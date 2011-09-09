package de.dubmas.modulob.migration.ui.mapping;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.dubmas.modulob.psee.ui.wizard.AbstractWizardPage;

public class OverviewPage extends AbstractWizardPage {

	protected OverviewPage(String pageName) {
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
	    
	    new Label(mainComposite, SWT.NONE).setText("Overview");
	}
	
	@Override
	public boolean isPageComplete() {
		return true;
	}
	
	@Override
	public boolean canFlipToNextPage(){
		return true;
	}
	
	@Override
	public IWizardPage getNextPage(){
		IWizardPage page = new InvokeMigrationGenerator("");
		page.setWizard(getWizard());
		return page;
	}
}
