//
//  PasswordEntry.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "MOBStateMachine.h"
#import "P_D_PasswordEntryStateHandler.h"

@interface PasswordEntry : NSObject <P_D_PasswordEntryStateHandler>

/*
 * Array of characters denoting a pin.
 * Pin can have at most 4 characters.
 */
@property (nonatomic, retain) NSMutableArray *pin;

@property (nonatomic, retain) NSString *correctUserPin;

/*
 * This state machine controls the state of
 * instances of this class.
 */
@property (nonatomic, retain) MOBStateMachine *stateMachine;

/*
 * The user has entered a character into a pin field.
 */
- (void) keyStroke:(NSString*) enteredChar;

/*
 * The last character in the pin field has been deleted.
 */
- (void) onDeleteChar;

@end
