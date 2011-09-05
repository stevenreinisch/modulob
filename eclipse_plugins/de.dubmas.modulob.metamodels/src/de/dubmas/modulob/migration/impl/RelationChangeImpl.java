/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dubmas.modulob.migration.impl;

import de.dubmas.modulob.migration.MigrationPackage;
import de.dubmas.modulob.migration.RelationChange;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class RelationChangeImpl extends FeatureChangeImpl implements RelationChange {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigrationPackage.Literals.RELATION_CHANGE;
	}

} //RelationChangeImpl
