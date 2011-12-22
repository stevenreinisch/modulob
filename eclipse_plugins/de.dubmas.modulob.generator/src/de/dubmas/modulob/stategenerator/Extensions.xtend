package de.dubmas.modulob.stategenerator

import de.dubmas.modulob.state.FinalNode
import de.dubmas.modulob.state.InitialNode
import de.dubmas.modulob.state.Node
import de.dubmas.modulob.state.State
import de.dubmas.modulob.state.StateMachine
import de.dubmas.modulob.state.StatePackage
import de.dubmas.modulob.state.Transition

class Extensions {
	def dispatch name(Node n){}
	
	def dispatch name(InitialNode in){
		'initial'
	}
	
	def dispatch name(FinalNode fn){
		'final' + 
		(fn.eContainer as StateMachine).
			nodes.filter(n | StatePackage::eINSTANCE.
								finalNode.isInstance(n)).toList.indexOf(fn)
	}
	
	def dispatch name(State s){
		s.name
	}
	
	def enumLiteral(Node n){
		(n.eContainer as StateMachine).name + '_State_' + n.name.toUpperCase()
	}
	
	def enumLiteral(Transition t){
		var literal = (t.eContainer as StateMachine).name + '_Transition_' +
					  t.source.name().toUpperCase() + '_' +
					  t.target.name().toUpperCase()
		/*
		 * If another transition with same source and target state
		 * exists, append the name of the trigger event
		 */
		if((t.eContainer as StateMachine).
				transitionsReactingToEvents.
					exists(t_ | t_ != t && t_.source == t.source && t_.target == t.target)
		)
		{
			literal = literal + '_' + t.triggerEventName.toUpperCase
		}	
					  
		literal			  
	}
	
	def transitionsWithoutTimeout (StateMachine sm) {
		sm.transitions.filter(t | !StatePackage::eINSTANCE.timeoutTransition.isInstance(t))
	}
	
	def transitionsWithoutTimeoutAndInitial (StateMachine sm) {
		sm.transitions.filter(t | !StatePackage::eINSTANCE.timeoutTransition.isInstance(t))
			.filter(t | !StatePackage::eINSTANCE.initialNode.isInstance(t.source))
	}
	
	def transitionsReactingToEvents (StateMachine sm) {
		sm.transitionsWithoutTimeoutAndInitial.filter(t | t.triggerEventName != null && t.triggerEventName != "")
	}
	
	def headerFilePath(StateMachine sm){
		sm.module.name + '/private/states/'
	}
	
	def implFilePath(StateMachine sm){
		sm.module.name + '/private/states/'
	}
	
	def className(StateMachine sm){
		sm.name + 'StateMachine'
	}
	
	def entrySelectorName(Node n){
		'enter_' + n.name()	
	}
	
	def exitSelectorName(Node n){
		'exit_' + n.name()	
	}
	
	def name(Transition t){
		var name = t.source.name() + '_to_' + t.target.name()
		
		/*
		 * If another transition with same source and target state
		 * exists, append the name of the trigger event
		 */
		if((t.eContainer as StateMachine).
				transitionsReactingToEvents.
					exists(t_ | t_ != t && t_.source == t.source && t_.target == t.target)
		)
		{
			name = name + '_' + t.triggerEventName
		}
		
		name
	}
	
	def guardSelectorName(Transition t){
		'guard_' + t.name()	
	}

	def actionSelectorName(Transition t){
		'action_' + t.name()	
	}
	
	def triggerEventConstant(Transition t) {
		if (StatePackage::eINSTANCE.timeoutTransition.isInstance(t)){
			return ''
		}
		(t.eContainer as StateMachine).name + '_Event_' + t.triggerEventName.toUpperCase
	}
	
	def stateHandlerName(StateMachine sm){
		'P_D_' + sm.name + 'StateHandler'
	}
	
	def deterministicExitStates(StateMachine sm){
		sm.nodes.filter(s | s.outgoing.size == 1)
	}

	def nonDeterministicExitStates(StateMachine sm){
		var nodes = sm.nodes 
		nodes.removeAll(sm.deterministicExitStates().toSet)
		nodes
	}
	
	def eventConstants(StateMachine sm) {
		sm.transitionsReactingToEvents.map(t | t.triggerEventConstant).toSet
	}
	
	def stateNodes(StateMachine sm) {
		sm.nodes.filter(n | StatePackage::eINSTANCE.state.isInstance(n))
	}
}