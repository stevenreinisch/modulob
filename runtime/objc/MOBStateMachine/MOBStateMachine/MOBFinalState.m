//
//  MOBFinalState.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/21/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBFinalState.h"

@implementation MOBFinalState

@synthesize incomingTransitions;

- (id)init
{
    self = [super init];
    if (self) {
        // Initialization code here.
    }
    
    return self;
}

- (void) dealloc {
    self.incomingTransitions = nil;
    
    [super dealloc];
}

@end
