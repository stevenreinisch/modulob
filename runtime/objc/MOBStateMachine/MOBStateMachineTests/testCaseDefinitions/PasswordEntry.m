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

@synthesize pin, lastDigitDeleted, correctUserPin, stateMachine, pinCorrect, lockAfterFailedAuthentication;

- (id)init
{
    self = [super init];
    if (self) {
        self.stateMachine = [[PasswordEntryStateMachine new] autorelease];
        [stateMachine setDelegate:self];
        [stateMachine start];
        
        self.pinCorrect = NO;
        self.lockAfterFailedAuthentication = NO;
        self.lastDigitDeleted = NO;
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
    self.lastDigitDeleted = NO;
    [self.stateMachine handleEvent:PasswordEntry_Event_DIGITENTERED];
}

- (void) deleteChar {
    [self.pin removeLastObject];
    self.lastDigitDeleted = YES;
    [self.stateMachine handleEvent:PasswordEntry_Event_DIGITDELETED];
}

#pragma mark -
#pragma mark state handling

- (void) finishedProcessing {
    
}

- (void) handleStateMachineError:(MOBStateMachineError) error {
    switch (error) {
        case MOBStateMachineError_AlreadyInFinalState:
            //handle it!
            break;
            
        case MOBStateMachineError_TransitionUnknown:
            //handle it
            break;
            
        case MOBStateMachineError_NotInSourceStateOfSwitchedTransition:
            //handle it
            break;
            
        default:
            break;
    }
}

- (void) enter_Empty {
    self.pin = [[NSMutableArray new] autorelease];
}

- (void) enter_CompletelyFilled {
    NSMutableString *enteredPin = [NSMutableString stringWithCapacity:MAX_PIN_DIGITS];
    for (NSString *digit in pin){
        [enteredPin appendString:digit];
    }
    
    if ([correctUserPin isEqualToString:enteredPin]) {
        pinCorrect = YES;

        [self.stateMachine handleEvent:PasswordEntry_Event_USERAUTHENTICATED];
    } else {
        pinCorrect = NO;
        
        [self.stateMachine handleEvent:PasswordEntry_Event_USERNOTAUTHENTICATED];
    }
}

#pragma mark guards

- (BOOL) guard_PartiallyFilled_to_Empty {
    BOOL result = NO;
    
    if ([pin count] == 0) {
        result = YES;
    }
    
    NSLog(@"evaluated guard_PartiallyFilled_to_Empty with result: %d", result);
    
    return result;
}

- (BOOL) guard_PartiallyFilled_to_PartiallyFilled_DigitEntered {
    BOOL result = NO;
    
    if ([pin count] > 0 
        && 
        [pin count] < MAX_PIN_DIGITS
        &&
        !self.lastDigitDeleted)
    {
        result = YES;
    }
    
    NSLog(@"evaluated guard_PartiallyFilled_to_PartiallyFilled_DigitEntered with result: %d", result);
    
    return result;
}

- (BOOL) guard_PartiallyFilled_to_PartiallyFilled_DigitDeleted {
    BOOL result = NO;
    
    if ([pin count] > 0 
        && 
        [pin count] < MAX_PIN_DIGITS
        &&
        self.lastDigitDeleted)
    {
        result = YES;
    }

    
    NSLog(@"evaluated guard_PartiallyFilled_to_PartiallyFilled_DigitDeleted with result: %d", result);
    
    return result;
}

- (BOOL) guard_PartiallyFilled_to_CompletelyFilled {
    BOOL result = NO;
    
    if ([pin count] == MAX_PIN_DIGITS) {
        result = YES;
    }
    
    NSLog(@"evaluated guard_PartiallyFilled_to_CompletelyFilled with result: %d", result);
    
    return result;
}

- (BOOL) guard_CompletelyFilled_to_final0 {
    BOOL result = pinCorrect;
    
    NSLog(@"evaluated guard_CompletelyFilled_to_final0 with result: %d", result);
    
    return result;
}

- (BOOL) guard_CompletelyFilled_to_Locked {
    BOOL result = !pinCorrect && lockAfterFailedAuthentication;
    
    NSLog(@"evaluated guard_CompletelyFilled_to_Locked with result: %d", result);
    
    return result;
}

- (BOOL) guard_CompletelyFilled_to_Empty {
    BOOL result = !pinCorrect && !lockAfterFailedAuthentication;
    
    NSLog(@"evaluated guard_CompletelyFilled_to_Empty with result: %d", result);
    
    return result;
}

@end
