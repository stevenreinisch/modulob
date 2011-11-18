//
//  MOBStateMachineExampleViewController.h
//  MOBStateMachineExample
//
//  Created by steven reinisch on 10/14/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "P_D_PasswordEntryStateHandler.h"

@interface MOBStateMachineExampleViewController : UIViewController
<P_D_PasswordEntryStateHandler>
{
    UITextField *pin1;
    UITextField *pin2;
    UITextField *pin3;
    UITextField *pin4;
    UIButton *clearButton;
    UIActivityIndicatorView *activityIndicator;
    UILabel *stateLabel;
}

@property (nonatomic, retain) IBOutlet UILabel *stateLabel;

@property (nonatomic, retain) IBOutlet UITextField *pin1;
@property (nonatomic, retain) IBOutlet UITextField *pin2;
@property (nonatomic, retain) IBOutlet UITextField *pin3;
@property (nonatomic, retain) IBOutlet UITextField *pin4;
@property (nonatomic, retain) IBOutlet UIButton *clearButton;
@property (nonatomic, retain) IBOutlet UIActivityIndicatorView *activityIndicator;
@property (retain, nonatomic) IBOutlet UIButton *unlockButton;

- (IBAction)pinEntered:(id)sender;
- (IBAction)clearButtonTapped:(id)sender;
- (IBAction)unlockButtonTapped:(id)sender;


@end
