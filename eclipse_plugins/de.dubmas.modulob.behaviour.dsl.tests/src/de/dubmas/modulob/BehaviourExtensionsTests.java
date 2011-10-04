package de.dubmas.modulob;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import de.dubmas.modulob.behaviour.Behaviour;
import de.dubmas.modulob.behaviour.BehaviourFactory;
import de.dubmas.modulob.behaviour.Reaction;
import de.dubmas.modulob.system.BehaviouralModel;
import de.dubmas.modulob.system.SystemFactory;
import de.dubmas.modulob.validation.BehaviourDslExtensions;

public class BehaviourExtensionsTests extends AbstractXtextTests {
	
	public void testOrderExtensions(){
		BehaviourDslExtensions extensions = new BehaviourDslExtensions();
		
		Integer sum = extensions.sum(Arrays.asList(1, 2, 3));
		assertEquals(6, sum.intValue());
		
		///
		
		assertTrue(extensions.checkOrder(Arrays.asList(1, 2, 3)));
		assertTrue(extensions.checkOrder(Arrays.asList(3, 1, 2)));
		assertFalse(extensions.checkOrder(Arrays.asList(0, 2, 3)));
	}
	
	public void testExtensions(){
		/*
		 * Build model fragment
		 */
		
		Notification n1 = ModulobFactory.eINSTANCE.createNotification();
		Notification n2 = ModulobFactory.eINSTANCE.createNotification();
		
		BehaviouralModel bm = SystemFactory.eINSTANCE.createBehaviouralModel();
		
		List<Behaviour> behaviours = new LinkedList<Behaviour>();
		Behaviour b1 = BehaviourFactory.eINSTANCE.createBehaviour();
		
		Reaction b1_r1 = BehaviourFactory.eINSTANCE.createReaction();
		b1_r1.setNotification(n1);
		
		Reaction b1_r2 = BehaviourFactory.eINSTANCE.createReaction();
		b1_r2.setNotification(n1);
		
		b1.getReactions().add(b1_r1);
		b1.getReactions().add(b1_r2);
		
		Behaviour b2 = BehaviourFactory.eINSTANCE.createBehaviour();
		
		Reaction b2_r1 = BehaviourFactory.eINSTANCE.createReaction();
		b2_r1.setNotification(n2);
		
		b2.getReactions().add(b2_r1);
		
		behaviours.add(b1);
		behaviours.add(b2);
		
		bm.getBehaviours().addAll(behaviours);
		
		/*
		 * do test
		 */
		BehaviourDslExtensions extensions = new BehaviourDslExtensions();
		
		Iterable<Reaction> reactions = 
				extensions.reactions(behaviours);
		
		assertEquals(3, IterableExtensions.toList(reactions).size());
		
		///
		
		Iterable<Notification> notifications = 
				extensions.notifications(behaviours);
		
		assertEquals(2, IterableExtensions.toList(notifications).size());
		
		///
		
		Iterable<Notification> multiNotifications = 
				extensions.notificationsTriggeringMultipleReactions(behaviours);
		
		assertEquals(1, IterableExtensions.toList(multiNotifications).size());
		assertTrue(IterableExtensions.toList(multiNotifications).contains(n1));
		
		///
		
		Iterable<Reaction> associatedReactions = 
					extensions.associatedReactions(n1, behaviours);
		
		assertEquals(2, IterableExtensions.toList(associatedReactions).size());
		
		///
		
		List<Notification> ns = new LinkedList<Notification>(); 
		extensions.notificationsReactedToInIncorrectOrder(bm, ns);
		
		assertEquals(1, IterableExtensions.toList(ns).size());
		assertTrue(IterableExtensions.toList(ns).contains(n1));
		
		///change order of reactions ..
		b1_r1.setOrder(1);
		b1_r2.setOrder(2);
		
		ns.clear();
		extensions.notificationsReactedToInIncorrectOrder(bm, ns);
		
		assertEquals(0, IterableExtensions.toList(ns).size());
		assertFalse(IterableExtensions.toList(ns).contains(n1));
		
		///
		
	}
	
	public void testReactionsNotInOrder(){
		List<Reaction> reactions = new LinkedList<Reaction>();
		
		Reaction r1 = BehaviourFactory.eINSTANCE.createReaction();
		r1.setOrder(1);
		reactions.add(r1);
		
		Reaction r2 = BehaviourFactory.eINSTANCE.createReaction();
		r2.setOrder(2);
		reactions.add(r2);
		
		Reaction r3 = BehaviourFactory.eINSTANCE.createReaction();
		r3.setOrder(3);
		reactions.add(r3);
		
		/*
		 * do test 
		 */
		BehaviourDslExtensions extensions = new BehaviourDslExtensions();
		
		List<Reaction> rs = extensions.reactionsNotInOrder(reactions);
		assertEquals(0, rs.size());
		
		///change order (r1.order = 1, r2.order = 3, r3.order = 3)
		r2.setOrder(3);
		rs = extensions.reactionsNotInOrder(reactions);
		assertEquals(1, rs.size());
		assertTrue(rs.contains(r2));
		
		///change order (r1.order = 0, r2.order = 3, r3.order = 0)
		r1.setOrder(0);
		r3.setOrder(0);
		rs = extensions.reactionsNotInOrder(reactions);
		assertEquals(2, rs.size());
		
		///change order (r1.order = 0, r2.order = 0, r3.order = 0)
		r2.setOrder(0);
		rs = extensions.reactionsNotInOrder(reactions);
		assertEquals(3, rs.size());
		
		///
		reactions.remove(r3);
		r1.setOrder(0);
		r2.setOrder(3);
		rs = extensions.reactionsNotInOrder(reactions);
		assertEquals(2, rs.size());
	}
}
