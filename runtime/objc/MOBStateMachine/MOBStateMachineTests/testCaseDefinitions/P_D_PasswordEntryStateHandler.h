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
 * INITIAL state empty
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
 * FINAL state userAuthenticated
 */
- (void) enter_userAuthenticated;
- (void) exit_userAuthenticated;

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
 * transition locked_to_empty
 */
- (void) action_locked_to_empty;

#pragma mark transitions: guards (optional)
/*
 * Guards are optional if state has only one
 * outgoing transition.
 */

/*
 * transition empty_to_partiallyFilled
 */
- (NSNumber*) guard_empty_to_partiallyFilled;

/*
 * transition locked_to_empty
 */
- (NSNumber*) guard_locked_to_empty;

#pragma mark transitions: guards (required)

@required

/*
 * transition partiallyFilled_to_empty
 */
- (NSNumber*) guard_partiallyFilled_to_empty;

/*
 * transition partiallyFilled_to_partiallyFilled
 */
- (NSNumber*) guard_partiallyFilled_to_partiallyFilled;

/*
 * transition partiallyFilled_to_completelyFilled
 */
- (NSNumber*) guard_partiallyFilled_to_completelyFilled;

/*
 * transition completelyFilled_to_userAuthenticated
 */
- (NSNumber*) guard_completelyFilled_to_userAuthenticated;

/*
 * transition completelyFilled_to_userNotAuthenticated
 */
- (NSNumber*) guard_completelyFilled_to_userNotAuthenticated;

/*
 * transition userNotAuthenticated_to_empty
 */
- (NSNumber*) guard_userNotAuthenticated_to_empty;

/*
 * transition userNotAuthenticated_to_locked
 */
- (NSNumber*) guard_userNotAuthenticated_to_locked;

@end
