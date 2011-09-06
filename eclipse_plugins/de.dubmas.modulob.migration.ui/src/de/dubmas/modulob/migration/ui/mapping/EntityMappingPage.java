package de.dubmas.modulob.migration.ui.mapping;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.xtend.util.stdlib.CloningExtensions;

import de.dubmas.modulob.Entity;
import de.dubmas.modulob.Feature;
import de.dubmas.modulob.migration.FeatureChange;
import de.dubmas.modulob.migration.Migration;
import de.dubmas.modulob.migration.services.MigrationResult;
import de.dubmas.modulob.migration.services.impl.Util;
import de.dubmas.modulob.migration.ui.execcontext.ExecContext;
import de.dubmas.modulob.migration.ui.execcontext.ExeccontextFactory;
import de.dubmas.modulob.psee.ui.wizard.AbstractWizardPage;

public class EntityMappingPage extends AbstractWizardPage implements SelectionListener{

	public static final String EXEC_CONTEXT_KEY = "execContext";
	
	private Composite mainComposite;
	private Composite featureMappingComp;
	
	private Combo sourceEntityDropDown;
	private Combo sourceFeatureDropDown;
	
	private Composite copyOrChangeComposite;
	private Button mustCopyButton;
	private Button mustChangeButton;
	
	private Label currentFeatureLabel;
	
	private ExecContext execContext;
	
	public EntityMappingPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		
		mainComposite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
	    gl.numColumns = 1;
	    mainComposite.setLayout(gl);
	   
	    setControl(mainComposite);
	    
	    copyOrChangeComposite = new Composite(mainComposite, SWT.NONE);
	    gl = new GridLayout();
	    gl.numColumns = 2;
	    copyOrChangeComposite.setLayout(gl);
	    
	    mustCopyButton = new Button(copyOrChangeComposite, SWT.RADIO);
	    mustCopyButton.setSelection(true);
	    mustCopyButton.addSelectionListener(this);
	    new Label (copyOrChangeComposite, SWT.NONE).setText("Copy");
	    
	    mustChangeButton = new Button(copyOrChangeComposite, SWT.RADIO);
	    mustChangeButton.addSelectionListener(this);
	    new Label (copyOrChangeComposite, SWT.NONE).setText("Change Mapping");
	    
	    /*
	     * The composite containing widgets for specifying
	     * how features are mapped.
	     */
	    featureMappingComp = new Composite(mainComposite, SWT.NONE);
	    
	    gl = new GridLayout();
	    gl.numColumns = 3;
	    featureMappingComp.setLayout(gl);
	    
	    new Label (featureMappingComp, SWT.NONE).setText("Destination Feature:");
	    new Label (featureMappingComp, SWT.NONE).setText("Source Entity:");
	    new Label (featureMappingComp, SWT.NONE).setText("Source Feature:");
	    
	    GridData gridData = new GridData();
	    gridData.horizontalSpan = 1;
	    gridData.horizontalAlignment = GridData.FILL;
	    gridData.grabExcessHorizontalSpace = true;
	    
	    currentFeatureLabel   = new Label (featureMappingComp, SWT.NONE);
	    currentFeatureLabel.setText("<aFeature> (x | y)");
	    currentFeatureLabel.setLayoutData(gridData);
	    
	    gridData = new GridData();
	    gridData.horizontalSpan = 1;
	    gridData.horizontalAlignment = GridData.FILL;
	    gridData.grabExcessHorizontalSpace = true;
	    
	    sourceEntityDropDown  = new Combo(featureMappingComp, SWT.DROP_DOWN);
	    sourceEntityDropDown.setLayoutData(gridData);
	    
	    gridData = new GridData();
	    gridData.horizontalSpan = 1;
	    gridData.horizontalAlignment = GridData.FILL;
	    gridData.grabExcessHorizontalSpace = true;
	    
	    sourceFeatureDropDown = new Combo(featureMappingComp, SWT.DROP_DOWN);
	    sourceFeatureDropDown.setLayoutData(gridData);
	    
	    sourceEntityDropDown.addSelectionListener(this);
	    sourceFeatureDropDown.addSelectionListener(this);   
	}
	
	public void setVisible(boolean visible){
		super.setVisible(visible);
		
		setState();
		
		/*
		 * update
		 */
		 this.setTitle(this.getTitle() + "becoming visible ...");
		 
		 boolean isCopyChange = true;
		 if(isCopyChange){
			 copyOrChangeComposite.setVisible(true);
			 featureMappingComp.setVisible(false);
		 } else {
			 copyOrChangeComposite.setVisible(false);
			 featureMappingComp.setVisible(true);
		 }
		 
		 mainComposite.layout(true);
	}
	
	private void setState(){
		setExecContext();
		
		List<String> entityNames = Util.namesFromEntities(execContext.getSourceEntities());
	    String[] items           = entityNames.toArray(new String[entityNames.size()]);
	    sourceEntityDropDown.setItems (items);
	}
	
	private void setExecContext(){
		/*
		 * instance of this page already shown?
		 */
		 if(slots.get(EXEC_CONTEXT_KEY) == null){
			 
			execContext = ExeccontextFactory.eINSTANCE.createExecContext();
			MigrationResult mr = (MigrationResult) slots.get(InvokeCompareAndTransform.MIGRATION_RESULT_KEY);
			execContext.getSourceEntities().addAll(mr.getSourceEntities());
			
			/*
			 * clone the migration because we want to manipulate it
			 */
			execContext.setMigration((Migration)CloningExtensions.clone(mr.getMigration()));
			
			pickNextEntityChange();
			
			slots.put(EXEC_CONTEXT_KEY, execContext);
		 } 
		 
		execContext = (ExecContext) slots.get(EXEC_CONTEXT_KEY);

		/*
		 * do we have to pick the next entity?
		 * .. do we have handled all feature changes of the current entityChange?
		 */
		if(execContext.getNextFeatureChangeIndex() == 
		   execContext.getCurrentEntityChange().getFeatureChanges().size())
		{
			pickNextEntityChange();
		}
		
		pickNextFeatureChange();
	}
	
	private void pickNextEntityChange(){
		
		if(execContext.getCurrentEntityChange() != null){
		   /*
		 	* remove the current
		 	*/
			int currentDestEntityIndex = 
					execContext.getMigration().getEntityChanges().
						indexOf(execContext.getCurrentEntityChange());
		
			if (currentDestEntityIndex < 0) {
				throw new RuntimeException(
					"Cannot find current entityChange. You have to tell me, when I am finished!");
			}
		
			execContext.getMigration().getEntityChanges().remove(currentDestEntityIndex);
		}
		
		/*
		 * always pick the last unmapped entity
		 */
		int entityIndex = execContext.getMigration().getEntityChanges().size() - 1;
		
		if (entityIndex < 0) {
			throw new RuntimeException(
					"all entityChanges handled! Cannot continue. You have to tell me, when I am finished!");
		}
		
		
		execContext.setCurrentEntityChange(execContext.getMigration().getEntityChanges().get(entityIndex));
		execContext.setNextFeatureChangeIndex(0);
	}
	
	/**
	 * Get the next feature from the current destination entity
	 */
	private void pickNextFeatureChange(){
		int featureChangeIndex = execContext.getNextFeatureChangeIndex();
		
		if(featureChangeIndex >= execContext.getCurrentEntityChange().getFeatureChanges().size()){
			throw new RuntimeException("I have already mapped all features of mapping: " + 
										execContext.getCurrentEntityChange().getSourceEntity().getName() + 
										" -> " + 
										execContext.getCurrentEntityChange().getDestinationEntity().getName());
		}
		
		FeatureChange currentFeatureChange = 
				execContext.getCurrentEntityChange().getFeatureChanges().get(featureChangeIndex);
		
		execContext.setCurrentFeatureChange(currentFeatureChange);
		execContext.setNextFeatureChangeIndex(featureChangeIndex + 1);
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		onEvent(e);
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		onEvent(e);
	}
	
	private void onEvent(SelectionEvent e){
		if(e.getSource() == mustCopyButton ||
		   e.getSource() == mustCopyButton)
		{
			featureMappingComp.setVisible(!featureMappingComp.isVisible());
			mainComposite.layout(true);
		} 
		else if(e.getSource() == sourceEntityDropDown)
		{
			int index = ((Combo)e.getSource()).getSelectionIndex();
			if(index > -1)
			{
				Entity entity = execContext.getSourceEntities().get(index);
				List<String> featureNames = Util.namesFromFeatures(entity.getFeatures());
				String[] items = featureNames.toArray(new String[featureNames.size()]);
			    sourceFeatureDropDown.setItems (items);
			}
			
		} 
		else if(e.getSource() == sourceFeatureDropDown)
		{
			int featureIndex = ((Combo)e.getSource()).getSelectionIndex();
			if(featureIndex > -1)
			{
				int entityIndex = sourceEntityDropDown.getSelectionIndex();
				Entity entity = execContext.getSourceEntities().get(entityIndex);
				Feature f = entity.getFeatures().get(featureIndex);
				//TODO: set feature as destinationFeature on current featureChange
			}
		}
	}
}
