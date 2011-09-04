package de.dubmas.modulob.migration.ui.wizard;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import de.dubmas.modulob.psee.ui.wizard.AbstractWizardPage;

public class InvokeCompareAndTransform extends AbstractWizardPage {
	
	public InvokeCompareAndTransform(String pageName) {
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
	}
	
	public boolean isPageComplete() {
		return false;
	}
	
	@Override
	public boolean canFlipToNextPage(){
		return false;
	}
}
