package de.dubmas.modulob.migration.ui.newversion;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.dubmas.modulob.migration.services.IMigrationService;
import de.dubmas.modulob.migration.services.impl.MigrationService;
import de.dubmas.modulob.psee.ui.wizard.AbstractInteractiveActivityWizard;

public class InvokeNewFileCreation extends WizardPage implements SelectionListener{

	private Composite mainComposite;
	private Button invokeButton;
	
	private IMigrationService migrationService;
	private Map<String, Object> slots;
	
	public InvokeNewFileCreation(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		
		migrationService = new MigrationService();
		slots = ((AbstractInteractiveActivityWizard)this.getWizard()).getSlots();
		
		mainComposite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
	    int ncol = 2;
	    gl.numColumns = ncol;
	    mainComposite.setLayout(gl);
	    setControl(mainComposite);
	    
	    new Label (mainComposite, SWT.NONE).
	    	setText("IMigrationService.createNewEntityModelVersionFile");
//	    			+
//	    			((IFile)slots.get(SelectFilePage.SELECTED_FILE_KEY)).getName()
//	    			+
//	    			", "
//	    			+
//	    			(String)slots.get(SpecifyVersionPage.VERSION_KEY)
//	    			+ 
//	    			")");
	    
	    invokeButton = new Button(mainComposite, SWT.PUSH);
	    invokeButton.setText("Invoke");
	    invokeButton.addSelectionListener(this);
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
			migrationService.
				createNewEntityModelVersionFile(((IFile)slots.get(SelectFilePage.SELECTED_FILE_KEY)), 
												(String)slots.get(SpecifyVersionPage.VERSION_KEY));
			
			this.getWizard().performFinish();
		}
	}
}
