//
//  MOBStateMachineConstants.h
//  MOBStateMachine
//
//  Created by steven reinisch on 11/11/11.
//  Copyright (c) 2011 __MyCompanyName__. All rights reserved.
//

#define MOBSTATEMACHINE_UNDEFINED -1
#define MOBSTATEMACHINE_DEFINED(i) i > MOBSTATEMACHINE_UNDEFINED

/*
 * If you set a state's duration to this value,
 * the state machine will not reside in this state
 * and wait for a call to [update] from outside,
 * but exit the state immediately after it has been
 * entered.
 */
#define MOBIMMEDIATE_STATE_EXIT 0

typedef NSUInteger MOBTransitionID;
typedef NSUInteger MOBStateID;

typedef enum{
    MOBStateMachineError_AlreadyInFinalState = 0,
    MOBStateMachineError_TransitionUnknown,
    MOBStateMachineError_NotInSourceStateOfSwitchedTransition
} MOBStateMachineError;
