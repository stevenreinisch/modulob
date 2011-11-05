package de.dubmas.modulob.validation

import de.dubmas.modulob.Notification
import de.dubmas.modulob.behaviour.Behaviour
import de.dubmas.modulob.behaviour.Reaction
import de.dubmas.modulob.system.BehaviouralModel
import java.util.LinkedList
import java.util.List

class BehaviourDslExtensions {
	
	def associatedReactions(Notification notification, List<Behaviour> behaviours){
		behaviours.reactions.filter(r|r.notification == notification).toList()	
	} 
	
	def notificationsTriggeringMultipleReactions(List<Behaviour> behaviours){
		behaviours.notifications.
			filter(n | behaviours.reactions.
						filter(r | r.notification == n).size > 1
			)
	}
	
	def reactions(List<Behaviour> behaviours){
		behaviours.map(b | b.reactions.map(r | r)).flatten.toSet()
	}
	
	def notifications(List<Behaviour> behaviours){
		behaviours.map(b | b.reactions.map(r | r.notification)).flatten.toSet()
	}
	
	def checkOrder(List<Integer> values){
		values.sum() == values.size.checkSum()	
	}
	
	def sum(List<Integer> values){
		values.reduce(a, b | a + b )
	}
	
	def checkSum(Integer i){
		if(i == 1){
			i
		} else {
			i + (i-1).checkSum()		
		}
	}
	
	def notificationsReactedToInIncorrectOrder(BehaviouralModel bm, List<Notification> errorneousNotifications){
		bm.behaviours.notificationsTriggeringMultipleReactions.
				forEach(n | n.checkIfOrderIsStrictlyIncreasing(bm.behaviours, errorneousNotifications))
	}
	
	def checkIfOrderIsStrictlyIncreasing(Notification n, List<Behaviour> behaviours, List<Notification> errorneousNotifications){
		if(!n.associatedReactions(behaviours).map(r | r.order).toList.checkOrder){
			errorneousNotifications.add(n)
		}
	}
	
	/*
	 * If:
	 * r1.order = 1,
	 * r2.order = 2,
	 * r3.order = 4
	 * 
	 * => returns r3
	 * 
	 * If:
	 * r1.order = 0,
	 * r2.order = 2,
	 * r3.order = 4
	 * 
	 * => returns r1, r2, r3
	 */
	def reactionsNotInOrder(List<Reaction> reactions){
		reactions.sortInplaceBy(r | r.order)
		var reactionsWithIncorrectOrder = new LinkedList<Reaction>()
		var order = 1
		while(order <= reactions.size){
			var reaction = reactions.get(order - 1)
			if(reaction.order != order){
				reactionsWithIncorrectOrder.add(reaction)
			}
			order = order + 1
		}
		reactionsWithIncorrectOrder
	}
	
	def sort(List<Reaction> reactions){
		
	}
}