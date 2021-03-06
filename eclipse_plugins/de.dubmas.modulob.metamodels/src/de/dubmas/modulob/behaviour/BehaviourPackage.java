/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.behaviour;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dubmas.modulob.behaviour.BehaviourFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://behaviour.modulob.dubmas.de/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modulob";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourPackage eINSTANCE = de.dubmas.modulob.behaviour.impl.BehaviourPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.behaviour.impl.BehaviourImpl <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.behaviour.impl.BehaviourImpl
	 * @see de.dubmas.modulob.behaviour.impl.BehaviourPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__REACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__NAME = 1;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.dubmas.modulob.behaviour.impl.ReactionImpl <em>Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dubmas.modulob.behaviour.impl.ReactionImpl
	 * @see de.dubmas.modulob.behaviour.impl.BehaviourPackageImpl#getReaction()
	 * @generated
	 */
	int REACTION = 1;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__NOTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__ORDER = 2;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__NAME = 4;

	/**
	 * The number of structural features of the '<em>Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.behaviour.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see de.dubmas.modulob.behaviour.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dubmas.modulob.behaviour.Behaviour#getReactions <em>Reactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactions</em>'.
	 * @see de.dubmas.modulob.behaviour.Behaviour#getReactions()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_Reactions();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.behaviour.Behaviour#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dubmas.modulob.behaviour.Behaviour#getName()
	 * @see #getBehaviour()
	 * @generated
	 */
	EAttribute getBehaviour_Name();

	/**
	 * Returns the meta object for class '{@link de.dubmas.modulob.behaviour.Reaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction</em>'.
	 * @see de.dubmas.modulob.behaviour.Reaction
	 * @generated
	 */
	EClass getReaction();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.behaviour.Reaction#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notification</em>'.
	 * @see de.dubmas.modulob.behaviour.Reaction#getNotification()
	 * @see #getReaction()
	 * @generated
	 */
	EReference getReaction_Notification();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.behaviour.Reaction#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see de.dubmas.modulob.behaviour.Reaction#getMethod()
	 * @see #getReaction()
	 * @generated
	 */
	EReference getReaction_Method();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.behaviour.Reaction#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see de.dubmas.modulob.behaviour.Reaction#getOrder()
	 * @see #getReaction()
	 * @generated
	 */
	EAttribute getReaction_Order();

	/**
	 * Returns the meta object for the reference '{@link de.dubmas.modulob.behaviour.Reaction#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see de.dubmas.modulob.behaviour.Reaction#getInterface()
	 * @see #getReaction()
	 * @generated
	 */
	EReference getReaction_Interface();

	/**
	 * Returns the meta object for the attribute '{@link de.dubmas.modulob.behaviour.Reaction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dubmas.modulob.behaviour.Reaction#getName()
	 * @see #getReaction()
	 * @generated
	 */
	EAttribute getReaction_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviourFactory getBehaviourFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.behaviour.impl.BehaviourImpl <em>Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.behaviour.impl.BehaviourImpl
		 * @see de.dubmas.modulob.behaviour.impl.BehaviourPackageImpl#getBehaviour()
		 * @generated
		 */
		EClass BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '<em><b>Reactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__REACTIONS = eINSTANCE.getBehaviour_Reactions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR__NAME = eINSTANCE.getBehaviour_Name();

		/**
		 * The meta object literal for the '{@link de.dubmas.modulob.behaviour.impl.ReactionImpl <em>Reaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dubmas.modulob.behaviour.impl.ReactionImpl
		 * @see de.dubmas.modulob.behaviour.impl.BehaviourPackageImpl#getReaction()
		 * @generated
		 */
		EClass REACTION = eINSTANCE.getReaction();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION__NOTIFICATION = eINSTANCE.getReaction_Notification();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION__METHOD = eINSTANCE.getReaction_Method();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTION__ORDER = eINSTANCE.getReaction_Order();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION__INTERFACE = eINSTANCE.getReaction_Interface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTION__NAME = eINSTANCE.getReaction_Name();

	}

} //BehaviourPackage
