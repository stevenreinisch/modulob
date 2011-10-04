package de.dubmas.modulob.validation

import java.util.*
import de.dubmas.modulob.*
import de.dubmas.modulob.behaviour.*
import de.dubmas.modulob.system.System
import de.dubmas.modulob.system.BehaviouralModel
import de.dubmas.modulob.system.NotificationModel
import org.eclipse.xtext.validation.Check
import com.google.inject.Inject

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
}