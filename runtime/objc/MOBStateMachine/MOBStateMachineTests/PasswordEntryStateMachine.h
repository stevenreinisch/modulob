//
//  PasswordEntryStateMachine.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBStateMachine.h"

enum {
    PasswordEntryState_EMPTY = 0,
    PasswordEntryState_PARTIALLYFILLED,
    PasswordEntryState_COMPLETELYFILLED,
    PasswordEntryState_USERAUTHENTICATED,
    PasswordEntryState_USERNOTAUTHENTICATED
};

enum {
    PasswordEntryTransition_EMPTY_PARTIALLYFILLED = 0,
    PasswordEntryTransition_PARTIALLYFILLED_EMPTY,
    PasswordEntryTransition_PARTIALLYFILLED_COMPLETELYFILLED,    
    PasswordEntryTransition_COMPLETELYFILLED_USERAUTHENTICATED,
    PasswordEntryTransition_COMPLETELYFILLED_USERNOTAUTHENTICATED,
    PasswordEntryTransition_USERNOTAUTHENTICATED_EMPTY
};

@interface PasswordEntryStateMachine : MOBStateMachine

@end
