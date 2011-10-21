//
//  MOBState.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBState.h"

@implementation MOBState

@synthesize duration,
            exitSelectorName,
            incomingTransitions,
            outgoingTransitions;

- (id)init
{
    self = [super init];
    if (self) {
        duration = UNDEFINED;
    }
    
    return self;
}

- (void) dealloc {
    self.exitSelectorName    = nil;
    self.incomingTransitions = nil;
    self.outgoingTransitions = nil;
    
    [super dealloc];
}

@end
