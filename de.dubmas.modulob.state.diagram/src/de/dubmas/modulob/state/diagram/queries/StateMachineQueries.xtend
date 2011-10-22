package de.dubmas.modulob.state.diagram.queries

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
}