//
//  MOBState.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBState.h"

@implementation MOBState

@synthesize name,
            ID,
            isInitial,
            isFinal,
            entrySelectorName,
            exitSelectorName,
            incomingTransitions,
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
    self.name                = nil;
    self.entrySelectorName   = nil;
    self.exitSelectorName    = nil;
    self.incomingTransitions = nil;
    self.outgoingTransitions = nil;
    
    [super dealloc];
}

@end
