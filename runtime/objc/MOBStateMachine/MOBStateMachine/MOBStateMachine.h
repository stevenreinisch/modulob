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

@interface MOBStateMachine : NSObject {
    id currentState;
}

@property (nonatomic, assign) id delegate;

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

- (void) start;
- (void) update;

- (MOBAbstractState*) currentState;

- (BOOL) switchTransitionWithID:(MOBTransitionID) transitionID;

@end
