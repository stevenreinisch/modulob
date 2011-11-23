#import "MOBStateMachine.h"

enum {
	TrafficLightState_INITIAL = 0,
	TrafficLightState_RED,
	TrafficLightState_FINAL0,
	TrafficLightState_YELLOW,
	TrafficLightState_GREEN,
	TrafficLightState_GREENYELLOW
};

enum {
	TrafficLightTransition_INITIAL_RED = 0,
	TrafficLightTransition_RED_FINAL0,
	TrafficLightTransition_RED_YELLOW,
	TrafficLightTransition_YELLOW_GREEN,
	TrafficLightTransition_GREEN_GREENYELLOW,
	TrafficLightTransition_GREENYELLOW_RED
};

@interface TrafficLightStateMachine : MOBStateMachine

@end