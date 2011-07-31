package de.dubmas.modulob.migration.ui.wizard;

import org.eclipse.jface.wizard.Wizard;

import de.dubmas.modulob.system.EntityModel;

public class EntityMappingWizard extends Wizard{

	private String[] entityNames = new String[]{"AnEntity", "AnotherEntity", "DifferentEntity"};
	
	/*
	 * Extracted from model files that are
	 * specified by the user 
	 */
	private EntityModel sourceEntityModel;
	private EntityModel destinationEntityModel;
	
	public EntityMappingWizard() {
		this.setWindowTitle("How to map entity \"AnEntity\" (2/12)?");
	}
	
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPages() {
		
		EntityModelsSelectionPage selectionPage = new EntityModelsSelectionPage("Select Source and Destination");
		this.addPage(selectionPage);
		
		for (String entityName : entityNames) {
			EntityMappingPage emp = new EntityMappingPage("How to map " + entityName);
			this.addPage(emp);
		}
		
	}
}
