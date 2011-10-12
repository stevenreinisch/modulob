//
//  MOBStateMachine.m
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBStateMachine.h"

@implementation MOBStateMachine

@synthesize delegate, states, transitions;

- (id)init
{
    self = [super init];
    if (self) {
        // Initialization code here.
    }
    
    return self;
}

- (void) start {
    
}

- (void) update {
    
}

- (MOBState*) currentState {
    
}

- (void) switchTransition:(NSUInteger) transitionID {
    
}

@end
