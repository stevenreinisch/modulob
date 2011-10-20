package de.dubmas.modulob.state.diagram.graphiti.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NewStateWizardPage extends WizardPage implements ModifyListener{

	private Composite mainComposite;
	private Text nameField;
	
	protected NewStateWizardPage(String pageName) {
		super(pageName);
		
		this.setTitle("Enter a name for the new state machine");
	}

	@Override
	public void createControl(Composite parent) {
		mainComposite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
	    int ncol = 2;
	    gl.numColumns = ncol;
	    mainComposite.setLayout(gl);
	    setControl(mainComposite);
	    
	    new Label (mainComposite, SWT.NONE).setText("Name:");
	    nameField = new Text(mainComposite, SWT.SINGLE);
	    nameField.addModifyListener(this);
	}	
	
	@Override
	public void modifyText(ModifyEvent e) {
		if(e.getSource() == nameField) {
			((NewStateWizard)getWizard()).stateName = nameField.getText();
			getWizard().getContainer().updateButtons();
		}
	}
}
