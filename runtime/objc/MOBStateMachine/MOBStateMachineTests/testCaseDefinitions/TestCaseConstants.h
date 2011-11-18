//
//  TestCaseConstants.h
//  MOBStateMachine
//
//  Created by steven reinisch on 11/18/11.
//  Copyright (c) 2011 __MyCompanyName__. All rights reserved.
//

/*
 * Set this macro to 1 if you want to demonstrate
 * the state machine behaviour if a state must be
 * exited immediately if it has been entered.
 * (see PasswordEntryStateMachine.m definition of
 *  state completelyFilled) 
 */
#define DEMONSTARTE_IMMEDIATE_STATE_EXIT 1

/*
 * Set this macro to 1 if you want to demonstrate
 * the state machine behaviour if transitions are
 * switched from outside the state machine.
 * (See PasswordEntry.m #enter_completelyFilled)
 */
#define DEMONSTARTE_EXTERNAL_TRANSITION_SWITCH 0
