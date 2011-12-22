//
//  MOBStateMachine.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "MOBAbstractState.h"
#import "MOBInitialState.h"
#import "MOBState.h"
#import "MOBFinalState.h"
#import  "MOBTransition.h"
#import "MOBStateMachineConstants.h"

@protocol P_D_MOBStateHandler;

@interface MOBStateMachine : NSObject {
    @private
    id currentState;
}

@property (nonatomic, assign) id<P_D_MOBStateHandler> delegate;

@property (nonatomic, retain) NSMutableSet *states;
@property (nonatomic, retain) NSMutableSet *transitions;

/*
 * This property conceptually has 'protected' access, not 'public'.
 *
 * The transitionIndex is used for fast transition lookup
 * if a transition must be switched directly (e.g. via a call
 * to [switchTransitionWithID:]. Each array index point to
 * the transition with the corresponding ID.
 */
@property (nonatomic, retain) NSArray *transitionIndex;

@property (nonatomic, assign) BOOL finished;

- (void) start;

- (void) handleEvent:(MOBEvent) event;

//- (void) update;

- (MOBAbstractState*) currentState;


#pragma mark -
#pragma mark protected

- (BOOL) evaluateGuardSelector:(NSString*) selectorName;
- (BOOL) switchTransitionWithID:(MOBTransitionID) transitionID;

@end

#pragma mark -
#pragma mark P_D_MOBStateHandler

@protocol P_D_MOBStateHandler <NSObject>

- (void) handleStateMachineError:(MOBStateMachineError) error;

/*
 * This method is called if the state machine has finished its
 * last update cycle. The entry method of a final state has already
 * been called at this point.
 */
- (void) finishedProcessing;

@end
