//
//  MOBViewController.m
//  TrafficLight
//
//  Created by steven reinisch on 11/22/11.
//  Copyright (c) 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBViewController.h"

#import "TrafficLightStateMachine.h"
#import "MOBStateMachineConstants.h"

@interface MOBViewController ()

@property (nonatomic, retain) TrafficLightStateMachine *stateMachine;

@end

@implementation MOBViewController
@synthesize red;
@synthesize yellow;
@synthesize green;

@synthesize stateMachine;

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Release any cached data, images, etc that aren't in use.
}

#pragma mark - View lifecycle

- (void)viewDidLoad
{
    [super viewDidLoad];
    
    self.stateMachine = [[TrafficLightStateMachine new] autorelease];
    self.stateMachine.delegate = self;
    [self.stateMachine start];
}

- (void)viewDidUnload
{
    [self setRed:nil];
    [self setYellow:nil];
    [self setGreen:nil];
    [super viewDidUnload];
    // Release any retained subviews of the main view.
    // e.g. self.myOutlet = nil;
}

- (void)viewWillAppear:(BOOL)animated
{
    [super viewWillAppear:animated];
}

- (void)viewDidAppear:(BOOL)animated
{
    [super viewDidAppear:animated];
}

- (void)viewWillDisappear:(BOOL)animated
{
	[super viewWillDisappear:animated];
}

- (void)viewDidDisappear:(BOOL)animated
{
	[super viewDidDisappear:animated];
}

- (BOOL)shouldAutorotateToInterfaceOrientation:(UIInterfaceOrientation)interfaceOrientation
{
    // Return YES for supported orientations
    if ([[UIDevice currentDevice] userInterfaceIdiom] == UIUserInterfaceIdiomPhone) {
        return (interfaceOrientation != UIInterfaceOrientationPortraitUpsideDown);
    } else {
        return YES;
    }
}

- (void)dealloc {
    [red release];
    [yellow release];
    [green release];
    [super dealloc];
}

#pragma mark -
#pragma mark state handling

- (void) handleStateMachineError:(MOBStateMachineError) error {
    switch (error) {
        case MOBStateMachineError_AlreadyInFinalState:
            //handle it!
            break;
            
        default:
            break;
    }
}

/*
 * state Red
 */

- (void) enter_Red {
    [red setHidden:NO];
    [yellow setHidden:YES];
    [green setHidden:YES];
}

/*
 * state final0
 */
- (void) enter_final0 {
    
}

/*
 * state Yellow
 */

- (void) enter_Yellow {
    [red setHidden:YES];
    [yellow setHidden:NO];
    [green setHidden:YES];
}

/*
 * state Green
 */
- (void) enter_Green {
    [red setHidden:YES];
    [yellow setHidden:YES];
    [green setHidden:NO];
}

/*
 * state GreenYellow
 */
- (void) enter_GreenYellow {
    [red setHidden:YES];
    [yellow setHidden:NO];
    [green setHidden:NO];
}

- (BOOL) guard_Red_to_final0 {
    return NO;
}

@end
