package de.dubmas.modulob;


import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.junit.validation.ValidatorTester;

import de.dubmas.modulob.behaviour.Behaviour;
import de.dubmas.modulob.behaviour.BehaviourFactory;
import de.dubmas.modulob.behaviour.Reaction;
import de.dubmas.modulob.common.DslStandaloneSetup;
import de.dubmas.modulob.system.BehaviouralModel;
import de.dubmas.modulob.system.SystemFactory;
import de.dubmas.modulob.validation.BehaviourDslJavaValidator;
import de.dubmas.modulob.validation.BehaviourValidationIssueCodes;

public class BehaviourDslValidatorTests extends AbstractXtextTests {
	
	private ValidatorTester<BehaviourDslJavaValidator> tester;
	
	@Override
	public void setUp() {
		try {
			super.setUp();
			
			with(DslStandaloneSetup.class);
			with(BehaviourDslStandaloneSetup.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BehaviourDslJavaValidator validator = get(BehaviourDslJavaValidator.class); 
		tester = new ValidatorTester<BehaviourDslJavaValidator>(validator, getInjector());
	}
	
	public void testCheckIfOrderIsCorrect(){
		/*
		 * Build model fragment:
		 * - two Notifications
		 * - BehaviouralModel with one behaviour and three reactions
		 * - two reactions reacting to same notification in wrong order 
		 */
		
		Notification n1 = ModulobFactory.eINSTANCE.createNotification();
		Notification n2 = ModulobFactory.eINSTANCE.createNotification();
		
		BehaviouralModel bm = SystemFactory.eINSTANCE.createBehaviouralModel();
		Behaviour b = BehaviourFactory.eINSTANCE.createBehaviour();
		bm.getBehaviours().add(b);
		
		Reaction r1 = BehaviourFactory.eINSTANCE.createReaction();
		r1.setNotification(n1);
		r1.setOrder(0);
		
		Reaction r2 = BehaviourFactory.eINSTANCE.createReaction();
		r2.setNotification(n1);
		r2.setOrder(0);
		
		Reaction r3 = BehaviourFactory.eINSTANCE.createReaction();
		r3.setNotification(n2);
		r3.setOrder(0);
		
		b.getReactions().add(r1);
		b.getReactions().add(r2);
		b.getReactions().add(r3);
		
		/*
		 * do test 
		 */
		tester.validator().checkIfReactionHasCorrectOrder(r1);
		tester.diagnose().assertError(BehaviourValidationIssueCodes.REACTION_INCORRECT_ORDER);
	}
}
