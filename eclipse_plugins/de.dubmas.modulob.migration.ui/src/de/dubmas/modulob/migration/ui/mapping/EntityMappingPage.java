package de.dubmas.modulob.migration.ui.mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.dubmas.modulob.Entity;
import de.dubmas.modulob.Feature;
import de.dubmas.modulob.migration.AttributeCopied;
import de.dubmas.modulob.migration.EntityChange;
import de.dubmas.modulob.migration.EntityCopied;
import de.dubmas.modulob.migration.FeatureChange;
import de.dubmas.modulob.migration.RelationCopied;
import de.dubmas.modulob.migration.services.MigrationResult;
import de.dubmas.modulob.migration.services.impl.Util;
import de.dubmas.modulob.migration.ui.execcontext.ExecContext;
import de.dubmas.modulob.migration.ui.execcontext.ExeccontextFactory;
import de.dubmas.modulob.psee.ui.wizard.AbstractWizardPage;
import de.dubmas.modulob.types.Primitive;

public class EntityMappingPage extends AbstractWizardPage implements SelectionListener{

	public static final String EXEC_CONTEXT_KEY = "execContext";
	
	private Composite mainComposite;
	private Composite featureMappingComp;
	
	private Combo sourceEntityDropDown;
	private Combo sourceFeatureDropDown;
	
	private Composite copyOrChangeComposite;
	private Button mustCopyButton;
	private Label mustCopyLabel;
	private Button mustChangeButton;
	private Label mustChangeLabel;
	
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
	    mustCopyLabel = new Label (copyOrChangeComposite, SWT.NONE);
	    mustCopyLabel.setText("Copy");
	    
	    mustChangeButton = new Button(copyOrChangeComposite, SWT.RADIO);
	    mustChangeButton.addSelectionListener(this);
	    mustChangeLabel = new Label (copyOrChangeComposite, SWT.NONE);
	    mustChangeLabel.setText("Change Mapping");
	    
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
		Entity currentDestEntity = execContext.getCurrentDestinationEntity();
		List<Entity> allDestEntities = execContext.getDestinationEntities();
		
		String title = "Specify mapping for Entity " + 
						currentDestEntity.getName() +
					   " (" + (allDestEntities.indexOf(currentDestEntity) + 1) + 
					   "/" + allDestEntities.size() +
					   ")";
					   
		 this.setTitle(title);
		 
		 Feature currentDestFeature = execContext.getCurrentDestinationFeature();
		 List<Feature> allFeatures = currentDestEntity.getFeatures();
		 
		 String text = null;
		 
		 if(allFeatures.size() > 0){
			 text = currentDestFeature.getName() + 
				 	   " (" + (allFeatures.indexOf(currentDestFeature) + 1) +
				 	   "/" + allFeatures.size() +
				 	   ")";
			 
			 currentFeatureLabel.setText(text);
		 } else {
			 text = "Entity " + currentDestEntity.getName() + " has no features. Just press Next!";
			 
			 currentFeatureLabel = new Label(mainComposite, SWT.NONE);
			 currentFeatureLabel.setText(text);
			 
			 copyOrChangeComposite.setVisible(false);
			 featureMappingComp.setVisible(false);
			 
			 mainComposite.layout(true);
			 
			 return;
		 }
		 
		 
		 if(isCopyChange()){
			 
			 StringBuffer copyLabelText = new StringBuffer();
			 copyLabelText.append("Click Next to copy ");
			 
			 if (currentEntityChange() instanceof EntityCopied) {
				 copyLabelText.append("Entity ");
				 copyLabelText.append(execContext.getCurrentDestinationEntity().getName());
			 } else if(currentFeatureChange() instanceof AttributeCopied){
				 copyLabelText.append("Feature ");
				 copyLabelText.append(execContext.getCurrentDestinationFeature().getName());
			 } else if(currentFeatureChange() instanceof RelationCopied){
				 copyLabelText.append("Feature ");
				 copyLabelText.append(execContext.getCurrentDestinationFeature().getName());
			 }
			 
			 copyLabelText.append(". It has not been changed.");
			 
			 mustCopyLabel.setText(copyLabelText.toString());
			 mustChangeLabel.setText("Change Mapping if you do not want to make a copy.");
			 
			 copyOrChangeComposite.setVisible(true);
			 featureMappingComp.setVisible(false);
		 } else {
			 copyOrChangeComposite.setVisible(false);
			 featureMappingComp.setVisible(true);
		 }
		 
		 /*
		  * If the user has already specified the first featureMapping
		  * for the current destination entity, preselect the previously
		  * selected source entity. This is because of the constraint that
		  * a destination entity can only be associated with one source 
		  * entity.
		  */
		 if(execContext.getNextDestFeatureIndex() > 1){
			 Entity currentSourceEntity = currentEntityChange().getSourceEntity();
			 sourceEntityDropDown.setItems (new String[]{currentSourceEntity.getName()});
			 
			 showPossibleFeatures(currentSourceEntity);
		 }
		 
		 mainComposite.layout(true);
	}
	
	@Override
	public boolean isPageComplete() {
		//TODO: show warnings to user if sourceFeature and sourceExpression not specified
		
		boolean isFeatureChangeSpecified = true;
		
		return isFeatureChangeSpecified;
	}
	
	@Override
	public boolean canFlipToNextPage(){
		
		boolean canFlip = true;
		
		return canFlip;
	}
	
	@Override
	public IWizardPage getNextPage()
	{
		IWizardPage page = null;
		
		/*
		 * Does the user has mapped the last destination entity
		 * and its last feature?
		 */
		if ((execContext.getNextDestEntityIndex() 
			>= 
			execContext.getDestinationEntities().size())
			&&
			execContext.getNextDestFeatureIndex()
			>=
			execContext.getCurrentDestinationEntity().getFeatures().size())
		{
			page = new OverviewPage("");
		} 
		else 
		{
			/*
			 * Does the user want to copy?
			 */
			if(mustCopyButton.isVisible() && mustCopyButton.getSelection()){
				/*
				 * ... copy an entity or a feature?
				 * 
				 * If the user choose to copy an entity,
				 * the currently mapped feature must be
				 * the first and the current change must
				 * be of type EntityCopied.
				 */
				int featureIndex = 
						execContext.getCurrentDestinationEntity().
										getFeatures().indexOf(execContext.
													getCurrentDestinationFeature());
				if(featureIndex == 0
				   &&
				   currentEntityChange() instanceof EntityCopied)
				{
					/*
					 *  Set nextDestFeatureIndex to the number
					 *  of all features of the current destination
					 *  entity such that the new instance of this page
					 *  will set force the execContext to pick the next
					 *  entity.
					 */
					int newFeatureIndex = 
							execContext.getCurrentDestinationEntity().
								getFeatures().size();
					execContext.setNextDestFeatureIndex(newFeatureIndex);
				}
				
				/*
				 * The current change is not of type EntityCopied.
				 * The user just wants to copy the current feature.
				 * We do not need to do anything here because the new
				 * instance of this page will pick the next feature in
				 * its setExecContext() method.
				 */
			}
			
			page = new EntityMappingPage("");
		}
		page.setWizard(getWizard());
		return page;
	}
	
	private boolean isCopyChange(){
		
		EntityChange ec = currentEntityChange();
		
		if(ec == null){
			return false;
		}
		
		if (ec instanceof EntityCopied) {
			return true;
		}
		
		FeatureChange fc = currentFeatureChange();
		
		if (fc instanceof AttributeCopied) {
			return true;
		}
		
		if (fc instanceof RelationCopied) {
			return true;
		}
		
		return false;
	}
	
	private EntityChange currentEntityChange(){
		Entity destEntity = execContext.getCurrentDestinationEntity();
		for(EntityChange ec: execContext.getMigration().getEntityChanges()){
			if(ec.getDestinationEntity() != null
			   &&
			   ec.getDestinationEntity().getName().equals(destEntity.getName()))
			{
				return ec;
			}
		}
		return null;
	}
	
	private FeatureChange currentFeatureChange(){
		EntityChange currentEC = currentEntityChange();
		Feature destFeature    = execContext.getCurrentDestinationFeature();
		
		for(FeatureChange fc: currentEC.getFeatureChanges()){
			if(fc.getDestinationFeature() != null
			   &&
			   fc.getDestinationFeature().getName().equals(destFeature.getName()))
			{
				return fc;
			}
		}
		
		return null;
	}
	
	private void setState(){
		if(getWizard().getContainer().getCurrentPage() == this){
			setExecContext();
		
			List<String> entityNames = Util.namesFromEntities(execContext.getSourceEntities());
	    	String[] items           = entityNames.toArray(new String[entityNames.size()]);
	    	sourceEntityDropDown.setItems (items);
		}
	}
	
	private void setExecContext(){
		/*
		 * instance of this page already shown?
		 */
		 if(slots.get(EXEC_CONTEXT_KEY) == null){
			 
			execContext = ExeccontextFactory.eINSTANCE.createExecContext();
			MigrationResult mr = (MigrationResult) slots.get(InvokeCompareAndTransform.MIGRATION_RESULT_KEY);
			execContext.getSourceEntities().addAll(mr.getSourceEntities());
			execContext.getDestinationEntities().addAll(mr.getDestinationEntities());
			execContext.setMigration(mr.getMigration());
			
			pickNextEntityChange();
			
			slots.put(EXEC_CONTEXT_KEY, execContext);
		 } else {
			 /*
			  * An instance of this page has already been shown.
			  */
			 execContext = (ExecContext) slots.get(EXEC_CONTEXT_KEY);

			 /*
			  * do we have to pick the next entity?
			  * .. do we have handled all features of the current entity?
			  */
			 if(execContext.getNextDestFeatureIndex() == 
					 execContext.getCurrentDestinationEntity().getFeatures().size())
			 {
				 pickNextEntityChange();
			 } else{
				 pickNextFeatureChange();
			 }
		 }
	}
	
	private void pickNextEntityChange(){
		
		if(execContext.getCurrentDestinationEntity() == null){
			execContext.setNextDestEntityIndex(0);
		}
		
		/*
		 * If a new entityChange is picked, always
		 * choose its first featureChange.
		 */
		execContext.setNextDestFeatureIndex(0);
		
		if (execContext.getNextDestEntityIndex() >= 
			execContext.getDestinationEntities().size()) 
		{
			throw new RuntimeException(
					"all entityChanges handled! Cannot continue. You have to tell me, when I am finished!");
		}
		
		int entityIndex  = execContext.getNextDestEntityIndex();
		int featureIndex = execContext.getNextDestFeatureIndex();
		
		execContext.setCurrentDestinationEntity((execContext.getDestinationEntities().get(entityIndex)));
		execContext.setNextDestEntityIndex(++entityIndex);
		
		if(featureIndex < execContext.getCurrentDestinationEntity().getFeatures().size()){
			execContext.setCurrentDestinationFeature(execContext.getCurrentDestinationEntity().getFeatures().get(featureIndex));
			execContext.setNextDestFeatureIndex(++featureIndex);
		} else {
			/*
			 * The current entity may not have any feature.
			 */
			execContext.setCurrentDestinationFeature(null);
		}
	}
	
	private void pickNextFeatureChange(){
		int featureChangeIndex = execContext.getNextDestFeatureIndex();
		
		if(featureChangeIndex >= execContext.getCurrentDestinationEntity().getFeatures().size()){
			throw new RuntimeException("I have already mapped all features of entity: " + 
										execContext.getCurrentDestinationEntity());
		}
		
		Feature currentFeatureChange = 
				execContext.getCurrentDestinationEntity().getFeatures().get(featureChangeIndex);
		
		execContext.setCurrentDestinationFeature(currentFeatureChange);
		execContext.setNextDestFeatureIndex(++featureChangeIndex);
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		onEvent(e);
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		onEvent(e);
	}
	
	private void showPossibleFeatures(Entity entity){
//		List<String> featureNames = Util.namesFromFeatures(entity.getFeatures());
//		String[] items = featureNames.toArray(new String[featureNames.size()]);
		
		Map<String, Feature> featureMap = new HashMap<String, Feature>(); 
		keyPathComputation(entity, new ArrayList<Entity>(10), featureMap, "");
		
		String[] items = featureMap.keySet().toArray(new String[featureMap.keySet().size()]);
		
    	sourceFeatureDropDown.setItems (items);
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
			/*
			 * Only allow the selection of a source entity if
			 * the user specifies the first featureMapping
			 * for the current destination entity.
			 */
			if(execContext.getNextDestFeatureIndex() == 1){
			
				int index = ((Combo)e.getSource()).getSelectionIndex();
				if(index > -1)
				{
					Entity entity   = execContext.getSourceEntities().get(index);
					EntityChange ec = currentEntityChange();
					ec.setSourceEntity(entity);
				
					/*
				 	 * Show user features of currently selected source entity.
				 	 */
					showPossibleFeatures(entity);
				}
			}
		} 
		else if(e.getSource() == sourceFeatureDropDown)
		{
			int featureIndex = ((Combo)e.getSource()).getSelectionIndex();
			if(featureIndex > -1)
			{
				int entityIndex       = sourceEntityDropDown.getSelectionIndex();
				Entity entity         = execContext.getSourceEntities().get(entityIndex);
				Feature sourceFeature = entity.getFeatures().get(featureIndex);
				
				FeatureChange currentFC = currentFeatureChange();
				if(currentFC != null){
					currentFC.setDestinationFeature(sourceFeature);
					//TODO: set keypath expression from selection as sourceExpr.
					currentFC.setSourceExpression(sourceFeature.getName());
				}
			}
		}
		
		getWizard().getContainer().updateButtons();
	}
	
	/**
	 * 
	 * @param e
	 * @param processedEntities
	 * @param featureMap
	 * @param prefix can be null
	 */
	private void keyPathComputation(Entity e, 
									List<Entity> processedEntities, 
									Map<String, Feature> featureMap, 
									String prefix)
	{
		if(processedEntities.contains(e)){
			return;
		}
		
		processedEntities.add(e);
		
		prefix = (prefix == null) ? "" : prefix;
		
		for(Feature f: primitiveFeature(e)){
			featureMap.put(featureNameWithPrefix(f, prefix), f);
		}
		for(Feature f: entityFeature(e)){
			featureMap.put(featureNameWithPrefix(f, prefix), f);
		}
		
		/*
		 * We can also navigate along our relations to other entities 
		 * (a.k.a "entityfeatures"). So fasten your seat belt and get
		 * ready to dive into recursion! 
		 */
		for(Feature f: entityFeature(e)){
			keyPathComputation((Entity)f.getType().getReferenced(), 
					            processedEntities, 
					            featureMap, 
					            featureNameWithPrefix(f, prefix));
		}
	}
	
	private String featureNameWithPrefix(Feature f, String prefix){
		if(prefix == null || prefix.equals("")){
			return f.getName();
		}
		
		return prefix + "." + f.getName();
	}
	
	private List<Feature> primitiveFeature(Entity e){
		List<Feature> result = new ArrayList<Feature>(e.getFeatures().size());
		for(Feature f: e.getFeatures()){
			if (f.getType().getReferenced() instanceof Primitive) {
				result.add(f);
			}
		}
		return result;
	}
	
	private List<Feature> entityFeature(Entity e){
		List<Feature> result = new ArrayList<Feature>(e.getFeatures().size());
		for(Feature f: e.getFeatures()){
			if (f.getType().getReferenced() instanceof Entity) {
				result.add(f);
			}
		}
		return result;
	}
}
