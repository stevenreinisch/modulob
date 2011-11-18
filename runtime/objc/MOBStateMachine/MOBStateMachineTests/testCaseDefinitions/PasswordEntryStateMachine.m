//
//  PasswordEntryStateMachine.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "PasswordEntryStateMachine.h"

#import "MOBState.h"
#import "MOBInitialState.h"
#import "MOBFinalState.h"
#import "MOBTransition.h"
#import "MOBStateMachineConstants.h"
#import "MOBTimeoutTransition.h"

#import "TestCaseConstants.h"

@implementation PasswordEntryStateMachine

- (id)init
{
    self = [super init];
    if (self) {
        
        /*
         * Define the states.
         */
        MOBInitialState *initial = [[MOBInitialState new] autorelease];
        initial.name = @"initial";
        initial.ID   = PasswordEntryState_INITIAL;
        initial.entrySelectorName = @"enter_initial";
        initial.exitSelectorName  = @"exit_initial";
        
        MOBState *empty = [[MOBState new] autorelease];
        empty.name = @"empty";
        empty.ID = PasswordEntryState_EMPTY;
        empty.entrySelectorName = @"enter_empty";
        empty.exitSelectorName = @"exit_empty";
        
        MOBState *partiallyFilled = [[MOBState new] autorelease];
        partiallyFilled.name = @"partiallyFilled";
        partiallyFilled.ID = PasswordEntryState_PARTIALLYFILLED;
        partiallyFilled.entrySelectorName = @"enter_partiallyFilled";
        partiallyFilled.exitSelectorName = @"exit_partiallyFilled";
        
        MOBState *completelyFilled = [[MOBState new] autorelease];
        completelyFilled.name = @"completelyFilled";
        completelyFilled.ID = PasswordEntryState_COMPLETELYFILLED;
        
        #if DEMONSTARTE_IMMEDIATE_STATE_EXIT==1
        completelyFilled.duration = MOBIMMEDIATE_STATE_EXIT;
        #endif
        
        completelyFilled.entrySelectorName = @"enter_completelyFilled";
        completelyFilled.exitSelectorName = @"exit_completelyFilled";
        
        MOBState *userAuthenticated = [[MOBState new] autorelease];
        userAuthenticated.name = @"userAuthenticated";
        userAuthenticated.ID = PasswordEntryState_USERAUTHENTICATED;
        userAuthenticated.duration = MOBIMMEDIATE_STATE_EXIT;
        userAuthenticated.entrySelectorName = @"enter_userAuthenticated";
        userAuthenticated.exitSelectorName = @"exit_userAuthenticated";
        
        MOBState *userNotAuthenticated = [[MOBState new] autorelease];
        userNotAuthenticated.name = @"userNotAuthenticated";
        userNotAuthenticated.ID = PasswordEntryState_USERNOTAUTHENTICATED;
        userNotAuthenticated.duration = MOBIMMEDIATE_STATE_EXIT;
        userNotAuthenticated.entrySelectorName = @"enter_userNotAuthenticated";
        userNotAuthenticated.exitSelectorName = @"exit_userNotAuthenticated";
        
        MOBState *locked = [[MOBState new] autorelease];
        locked.name = @"locked";
        locked.ID = PasswordEntryState_LOCKED;
        locked.duration = 5.0;
        locked.entrySelectorName = @"enter_locked";
        locked.exitSelectorName = @"exit_locked";
        
        MOBFinalState *userAuthenticated_final = [[MOBFinalState new] autorelease];
        userAuthenticated_final.name = @"userAuthenticated_final";
        userAuthenticated_final.ID   = PasswordEntryState_USERAUTHENTICATED_FINAL;
        userAuthenticated_final.entrySelectorName = @"enter_userAuthenticated_Final";
        
        /*
         * Define transitions.
         */
        MOBTransition *initial_to_empty = [[MOBTransition new] autorelease];
        initial_to_empty.ID = PasswordEntryTransition_INITIAL_EMPTY;
        initial_to_empty.guardSelectorName = @"guard_initial_to_empty";
        initial_to_empty.actionSelectorName = @"action_initial_to_empty";
        
        MOBTransition * empty_to_partiallyFilled = [[MOBTransition new] autorelease];
        empty_to_partiallyFilled.ID = PasswordEntryTransition_EMPTY_PARTIALLYFILLED;
        empty_to_partiallyFilled.guardSelectorName = @"guard_empty_to_partiallyFilled";
        empty_to_partiallyFilled.actionSelectorName = @"action_empty_to_partiallyFilled";
        
        MOBTransition * partiallyFilled_to_empty = [[MOBTransition new] autorelease];
        partiallyFilled_to_empty.ID = PasswordEntryTransition_PARTIALLYFILLED_EMPTY;
        partiallyFilled_to_empty.guardSelectorName = @"guard_partiallyFilled_to_empty";
        partiallyFilled_to_empty.actionSelectorName = @"action_partiallyFilled_to_empty";
        
        MOBTransition * partiallyFilled_to_partiallyFilled = [[MOBTransition new] autorelease];
        partiallyFilled_to_partiallyFilled.ID = PasswordEntryTransition_PARTIALLYFILLED_EMPTY;
        partiallyFilled_to_partiallyFilled.guardSelectorName = @"guard_partiallyFilled_to_partiallyFilled";
        partiallyFilled_to_partiallyFilled.actionSelectorName = @"action_partiallyFilled_to_partiallyFilled";
        
        MOBTransition * partiallyFilled_to_completelyFilled = [[MOBTransition new] autorelease];
        partiallyFilled_to_completelyFilled.ID = PasswordEntryTransition_PARTIALLYFILLED_COMPLETELYFILLED;
        partiallyFilled_to_completelyFilled.guardSelectorName = @"guard_partiallyFilled_to_completelyFilled";
        partiallyFilled_to_completelyFilled.actionSelectorName = @"action_partiallyFilled_to_completelyFilled";
        
        MOBTransition * completelyFilled_to_userAuthenticated = [[MOBTransition new] autorelease];
        completelyFilled_to_userAuthenticated.ID = PasswordEntryTransition_COMPLETELYFILLED_USERAUTHENTICATED;
        completelyFilled_to_userAuthenticated.guardSelectorName = @"guard_completelyFilled_to_userAuthenticated";
        completelyFilled_to_userAuthenticated.actionSelectorName = @"action_completelyFilled_to_userAuthenticated";
        
        MOBTransition * completelyFilled_to_userNotAuthenticated = [[MOBTransition new] autorelease];
        completelyFilled_to_userNotAuthenticated.ID = PasswordEntryTransition_COMPLETELYFILLED_USERNOTAUTHENTICATED;
        completelyFilled_to_userNotAuthenticated.guardSelectorName = @"guard_completelyFilled_to_userNotAuthenticated";
        completelyFilled_to_userNotAuthenticated.actionSelectorName = @"action_completelyFilled_to_userNotAuthenticated";
        
        MOBTransition * userNotAuthenticated_to_empty = [[MOBTransition new] autorelease];
        userNotAuthenticated_to_empty.ID = PasswordEntryTransition_USERNOTAUTHENTICATED_EMPTY;
        userNotAuthenticated_to_empty.guardSelectorName = @"guard_userNotAuthenticated_to_empty";
        userNotAuthenticated_to_empty.actionSelectorName = @"action_userNotAuthenticated_to_empty";
        
        MOBTransition * userNotAuthenticated_to_locked = [[MOBTransition new] autorelease];
        userNotAuthenticated_to_locked.ID = PasswordEntryTransition_USERNOTAUTHENTICATED_LOCKED;
        userNotAuthenticated_to_locked.guardSelectorName = @"guard_userNotAuthenticated_to_locked";
        userNotAuthenticated_to_locked.actionSelectorName = @"action_userNotAuthenticated_to_locked";
        
        MOBTimeoutTransition * locked_to_empty = [[MOBTimeoutTransition new] autorelease];
        locked_to_empty.ID = PasswordEntryTransition_LOCKED_EMPTY;
        locked_to_empty.guardSelectorName = @"guard_locked_to_empty";
        locked_to_empty.actionSelectorName = @"action_locked_to_empty";
        
        locked.timeoutTransition = locked_to_empty;
        
        MOBTransition * locked_to_userauthenticated = [[MOBTransition new] autorelease];
        locked_to_userauthenticated.ID = PasswordEntryTransition_LOCKED_USERAUTHENTICATED;
        locked_to_userauthenticated.guardSelectorName = @"guard_locked_to_userauthenticated";
        locked_to_userauthenticated.actionSelectorName = @"action_locked_to_userauthenticated";
        
        MOBTransition * userauthenticated_to_final = [[MOBTransition new] autorelease];
        userauthenticated_to_final.ID = PasswordEntryTransition_USERAUTHENTICATED_FINAL;
        userauthenticated_to_final.guardSelectorName = @"guard_userauthenticated_to_final";
        userauthenticated_to_final.actionSelectorName = @"action_userauthenticated_to_final";
        
        MOBTransition *userauthenticated_to_empty = [[MOBTransition new] autorelease];
        userauthenticated_to_empty.ID = PasswordEntryTransition_USERAUTHENTICATED_EMPTY;
        userauthenticated_to_empty.guardSelectorName = @"guard_userauthenticated_to_empty";
        userauthenticated_to_empty.actionSelectorName = @"action_userauthenticated_to_empty";
        
        /*
         * Build the transition index.
         */
        
        self.transitionIndex = [NSArray arrayWithObjects:
                                initial_to_empty,
                                empty_to_partiallyFilled,
                                partiallyFilled_to_empty,
                                partiallyFilled_to_completelyFilled,    
                                completelyFilled_to_userAuthenticated,
                                completelyFilled_to_userNotAuthenticated,
                                userAuthenticated_final,
                                userauthenticated_to_final,
                                userNotAuthenticated_to_locked,
                                locked_to_empty,
                                locked_to_userauthenticated,
                                userauthenticated_to_empty,
                                nil];
        
        /*
         * Wire states and transitions.
         */
        
        //states -> transitions
        initial.outgoingTransitions = [NSSet setWithObjects:initial_to_empty, 
                                                            nil];
        
        empty.incomingTransitions = [NSSet setWithObjects:initial_to_empty,
                                                          userauthenticated_to_empty,
                                                          nil];
        empty.outgoingTransitions = [NSSet setWithObjects:empty_to_partiallyFilled, 
                                                          nil];
        
        partiallyFilled.incomingTransitions = [NSSet setWithObjects:empty_to_partiallyFilled, 
                                                                    nil];
        partiallyFilled.outgoingTransitions = [NSSet setWithObjects:partiallyFilled_to_empty,
                                                                    partiallyFilled_to_completelyFilled,
                                                                    partiallyFilled_to_partiallyFilled,
                                                                    nil];
        
        completelyFilled.incomingTransitions = [NSSet setWithObjects:partiallyFilled_to_completelyFilled, 
                                                                     nil];
        completelyFilled.outgoingTransitions = [NSSet setWithObjects:completelyFilled_to_userAuthenticated,
                                                                     completelyFilled_to_userNotAuthenticated,
                                                                     nil];
        
        userAuthenticated.incomingTransitions = [NSSet setWithObjects:completelyFilled_to_userAuthenticated,
                                                                      locked_to_userauthenticated,
                                                                      nil];
        
        userAuthenticated.outgoingTransitions = [NSSet setWithObjects:userauthenticated_to_final, 
                                                                      userauthenticated_to_empty,
                                                                      nil];
        
        userNotAuthenticated.incomingTransitions = [NSSet setWithObjects:completelyFilled_to_userNotAuthenticated, 
                                                                         nil];
        userNotAuthenticated.outgoingTransitions = [NSSet setWithObjects:userNotAuthenticated_to_empty, 
                                                                         userNotAuthenticated_to_locked,
                                                                         nil];
        
        locked.incomingTransitions = [NSSet setWithObjects:userNotAuthenticated_to_locked, 
                                                           nil];
        locked.outgoingTransitions = [NSSet setWithObjects:locked_to_empty,
                                                           locked_to_userauthenticated,
                                                           nil];
        
        //transitions -> states
        initial_to_empty.sourceState = initial;
        initial_to_empty.targetState = empty;
        
        empty_to_partiallyFilled.sourceState = empty;
        empty_to_partiallyFilled.targetState = partiallyFilled;
        
        partiallyFilled_to_empty.sourceState = partiallyFilled;
        partiallyFilled_to_empty.targetState = empty;
        
        partiallyFilled_to_partiallyFilled.sourceState = partiallyFilled;
        partiallyFilled_to_partiallyFilled.targetState = partiallyFilled;
        
        partiallyFilled_to_completelyFilled.sourceState = partiallyFilled;
        partiallyFilled_to_completelyFilled.targetState = completelyFilled;
        
        completelyFilled_to_userAuthenticated.sourceState = completelyFilled;
        completelyFilled_to_userAuthenticated.targetState = userAuthenticated;
        
        completelyFilled_to_userNotAuthenticated.sourceState = completelyFilled;
        completelyFilled_to_userNotAuthenticated.targetState = userNotAuthenticated;
        
        userauthenticated_to_final.sourceState = userAuthenticated;
        userauthenticated_to_final.targetState = userAuthenticated_final;
        
        userNotAuthenticated_to_empty.sourceState = userNotAuthenticated;
        userNotAuthenticated_to_empty.targetState = empty;
        
        userNotAuthenticated_to_locked.sourceState = userNotAuthenticated;
        userNotAuthenticated_to_locked.targetState = locked;
        
        locked_to_empty.sourceState = locked;
        locked_to_empty.targetState = empty;
        
        locked_to_userauthenticated.sourceState = locked;
        locked_to_userauthenticated.targetState = userAuthenticated;
        
        userauthenticated_to_empty.sourceState = userAuthenticated;
        userauthenticated_to_empty.targetState = empty;
        
        /*
         * Add states and transitions to this state machine instance.
         */
        [self.states addObject:initial];
        [self.states addObject:empty];
        [self.states addObject:partiallyFilled];
        [self.states addObject:completelyFilled];
        [self.states addObject:userAuthenticated];
        [self.states addObject:userNotAuthenticated];
        [self.states addObject:locked];
        [self.states addObject:userAuthenticated_final];
        
        [self.transitions addObject:initial_to_empty];
        [self.transitions addObject:empty_to_partiallyFilled];
        [self.transitions addObject:partiallyFilled_to_empty];
        [self.transitions addObject:partiallyFilled_to_partiallyFilled];
        [self.transitions addObject:partiallyFilled_to_completelyFilled];
        [self.transitions addObject:completelyFilled_to_userAuthenticated];
        [self.transitions addObject:completelyFilled_to_userNotAuthenticated];
        [self.transitions addObject:userauthenticated_to_final];
        [self.transitions addObject:userNotAuthenticated_to_empty];
        [self.transitions addObject:userNotAuthenticated_to_locked];
        [self.transitions addObject:locked_to_empty];
        [self.transitions addObject:locked_to_userauthenticated];
        [self.transitions addObject:userauthenticated_to_empty];
        
    }
    
    return self;
}

@end
