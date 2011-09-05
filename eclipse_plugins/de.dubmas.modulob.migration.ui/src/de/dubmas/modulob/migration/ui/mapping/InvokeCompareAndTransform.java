package de.dubmas.modulob.migration.ui.mapping;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.dubmas.modulob.migration.Migration;
import de.dubmas.modulob.migration.services.IMigrationService;
import de.dubmas.modulob.migration.services.impl.MigrationService;
import de.dubmas.modulob.psee.ui.wizard.AbstractWizardPage;

public class InvokeCompareAndTransform extends AbstractWizardPage implements SelectionListener{
	
	public static final String MIGRATION_MODEL_KEY = "migrationModel";
	
	private Button invokeButton;
	
	private IMigrationService migrationService;
	
	public InvokeCompareAndTransform(String pageName) {
		super(pageName);
	}
	
	@Override
	public void createControl(Composite parent) {
		
		migrationService = new MigrationService();
		
		super.createControl(parent);
		
		Composite mainComposite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
	    int ncol = 2;
	    gl.numColumns = ncol;
	    mainComposite.setLayout(gl);
	   
	    setControl(mainComposite);
	    
	    new Label (mainComposite, SWT.NONE).
    	setText("IMigrationService.createMigrationModel");
	    
	    invokeButton = new Button(mainComposite, SWT.PUSH);
	    invokeButton.setText("Invoke");
	    invokeButton.addSelectionListener(this);
	}
	
	public boolean isPageComplete() {
		return slots.containsKey(MIGRATION_MODEL_KEY);
	}
	
	@Override
	public boolean canFlipToNextPage(){
		return slots.containsKey(MIGRATION_MODEL_KEY);
	}
	
	@Override
	public void widgetSelected(SelectionEvent e) {
		onEvent(e);
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		onEvent(e);
	}
	
	private void onEvent(TypedEvent e){
		if(e.getSource() == invokeButton) {
			try {
				IFile sourceFile      = (IFile)slots.get(EntityModelsSelectionPage.SOURCE_FILE_KEY);
				IFile destinationFile = (IFile)slots.get(EntityModelsSelectionPage.DESTINATION_FILE_KEY);
				
				Migration migrationModel = migrationService.createMigrationModel(sourceFile, destinationFile);
				slots.put(MIGRATION_MODEL_KEY, migrationModel);
				
			} catch (Exception e2) {
				throw new RuntimeException(e2);
			}
			
			this.getWizard().performFinish();
		}
	}
}
