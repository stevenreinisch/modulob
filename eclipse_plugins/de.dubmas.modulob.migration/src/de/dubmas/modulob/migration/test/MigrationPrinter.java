package de.dubmas.modulob.migration.test;

import org.eclipse.emf.mwe2.runtime.workflow.AbstractCompositeWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

import de.dubmas.modulob.migration.model.migration.AttributeChange;
import de.dubmas.modulob.migration.model.migration.EntityChange;
import de.dubmas.modulob.migration.model.migration.FeatureChange;
import de.dubmas.modulob.migration.model.migration.Migration;
import de.dubmas.modulob.migration.model.migration.RelationChange;

public class MigrationPrinter extends AbstractCompositeWorkflowComponent{
	
	private String migrationSlotName;
	
	public void setMigrationSlotName(String migrationSlotName){
		this.migrationSlotName = migrationSlotName;
	}
	
	@Override
	public void invoke(IWorkflowContext ctx) {
		Migration migration = (Migration)ctx.get(migrationSlotName);
		
		for(EntityChange ec: migration.getEntityChanges()){
			print(ec);
		}
	}
	
	private void print(EntityChange ec){
		System.out.println("\nEntityChange: " + 
						   ec.eClass().getName() + 
						   "(" + (ec.getSourceEntity() != null ? ec.getSourceEntity().getName() : "no source") + " -> " +
						   (ec.getDestinationEntity() != null ? ec.getDestinationEntity().getName() : "no destination)"));
		System.out.println("-----------------------------\n");
		
		System.out.println("AttributeChanges: ");
		for(AttributeChange ac: ec.getAttributeChanges()){
			print(ac);
		}
		
		System.out.println("RelationChanges: ");
		for(RelationChange rc: ec.getRelationChanges()){
			print(rc);
		}
		
		System.out.println("\n");
	}
	
	private void print(FeatureChange ac){
		System.out.println(ac.eClass().getName() + 
						   "(" + (ac.getSourceFeature() != null ? ac.getSourceFeature().getName() : "no source") + " -> " +
					       (ac.getDestinationFeature() != null ? ac.getDestinationFeature().getName() : "no destination"));
		System.out.println();
	}
}
