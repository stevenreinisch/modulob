package de.dubmas.modulob.util.queries

import de.dubmas.modulob.state.*

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
}