# FSM Runtime Library

## Introduction

[Finite State Machines (FSMs)](http://en.wikipedia.org/wiki/Finite-state_machine) allow you to describe the state of an object as a set of states and the transitions among these states. 

FSMs are useful for systems that heavily depend on input events whose order of occurrences cannot be predicted. An example are user interfaces. With FSMs you can describe in which state a user interface should react to which events and which events should be ignored. If you ever got angry about deeply nested if-statements with long conditions, FSMs are a viable alternative.

As part of *modulob* we provide you a textual modeling language that you can use to describe FSMs, a code generator to generate an *Objective-C* representation of your FSMs, and an *Objective-C* runtime library that interprets FSMs.

## Runtime Library

To see the runtime library in action open the *Runtime.xcworkspace* with Xcode. After opening the workspace you should see three projects:

* MOBStateMachine
	* the project for the runtime library 
* TrafficLight
	* an example that shows the implementation of the behaviour of a traffic light on the basis of a FSM
* MOBStateMachineExample
	* an example that shows the implementation of a password entry UI on the basis of a FSM
	
All files in folders named *src-gen* are generated by our code generator.

### MOBStateMachine

The interpretation logic is implemented in the class [MOBStateMachine](MOBStateMachine/MOBStateMachine/MOBStateMachine.h). 

All state machines that are generated, inherit from **MOBStateMachine**. For an example have a look at [PasswordEntryStateMachine](MOBStateMachine/MOBStateMachineTests/testCaseDefinitions/src-gen/PasswordEntryStateMachine.h) or [TrafficLightStateMachine](TrafficLight/TrafficLight/src-gen/TrafficLightStateMachine.h).

Our code generator maps your textual FSM model to an object representation that is instantiated in a state machine's **init** method and a **dispatchEvent:** method that contains your FSM's transition logic (see [PasswordEntryStateMachine](MOBStateMachine/MOBStateMachineTests/testCaseDefinitions/src-gen/PasswordEntryStateMachine.m)).