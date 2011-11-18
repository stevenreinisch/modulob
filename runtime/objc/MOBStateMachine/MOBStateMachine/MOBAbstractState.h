//
//  MOBAbstractState.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/21/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "MOBStateMachineConstants.h"

@interface MOBAbstractState : NSObject

@property (nonatomic, retain) NSString *name;

/*
 * For performance reasons a state can also
 * be identified via an integer.
 * This is especially useful for using a switch:
 *
 * switch(stateMachine.currentState.ID){
 *  case ASTATE: // do this;
 *  case ANOTHERSTATE: // do that;
 * }
 */
@property (nonatomic, assign) MOBStateID ID;

/*
 * If a state is entered, entrySelectorName != nil
 * and the state machine's delegagte responds to this
 * selector, this selector is executed on the state
 * machine's target.
 *
 * The corresponding method must take no arguments and
 * its return value must be void.
 */
@property (nonatomic, retain) NSString *entrySelectorName;

@end
