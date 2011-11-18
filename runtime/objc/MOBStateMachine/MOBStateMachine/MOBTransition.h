//
//  MOBTransition.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "MOBStateMachineConstants.h"

@class MOBAbstractState;

@interface MOBTransition : NSObject

@property (nonatomic, assign) MOBTransitionID ID;

@property (nonatomic, retain) MOBAbstractState *sourceState;
@property (nonatomic, retain) MOBAbstractState *targetState;

/*
 * The selector that is executed on a state machine's
 * delegate if the state machine must decide to switch
 * this transition or not.
 *
 * The corresponding method must take no arguments and
 * its return value must be [NSNumber numberWithBool:].
 *
 * If guardSelectorName == nil or the state machine's
 * delegate does not repond to this selector, the state
 * machine assumes that this transition can be switched.
 */
@property (nonatomic, retain) NSString *guardSelectorName;

/*
 * If a state machine switches this transition and 
 * actionSelectorName != nil and the state machine's
 * delegate responds to this selector, this selector
 * is executed immediately after this transition has
 * been switched.
 *
 * The corresponding method must take no arguments and
 * its return value must be void.
 */
@property (nonatomic, retain) NSString *actionSelectorName;

@end
