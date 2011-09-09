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

import de.dubmas.modulob.migration.services.IMigrationService;
import de.dubmas.modulob.migration.services.MigrationResult;
import de.dubmas.modulob.migration.services.impl.MigrationService;
import de.dubmas.modulob.psee.ui.wizard.AbstractWizardPage;
import de.dubmas.modulob.system.EntityModel;

public class InvokeMigrationGenerator extends AbstractWizardPage implements SelectionListener{
	
	private Button invokeButton;
	private boolean invokeSuccessfull = false;
	private IMigrationService migrationService;
	
	public InvokeMigrationGenerator(String pageName) {
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
	    
	    new Label (mainComposite, SWT.NONE).setText("IMigrationService.generateMigration");
	    
	    invokeButton = new Button(mainComposite, SWT.PUSH);
	    invokeButton.setText("Invoke");
	    invokeButton.addSelectionListener(this);
	}
	
	public boolean isPageComplete() {
		return invokeSuccessfull;
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
				MigrationResult mr = (MigrationResult)slots.get(InvokeCompareAndTransform.MIGRATION_RESULT_KEY);
				
				EntityModel source      = mr.getSource();
				EntityModel destination = mr.getDestination();
				
				IFile sourceFile = (IFile)slots.get(EntityModelsSelectionPage.SOURCE_FILE_KEY);
				
				invokeSuccessfull = migrationService.generateMigration(source, 
																	   destination, 
																	   mr.getMigration(), 
																	   sourceFile.getProject());
			} catch (Exception e2) {
				throw new RuntimeException(e2);
			}
			
			getWizard().getContainer().updateButtons();
		}
	}
}
