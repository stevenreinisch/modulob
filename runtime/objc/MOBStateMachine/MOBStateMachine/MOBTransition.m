//
//  MOBTransition.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBTransition.h"

@implementation MOBTransition

@synthesize ID,
            sourceState, 
            targetState, 
            guardSelectorName, 
            actionSelectorName;

- (id)init
{
    self = [super init];
    if (self) {
        // Initialization code here.
    }
    
    return self;
}

- (void) dealloc {
    self.sourceState        = nil;
    self.targetState        = nil;
    self.guardSelectorName  = nil; 
    self.actionSelectorName = nil;
    
    [super dealloc];
}

@end
