//
//  MOBInitialState.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/21/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBAbstractState.h"

/*
 * Only one state can be an initial state.
 * It is a state machine's current state
 * immediately after start up.
 */
@interface MOBInitialState : MOBAbstractState

/*
 * If a state is exited, exitSelectorName != nil
 * and the state machine's delegagte responds to this
 * selector, this selector is executed on the state
 * machine's target.
 *
 * The corresponding method must take no arguments and
 * its return value must be void.
 */
@property (nonatomic, retain) NSString *exitSelectorName;

@property (nonatomic, retain) NSSet *outgoingTransitions;

@end
