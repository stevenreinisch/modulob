//
//  PasswordEntry.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "PasswordEntry.h"

#import "MOBStateMachine.h"

@implementation PasswordEntry

@synthesize pin, correctUserPin, stateMachine;

- (id)init
{
    self = [super init];
    if (self) {
        // Initialization code here.
    }
    
    return self;
}

- (void) keyStroke:(NSString*) enteredChar {
    [self.pin addObject:enteredChar];
    [self.stateMachine update];
}

- (void) onDeleteChar {
    [self.pin removeLastObject];
    [self.stateMachine update];
}



@end
