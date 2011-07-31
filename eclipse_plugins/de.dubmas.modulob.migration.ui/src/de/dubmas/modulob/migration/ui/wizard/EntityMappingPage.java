package de.dubmas.modulob.migration.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class EntityMappingPage extends WizardPage{

	private Combo sourceEntityDropDown;
	private Combo sourceFeatureDropDown;
	
	protected EntityMappingPage(String pageName) {
		super(pageName);
		this.setTitle("XXXXX");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
	    int ncol = 4;
	    gl.numColumns = ncol;
	    composite.setLayout(gl);
	    
	    new Label (composite, SWT.NONE).setText("Feature \"name\" (1/5):");
	    
	    sourceEntityDropDown = new Combo(composite, SWT.DROP_DOWN);
	    sourceEntityDropDown.setItems (new String [] {"Alpha", "Bravo", "Charlie"});
	    
	    sourceFeatureDropDown = new Combo(composite, SWT.DROP_DOWN);
	    sourceFeatureDropDown.setItems (new String [] {"name", "adress", "size"});
	    
	    GridData gd = new GridData();
	    gd.horizontalAlignment = GridData.BEGINNING;
//	    gd.widthHint = 225;
//	    gd.heightHint = 123;
	    sourceEntityDropDown.setLayoutData(gd);
	    
	    setControl(composite);
	}

}
