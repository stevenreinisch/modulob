//
//  MOBStateMachine.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 dubmas. All rights reserved.
//

#import "MOBStateMachine.h"
#import "MOBStateMachineConstants.h"

#define NO_EVENT NSUIntegerMax
#define EVENT_CURRENTLY_HANDLED [self.eventFIFO count] > 1

NSString *const MOBTIMER_TIMEOUTTRANSITION_KEY = @"timeoutTransition";

@interface MOBStateMachine ()

@property (nonatomic, retain) NSMutableArray *eventFIFO;

- (void) checkConsistencyAtStartUp;
//- (void) doUpdate;
- (BOOL) switchTransitionInternal:(MOBTransition*) transition;
- (void) enterState:(MOBAbstractState*) newState;
- (void) executeSelector:(NSString*) selectorName;

- (void) currentStateDurationEnded:(id)timerOrTimeoutTransition;

- (void) dispatchEvent:(MOBEvent) event;

- (void) enqueueEvent:(MOBEvent) event;
- (MOBEvent) nextEvent;
- (MOBEvent) dequeEvent;

@end

@implementation MOBStateMachine

@synthesize delegate, states, transitions, finished, transitionIndex, eventFIFO;

#pragma mark -

- (id)init
{
    self = [super init];
    if (self) {
        self.finished         = NO;
        self.states           = [NSMutableSet set];
        self.transitions      = [NSMutableSet set];
        self.eventFIFO        = [NSMutableArray arrayWithCapacity:5];
    }
    
    return self;
}

- (void) dealloc {
    self.finished         = NO;
    self.states           = nil;
    self.transitions      = nil;
    self.transitionIndex  = nil;
    self.eventFIFO        = nil;
    
    currentState          = nil;
    
    [super dealloc];
}

#pragma mark -

- (void) start {
    [self currentState];
    [self checkConsistencyAtStartUp];
    
    /*
     * Switch one of the initial state's outgoing transitions
     */
    
    BOOL switched = NO;
        
    NSEnumerator *enumerator  = [[currentState outgoingTransitions] objectEnumerator];
    MOBTransition *transition = nil;

    while (!switched && (transition = [enumerator nextObject]) ) {
        if ([self evaluateGuardSelector:transition.guardSelectorName]) {
            switched = [self switchTransitionInternal:transition];
        }
    }
}

- (void) handleEvent:(MOBEvent) event {
    
    [self enqueueEvent:event];
    
    if (EVENT_CURRENTLY_HANDLED) {
        return;
    } else {
        
        while ([self.eventFIFO count] > 0) {
            
            MOBEvent nextEvent = [self nextEvent];
            if (nextEvent != NO_EVENT) {
                [self dispatchEvent:nextEvent];
            }
            
            [self dequeEvent];
        }
        
        if ([currentState isKindOfClass:[MOBFinalState class]]) {
            
            self.finished = YES;
            
            if ([self.delegate respondsToSelector:@selector(finishedProcessing)]) {
                [self.delegate finishedProcessing];
            }
        }
    }
}

- (void) dispatchEvent:(MOBEvent) event {
    [NSException raise:@"Abstract Mehtod" format:@"Implement dispatchEvent: in a subclass"];
}
    
- (MOBAbstractState*) currentState {
    if(!currentState){
        currentState = [[[states filteredSetUsingPredicate:
                               [NSPredicate predicateWithFormat:@"SELF isKindOfClass: %@", [MOBInitialState class]]] 
                                allObjects] objectAtIndex:0];
    }
    return currentState;
}

- (BOOL) switchTransitionWithID:(MOBTransitionID) transitionID {
    
    MOBTransition *t = [self.transitionIndex objectAtIndex:transitionID];
    
    if (!t) {
        [delegate handleStateMachineError:MOBStateMachineError_TransitionUnknown];
        
        self.finished = YES;
        
        return NO;
    }
    
    if (self.currentState != t.sourceState) {
        [delegate handleStateMachineError:MOBStateMachineError_NotInSourceStateOfSwitchedTransition];
        
        self.finished = YES;
        
        return NO;
    }
    
    BOOL switched = NO;
    
    /*
     * The transition's guard should have been evaluated in dispatchEvent:
     */
    [self switchTransitionInternal:t];

    
    return switched;
}

#pragma mark -
#pragma mark private

- (void) enqueueEvent:(MOBEvent) event {
    [self.eventFIFO addObject:[NSNumber numberWithUnsignedInteger:event]];
}

- (MOBEvent) dequeEvent {
    MOBEvent event = NO_EVENT;
    
    if ([self.eventFIFO count] > 0) {
        event = [[self.eventFIFO objectAtIndex:0] unsignedIntValue];
        [self.eventFIFO removeObjectAtIndex:0];
    }
    
    return event;
}

- (MOBEvent) nextEvent {
    MOBEvent event = NO_EVENT;
    
    if ([self.eventFIFO count] > 0) {    
        event = [[self.eventFIFO objectAtIndex:0] unsignedIntValue];
    }
    
    return event;
}

/*
 * 1. execute current state's exit selector
 * 2. execute transition's action selector
 * 3. enter transition's target state
 */
- (BOOL) switchTransitionInternal:(MOBTransition*) transition {
    NSLog(@"MOBStateMachine:: switching transition with guard: %@", transition.guardSelectorName);
    
    [self executeSelector:[currentState exitSelectorName]];
    [self executeSelector:transition.actionSelectorName];
    [self enterState:transition.targetState];
    
    return YES;
}

- (void) enterState:(MOBAbstractState*) newState {
    currentState = newState;
    
    NSLog(@"MOBStateMachine:: entered state: %@", [currentState name]);
    
    [self executeSelector:[currentState entrySelectorName]];
    
    if ([currentState isKindOfClass:[MOBState class]]) 
    {
        if (MOBSTATEMACHINE_DEFINED([(id)newState duration])) {
            
            NSLog(@"MOBStateMachine:: starting timer for state: %@ (ID: %lu) with duration: %f",
                  [newState name], (unsigned long)[newState ID], [(id)newState duration]);
            
            MOBTimeoutTransition *tot = ((MOBState*)newState).timeoutTransition;
            
            /*
             * If the duration is 0, we do not need to start a timer but
             * call the timer's selector immediately.
             *
             * This behaviour corresponds to the semantic that a state
             * must be exited immediately after it has been entered
             * without the need of a call to [ update] from outside the
             * state machine.
             */
            if ([(id)newState duration] == MOBIMMEDIATE_STATE_EXIT) {
                [self currentStateDurationEnded:tot];
            } else {
                
                NSAssert(tot != nil, 
                         @"if duration > 0, a timeoutTransition must be set on state: %lu", (unsigned long)newState.ID);
                
                NSDictionary *userInfo = 
                    [NSDictionary dictionaryWithObjectsAndKeys: 
                     tot, 
                     MOBTIMER_TIMEOUTTRANSITION_KEY, 
                     nil];
                
                [NSTimer scheduledTimerWithTimeInterval:[(id)newState duration] 
                                                 target:self 
                                               selector:@selector(currentStateDurationEnded:) 
                                               userInfo:userInfo 
                                                repeats:NO];
            }
        }
    }
}

- (void) checkConsistencyAtStartUp {
    NSAssert([states count] > 0, @"state machine must have at least one state");
    NSAssert([transitions count] > 0, @"state machine must have at least one transition");
    
    NSArray *initialStates = [[states filteredSetUsingPredicate:
                                [NSPredicate predicateWithFormat:@"SELF isKindOfClass: %@", [MOBInitialState class]]] 
                                  allObjects];
    
    NSAssert([initialStates count] == 1, @"only one state can be initial state");
    
    MOBInitialState *initialState = [initialStates objectAtIndex:0];
    
    NSAssert(currentState == initialState, 
             @"current state: %@ (ID: %lu) must be the same as %@ (ID: %lu)",
             [currentState name], (unsigned long)[currentState ID], [initialState name], (unsigned long)[initialState ID]);
    
    NSArray *finalStates = [[states filteredSetUsingPredicate:
                               [NSPredicate predicateWithFormat:@"SELF isKindOfClass: %@", [MOBFinalState class]]] 
                                 allObjects];
    
    NSAssert([finalStates count] >= 1, @"at least one state must be final");
}

-(void) executeSelector:(NSString*) selectorName {
    
    SEL selector = NSSelectorFromString(selectorName);
    
    if ([delegate respondsToSelector:selector]) {
        
        NSMethodSignature *sig = [(id)delegate methodSignatureForSelector:selector];
        NSAssert(sig, @"no signature found in MOBStateMachine#executeSelector:");
        
        NSInvocation *invoc = [NSInvocation invocationWithMethodSignature:sig];
        [invoc setSelector:selector];
        [invoc setTarget:delegate];
        [invoc invoke];
    }
}     
     
/*
 * If selectorName == nil or delegate not responding to selector,
 * returns YES.
 * Otherwise the guard is evaluated.
 */
-(BOOL) evaluateGuardSelector:(NSString*) selectorName {
	if (selectorName) {
        SEL selector = NSSelectorFromString(selectorName);
        if ([delegate respondsToSelector:selector]) {
            //do this cast magic to get rid of the warning
            return (int)((void*)[delegate performSelector:selector]);
        }
    }
	return YES;
}

- (void) currentStateDurationEnded:(id)timerOrTimeoutTransition {
    
    MOBTimeoutTransition *tot = nil;
    
    if ([timerOrTimeoutTransition isKindOfClass:[NSTimer class]]) {
        
        tot = [[timerOrTimeoutTransition userInfo] 
               objectForKey:MOBTIMER_TIMEOUTTRANSITION_KEY];
    } else {
        tot = (MOBTimeoutTransition*)timerOrTimeoutTransition;
    }
    
    /*
     * Is the state machine still in the same state
     * when the timer was started?
     */
    if (tot.sourceState == self.currentState) {
        
        NSLog(@"MOBStateMachine:: switching timeoutTransition for state: %@", [currentState name]);
        
        [self switchTransitionWithID:tot.ID];
    } else {
        NSLog(@"MOBStateMachine:: wanted to switch timeoutTransition for state: %@ but state machine already switched to state: %@. Doing nothing.",
              tot.sourceState.name, [self.currentState name]);
    }
    
}

@end
