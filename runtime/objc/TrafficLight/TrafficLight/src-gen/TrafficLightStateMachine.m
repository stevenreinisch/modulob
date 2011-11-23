#import "TrafficLightStateMachine.h"

#import "MOBStateMachine.h"

@implementation TrafficLightStateMachine

- (id)init {
	self = [super init];
	if (self) {
		/*
		 * Define the states.
		 */
		MOBInitialState *initial = [[MOBInitialState new] autorelease];
		initial.name = @"initial";
		initial.ID   = TrafficLightState_INITIAL;
		initial.entrySelectorName = @"enter_initial";
		initial.exitSelectorName  = @"exit_initial";

		MOBState *Red = [[MOBState new] autorelease];
		Red.name = @"Red";
		Red.ID = TrafficLightState_RED;
		Red.duration = 3.0;
		Red.entrySelectorName = @"enter_Red";
		Red.exitSelectorName = @"exit_Red";

		MOBFinalState *final0 = [[MOBFinalState new] autorelease];
		final0.name = @"final0";
		final0.ID   = TrafficLightState_FINAL0;
		final0.entrySelectorName = @"enter_final0";

		MOBState *Yellow = [[MOBState new] autorelease];
		Yellow.name = @"Yellow";
		Yellow.ID = TrafficLightState_YELLOW;
		Yellow.duration = 1.0;
		Yellow.entrySelectorName = @"enter_Yellow";
		Yellow.exitSelectorName = @"exit_Yellow";

		MOBState *Green = [[MOBState new] autorelease];
		Green.name = @"Green";
		Green.ID = TrafficLightState_GREEN;
		Green.duration = 3.0;
		Green.entrySelectorName = @"enter_Green";
		Green.exitSelectorName = @"exit_Green";

		MOBState *GreenYellow = [[MOBState new] autorelease];
		GreenYellow.name = @"GreenYellow";
		GreenYellow.ID = TrafficLightState_GREENYELLOW;
		GreenYellow.duration = 1.5;
		GreenYellow.entrySelectorName = @"enter_GreenYellow";
		GreenYellow.exitSelectorName = @"exit_GreenYellow";

		/*
		 * Define transitions.
		 */
		MOBTransition *initial_to_Red = [[MOBTransition new] autorelease];
		initial_to_Red.ID = TrafficLightTransition_INITIAL_RED;
		initial_to_Red.guardSelectorName = @"guard_initial_to_Red";
		initial_to_Red.actionSelectorName = @"action_initial_to_Red";

		MOBTransition *Red_to_final0 = [[MOBTransition new] autorelease];
		Red_to_final0.ID = TrafficLightTransition_RED_FINAL0;
		Red_to_final0.guardSelectorName = @"guard_Red_to_final0";
		Red_to_final0.actionSelectorName = @"action_Red_to_final0";

		MOBTimeoutTransition *Red_to_Yellow = [[MOBTimeoutTransition new] autorelease];
		Red_to_Yellow.ID = TrafficLightTransition_RED_YELLOW;
		Red_to_Yellow.guardSelectorName = @"guard_Red_to_Yellow";
		Red_to_Yellow.actionSelectorName = @"action_Red_to_Yellow";

		Red.timeoutTransition = Red_to_Yellow;

		MOBTimeoutTransition *Yellow_to_Green = [[MOBTimeoutTransition new] autorelease];
		Yellow_to_Green.ID = TrafficLightTransition_YELLOW_GREEN;
		Yellow_to_Green.guardSelectorName = @"guard_Yellow_to_Green";
		Yellow_to_Green.actionSelectorName = @"action_Yellow_to_Green";

		Yellow.timeoutTransition = Yellow_to_Green;

		MOBTimeoutTransition *Green_to_GreenYellow = [[MOBTimeoutTransition new] autorelease];
		Green_to_GreenYellow.ID = TrafficLightTransition_GREEN_GREENYELLOW;
		Green_to_GreenYellow.guardSelectorName = @"guard_Green_to_GreenYellow";
		Green_to_GreenYellow.actionSelectorName = @"action_Green_to_GreenYellow";

		Green.timeoutTransition = Green_to_GreenYellow;

		MOBTimeoutTransition *GreenYellow_to_Red = [[MOBTimeoutTransition new] autorelease];
		GreenYellow_to_Red.ID = TrafficLightTransition_GREENYELLOW_RED;
		GreenYellow_to_Red.guardSelectorName = @"guard_GreenYellow_to_Red";
		GreenYellow_to_Red.actionSelectorName = @"action_GreenYellow_to_Red";

		GreenYellow.timeoutTransition = GreenYellow_to_Red;

		/*
		 * Build the transition index.
		 */

		self.transitionIndex = [NSArray arrayWithObjects:
		                        initial_to_Red,
		                        Red_to_final0,
		                        Red_to_Yellow,
		                        Yellow_to_Green,
		                        Green_to_GreenYellow,
		                        GreenYellow_to_Red
		                        , nil];

		/*
		 * Wire states and transitions.
		 */

		//states -> transitions
		initial.outgoingTransitions = [NSSet setWithObjects:
		                               initial_to_Red
		                               , nil];

		Red.outgoingTransitions = [NSSet setWithObjects:
		                           Red_to_final0,
		                           Red_to_Yellow
		                           , nil];
		Red.incomingTransitions = [NSSet setWithObjects:
		                           initial_to_Red,
		                           GreenYellow_to_Red
		                           , nil];

		final0.incomingTransitions = [NSSet setWithObjects:
		                              Red_to_final0
		                              , nil];

		Yellow.outgoingTransitions = [NSSet setWithObjects:
		                              Yellow_to_Green
		                              , nil];
		Yellow.incomingTransitions = [NSSet setWithObjects:
		                              Red_to_Yellow
		                              , nil];

		Green.outgoingTransitions = [NSSet setWithObjects:
		                             Green_to_GreenYellow
		                             , nil];
		Green.incomingTransitions = [NSSet setWithObjects:
		                             Yellow_to_Green
		                             , nil];

		GreenYellow.outgoingTransitions = [NSSet setWithObjects:
		                                   GreenYellow_to_Red
		                                   , nil];
		GreenYellow.incomingTransitions = [NSSet setWithObjects:
		                                   Green_to_GreenYellow
		                                   , nil];

		//transitions -> states
		initial_to_Red.sourceState = initial;
		initial_to_Red.targetState = Red;

		Red_to_final0.sourceState = Red;
		Red_to_final0.targetState = final0;

		Red_to_Yellow.sourceState = Red;
		Red_to_Yellow.targetState = Yellow;

		Yellow_to_Green.sourceState = Yellow;
		Yellow_to_Green.targetState = Green;

		Green_to_GreenYellow.sourceState = Green;
		Green_to_GreenYellow.targetState = GreenYellow;

		GreenYellow_to_Red.sourceState = GreenYellow;
		GreenYellow_to_Red.targetState = Red;

		/*
		 * Add states and transitions to this state machine instance.
		 */
		[self.states addObject: initial];
		[self.states addObject: Red];
		[self.states addObject: final0];
		[self.states addObject: Yellow];
		[self.states addObject: Green];
		[self.states addObject: GreenYellow];

		[self.transitions addObject: initial_to_Red];
		[self.transitions addObject: Red_to_final0];
		[self.transitions addObject: Red_to_Yellow];
		[self.transitions addObject: Yellow_to_Green];
		[self.transitions addObject: Green_to_GreenYellow];
		[self.transitions addObject: GreenYellow_to_Red];
	}
	return self;
}

@end