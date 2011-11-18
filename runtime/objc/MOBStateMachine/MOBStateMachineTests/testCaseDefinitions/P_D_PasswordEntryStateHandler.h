//
//  P_D_PasswordEntryStateHandler.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>

@protocol P_D_PasswordEntryStateHandler <NSObject>
@optional

#pragma mark states: entry and exit (optional)

/*
 * INITIAL state initial
 */
- (void) enter_initial;
- (void) exit_initial;

/*
 * state empty
 */
- (void) enter_empty;
- (void) exit_empty;

/*
 * state partiallyFilled
 */
- (void) enter_partiallyFilled;
- (void) exit_partiallyFilled;

/*
 * state completelyFilled
 */
- (void) enter_completelyFilled;
- (void) exit_completelyFilled;

/*
 * state userAuthenticated
 */
- (void) enter_userAuthenticated;
- (void) exit_userAuthenticated;

/*
 * FINAL state userAuthenticated_final
 */
- (void) enter_userAuthenticated_final;

/*
 * state userNotAuthenticated
 */
- (void) enter_userNotAuthenticated;
- (void) exit_userNotAuthenticated;

/*
 * state locked
 */
- (void) enter_locked;
- (void) exit_locked;

#pragma mark -
#pragma mark transitions: actions (optional)

/*
 * transition initial_to_empty
 */
- (void) action_initial_to_empty;

/*
 * transition empty_to_partiallyFilled
 */
- (void) action_empty_to_partiallyFilled;

/*
 * transition partiallyFilled_to_empty
 */
- (void) action_partiallyFilled_to_empty;

/*
 * transition partiallyFilled_to_partiallyFilled
 */
- (void) action_partiallyFilled_to_partiallyFilled;

/*
 * transition partiallyFilled_to_completelyFilled
 */
- (void) action_partiallyFilled_to_completelyFilled;

/*
 * transition completelyFilled_to_userAuthenticated
 */
- (void) action_completelyFilled_to_userAuthenticated;

/*
 * transition completelyFilled_to_userNotAuthenticated
 */
- (void) action_completelyFilled_to_userNotAuthenticated;

/*
 * transition userNotAuthenticated_to_empty
 */
- (void) action_userNotAuthenticated_to_empty;

/*
 * transition userNotAuthenticated_to_locked
 */
- (void) action_userNotAuthenticated_to_locked;

/*
 * transition userauthenticated_to_final
 */
- (void) action_userauthenticated_to_final;

/*
 * transition locked_to_empty
 */
- (void) action_locked_to_empty;

/*
 * transition locked_to_userauthenticated
 */
- (void) action_locked_to_userauthenticated;

/*
 * transition locked_to_userauthenticated
 */
- (void) action_locked_to_userauthenticated;

/*
 * transition userauthenticated_to_empty
 */
- (void) action_userauthenticated_to_empty;

#pragma mark -
#pragma mark guards
#pragma mark !! do not call [stateMachine update] in guards. This will trigger infinite loop!!
#pragma mark -

#pragma mark transitions: optional guards
//Guards are optional if state has only one outgoing transition.

/*
 * transition empty_to_partiallyFilled
 */
- (BOOL) guard_empty_to_partiallyFilled;

#pragma mark transitions: required guards

@required

/*
 * transition partiallyFilled_to_empty
 */
- (BOOL) guard_partiallyFilled_to_empty;

/*
 * transition partiallyFilled_to_partiallyFilled
 */
- (BOOL) guard_partiallyFilled_to_partiallyFilled;

/*
 * transition partiallyFilled_to_completelyFilled
 */
- (BOOL) guard_partiallyFilled_to_completelyFilled;

/*
 * transition completelyFilled_to_userAuthenticated
 */
- (BOOL) guard_completelyFilled_to_userAuthenticated;

/*
 * transition completelyFilled_to_userNotAuthenticated
 */
- (BOOL) guard_completelyFilled_to_userNotAuthenticated;

/*
 * transition userNotAuthenticated_to_empty
 */
- (BOOL) guard_userNotAuthenticated_to_empty;

/*
 * transition userNotAuthenticated_to_locked
 */
- (BOOL) guard_userNotAuthenticated_to_locked;

/*
 * transition locked_to_empty .. no guards for timeoutTransitions
 */

/*
 * transition userauthenticated_to_final
 */
- (BOOL) guard_userauthenticated_to_final;

/*
 * transition locked_to_userauthenticated
 */
- (BOOL) guard_locked_to_userauthenticated;

/*
 * transition userauthenticated_to_empty
 */
- (BOOL) guard_userauthenticated_to_empty;

@end
