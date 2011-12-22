#import "MOBStateMachine.h"
#import "MOBStateMachineConstants.h"

@protocol P_D_PasswordEntryStateHandler <P_D_MOBStateHandler>

@optional

#pragma mark states: entry and exit (optional)

/*
 * state initial
 */
- (void) exit_initial;

/*
 * state Empty
 */
- (void) enter_Empty;
- (void) exit_Empty;

/*
 * state final0
 */
- (void) enter_final0;

/*
 * state PartiallyFilled
 */
- (void) enter_PartiallyFilled;
- (void) exit_PartiallyFilled;

/*
 * state CompletelyFilled
 */
- (void) enter_CompletelyFilled;
- (void) exit_CompletelyFilled;

/*
 * state Locked
 */
- (void) enter_Locked;
- (void) exit_Locked;

#pragma mark -
#pragma mark transitions: actions (optional)

/*
 * transition initial_to_Empty
 */
- (void) action_initial_to_Empty;

/*
 * transition Empty_to_PartiallyFilled
 */
- (void) action_Empty_to_PartiallyFilled;

/*
 * transition PartiallyFilled_to_CompletelyFilled
 */
- (void) action_PartiallyFilled_to_CompletelyFilled;

/*
 * transition CompletelyFilled_to_Locked
 */
- (void) action_CompletelyFilled_to_Locked;

/*
 * transition CompletelyFilled_to_final0
 */
- (void) action_CompletelyFilled_to_final0;

/*
 * transition CompletelyFilled_to_Empty
 */
- (void) action_CompletelyFilled_to_Empty;

/*
 * transition Locked_to_Empty
 */
- (void) action_Locked_to_Empty;

/*
 * transition PartiallyFilled_to_Empty
 */
- (void) action_PartiallyFilled_to_Empty;

/*
 * transition PartiallyFilled_to_PartiallyFilled_DigitDeleted
 */
- (void) action_PartiallyFilled_to_PartiallyFilled_DigitDeleted;

/*
 * transition PartiallyFilled_to_PartiallyFilled_DigitEntered
 */
- (void) action_PartiallyFilled_to_PartiallyFilled_DigitEntered;

#pragma mark transitions: guards (optional)
//Guards are optional if state has only one outgoing transition.
//Guards for timeout transitions are not evaluated and thus neither optional nor required.

/*
 * transition initial_to_Empty
 *
 */
- (BOOL) guard_initial_to_Empty;

/*
 * transition Empty_to_PartiallyFilled
 *
 */
- (BOOL) guard_Empty_to_PartiallyFilled;

#pragma mark transitions: guards (required)
//Guards for timeout transitions are not evaluated and thus neither optional nor required.

/*
 * transition PartiallyFilled_to_CompletelyFilled
 *
 */
- (BOOL) guard_PartiallyFilled_to_CompletelyFilled;

/*
 * transition PartiallyFilled_to_Empty
 *
 */
- (BOOL) guard_PartiallyFilled_to_Empty;

/*
 * transition PartiallyFilled_to_PartiallyFilled_DigitDeleted
 *
 */
- (BOOL) guard_PartiallyFilled_to_PartiallyFilled_DigitDeleted;

/*
 * transition PartiallyFilled_to_PartiallyFilled_DigitEntered
 *
 */
- (BOOL) guard_PartiallyFilled_to_PartiallyFilled_DigitEntered;

/*
 * transition CompletelyFilled_to_Locked
 *
 */
- (BOOL) guard_CompletelyFilled_to_Locked;

/*
 * transition CompletelyFilled_to_final0
 *
 */
- (BOOL) guard_CompletelyFilled_to_final0;

/*
 * transition CompletelyFilled_to_Empty
 *
 */
- (BOOL) guard_CompletelyFilled_to_Empty;

@end