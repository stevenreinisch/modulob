#import "MOBStateMachine.h"
#import "MOBStateMachineConstants.h"

@protocol P_D_TrafficLightStateHandler <P_D_MOBStateHandler>

@optional

#pragma mark states: entry and exit (optional)

/*
 * state initial
 */
- (void) exit_initial;

/*
 * state Red
 */
- (void) enter_Red;
- (void) exit_Red;

/*
 * state final0
 */
- (void) enter_final0;

/*
 * state Yellow
 */
- (void) enter_Yellow;
- (void) exit_Yellow;

/*
 * state Green
 */
- (void) enter_Green;
- (void) exit_Green;

/*
 * state GreenYellow
 */
- (void) enter_GreenYellow;
- (void) exit_GreenYellow;

#pragma mark -
#pragma mark transitions: actions (optional)

/*
 * transition initial_to_Red
 */
- (void) action_initial_to_Red;

/*
 * transition Red_to_final0
 */
- (void) action_Red_to_final0;

/*
 * transition Red_to_Yellow
 */
- (void) action_Red_to_Yellow;

/*
 * transition Yellow_to_Green
 */
- (void) action_Yellow_to_Green;

/*
 * transition Green_to_GreenYellow
 */
- (void) action_Green_to_GreenYellow;

/*
 * transition GreenYellow_to_Red
 */
- (void) action_GreenYellow_to_Red;

#pragma mark transitions: guards (optional)
//Guards are optional if state has only one outgoing transition.
//Guards for timeout transitions are not evaluated and thus neither optional nor required.

/*
 * transition initial_to_Red
 *
 */
- (BOOL) guard_initial_to_Red;

#pragma mark transitions: guards (required)
//Guards for timeout transitions are not evaluated and thus neither optional nor required.

/*
 * transition Red_to_final0
 *
 */
- (BOOL) guard_Red_to_final0;

@end