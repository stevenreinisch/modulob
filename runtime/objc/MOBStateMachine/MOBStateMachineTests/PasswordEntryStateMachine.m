//
//  PasswordEntryStateMachine.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "PasswordEntryStateMachine.h"

#import "MOBState.h"
#import "MOBTransition.h"

@implementation PasswordEntryStateMachine

- (id)init
{
    self = [super init];
    if (self) {
        
        /*
         * Define the states.
         */ 
        MOBState *empty = [[MOBState new] autorelease];
        empty.name = @"name";
        empty.ID = PasswordEntryState_EMPTY;
        empty.isInitial = YES;
        empty.isFinal = NO;
        empty.entrySelectorName = @"enter_empty";
        empty.exitSelectorName = @"exit_empty";
        
        MOBState *partiallyFilled = [[MOBState new] autorelease];
        partiallyFilled.name = @"partiallyFilled";
        partiallyFilled.ID = PasswordEntryState_PARTIALLYFILLED;
        partiallyFilled.isInitial = NO;
        partiallyFilled.isFinal = NO;
        partiallyFilled.entrySelectorName = @"enter_partiallyFilled";
        partiallyFilled.exitSelectorName = @"exit_partiallyFilled";
        
        MOBState *completelyFilled = [[MOBState new] autorelease];
        completelyFilled.name = @"completelyFilled";
        completelyFilled.ID = PasswordEntryState_COMPLETELYFILLED;
        completelyFilled.isInitial = NO;
        completelyFilled.isFinal = NO;
        completelyFilled.entrySelectorName = @"enter_completelyFilled";
        completelyFilled.exitSelectorName = @"exit_completelyFilled";
        
        MOBState *userAuthenticated = [[MOBState new] autorelease];
        userAuthenticated.name = @"userAuthenticated";
        userAuthenticated.ID = PasswordEntryState_USERAUTHENTICATED;
        userAuthenticated.isInitial = NO;
        userAuthenticated.isFinal = YES;
        userAuthenticated.entrySelectorName = @"enter_userAuthenticated";
        userAuthenticated.exitSelectorName = @"exit_userAuthenticated";
        
        MOBState *userNotAuthenticated = [[MOBState new] autorelease];
        userNotAuthenticated.name = @"userNotAuthenticated";
        userNotAuthenticated.ID = PasswordEntryState_USERNOTAUTHENTICATED;
        userNotAuthenticated.isInitial = NO;
        userNotAuthenticated.isFinal = YES;
        userNotAuthenticated.entrySelectorName = @"enter_userNotAuthenticated";
        userNotAuthenticated.exitSelectorName = @"exit_userNotAuthenticated";
        
        /*
         * Define transitions.
         */
        MOBTransition * empty_to_partiallyFilled = [[MOBTransition new] autorelease];
        empty_to_partiallyFilled.ID = PasswordEntryTransition_EMPTY_PARTIALLYFILLED;
        empty_to_partiallyFilled.guardSelectorName = @"guard_empty_to_partiallyFilled";
        empty_to_partiallyFilled.actionSelectorName = @"action_empty_to_partiallyFilled";
        
        MOBTransition * partiallyFilled_to_empty = [[MOBTransition new] autorelease];
        partiallyFilled_to_empty.ID = PasswordEntryTransition_PARTIALLYFILLED_EMPTY;
        partiallyFilled_to_empty.guardSelectorName = @"guard_partiallyFilled_to_empty";
        partiallyFilled_to_empty.actionSelectorName = @"action_partiallyFilled_to_empty";
        
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
        
        /*
         * Wire states and transitions.
         */
        
        //states -> transitions
        empty.outgoingTransitions = [NSSet setWithObjects:empty_to_partiallyFilled, nil];
        
        partiallyFilled.incomingTransitions = [NSSet setWithObjects:empty_to_partiallyFilled, 
                                                                    nil];
        partiallyFilled.outgoingTransitions = [NSSet setWithObjects:partiallyFilled_to_empty,
                                                                    partiallyFilled_to_completelyFilled, 
                                                                    nil];
        
        completelyFilled.incomingTransitions = [NSSet setWithObjects:partiallyFilled_to_completelyFilled, 
                                                                     nil];
        completelyFilled.outgoingTransitions = [NSSet setWithObjects:completelyFilled_to_userAuthenticated,
                                                                     completelyFilled_to_userNotAuthenticated,
                                                                     nil];
        
        userAuthenticated.incomingTransitions = [NSSet setWithObjects:completelyFilled_to_userAuthenticated, 
                                                                      nil];
        
        userNotAuthenticated.incomingTransitions = [NSSet setWithObjects:completelyFilled_to_userNotAuthenticated, 
                                                                         nil];
        userNotAuthenticated.outgoingTransitions = [NSSet setWithObjects:userNotAuthenticated_to_empty, 
                                                                         nil];
        
        //transitions -> states
        empty_to_partiallyFilled.sourceState = empty;
        empty_to_partiallyFilled.targetState = partiallyFilled;
        
        partiallyFilled_to_empty.sourceState = partiallyFilled;
        partiallyFilled_to_empty.targetState = empty;
        
        partiallyFilled_to_completelyFilled.sourceState = partiallyFilled;
        partiallyFilled_to_completelyFilled.targetState = completelyFilled;
        
        completelyFilled_to_userAuthenticated.sourceState = completelyFilled;
        completelyFilled_to_userAuthenticated.targetState = userAuthenticated;
        
        completelyFilled_to_userNotAuthenticated.sourceState = completelyFilled;
        completelyFilled_to_userNotAuthenticated.targetState = userNotAuthenticated;
        
        userNotAuthenticated_to_empty.sourceState = userNotAuthenticated;
        userNotAuthenticated_to_empty.targetState = empty;
        
        /*
         * Add states and transitions to this state machine instance.
         */
        [self.states addObject:empty];
        [self.states addObject:partiallyFilled];
        [self.states addObject:completelyFilled];
        [self.states addObject:userAuthenticated];
        [self.states addObject:userNotAuthenticated];
        
        [self.transitions addObject:empty_to_partiallyFilled];
        [self.transitions addObject:partiallyFilled_to_empty];
        [self.transitions addObject:partiallyFilled_to_completelyFilled];
        [self.transitions addObject:completelyFilled_to_userAuthenticated];
        [self.transitions addObject:completelyFilled_to_userNotAuthenticated];
        [self.transitions addObject:userNotAuthenticated_to_empty];
    }
    
    return self;
}

@end
