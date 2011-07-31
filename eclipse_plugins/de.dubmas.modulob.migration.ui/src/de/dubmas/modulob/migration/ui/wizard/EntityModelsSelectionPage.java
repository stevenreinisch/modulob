package de.dubmas.modulob.migration.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class EntityModelsSelectionPage extends WizardPage{

	protected EntityModelsSelectionPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
	    int ncol = 1;
	    gl.numColumns = ncol;
	    composite.setLayout(gl);
	   
	    /*
	     * 1. model
	     */
	    
	    Composite model1Composite = new Composite(composite, SWT.NONE);
	    model1Composite.setLayout(new RowLayout());
	    
	    new Label (model1Composite, SWT.NONE).setText("Model1");
	    
	    Button srcButton1 = new Button(model1Composite, SWT.RADIO);
	    srcButton1.setText("Source Model");
	    
	    Button destButton1 = new Button(model1Composite, SWT.RADIO);
	    destButton1.setText("Destination Model");
	    
	    /*
	     * 2. model
	     */
	    
	    Composite model2Composite = new Composite(composite, SWT.NONE);
	    model2Composite.setLayout(new RowLayout());
	    
	    new Label (model2Composite, SWT.NONE).setText("Model2");
	    
	    Button srcButton2 = new Button(model2Composite, SWT.RADIO);
	    srcButton2.setText("Source Model");
	    
	    Button destButton2 = new Button(model2Composite, SWT.RADIO);
	    destButton2.setText("Destination Model");
	    
	
	    
	    setControl(composite);
	}
}
