package de.dubmas.modulob.migration.test;

import org.eclipse.emf.mwe2.runtime.workflow.AbstractCompositeWorkflowComponent;

import de.dubmas.modulob.migration.model.migration.MigrationPackage;

public class EPackageRegistration extends AbstractCompositeWorkflowComponent{
	
	public void preInvoke() {
		MigrationPackage.eINSTANCE.eClass();
	}
}
