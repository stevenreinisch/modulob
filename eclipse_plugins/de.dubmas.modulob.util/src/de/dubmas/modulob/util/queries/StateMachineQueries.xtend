package de.dubmas.modulob.util.queries

import de.dubmas.modulob.state.FinalNode
import de.dubmas.modulob.state.InitialNode
import de.dubmas.modulob.state.Node
import de.dubmas.modulob.state.State
import de.dubmas.modulob.state.Transition
import de.dubmas.modulob.state.TimeoutTransition
import de.dubmas.modulob.state.StateMachine
import de.dubmas.modulob.state.StatePackage

class StateMachineQueries {
	
	def statesConnectedToInitialNode(StateMachine sm) {
		sm.nodes.filter(typeof(State)).
			filter(s | s.incoming.exists(t | StatePackage::eINSTANCE.initialNode.isInstance(t.source)))
				.toList
	}
	
	def finalStates(StateMachine sm){
		sm.nodes.filter(typeof(FinalNode)).toList
	}
	
	def danglingStates(StateMachine sm){
		sm.nodes.filter(typeof(State)).filter(s | s.incoming.size == 0).toList
	}
	
	def initialNode(StateMachine sm){
		sm.nodes.filter(typeof(InitialNode)).toList.head
	}
	
	def states(StateMachine sm){
		sm.nodes.filter(typeof(State)).toList
	}
	
	def finalNodes(StateMachine sm){
		sm.nodes.filter(typeof(FinalNode)).toList
	}
	
	def transition(StateMachine sm, Node source, Node target){
		sm.transitions.filter(t | t.source == source && t.target == target).head
	}
	
	def outgoingTimeoutTransitions(State s) {
		s.outgoing.filter(typeof(TimeoutTransition)).toList 
	}
	
	def hasDuplicateOutgoingTransitions(State s) {
		s.outgoing.exists(t | t.transitionWithSameSourceAndTarget)
	}
	
	def transitionWithSameSourceAndTarget(Transition t) {
		var sm = t.eContainer as StateMachine
		sm.transitions.exists(t_ | t_ != t && t_.source == t.source && t_.target == t.target)	
	}
}