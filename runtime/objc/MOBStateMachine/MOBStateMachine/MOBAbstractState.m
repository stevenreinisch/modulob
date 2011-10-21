//
//  MOBAbstractState.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/21/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBAbstractState.h"

@implementation MOBAbstractState

@synthesize name,
            ID,
            entrySelectorName;

- (id)init
{
    self = [super init];
    if (self) {
        ID       = UNDEFINED;
    }
    
    return self;
}

- (void) dealloc {
    self.name                = nil;
    self.entrySelectorName   = nil;
    
    [super dealloc];
}

@end
