package de.dubmas.modulob.stategenerator

import de.dubmas.modulob.state.*

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
		(n.eContainer as StateMachine).name + 'State_' + n.name.toUpperCase()
	}
	
	def enumLiteral(Transition t){
		(t.eContainer as StateMachine).name + 'Transition_' +
		t.source.name().toUpperCase() + '_' +
		t.target.name().toUpperCase()
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
		t.source.name() + '_to_' + t.target.name()
	}
	
	def guardSelectorName(Transition t){
		'guard_' + t.name()	
	}

	def actionSelectorName(Transition t){
		'action_' + t.name()	
	}
	
	def stateHandlerName(StateMachine sm){
		'P_D_' + sm.name + 'StateHandler'
	}
	
	def deterministicExitStates(StateMachine sm){
		sm.nodes.filter(typeof(State)).filter(s | s.outgoing.size == 1)
	}

	def nonDeterministicExitStates(StateMachine sm){
		var states = sm.nodes.filter(typeof(State)).toSet 
		states.removeAll(sm.deterministicExitStates().toSet)
		states
	}
}