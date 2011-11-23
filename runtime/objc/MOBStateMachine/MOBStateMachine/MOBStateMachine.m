//
//  MOBStateMachine.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 dubmas. All rights reserved.
//

#import "MOBStateMachine.h"
#import "MOBStateMachineConstants.h"

NSString *const MOBTIMER_TIMEOUTTRANSITION_KEY = @"timeoutTransition";

#define FURTHER_UPDATES_REQUESTED (requestedUpdates > 0)

@interface MOBStateMachine ()

- (void) checkConsistencyAtStartUp;
- (void) doUpdate;
- (BOOL) switchTransitionInternal:(MOBTransition*) transition;
- (void) enterState:(MOBAbstractState*) newState;
- (void) executeSelector:(NSString*) selectorName;
- (BOOL) evaluateGuardSelector:(NSString*) selectorName;

- (void) currentStateDurationEnded:(NSTimer*)theTimer;

@property (nonatomic, assign) BOOL inUpdate;
@property (nonatomic, assign) NSUInteger requestedUpdates;

@end

@implementation MOBStateMachine

@synthesize delegate, states, transitions, inUpdate, requestedUpdates, transitionIndex;

#pragma mark -

- (id)init
{
    self = [super init];
    if (self) {
        self.inUpdate         = NO;
        self.requestedUpdates = 0;
        self.states           = [[NSMutableSet new] autorelease];
        self.transitions      = [[NSMutableSet new] autorelease];
    }
    
    return self;
}

- (void) dealloc {
    self.inUpdate         = NO;
    self.requestedUpdates = 0;
    self.states           = nil;
    self.transitions      = nil;
    
    currentState          = nil;
    
    [super dealloc];
}

#pragma mark -

- (void) start {
    [self currentState];
    [self checkConsistencyAtStartUp];
    
    [self update];
}

/*
 * Loop through the current state's outgoing transitions.
 * If a transition's guard selector is evaluated to true,
 * this transition is switched.
 */
- (void) update {
    
    if (![currentState isKindOfClass:[MOBFinalState class]]) {
        
        if(!self.inUpdate) {
            
            self.inUpdate = YES;
            
            NSLog(@"in update for state: %@.", [currentState name]);
            
            [self doUpdate];
            
            NSLog(@"finished update. Now in state: %@.", [currentState name]);
            
            self.inUpdate = NO;
            
            if(FURTHER_UPDATES_REQUESTED) {
                requestedUpdates--;
                NSLog(@"executing requested update in state: %@ (%d remaining).", 
                      [currentState name], requestedUpdates);
                [self update];
            }
        } else {
            NSLog(@"further update requested in state: %@.", [currentState name]);
            self.requestedUpdates++;
            return;
        }
    } else {
        NSLog(@"ERROR: MOBStateMachine cannot update .. in final state.");
        
        [delegate handleStateMachineError:MOBStateMachineError_AlreadyInFinalState];
    }
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
    
    //NSAssert(t != nil, @"Could not find transition with ID: %d", transitionID);
    if (!t) {
        [delegate handleStateMachineError:MOBStateMachineError_TransitionUnknown];
    }
    
//    NSAssert(self.currentState == t.sourceState, 
//             @"Cannot switch transition with ID: %d because state machine's current state is not transition's source state");
    if (self.currentState != t.sourceState) {
        [delegate handleStateMachineError:MOBStateMachineError_NotInSourceStateOfSwitchedTransition];
    }
    
    NSLog(@"forced to switch transition with ID: %d (guard: %@)", transitionID, t.guardSelectorName);
    
    BOOL switched = [self switchTransitionInternal:t];
    
    return switched;
}

#pragma mark -
#pragma mark private

- (void) doUpdate {
    BOOL switched = NO;
    
    NSEnumerator *enumerator  = [[currentState outgoingTransitions] objectEnumerator];
    MOBTransition *transition = nil;
    
    while (!switched && (transition = [enumerator nextObject]) ) {
        if ([self evaluateGuardSelector:transition.guardSelectorName]) {
            switched = [self switchTransitionInternal:transition];
        }
    }
}

/*
 * 1. execute current state's exit selector
 * 2. execute transition's action selector
 * 3. enter transition's target state
 */
- (BOOL) switchTransitionInternal:(MOBTransition*) transition {
    NSLog(@"switching transition with guard: %@", transition.guardSelectorName);
    [self executeSelector:[currentState exitSelectorName]];
    [self executeSelector:transition.actionSelectorName];
    [self enterState:transition.targetState];
    return YES;
}

- (void) enterState:(MOBAbstractState*) newState {
    currentState = newState;
    
    NSLog(@"entered state: %@", [currentState name]);
    
    [self executeSelector:[currentState entrySelectorName]];
    
    if ([currentState isKindOfClass:[MOBState class]]) 
    {
        if (MOBSTATEMACHINE_DEFINED([(id)newState duration])) {
            NSLog(@"starting timer for state: %@ (ID: %d) with duration: %f",
                  [newState name], [newState ID], [(id)newState duration]);
            
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
                [self currentStateDurationEnded:nil];
            } else {
                MOBTimeoutTransition *tot = ((MOBState*)newState).timeoutTransition;
                
                NSAssert(tot != nil, 
                         @"if duration > 0, a timeoutTransition must be set on state: %d", newState.ID);
                
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
             @"current state: %@ (ID: %d) must be the same as %@ (ID: %d)",
             [currentState name], [currentState ID], [initialState name], [initialState ID]);
    
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

/*
 * If the current state's duration has ended,
 * the state machine leaves the current state
 * by updating itself.
 */
- (void) currentStateDurationEnded:(NSTimer*)theTimer {
    
    if (theTimer) {
        MOBTimeoutTransition *tot = 
            [[theTimer userInfo] objectForKey:MOBTIMER_TIMEOUTTRANSITION_KEY];
        
        /*
         * Is the state machine still in the same state
         * when the timer was started?
         */
        if (tot.sourceState == self.currentState) {
            
            NSLog(@"switching timeoutTransition for state: %@", [currentState name]);
            
            [self switchTransitionWithID:tot.ID];
        } else {
            NSLog(@"wanted to switch timeoutTransition for state: %@ but state machine already switched to state: %@. Doing nothing.",
                  tot.sourceState.name, [self.currentState name]);
        }
    } else {//called with no timer => currentState is exited immediately
        
        NSLog(@"immediately exiting current state: %@", [currentState name]);
        
        [self update];
    }
}

@end
