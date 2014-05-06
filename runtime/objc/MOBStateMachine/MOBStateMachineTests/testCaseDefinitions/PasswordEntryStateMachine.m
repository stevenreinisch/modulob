//
//  PasswordEntryStateMachine.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "PasswordEntryStateMachine.h"

#import "MOBAbstractState.h"
#import "MOBState.h"
#import "MOBInitialState.h"
#import "MOBFinalState.h"
#import "MOBTransition.h"
#import "MOBStateMachineConstants.h"
#import "MOBTimeoutTransition.h"

#import "TestCaseConstants.h"

@implementation PasswordEntryStateMachine

- (id)init {
	self = [super init];
	if (self) {
		/*
		 * Define the states.
		 */
		MOBInitialState *initial = [[MOBInitialState new] autorelease];
		initial.name = @"initial";
		initial.ID   = PasswordEntry_State_INITIAL;
		initial.entrySelectorName = @"enter_initial";
		initial.exitSelectorName  = @"exit_initial";
        
		MOBState *Empty = [[MOBState new] autorelease];
		Empty.name = @"Empty";
		Empty.ID = PasswordEntry_State_EMPTY;
		Empty.entrySelectorName = @"enter_Empty";
		Empty.exitSelectorName = @"exit_Empty";
        
		MOBFinalState *final0 = [[MOBFinalState new] autorelease];
		final0.name = @"final0";
		final0.ID   = PasswordEntry_State_FINAL0;
		final0.entrySelectorName = @"enter_final0";
        
		MOBState *PartiallyFilled = [[MOBState new] autorelease];
		PartiallyFilled.name = @"PartiallyFilled";
		PartiallyFilled.ID = PasswordEntry_State_PARTIALLYFILLED;
		PartiallyFilled.entrySelectorName = @"enter_PartiallyFilled";
		PartiallyFilled.exitSelectorName = @"exit_PartiallyFilled";
        
		MOBState *CompletelyFilled = [[MOBState new] autorelease];
		CompletelyFilled.name = @"CompletelyFilled";
		CompletelyFilled.ID = PasswordEntry_State_COMPLETELYFILLED;
		CompletelyFilled.entrySelectorName = @"enter_CompletelyFilled";
		CompletelyFilled.exitSelectorName = @"exit_CompletelyFilled";
        
		MOBState *Locked = [[MOBState new] autorelease];
		Locked.name = @"Locked";
		Locked.ID = PasswordEntry_State_LOCKED;
		Locked.duration = 5.0;
		Locked.entrySelectorName = @"enter_Locked";
		Locked.exitSelectorName = @"exit_Locked";
        
		/*
		 * Define transitions.
		 */
		MOBTransition *initial_to_Empty = [[MOBTransition new] autorelease];
		initial_to_Empty.ID = PasswordEntry_Transition_INITIAL_EMPTY;
		initial_to_Empty.guardSelectorName = @"guard_initial_to_Empty";
		initial_to_Empty.actionSelectorName = @"action_initial_to_Empty";
        
		MOBTransition *Empty_to_PartiallyFilled = [[MOBTransition new] autorelease];
		Empty_to_PartiallyFilled.ID = PasswordEntry_Transition_EMPTY_PARTIALLYFILLED;
		Empty_to_PartiallyFilled.guardSelectorName = @"guard_Empty_to_PartiallyFilled";
		Empty_to_PartiallyFilled.actionSelectorName = @"action_Empty_to_PartiallyFilled";
        
		MOBTransition *PartiallyFilled_to_CompletelyFilled = [[MOBTransition new] autorelease];
		PartiallyFilled_to_CompletelyFilled.ID = PasswordEntry_Transition_PARTIALLYFILLED_COMPLETELYFILLED;
		PartiallyFilled_to_CompletelyFilled.guardSelectorName = @"guard_PartiallyFilled_to_CompletelyFilled";
		PartiallyFilled_to_CompletelyFilled.actionSelectorName = @"action_PartiallyFilled_to_CompletelyFilled";
        
		MOBTransition *CompletelyFilled_to_Locked = [[MOBTransition new] autorelease];
		CompletelyFilled_to_Locked.ID = PasswordEntry_Transition_COMPLETELYFILLED_LOCKED;
		CompletelyFilled_to_Locked.guardSelectorName = @"guard_CompletelyFilled_to_Locked";
		CompletelyFilled_to_Locked.actionSelectorName = @"action_CompletelyFilled_to_Locked";
        
		MOBTransition *CompletelyFilled_to_final0 = [[MOBTransition new] autorelease];
		CompletelyFilled_to_final0.ID = PasswordEntry_Transition_COMPLETELYFILLED_FINAL0;
		CompletelyFilled_to_final0.guardSelectorName = @"guard_CompletelyFilled_to_final0";
		CompletelyFilled_to_final0.actionSelectorName = @"action_CompletelyFilled_to_final0";
        
		MOBTransition *CompletelyFilled_to_Empty = [[MOBTransition new] autorelease];
		CompletelyFilled_to_Empty.ID = PasswordEntry_Transition_COMPLETELYFILLED_EMPTY;
		CompletelyFilled_to_Empty.guardSelectorName = @"guard_CompletelyFilled_to_Empty";
		CompletelyFilled_to_Empty.actionSelectorName = @"action_CompletelyFilled_to_Empty";
        
		MOBTimeoutTransition *Locked_to_Empty = [[MOBTimeoutTransition new] autorelease];
		Locked_to_Empty.ID = PasswordEntry_Transition_LOCKED_EMPTY;
		Locked_to_Empty.guardSelectorName = @"guard_Locked_to_Empty";
		Locked_to_Empty.actionSelectorName = @"action_Locked_to_Empty";
        
		Locked.timeoutTransition = Locked_to_Empty;
        
		MOBTransition *PartiallyFilled_to_Empty = [[MOBTransition new] autorelease];
		PartiallyFilled_to_Empty.ID = PasswordEntry_Transition_PARTIALLYFILLED_EMPTY;
		PartiallyFilled_to_Empty.guardSelectorName = @"guard_PartiallyFilled_to_Empty";
		PartiallyFilled_to_Empty.actionSelectorName = @"action_PartiallyFilled_to_Empty";
        
		MOBTransition *PartiallyFilled_to_PartiallyFilled_DigitDeleted = [[MOBTransition new] autorelease];
		PartiallyFilled_to_PartiallyFilled_DigitDeleted.ID = PasswordEntry_Transition_PARTIALLYFILLED_PARTIALLYFILLED_DIGITDELETED;
		PartiallyFilled_to_PartiallyFilled_DigitDeleted.guardSelectorName = @"guard_PartiallyFilled_to_PartiallyFilled_DigitDeleted";
		PartiallyFilled_to_PartiallyFilled_DigitDeleted.actionSelectorName = @"action_PartiallyFilled_to_PartiallyFilled_DigitDeleted";
        
		MOBTransition *PartiallyFilled_to_PartiallyFilled_DigitEntered = [[MOBTransition new] autorelease];
		PartiallyFilled_to_PartiallyFilled_DigitEntered.ID = PasswordEntry_Transition_PARTIALLYFILLED_PARTIALLYFILLED_DIGITENTERED;
		PartiallyFilled_to_PartiallyFilled_DigitEntered.guardSelectorName = @"guard_PartiallyFilled_to_PartiallyFilled_DigitEntered";
		PartiallyFilled_to_PartiallyFilled_DigitEntered.actionSelectorName = @"action_PartiallyFilled_to_PartiallyFilled_DigitEntered";
        
		/*
		 * Build the transition index.
		 */
        
		self.transitionIndex = [NSArray arrayWithObjects:
		                        initial_to_Empty,
		                        Empty_to_PartiallyFilled,
		                        PartiallyFilled_to_CompletelyFilled,
		                        CompletelyFilled_to_Locked,
		                        CompletelyFilled_to_final0,
		                        CompletelyFilled_to_Empty,
		                        Locked_to_Empty,
		                        PartiallyFilled_to_Empty,
		                        PartiallyFilled_to_PartiallyFilled_DigitDeleted,
		                        PartiallyFilled_to_PartiallyFilled_DigitEntered
		                        , nil];
        
		/*
		 * Wire states and transitions.
		 */
        
		//states -> transitions
		initial.outgoingTransitions = [NSSet setWithObjects:
		                               initial_to_Empty
		                               , nil];
        
		Empty.outgoingTransitions = [NSSet setWithObjects:
		                             Empty_to_PartiallyFilled
		                             , nil];
		Empty.incomingTransitions = [NSSet setWithObjects:
		                             initial_to_Empty,
		                             Locked_to_Empty,
		                             PartiallyFilled_to_Empty,
		                             CompletelyFilled_to_Empty
		                             , nil];
        
		final0.incomingTransitions = [NSSet setWithObjects:
		                              CompletelyFilled_to_final0
		                              , nil];
        
		PartiallyFilled.outgoingTransitions = [NSSet setWithObjects:
		                                       PartiallyFilled_to_CompletelyFilled,
		                                       PartiallyFilled_to_Empty,
		                                       PartiallyFilled_to_PartiallyFilled_DigitDeleted,
		                                       PartiallyFilled_to_PartiallyFilled_DigitEntered
		                                       , nil];
		PartiallyFilled.incomingTransitions = [NSSet setWithObjects:
		                                       Empty_to_PartiallyFilled,
		                                       PartiallyFilled_to_PartiallyFilled_DigitDeleted,
		                                       PartiallyFilled_to_PartiallyFilled_DigitEntered
		                                       , nil];
        
		CompletelyFilled.outgoingTransitions = [NSSet setWithObjects:
		                                        CompletelyFilled_to_Locked,
		                                        CompletelyFilled_to_final0,
		                                        CompletelyFilled_to_Empty
		                                        , nil];
		CompletelyFilled.incomingTransitions = [NSSet setWithObjects:
		                                        PartiallyFilled_to_CompletelyFilled
		                                        , nil];
        
		Locked.outgoingTransitions = [NSSet setWithObjects:
		                              Locked_to_Empty
		                              , nil];
		Locked.incomingTransitions = [NSSet setWithObjects:
		                              CompletelyFilled_to_Locked
		                              , nil];
        
		//transitions -> states
		initial_to_Empty.sourceState = initial;
		initial_to_Empty.targetState = Empty;
        
		Empty_to_PartiallyFilled.sourceState = Empty;
		Empty_to_PartiallyFilled.targetState = PartiallyFilled;
        
		PartiallyFilled_to_CompletelyFilled.sourceState = PartiallyFilled;
		PartiallyFilled_to_CompletelyFilled.targetState = CompletelyFilled;
        
		CompletelyFilled_to_Locked.sourceState = CompletelyFilled;
		CompletelyFilled_to_Locked.targetState = Locked;
        
		CompletelyFilled_to_final0.sourceState = CompletelyFilled;
		CompletelyFilled_to_final0.targetState = final0;
        
		CompletelyFilled_to_Empty.sourceState = CompletelyFilled;
		CompletelyFilled_to_Empty.targetState = Empty;
        
		Locked_to_Empty.sourceState = Locked;
		Locked_to_Empty.targetState = Empty;
        
		PartiallyFilled_to_Empty.sourceState = PartiallyFilled;
		PartiallyFilled_to_Empty.targetState = Empty;
        
		PartiallyFilled_to_PartiallyFilled_DigitDeleted.sourceState = PartiallyFilled;
		PartiallyFilled_to_PartiallyFilled_DigitDeleted.targetState = PartiallyFilled;
        
		PartiallyFilled_to_PartiallyFilled_DigitEntered.sourceState = PartiallyFilled;
		PartiallyFilled_to_PartiallyFilled_DigitEntered.targetState = PartiallyFilled;
        
		/*
		 * Add states and transitions to this state machine instance.
		 */
		[self.states addObject: initial];
		[self.states addObject: Empty];
		[self.states addObject: final0];
		[self.states addObject: PartiallyFilled];
		[self.states addObject: CompletelyFilled];
		[self.states addObject: Locked];
        
		[self.transitions addObject: initial_to_Empty];
		[self.transitions addObject: Empty_to_PartiallyFilled];
		[self.transitions addObject: PartiallyFilled_to_CompletelyFilled];
		[self.transitions addObject: CompletelyFilled_to_Locked];
		[self.transitions addObject: CompletelyFilled_to_final0];
		[self.transitions addObject: CompletelyFilled_to_Empty];
		[self.transitions addObject: Locked_to_Empty];
		[self.transitions addObject: PartiallyFilled_to_Empty];
		[self.transitions addObject: PartiallyFilled_to_PartiallyFilled_DigitDeleted];
		[self.transitions addObject: PartiallyFilled_to_PartiallyFilled_DigitEntered];
	}
	return self;
}

- (void) dispatchEvent:(MOBEvent) event {
    switch (event) 
    {
        case PasswordEntry_Event_DIGITENTERED:
        {
            switch ([self.currentState ID]) 
            {
                case PasswordEntry_State_EMPTY:
                {
                    if ([self evaluateGuardSelector:@"guard_Empty_to_PartiallyFilled"]) 
                    {
                        [self switchTransitionWithID:PasswordEntry_Transition_EMPTY_PARTIALLYFILLED];
                    } 
                    else 
                    {
                        NSLog(@"MOBStateMachine::No guard permits transition in state: %@ for event: %lu.", [self.currentState name], (unsigned long)event);
                    }
                    break;
                }
                case PasswordEntry_State_PARTIALLYFILLED:
                {
                    if ([self evaluateGuardSelector:@"guard_PartiallyFilled_to_PartiallyFilled_DigitEntered"]) 
                    {
                        [self switchTransitionWithID:PasswordEntry_Transition_PARTIALLYFILLED_PARTIALLYFILLED_DIGITENTERED];
                    } 
                    else if ([self evaluateGuardSelector:@"guard_PartiallyFilled_to_CompletelyFilled"]) 
                    {
                        [self switchTransitionWithID:PasswordEntry_Transition_PARTIALLYFILLED_COMPLETELYFILLED];
                    }
                    else
                    {
                        NSLog(@"MOBStateMachine::No guard permits transition in state: %@ for event: %lu.", [self.currentState name], (unsigned long)event);
                    }
                    break;
                }
                default:
                {
                    NSLog(@"MOBStateMachine::Warning: state: %@ not designated to react to event: %lu.", [self.currentState name], (unsigned long)event);
                    break;
                }
            }
            break;
        }
        case PasswordEntry_Event_DIGITDELETED:
        {
            switch ([self.currentState ID]) 
            {
                case PasswordEntry_State_PARTIALLYFILLED:
                {
                    if ([self evaluateGuardSelector:@"guard_PartiallyFilled_to_Empty"]) 
                    {
                        [self switchTransitionWithID:PasswordEntry_Transition_PARTIALLYFILLED_EMPTY];
                    }
                    else if ([self evaluateGuardSelector:@"guard_PartiallyFilled_to_PartiallyFilled_DigitDeleted"])
                    {
                        [self switchTransitionWithID:PasswordEntry_Transition_PARTIALLYFILLED_PARTIALLYFILLED_DIGITDELETED];
                    }
                    else
                    {
                        NSLog(@"MOBStateMachine::No guard permits transition in state: %@ for event: %lu.", [self.currentState name], (unsigned long)event);
                    }
                    break;
                }
                default:
                {
                    NSLog(@"MOBStateMachine::Warning: state: %@ not designated to react to event: %lu.", [self.currentState name], (unsigned long)event);
                    break;
                }
            }
            break;
        }
        case PasswordEntry_Event_USERAUTHENTICATED:
        {
            switch ([self.currentState ID]) 
            {
                case PasswordEntry_State_COMPLETELYFILLED:
                {
                    if ([self evaluateGuardSelector:@"guard_CompletelyFilled_to_final0"]) 
                    {
                        [self switchTransitionWithID:PasswordEntry_Transition_COMPLETELYFILLED_FINAL0];
                    }
                    else
                    {
                        NSLog(@"MOBStateMachine::No guard permits transition in state: %@ for event: %lu.", [self.currentState name], (unsigned long)event);
                    }
                    break;
                }
                default:
                {
                    NSLog(@"MOBStateMachine::Warning: state: %@ not designated to react to event: %lu.", [self.currentState name], (unsigned long)event);
                    break;
                }
            }
            break;
        }
        case PasswordEntry_Event_USERNOTAUTHENTICATED:
        {
            switch ([self.currentState ID]) 
            {
                case PasswordEntry_State_COMPLETELYFILLED:
                {
                    if ([self evaluateGuardSelector:@"guard_CompletelyFilled_to_Empty"]) 
                    {
                        [self switchTransitionWithID:PasswordEntry_Transition_COMPLETELYFILLED_EMPTY];
                    }
                    else if ([self evaluateGuardSelector:@"guard_CompletelyFilled_to_Locked"])
                    {
                        [self switchTransitionWithID:PasswordEntry_Transition_COMPLETELYFILLED_LOCKED];
                    }
                    else
                    {
                        NSLog(@"MOBStateMachine::No guard permits transition in state: %@ for event: %lu.", [self.currentState name], (unsigned long)event);
                    }
                    break;
                }
                default:
                {
                    NSLog(@"MOBStateMachine::Warning: state: %@ not designated to react to event: %lu.", [self.currentState name], (unsigned long)event);
                    break;
                }
            }
            break;
        }
        default:
        {
            NSLog(@"MOBStateMachine::Error: Cannot handle event: %lu", (unsigned long)event);

            [self.delegate handleStateMachineError:MOBStateMachineError_UnknownEvent];
        }
    }
}

@end
