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
    self.passwordEntry.correctUserPin = @"2247";
    self.passwordEntry.lockAfterFailedAuthentication = NO;
}

- (void)tearDown
{
    self.passwordEntry = nil;
    
    [super tearDown];
}

- (void)testState
{
    STAssertNotNil(passwordEntry.stateMachine, @"no state machine found");
    
    STAssertEquals([[passwordEntry.stateMachine currentState] ID], 
                   (NSUInteger)PasswordEntry_State_EMPTY, 
                   @"wrong current state");
    
    STAssertNotNil(passwordEntry.pin, @"pin should not be nil");
    STAssertEquals([passwordEntry.pin count], (NSUInteger)0, 
                   @"pin should be empty");
    
    /*
     * The user enters a character into the empty pin field.
     * We expect the passwordEntry to be in state partially filled.
     */
    [passwordEntry keyStroke:@"0"];
        
    STAssertEquals([[passwordEntry.stateMachine currentState] ID], 
                   (NSUInteger)PasswordEntry_State_PARTIALLYFILLED, 
                   @"wrong current state");
    
    [passwordEntry deleteChar];
    
    STAssertEquals([[passwordEntry.stateMachine currentState] ID], 
                   (NSUInteger)PasswordEntry_State_EMPTY, 
                   @"wrong current state");
    
    //enter first digit
    [passwordEntry keyStroke:@"2"];
    
    STAssertEquals([[passwordEntry.stateMachine currentState] ID], 
                   (NSUInteger)PasswordEntry_State_PARTIALLYFILLED, 
                   @"wrong current state");
    
    //enter second digit
    [passwordEntry keyStroke:@"2"];
    
    STAssertEquals([[passwordEntry.stateMachine currentState] ID], 
                   (NSUInteger)PasswordEntry_State_PARTIALLYFILLED, 
                   @"wrong current state");
    
    //enter third digit
    [passwordEntry keyStroke:@"4"];
    
    STAssertEquals([[passwordEntry.stateMachine currentState] ID], 
                   (NSUInteger)PasswordEntry_State_PARTIALLYFILLED, 
                   @"wrong current state");
    
    //enter fourth digit
    [passwordEntry keyStroke:@"7"];
    
    if ([@"2247" isEqualToString:self.passwordEntry.correctUserPin]) {
        STAssertEquals([[passwordEntry.stateMachine currentState] ID], 
                       (NSUInteger)PasswordEntry_State_FINAL0, 
                       @"wrong current state");
    } else {
        /*
        * After the user has entered MAX_PIN_DIGITS passwordEntry
        * enters the state PasswordEntryState_COMPLETELYFILLED. 
        * It immediately evaluates if the entered pin is correct 
        * and tells the state machine to handle if the user is authenticated
        * or not. Because of this 
        * immediate update passwordEntry does not stay in state
        * PasswordEntryState_COMPLETELYFILLED.
        * If the entered pin pin does not match the correctPin,
        * the state PasswordEntryState_USERNOTAUTHENTICATED is
        * entered which again immediately updates the state machine.
        * The state machines switches to PasswordEntryState_EMPTY.
        */
        STAssertEquals([[passwordEntry.stateMachine currentState] ID], 
                       (NSUInteger)PasswordEntry_State_EMPTY, 
                       @"wrong current state");
    }
}

@end
