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

- (void) onDeleteChar {
    [self.pin removeLastObject];
    [self.stateMachine update];
}

#pragma mark -
#pragma mark state handling

- (void) enter_empty {
    self.pin = [[NSMutableArray new] autorelease];
}

@end
