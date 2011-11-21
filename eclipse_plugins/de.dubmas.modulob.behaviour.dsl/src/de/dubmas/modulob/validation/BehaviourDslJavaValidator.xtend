package de.dubmas.modulob.validation

import com.google.inject.Inject
import de.dubmas.modulob.Notification
import de.dubmas.modulob.behaviour.BehaviourPackage
import de.dubmas.modulob.behaviour.Reaction
import de.dubmas.modulob.system.BehaviouralModel
import java.util.LinkedList
import org.eclipse.xtext.validation.Check

class BehaviourDslJavaValidator extends AbstractBehaviourDslJavaValidator{
	
	@Inject extension BehaviourDslExtensions extensions

	@Check
	def checkIfReactionHasCorrectOrder(Reaction r){
		var bm = (r.eContainer.eContainer as BehaviouralModel)
		var errorneousNotifications = new LinkedList<Notification>() 
		bm.notificationsReactedToInIncorrectOrder(errorneousNotifications)
		
		if(errorneousNotifications.
			map(n | n.associatedReactions((r.eContainer.eContainer as BehaviouralModel).behaviours)).
				flatten.toList.reactionsNotInOrder.contains(r))
		{
			error("Order is incorrect.", 
				   	  r, 
				      BehaviourPackage::eINSTANCE.reaction_Order, 
				      0, 
				      de::dubmas::modulob::validation::BehaviourValidationIssueCodes::REACTION_INCORRECT_ORDER, 
				      null)		
		}
	}
	
	
	/*
	 * The features of a reaction's notification must match 
	 * the reaction's parameters in number, type, and name.
	 */
	@Check
	def checkIfParametersMatch(Reaction r){
		if(((r.notification.features.size != r.method.parameters.size)
			&&
			!r.notification.features.
				forall(f | r.method.parameters.exists(p | f.type.isMulti == p.type.isMulti
														  &&
														  f.type.referenced == p.type.referenced
														  &&
														  f.name == p.name
				)))
		)
		{
			error("The features of a reaction's notification must match the method's parameters in number, type, and name.", 
				   r, 
				   BehaviourPackage::eINSTANCE.reaction_Notification, 
				   0, 
				   de::dubmas::modulob::validation::BehaviourValidationIssueCodes::REACTION_PARAMETER_ORDER, 
				   null)		
		}
	}
	
	@Check
	def checkIfParametersInReactionMatch(Reaction r) {
		var check = r.notification.features.
						forall(f | r.method.parameters.
							exists(f_ | f.type.isMulti == f_.type.isMulti
									    &&
									    f.type.referenced == f_.type.referenced
								    	&&
								    	f.name == f_.name
							)
						)
		if (!check) {
			error ("Features of notification have to match parameters of method in type and name." ,
					BehaviourPackage::eINSTANCE.reaction_Notification, 
					0 ,
					de::dubmas::modulob::validation::BehaviourValidationIssueCodes::REACTION_PARAMS_NAME_CODE,
					null )
		}
	}
}