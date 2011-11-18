//
//  PasswordEntryStateMachine.h
//  MOBStateMachine
//
//  Created by steven reinisch on 10/12/11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import "MOBStateMachine.h"

enum{
    PasswordEntryState_INITIAL = 0,
    PasswordEntryState_EMPTY,
    PasswordEntryState_PARTIALLYFILLED,
    PasswordEntryState_COMPLETELYFILLED,
    PasswordEntryState_USERAUTHENTICATED,
    PasswordEntryState_USERNOTAUTHENTICATED,
    PasswordEntryState_LOCKED,
    PasswordEntryState_USERAUTHENTICATED_FINAL
};

enum {
    PasswordEntryTransition_INITIAL_EMPTY = 0,
    PasswordEntryTransition_EMPTY_PARTIALLYFILLED,
    PasswordEntryTransition_PARTIALLYFILLED_EMPTY,
    PasswordEntryTransition_PARTIALLYFILLED_COMPLETELYFILLED,    
    PasswordEntryTransition_COMPLETELYFILLED_USERAUTHENTICATED,
    PasswordEntryTransition_COMPLETELYFILLED_USERNOTAUTHENTICATED,
    PasswordEntryTransition_USERAUTHENTICATED_FINAL,
    PasswordEntryTransition_USERNOTAUTHENTICATED_EMPTY,
    PasswordEntryTransition_USERNOTAUTHENTICATED_LOCKED,
    PasswordEntryTransition_LOCKED_EMPTY,
    PasswordEntryTransition_LOCKED_USERAUTHENTICATED,
    PasswordEntryTransition_USERAUTHENTICATED_EMPTY
};

@interface PasswordEntryStateMachine : MOBStateMachine

@end
