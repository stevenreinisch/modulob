//
//  MOBTransition.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBTransition.h"
#import "MOBStateMachineConstants.h"

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
        ID = MOBSTATEMACHINE_UNDEFINED;
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
