//
//  MOBInitialState.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/21/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBInitialState.h"

@implementation MOBInitialState

@synthesize exitSelectorName,
            outgoingTransitions;

- (id)init
{
    self = [super init];
    if (self) {
        // Initialization code here.
    }
    
    return self;
}

- (void) dealloc {
    self.exitSelectorName    = nil;
    self.outgoingTransitions = nil;
    
    [super dealloc];
}

@end
