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

@interface MOBStateMachine : NSObject {
    id currentState;
}

@property (nonatomic, assign) id delegate;

@property (nonatomic, retain) NSMutableSet *states;
@property (nonatomic, retain) NSMutableSet *transitions;

- (void) start;
- (void) update;

- (MOBAbstractState*) currentState;

@end
