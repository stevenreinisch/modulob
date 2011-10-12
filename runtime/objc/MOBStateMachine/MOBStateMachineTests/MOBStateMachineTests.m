//
//  MOBStateMachineTests.m
//  MOBStateMachineTests
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBStateMachineTests.h"

#import "PasswordEntry.h"
#import "PasswordEntryStateMachine.h"

@interface MOBStateMachineTests ()
@property (nonatomic, retain) PasswordEntry *passwordEntry;
@end

#pragma -

@implementation MOBStateMachineTests

@synthesize passwordEntry;

- (void)setUp
{
    [super setUp];
    
    self.passwordEntry = [[PasswordEntry new] autorelease];
}

- (void)tearDown
{
    self.passwordEntry = nil;
    
    [super tearDown];
}

- (void)testState
{
    STAssertNotNil(passwordEntry.stateMachine, @"no state machine found");
    
    STAssertEquals(passwordEntry.stateMachine.currentState.ID, 
                   (NSInteger)PasswordEntryState_EMPTY, 
                   @"wrong current state");
    
    STAssertNotNil(passwordEntry.pin, @"pin should not be nil");
    STAssertEquals([passwordEntry.pin count], (NSUInteger)0, 
                   @"pin should be empty");
    
    /*
     * The user enters a character into the empty pin field.
     * We expect the passwordEntry to be in state partially filled.
     */
    [passwordEntry keyStroke:@"0"];
    
    STAssertEquals(passwordEntry.stateMachine.currentState.ID, 
                   (NSInteger)PasswordEntryState_PARTIALLYFILLED, 
                   @"wrong current state");
}

@end
