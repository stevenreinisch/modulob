//
//  MOBStateMachineExampleViewController.m
//  MOBStateMachineExample
//
//  Created by steven reinisch on 10/14/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBStateMachineExampleViewController.h"
#import "PasswordEntryStateMachine.h"

#import "TestCaseConstants.h"

#define MAX_PIN_DIGITS 4

@interface MOBStateMachineExampleViewController ()
/*
 * Array of characters denoting a pin.
 * Pin can have at most 4 characters.
 */
@property (nonatomic, retain) NSMutableArray *pin;

/*
 * hard coded correct (expected) pin.
 */
@property (nonatomic, retain) NSString *correctUserPin;

/*
 * does pin match correctUserPin?
 */
@property (nonatomic, assign) BOOL pinCorrect;

/*
 * Shall the screen be locked if a wrong pin has been entered?
 */
@property (nonatomic, assign) BOOL lockAfterFailedAuthentication;

/*
 * A state machine controlling the state transitions of this controller.
 */
@property (nonatomic, retain) PasswordEntryStateMachine *stateMachine;
@end

#pragma mark -

@implementation MOBStateMachineExampleViewController
@synthesize stateLabel;
@synthesize pin1;
@synthesize pin2;
@synthesize pin3;
@synthesize pin4;
@synthesize clearButton;
@synthesize activityIndicator;
@synthesize unlockButton;
@synthesize pin, correctUserPin, pinCorrect, lockAfterFailedAuthentication, stateMachine;

- (void)didReceiveMemoryWarning
{
    // Releases the view if it doesn't have a superview.
    [super didReceiveMemoryWarning];
    
    // Release any cached data, images, etc that aren't in use.
}

#pragma mark - View lifecycle


// Implement viewDidLoad to do additional setup after loading the view, typically from a nib.
- (void)viewDidLoad
{
    [super viewDidLoad];
    [self.activityIndicator setHidden:YES];
    
    self.correctUserPin                = @"1234";
    self.lockAfterFailedAuthentication = YES;
    self.stateMachine                  = [[PasswordEntryStateMachine new] autorelease];
    
    pin1.keyboardType = UIKeyboardTypeNumberPad;
    pin2.keyboardType = UIKeyboardTypeNumberPad;
    pin3.keyboardType = UIKeyboardTypeNumberPad;
    pin4.keyboardType = UIKeyboardTypeNumberPad;
    
    [stateMachine setDelegate:self];
    [stateMachine start];
}


- (void)viewDidUnload
{
    [self setPin1:nil];
    [self setPin2:nil];
    [self setPin3:nil];
    [self setPin4:nil];
    [self setClearButton:nil];
    [self setActivityIndicator:nil];
    [self setStateMachine: nil];
    [self setStateLabel:nil];
    [self setUnlockButton:nil];
    [super viewDidUnload];
    // Release any retained subviews of the main view.
    // e.g. self.myOutlet = nil;
}

- (BOOL)shouldAutorotateToInterfaceOrientation:(UIInterfaceOrientation)interfaceOrientation
{
    // Return YES for supported orientations
    return (interfaceOrientation == UIInterfaceOrientationPortrait);
}

- (void)dealloc {
    [pin1 release];
    [pin2 release];
    [pin3 release];
    [pin4 release];
    [clearButton release];
    [activityIndicator release];
    [stateMachine release];
    [pin release];
    [stateLabel release];
    [unlockButton release];
    [super dealloc];
}

- (IBAction)clearButtonTapped:(id)sender {
    if([pin4 text] && ![[pin4 text] isEqualToString:@""]){
        [pin4 setText:nil];
        [pin4 setEnabled:NO];
        [pin3 setEnabled:YES];
        [pin3 becomeFirstResponder];
    } else if([pin3 text] && ![[pin3 text] isEqualToString:@""]){
        [pin3 setText:nil];
        [pin3 setEnabled:NO];
        [pin2 setEnabled:YES];
        [pin2 becomeFirstResponder];
    }  else if([pin2 text] && ![[pin2 text] isEqualToString:@""]){
        [pin2 setText:nil];
        [pin2 setEnabled:NO];
        [pin1 setEnabled:YES];
        [pin1 becomeFirstResponder];
    }  else if([pin1 text] && ![[pin1 text] isEqualToString:@""]){
        [pin1 setText:nil];
    }

    [self.pin removeLastObject];
    
    [self.stateMachine update];
}

- (IBAction)unlockButtonTapped:(id)sender {
    /*
     * Pressing the unlock button will switch to empty state
     * although the timer for the locked state did not
     * finish yet.
     *
     */
    [self.stateMachine switchTransitionWithID:PasswordEntryTransition_LOCKED_USERAUTHENTICATED];
}

- (IBAction)pinEntered:(id)sender {
    NSString *text = [sender text];
    if (text && ![text isEqualToString:@""]) {
        [self.pin addObject:text];
        
        if (sender == pin1) {
            [pin1 setEnabled:NO];
            [pin2 setEnabled:YES];
            [pin2 becomeFirstResponder];
        } else if (sender == pin2) {
            [pin2 setEnabled:NO];
            [pin3 setEnabled:YES];
            [pin3 becomeFirstResponder];
        } else if (sender == pin3) {
            [pin3 setEnabled:NO];
            [pin4 setEnabled:YES];
            [pin4 becomeFirstResponder];
        }
        
        [self.stateMachine update];
    }
}

#pragma mark -
#pragma mark state handling

- (void) enter_empty {
    stateLabel.text = @"Empty";
    
    pin1.text = nil;
    pin2.text = nil;
    pin3.text = nil;
    pin4.text = nil;
    
    [pin1 setEnabled:YES];
    [pin2 setEnabled:NO];
    [pin3 setEnabled:NO];
    [pin4 setEnabled:NO];
    
    [pin1 becomeFirstResponder];
    
    [clearButton setHidden:YES];
    [unlockButton setHidden:YES];
    
    self.pin        = [[NSMutableArray new] autorelease];
    self.pinCorrect = NO;
}

- (void) enter_partiallyFilled {
    [clearButton setHidden:NO];
    
    stateLabel.text = @"partially filled";
}

- (void) enter_completelyFilled {
    stateLabel.text = @"completely filled";
    
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

- (void) enter_userAuthenticated {
    stateLabel.text = @"user authenticated";
}

- (void) enter_userNotAuthenticated {
    stateLabel.text = @"user not authenticated";
    
    //we could present the user a dialog here ..
}

- (void) enter_locked {
    stateLabel.text = @"locked";
    
    [pin1 setEnabled:NO];
    [pin2 setEnabled:NO];
    [pin3 setEnabled:NO];
    [pin4 setEnabled:NO];
    
    [clearButton setHidden:YES];
    [unlockButton setHidden:NO];
    
    [activityIndicator setHidden:NO];
    [activityIndicator startAnimating];
}

- (void) exit_locked {
    [activityIndicator stopAnimating];
    [activityIndicator setHidden:YES];
    [unlockButton setHidden:YES];
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

- (BOOL) guard_locked_to_userauthenticated {
    BOOL result = YES;
    
    NSLog(@"evaluated guard_locked_to_userauthenticated with result: %d", result);
    
    return result;
}

- (BOOL) guard_userauthenticated_to_final {
    BOOL result = NO;
    
    NSLog(@"evaluated guard_userauthenticated_to_final with result: %d", result);
    
    return result;
}

- (BOOL) guard_userauthenticated_to_empty {
    BOOL result = YES;
    
    NSLog(@"evaluated guard_userauthenticated_to_empty with result: %d", result);
    
    return result;
}

@end
