	#import "MOBStateMachine.h"

/*
 * State IDs
 */
enum {
	TrafficLight_State_INITIAL = 0,
	TrafficLight_State_RED,
	TrafficLight_State_FINAL0,
	TrafficLight_State_YELLOW,
	TrafficLight_State_GREEN,
	TrafficLight_State_GREENYELLOW
};

/*
 * Transition IDs
 */
enum {
	TrafficLight_Transition_INITIAL_RED = 0,
	TrafficLight_Transition_RED_FINAL0,
	TrafficLight_Transition_RED_YELLOW,
	TrafficLight_Transition_YELLOW_GREEN,
	TrafficLight_Transition_GREEN_GREENYELLOW,
	TrafficLight_Transition_GREENYELLOW_RED
};

@interface TrafficLightStateMachine : MOBStateMachine

@end