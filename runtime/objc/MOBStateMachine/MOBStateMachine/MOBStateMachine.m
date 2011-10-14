//
//  MOBStateMachine.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 dubmas. All rights reserved.
//

#import "MOBStateMachine.h"

@interface MOBStateMachine ()
@property (nonatomic, retain) MOBState *currentState;

- (void) checkConsistencyAtStartUp;

- (BOOL) switchTransitionInternal:(MOBTransition*) transition;
- (void) enterState:(MOBState*) newState;
- (void) executeSelector:(NSString*) selectorName;
- (BOOL) evaluateGuardSelector:(NSString*) selectorName;

- (void) currentStateDurationEnded;
@end

@implementation MOBStateMachine

@synthesize delegate, states, transitions, currentState;

#pragma mark -

- (id)init
{
    self = [super init];
    if (self) {
        self.states      = [[NSMutableSet new] autorelease];
        self.transitions = [[NSMutableSet new] autorelease];
    }
    
    return self;
}

- (void) dealloc {
    self.states          = nil;
    self.transitions     = nil;
    self.currentState    = nil;
    
    [super dealloc];
}

#pragma mark -

- (void) start {
    [self currentState];
    [self checkConsistencyAtStartUp];
    
    [self executeSelector:currentState.entrySelectorName];
}

/*
 * Loop through the current state's outgoing transitions.
 * If a transition's guard selector is evaluated to true,
 * this transition is switched.
 */
- (void) update {
    BOOL switched = NO;
    
    NSEnumerator *enumerator  = [currentState.outgoingTransitions objectEnumerator];
    MOBTransition *transition = nil;
    
    while (!switched && (transition = [enumerator nextObject]) ) {
        if ([self evaluateGuardSelector:transition.guardSelectorName]) {
            switched = [self switchTransitionInternal:transition];
        }
    }
    
    if (switched && transition) {
        [self enterState:transition.targetState];
    }
}

- (MOBState*) currentState {
    if(!currentState){
        self.currentState = [[[states filteredSetUsingPredicate:
                               [NSPredicate predicateWithFormat:@"SELF.isInitial == YES"]] 
                                allObjects] objectAtIndex:0];
    }
    return currentState;
}

#pragma mark -
#pragma mark private

/*
 * 1. execute current state's exit selector
 * 2. execute transition's action selector
 */
- (BOOL) switchTransitionInternal:(MOBTransition*) transition {
    [self executeSelector:currentState.exitSelectorName];
    [self executeSelector:transition.actionSelectorName];
    return YES;
}

- (void) enterState:(MOBState*) newState {
    self.currentState = newState;
    [self executeSelector:currentState.entrySelectorName];
    
    if (DEFINED(newState.duration)) {
        NSLog(@"starting timer for state: %@ (ID: %d) with duration: %f",
              newState.name, newState.ID, newState.duration);
        
        [NSTimer scheduledTimerWithTimeInterval:newState.duration 
                                         target:self 
                                       selector:@selector(currentStateDurationEnded) 
                                       userInfo:nil 
                                        repeats:NO];
    }
}

- (void) checkConsistencyAtStartUp {
    NSAssert([states count] > 0, @"state machine must have at least one state");
    NSAssert([transitions count] > 0, @"state machine must have at least one transition");
    
    NSArray *initialStates = [[states filteredSetUsingPredicate:
                                [NSPredicate predicateWithFormat:@"SELF.isInitial == YES"]] 
                                  allObjects];
    
    NSAssert([initialStates count] == 1, @"only one state can be initial state");
    
    MOBState *initialState = [initialStates objectAtIndex:0];
    
    NSAssert(self.currentState == initialState, 
             @"current state: %@ (ID: %d) must be the same as %@ (ID: %d)",
             currentState.name, currentState.ID, initialState.name, initialState.ID);
    
    NSArray *finalStates = [[states filteredSetUsingPredicate:
                               [NSPredicate predicateWithFormat:@"SELF.isFinal == YES"]] 
                                 allObjects];
    
    NSAssert([finalStates count] >= 1, @"at least one state must be final");
    
    for(MOBState *finalState in finalStates) {
        NSSet *outgoingTransitions = finalState.outgoingTransitions;
        if (outgoingTransitions) {
            NSAssert([outgoingTransitions count] == 1, 
                     @"final state: %@ (ID: %d) must not have any outgoing transition",
                     finalState.name, finalState.ID);
        }
    }
}

-(void) executeSelector:(NSString*) selectorName {
    
    SEL selector = NSSelectorFromString(selectorName);
    
    if ([delegate respondsToSelector:selector]) {
        
        NSMethodSignature *sig = [delegate methodSignatureForSelector:selector];
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
            return [[delegate performSelector:selector] boolValue];
        }
    }
	return YES;
}

/*
 * If the current state's duration has ended,
 * the state machine leaves the current state
 * by updating itself.
 */
- (void) currentStateDurationEnded {
    NSLog(@"timer ended for state: %@ (ID: %d) with duration: %f",
          currentState.name, currentState.ID, currentState.duration);
    
    [self update];
}

@end
