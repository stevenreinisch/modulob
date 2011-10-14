//
//  MOBState.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface MOBState : NSObject

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
@property (nonatomic, assign) NSInteger ID;

/*
 * Only one state can have isInitial == YES.
 * If isInitial == YES, this state is entered 
 * immediately at state machine start up.
 */
@property (nonatomic, assign) BOOL isInitial;

/*
 * Many states can have isFInal == YES. At least
 * one state must have isFinal == YES.
 * If isFinal == YES, outgoingTransitions must be
 * empty, and if a final state is entered its
 * exitSelector is executed immediately after
 * its entrySelector.
 */
@property (nonatomic, assign) BOOL isFinal;

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
 * If a state is entered, entrySelectorName != nil
 * and the state machine's delegagte responds to this
 * selector, this selector is executed on the state
 * machine's target.
 *
 * The corresponding method must take no arguments and
 * its return value must be void.
 */
@property (nonatomic, retain) NSString *entrySelectorName;

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
