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

#pragma mark states entry and exit

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
 * state userNotAuthenticated
 */
- (void) enter_userNotAuthenticated;
- (void) exit_userNotAuthenticated;

#pragma mark -
#pragma mark transitions guard and action

/*
 * transition empty_to_partiallyFilled
 */
- (NSNumber*) guard_empty_to_partiallyFilled;
- (void) action_empty_to_partiallyFilled;

/*
 * transition partiallyFilled_to_empty
 */
- (NSNumber*) guard_partiallyFilled_to_empty;
- (void) action_partiallyFilled_to_empty;

/*
 * transition partiallyFilled_to_partiallyFilled
 */
- (NSNumber*) guard_partiallyFilled_to_partiallyFilled;
- (void) action_partiallyFilled_to_partiallyFilled;

/*
 * transition partiallyFilled_to_completelyFilled
 */
- (NSNumber*) guard_partiallyFilled_to_completelyFilled;
- (void) action_partiallyFilled_to_completelyFilled;

/*
 * transition completelyFilled_to_userAuthenticated
 */
- (NSNumber*) guard_completelyFilled_to_userAuthenticated;
- (void) action_completelyFilled_to_userAuthenticated;

/*
 * transition completelyFilled_to_userNotAuthenticated
 */
- (NSNumber*) guard_completelyFilled_to_userNotAuthenticated;
- (void) action_completelyFilled_to_userNotAuthenticated;

/*
 * transition userNotAuthenticated_to_empty
 */
- (NSNumber*) guard_userNotAuthenticated_to_empty;
- (void) action_userNotAuthenticated_to_empty;

@end
