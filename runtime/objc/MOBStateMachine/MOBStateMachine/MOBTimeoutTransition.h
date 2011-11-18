//
//  MOBTimeoutTransition.h
//  MOBStateMachine
//
//  Created by steven reinisch on 11/18/11.
//  Copyright (c) 2011 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "MOBTransition.h"
#import "MOBStateMachineConstants.h"

/*
 * If this transition's source state has a duration > 0,
 * its source state must have exactly one outgoing transition
 * of type MOBTimeoutTransition.
 *
 */
@interface MOBTimeoutTransition : MOBTransition

@end
