//
//  MOBFinalState.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/21/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBAbstractState.h"

/*
 * At least one state must be a FinalState.
 * It only has an entry selector.
 */

@interface MOBFinalState : MOBAbstractState

@property (nonatomic, retain) NSSet *incomingTransitions;

@end
