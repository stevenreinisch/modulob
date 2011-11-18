package de.dubmas.modulob.stategenerator

import com.google.inject.Inject
import de.dubmas.modulob.state.FinalNode
import de.dubmas.modulob.state.InitialNode
import de.dubmas.modulob.state.Node
import de.dubmas.modulob.state.State
import de.dubmas.modulob.state.StateMachine
import de.dubmas.modulob.state.StatePackage
import de.dubmas.modulob.state.Transition
import de.dubmas.modulob.state.TimeoutTransition
import de.dubmas.modulob.util.Indexed
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class Compiler implements IGenerator{
	
	@Inject extension Extensions e	
	
	override doGenerate(Resource r, IFileSystemAccess fsa) {
		var sm = (r.contents.get(0) as StateMachine)
		fsa.generateFile(sm.headerFilePath + sm.className + '.h', sm.header)
		fsa.generateFile(sm.implFilePath + sm.className + '.m', sm.impl)
		fsa.generateFile(sm.headerFilePath + sm.stateHandlerName + '.h', sm.stateHandler)
	}
	
	def header(StateMachine sm)
	'''
	#import "MOBStateMachine.h"

	enum {
		«sm.nodes.filter(typeof(InitialNode)).head.enumLiteral» = 0,
		«FOR s: sm.nodes.filter(n | StatePackage::eINSTANCE.state.isInstance(n) 
									|| 
									StatePackage::eINSTANCE.finalNode.isInstance(n)) SEPARATOR ','»
			«s.enumLiteral»
		«ENDFOR»
	};
	
	enum {
		«FOR t: Indexed::indexed(sm.transitions) SEPARATOR ','»
			«t.value.enumLiteral()» «IF t.index0 == 0»= 0«ENDIF»
		«ENDFOR»
	};
	
	@interface «sm.className» : MOBStateMachine

	@end
	'''
	
	def impl(StateMachine sm)
	'''
	#import "«sm.className».h"

	#import "MOBStateMachine.h"

	@implementation «sm.className»

	- (id)init
	{
		self = [super init];
		if (self) {
			/*
			 * Define the states.
			 */
			 «FOR n: sm.nodes»
			 	«n.stateDef»
			 	
			 «ENDFOR»
			 
			 /*
			  * Define transitions.
			  */
			  «FOR t: sm.transitions»
			  	«t.transitionType» «t.name()» = [[MOBTransition new] autorelease];
			  	«t.name()».ID = «t.enumLiteral»;
			  	«t.name()».guardSelectorName = @"«t.guardSelectorName»";
			  	«t.name()».actionSelectorName = @"«t.actionSelectorName»";
			  	
			  	«IF StatePackage::eINSTANCE.timeoutTransition.isInstance(t)»
			  		«t.source.name()».timeoutTransition = «t.name()»;
			  		
			  	«ENDIF»
			  «ENDFOR»
			  
			  /*
			   * Build the transition index.
			   */
			   
			   self.transitionIndex = [NSArray arrayWithObjects:
                                «FOR t: sm.transitions SEPARATOR ','»
                                	«t.name()»
                                «ENDFOR»
								,nil];
			  
				/*
				 * Wire states and transitions.
				 */

				//states -> transitions
				«FOR n: sm.nodes»
					«n.stateTransitionWiring»
					
				«ENDFOR»
				
				//transitions -> states
				«FOR t: sm.transitions»
					«t.name()».sourceState = «t.source.name()»;
					«t.name()».targetState = «t.target.name()»;
					
				«ENDFOR»
				
				/*
				 * Add states and transitions to this state machine instance.
				 */
				 «FOR n: sm.nodes»
				 	[self.states addObject:«n.name()»];
				 «ENDFOR»
				 
				 «FOR t: sm.transitions»
				 	[self.transitions addObject:«t.name()»];
				 «ENDFOR»
		}
		return self;
	}
	@end 
	'''
	
	def dispatch transitionType(Transition t)
	''' MOBTransition * '''
	
	def dispatch transitionType(TimeoutTransition t)
	''' MOBTimeoutTransition * '''
	
	def dispatch stateDef(Node n)
	''''''
	
	def dispatch stateDef(InitialNode in)
	'''
	MOBInitialState *«in.name()» = [[MOBInitialState new] autorelease];
	«in.name()».name = @"«in.name()»";
	«in.name()».ID   = «in.enumLiteral»;
	«in.name()».entrySelectorName = @"«in.entrySelectorName»";
	«in.name()».exitSelectorName  = @"«in.exitSelectorName»";
	'''
	
	def dispatch stateDef(FinalNode fn)
	'''
	MOBFinalState *«fn.name()» = [[MOBFinalState new] autorelease];
	«fn.name()».name = @"«fn.name()»";
	«fn.name()».ID   = «fn.enumLiteral»;
	«fn.name()».entrySelectorName = @"«fn.entrySelectorName»";
	'''
	
	def dispatch stateDef(State s)
	'''
	MOBState *«s.name()» = [[MOBState new] autorelease];
	«s.name()».name = @"«s.name()»";
	«s.name()».ID = «s.enumLiteral»;
	«IF s.duration > new Double(0)»
		«s.name()».duration = «s.duration»;
	«ELSEIF (s.duration == new Double(0))»
		«s.name()».duration = MOBIMMEDIATE_STATE_EXIT;
	«ENDIF»
	«s.name()».entrySelectorName = @"«s.entrySelectorName»";
	«s.name()».exitSelectorName = @"«s.exitSelectorName»";
	'''
	
	def dispatch stateTransitionWiring(Node n)
	''''''
	
	def dispatch stateTransitionWiring(InitialNode in)
	'''
	«IF in.outgoing.size > 0»
		«in.name()».outgoingTransitions = [NSSet setWithObjects:
     		«FOR t: in.outgoing SEPARATOR ','»
     			«t.name()»
     		«ENDFOR», nil];
	«ENDIF»
	'''
	
	def dispatch stateTransitionWiring(FinalNode fn)
	'''
	«IF fn.incoming.size > 0»
		«fn.name()».incomingTransitions = [NSSet setWithObjects:
     		«FOR t: fn.incoming SEPARATOR ','»
     			«t.name()»
     		«ENDFOR», nil];
	«ENDIF»
	'''
	
	def dispatch stateTransitionWiring(State s)
	'''
	«IF s.outgoing.size > 0»
		«s.name()».outgoingTransitions = [NSSet setWithObjects:
     		«FOR t: s.outgoing SEPARATOR ','»
     			«t.name()»
     		«ENDFOR», nil];
	«ENDIF»
	«IF s.incoming.size > 0»
		«s.name()».incomingTransitions = [NSSet setWithObjects:
     		«FOR t: s.incoming SEPARATOR ','»
     			«t.name()»
     		«ENDFOR», nil];
	«ENDIF»
	'''
	
	def stateHandler(StateMachine sm)
	'''
	#import <Foundation/Foundation.h>

	@protocol «sm.stateHandlerName» <NSObject>
	@optional

	#pragma mark states: entry and exit (optional)
	«FOR n: sm.nodes»
		/*
		 * state «n.name()»
		 */
		«n.entryExit»
		
	«ENDFOR»
	
	#pragma mark -
	#pragma mark transitions: actions (optional)
	«FOR t: sm.transitions»
		«t.transitionAction»
		
	«ENDFOR»
	
	«IF sm.deterministicExitStates().size > 0»
		#pragma mark transitions: guards (optional)
		//Guards are optional if state has only one outgoing transition.
		//Guards for timeout transitions are not evaluated and thus neither optional nor required.
		
		«FOR t: sm.deterministicExitStates.map(s | s.outgoing).flatten.
					filter(t | !StatePackage::eINSTANCE.timeoutTransition.isInstance(t))
		»
			«t.transitionGuard»
			
		«ENDFOR»	
	«ENDIF»

	«IF sm.nonDeterministicExitStates().size > 0»
		#pragma mark transitions: guards (required)
		//Guards for timeout transitions are not evaluated and thus neither optional nor required.

		@required
		
		«FOR t: sm.nonDeterministicExitStates.map(s | s.outgoing).flatten.
					filter(t | !StatePackage::eINSTANCE.timeoutTransition.isInstance(t))
		»
			«t.transitionGuard»
			
		«ENDFOR»
	«ENDIF»
	@end
	'''
	
	def dispatch entryExit(Node n){}
	
	def dispatch entryExit(InitialNode in)
	'''
		- (void) «in.exitSelectorName()»;
	'''
	
	def dispatch entryExit(FinalNode fn)
	'''
		- (void) «fn.entrySelectorName()»;
	'''
	
	def dispatch entryExit(State s)
	'''
		- (void) «s.exitSelectorName()»;
		- (void) «s.entrySelectorName()»;
	'''
	
	def transitionAction(Transition t)
	'''
	/*
	 * transition «t.name()»
	 */
	- (void) «t.actionSelectorName()»;
	'''
	
	def transitionGuard(Transition t)
	'''
	/*
	 * transition «t.name()»
	 «IF t.guard.expression != ""»* guard description: «t.guard.expression»«ELSE»*«ENDIF»
	 */
	- (BOOL) «t.guardSelectorName()»;
	'''
}