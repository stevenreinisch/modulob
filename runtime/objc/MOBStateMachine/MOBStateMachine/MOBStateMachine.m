//
//  MOBStateMachine.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 dubmas. All rights reserved.
//

#import "MOBStateMachine.h"

#define FURTHER_UPDATES_REQUESTED (requestedUpdates > 0)

@interface MOBStateMachine ()

- (void) checkConsistencyAtStartUp;
- (void) doUpdate;
- (BOOL) switchTransitionInternal:(MOBTransition*) transition;
- (void) enterState:(MOBAbstractState*) newState;
- (void) executeSelector:(NSString*) selectorName;
- (BOOL) evaluateGuardSelector:(NSString*) selectorName;

- (void) currentStateDurationEnded;

@property (nonatomic, assign) BOOL inUpdate;
@property (nonatomic, assign) NSUInteger requestedUpdates;

@end

@implementation MOBStateMachine

@synthesize delegate, states, transitions, inUpdate, requestedUpdates;

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
    }
}

- (void) doUpdate {
    BOOL switched = NO;
    
    NSEnumerator *enumerator  = [[currentState outgoingTransitions] objectEnumerator];
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

- (MOBAbstractState*) currentState {
    if(!currentState){
        currentState = [[[states filteredSetUsingPredicate:
                               [NSPredicate predicateWithFormat:@"SELF isKindOfClass: %@", [MOBInitialState class]]] 
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
    NSLog(@"switching transition with guard: %@", transition.guardSelectorName);
    [self executeSelector:[currentState exitSelectorName]];
    [self executeSelector:transition.actionSelectorName];
    return YES;
}

- (void) enterState:(MOBAbstractState*) newState {
    currentState = newState;
    
    NSLog(@"entered state: %@", [currentState name]);
    
    [self executeSelector:[currentState entrySelectorName]];
    
    if ([currentState isKindOfClass:[MOBState class]]) 
    {
        if (DEFINED([(id)newState duration])) {
            NSLog(@"starting timer for state: %@ (ID: %d) with duration: %f",
                  [newState name], [newState ID], [(id)newState duration]);
            
            [NSTimer scheduledTimerWithTimeInterval:[(id)newState duration] 
                                             target:self 
                                           selector:@selector(currentStateDurationEnded) 
                                           userInfo:nil 
                                            repeats:NO];
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
          [currentState name], [currentState ID], [currentState duration]);
    
    [self update];
}

@end
