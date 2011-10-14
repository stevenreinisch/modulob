//
//  MOBStateMachine.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>

#import  "MOBState.h"
#import  "MOBTransition.h"

@interface MOBStateMachine : NSObject

@property (nonatomic, assign) id delegate;

@property (nonatomic, retain) NSMutableSet *states;
@property (nonatomic, retain) NSMutableSet *transitions;

- (void) start;
- (void) update;

- (MOBState*) currentState;

@end
