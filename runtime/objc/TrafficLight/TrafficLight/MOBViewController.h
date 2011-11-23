//
//  MOBViewController.h
//  TrafficLight
//
//  Created by steven reinisch on 11/22/11.
//  Copyright (c) 2011 __MyCompanyName__. All rights reserved.
//

#import <UIKit/UIKit.h>

#import "P_D_TrafficLightStateHandler.h"

@interface MOBViewController : UIViewController
<P_D_TrafficLightStateHandler>

@property (retain, nonatomic) IBOutlet UILabel *red;
@property (retain, nonatomic) IBOutlet UILabel *yellow;
@property (retain, nonatomic) IBOutlet UILabel *green;

@end
