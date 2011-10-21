//
//  MOBState.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBAbstractState.h"

@interface MOBState : MOBAbstractState

/*
 * If duration is specified, the state machine waits
 * for this time interval after this state is entered
 * and exists this state after this time interval.
 *
 * This can be used to model timeouts; e.g. in networking
 * code: you can have a state "WaitingForReply" that is
 * automatically exited if a certain time interval has
 * elapsed.
 */
@property (nonatomic, assign) NSTimeInterval duration;



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

@property (nonatomic, retain) NSSet *incomingTransitions;
@property (nonatomic, retain) NSSet *outgoingTransitions;

@end
