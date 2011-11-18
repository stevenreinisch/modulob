//
//  PasswordEntry.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "PasswordEntry.h"

#import "PasswordEntryStateMachine.h"

#import "TestCaseConstants.h"

@implementation PasswordEntry

@synthesize pin, correctUserPin, stateMachine, pinCorrect, lockAfterFailedAuthentication;

- (id)init
{
    self = [super init];
    if (self) {
        self.stateMachine = [[PasswordEntryStateMachine new] autorelease];
        [stateMachine setDelegate:self];
        [stateMachine start];
        
        self.pinCorrect = NO;
        self.lockAfterFailedAuthentication = NO;
    }
    
    return self;
}

- (void) dealloc {
    self.stateMachine = nil;
    
    [super dealloc];
}

#pragma mark -

- (void) keyStroke:(NSString*) enteredChar {
    [self.pin addObject:enteredChar];
    [self.stateMachine update];
}

- (void) deleteChar {
    [self.pin removeLastObject];
    [self.stateMachine update];
}

#pragma mark -
#pragma mark state handling

- (void) enter_empty {
    self.pin = [[NSMutableArray new] autorelease];
}

- (void) enter_completelyFilled {
    NSMutableString *enteredPin = [NSMutableString stringWithCapacity:MAX_PIN_DIGITS];
    for (NSString *digit in pin){
        [enteredPin appendString:digit];
    }
    
    if ([correctUserPin isEqualToString:enteredPin]) {
        pinCorrect = YES;

        #if DEMONSTARTE_IMMEDIATE_STATE_EXIT==0 && DEMONSTARTE_EXTERNAL_TRANSITION_SWITCH==1
        [stateMachine switchTransitionWithID:PasswordEntryTransition_COMPLETELYFILLED_USERAUTHENTICATED];
        #endif
    }
    
    #if DEMONSTARTE_IMMEDIATE_STATE_EXIT==0 && DEMONSTARTE_EXTERNAL_TRANSITION_SWITCH==1
    [stateMachine switchTransitionWithID:PasswordEntryTransition_COMPLETELYFILLED_USERNOTAUTHENTICATED];
    #endif
}

- (void) enter_userNotAuthenticated {
    //we could present the user a dialog here ..
    
    [stateMachine update];
}

#pragma mark guards

- (BOOL) guard_partiallyFilled_to_empty {
    BOOL result = NO;
    
    if ([pin count] == 0) {
        result = YES;
    }
    
    NSLog(@"evaluated guard_partiallyFilled_to_empty with result: %d", result);
    
    return result;
}

- (BOOL) guard_partiallyFilled_to_partiallyFilled {
    BOOL result = NO;
    
    if ([pin count] > 0 && [pin count] < MAX_PIN_DIGITS) {
        result = YES;
    }
    
    NSLog(@"evaluated guard_partiallyFilled_to_partiallyFilled with result: %d", result);
    
    return result;
}

- (BOOL) guard_partiallyFilled_to_completelyFilled {
    BOOL result = NO;
    
    if ([pin count] == MAX_PIN_DIGITS) {
        result = YES;
    }
    
    NSLog(@"evaluated guard_partiallyFilled_to_completelyFilled with result: %d", result);
    
    return result;
}

- (BOOL) guard_completelyFilled_to_userAuthenticated {
    BOOL result = pinCorrect;
    
    NSLog(@"evaluated guard_completelyFilled_to_userAuthenticated with result: %d", result);
    
    return result;
}

- (BOOL) guard_completelyFilled_to_userNotAuthenticated {
    BOOL result = !pinCorrect;
    
    NSLog(@"evaluated guard_completelyFilled_to_userNotAuthenticated with result: %d", result);
    
    return result;
}

- (BOOL) guard_userNotAuthenticated_to_empty {
    BOOL result = !lockAfterFailedAuthentication;
    
    NSLog(@"evaluated guard_userNotAuthenticated_to_empty with result: %d", result);
    
    return result;
}

- (BOOL) guard_userNotAuthenticated_to_locked {
    BOOL result = lockAfterFailedAuthentication;
    
    NSLog(@"evaluated guard_userNotAuthenticated_to_locked with result: %d", result);
    
    return result;
}

@end
