//
//  MOBState.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBAbstractState.h"
#import "MOBTimeoutTransition.h"

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
 *
 * If duration < 0, the reference 'timeoutTransition'
 * must not be nil.
 * If the time interval specified by duration has elapsed,
 * the 'timeoutTransition' is switched.
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

/*
 * See comment for property 'duration'.
 */
@property (nonatomic, retain) MOBTimeoutTransition *timeoutTransition;

@end
