package de.dubmas.modulob.migration.ui.mapping;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.dubmas.modulob.Feature;
import de.dubmas.modulob.migration.services.MigrationResult;
import de.dubmas.modulob.migration.ui.execcontext.ExecContext;
import de.dubmas.modulob.migration.ui.execcontext.ExeccontextFactory;
import de.dubmas.modulob.psee.ui.wizard.AbstractWizardPage;

public class EntityMappingPage extends AbstractWizardPage{

	public static final String EXEC_CONTEXT_KEY = "execContext";
	
	private Combo sourceEntityDropDown;
	private Combo sourceFeatureDropDown;
	
	private Label currentFeatureLabel;
	private Label featureCounterLabel;
	
	private ExecContext execContext;
	
	public EntityMappingPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		
		Composite mainComposite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
	    int ncol = 2;
	    gl.numColumns = ncol;
	    mainComposite.setLayout(gl);
	   
	    setControl(mainComposite);
	    
	    new Label (mainComposite, SWT.NONE).setText("Feature:");
	    currentFeatureLabel = new Label (mainComposite, SWT.NONE);
	    currentFeatureLabel.setText("<aFeature>");
	    
	    featureCounterLabel = new Label (mainComposite, SWT.NONE);
	    featureCounterLabel.setText("(x | y)");
	}
	
	private void setExecContext(){
		/*
		 * instance of this page already shown?
		 */
		 if(slots.get(EXEC_CONTEXT_KEY) == null){
			 
			execContext = ExeccontextFactory.eINSTANCE.createExecContext();
			MigrationResult mr = (MigrationResult) slots.get(InvokeCompareAndTransform.MIGRATION_RESULT_KEY);
			execContext.setMigration(mr.getMigration());
			execContext.getUnmappedDestEntities().addAll(mr.getDestinationEntities());
			execContext.getSourceEntities().addAll(mr.getSourceEntities());
			execContext.setNumOfDestEntities(mr.getDestinationEntities().size());
			
			pickNextUnmappedDestEntity();
			
			slots.put(EXEC_CONTEXT_KEY, execContext);
		 } 
		 
		execContext = (ExecContext) slots.get(EXEC_CONTEXT_KEY);

		/*
		 * do we have to pick the next entity?
		 * .. do we have mapped all features of the current 
		 *    destination entity?
		 */
		if(execContext.getNextDestFeatureIndex() == 
		   (execContext.getCurrentDestEntity().getFeatures().size()))
		{
			pickNextUnmappedDestEntity();
		}
		
		pickNextDestFeature();
	}
	
	private void pickNextUnmappedDestEntity(){
		
		if(execContext.getCurrentDestEntity() != null){
		   /*
		 	* remove the current dest. entity from the unmapped ones.
		 	*/
			int currentDestEntityIndex = execContext.getUnmappedDestEntities().size() - 1;
		
			if (currentDestEntityIndex < 0) {
				throw new RuntimeException(
					"Cannot find current dest. entity. You have to tell me, when I am finished!");
			}
		
			execContext.getUnmappedDestEntities().remove(currentDestEntityIndex);
		}
		
		/*
		 * always pick the last unmapped entity
		 */
		int entityIndex = execContext.getUnmappedDestEntities().size() - 1;
		
		if (entityIndex < 0) {
			throw new RuntimeException(
					"all destination entities mapped! Cannot continue. You have to tell me, when I am finished!");
		}
		
		
		execContext.setCurrentDestEntity(execContext.getUnmappedDestEntities().get(entityIndex));
		execContext.setNextDestFeatureIndex(0);
	}
	
	/**
	 * Get the next feature from the current destination entity
	 */
	private void pickNextDestFeature(){
		int featureIndex = execContext.getNextDestFeatureIndex();
		
		if(featureIndex >= execContext.getCurrentDestEntity().getFeatures().size()){
			throw new RuntimeException("I have already mapped all features of dest. entity: " + 
										execContext.getCurrentDestEntity().getName());
		}
		
		Feature currentFeature = execContext.getCurrentDestEntity().getFeatures().get(featureIndex);
		
		execContext.setCurrentDestFeature(currentFeature);
		execContext.setNextDestFeatureIndex(featureIndex + 1);
	}
	
	public void setVisible(boolean visible){
		super.setVisible(visible);
		
		/*
		 * update
		 */
		 this.setTitle(this.getTitle() + "becoming visible ...");
	}
}
