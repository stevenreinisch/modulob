	#import "MOBStateMachine.h"

/*
 * State IDs
 */
enum {
	PasswordEntry_State_INITIAL = 0,
	PasswordEntry_State_EMPTY,
	PasswordEntry_State_FINAL0,
	PasswordEntry_State_PARTIALLYFILLED,
	PasswordEntry_State_COMPLETELYFILLED,
	PasswordEntry_State_LOCKED
};

/*
 * Transition IDs
 */
enum {
	PasswordEntry_Transition_INITIAL_EMPTY = 0,
	PasswordEntry_Transition_EMPTY_PARTIALLYFILLED,
	PasswordEntry_Transition_PARTIALLYFILLED_COMPLETELYFILLED,
	PasswordEntry_Transition_COMPLETELYFILLED_LOCKED,
	PasswordEntry_Transition_COMPLETELYFILLED_FINAL0,
	PasswordEntry_Transition_COMPLETELYFILLED_EMPTY,
	PasswordEntry_Transition_LOCKED_EMPTY,
	PasswordEntry_Transition_PARTIALLYFILLED_EMPTY,
	PasswordEntry_Transition_PARTIALLYFILLED_PARTIALLYFILLED_DIGITDELETED,
	PasswordEntry_Transition_PARTIALLYFILLED_PARTIALLYFILLED_DIGITENTERED
};

/*
 * Transition Trigger Event IDs
 * (without TimeoutTransitions and transitions from initial node)
 */
enum {
	PasswordEntry_Event_DIGITENTERED = 0,
	PasswordEntry_Event_USERNOTAUTHENTICATED,
	PasswordEntry_Event_USERAUTHENTICATED,
	PasswordEntry_Event_DIGITDELETED
};

@interface PasswordEntryStateMachine : MOBStateMachine

@end