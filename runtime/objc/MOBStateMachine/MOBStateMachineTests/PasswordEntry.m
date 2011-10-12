//
//  PasswordEntry.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "PasswordEntry.h"

#import "PasswordEntryStateMachine.h"

@implementation PasswordEntry

@synthesize pin, correctUserPin, stateMachine;

- (id)init
{
    self = [super init];
    if (self) {
        self.stateMachine = [[PasswordEntryStateMachine new] autorelease];
        [stateMachine setDelegate:self];
        [stateMachine start];
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

#pragma mark guards

- (NSNumber*) guard_partiallyFilled_to_empty {
    BOOL result = NO;
    
    if ([pin count] == 0) {
        result = YES;
    }
    
    NSLog(@"evaluated guard_partiallyFilled_to_empty with result: %d", result);
    
    return [NSNumber numberWithBool:result];
}

- (NSNumber*) guard_partiallyFilled_to_partiallyFilled {
    BOOL result = NO;
    
    if ([pin count] > 0 && [pin count] < MAX_PIN_DIGITS) {
        result = YES;
    }
    
    NSLog(@"evaluated guard_partiallyFilled_to_partiallyFilled with result: %d", result);
    
    return [NSNumber numberWithBool:result];
}

- (NSNumber*) guard_partiallyFilled_to_completelyFilled {
    BOOL result = NO;
    
    if ([pin count] == MAX_PIN_DIGITS) {
        result = YES;
    }
    
    NSLog(@"evaluated guard_partiallyFilled_to_completelyFilled with result: %d", result);
    
    return [NSNumber numberWithBool:result];
}

- (NSNumber*) guard_completelyFilled_to_userAuthenticated {
    BOOL result = NO;
    
    NSLog(@"evaluated guard_completelyFilled_to_userAuthenticated with result: %d", result);
    
    return [NSNumber numberWithBool:result];
}

- (NSNumber*) guard_completelyFilled_to_userNotAuthenticated {
    BOOL result = NO;
    
    NSLog(@"evaluated guard_completelyFilled_to_userNotAuthenticated with result: %d", result);
    
    return [NSNumber numberWithBool:result];
}

@end
