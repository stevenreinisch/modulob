package de.dubmas.modulob.migration.ui.newversion;

import java.util.Map;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.dubmas.modulob.psee.ui.wizard.AbstractInteractiveActivityWizard;

public class SpecifyVersionPage extends WizardPage implements ModifyListener{

	public static final String VERSION_KEY = "version";
	
	private Composite mainComposite;
	private Text versionField;
	
	private Map<String, Object> slots;
	
	public SpecifyVersionPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		
		slots = ((AbstractInteractiveActivityWizard)this.getWizard()).getSlots();
		
		mainComposite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
	    int ncol = 2;
	    gl.numColumns = ncol;
	    mainComposite.setLayout(gl);
	    setControl(mainComposite);
	    
	    new Label (mainComposite, SWT.NONE).setText("New Version:");
	    versionField = new Text(mainComposite, SWT.SINGLE);
	    versionField.addModifyListener(this);
	}
	
	@Override
	public boolean canFlipToNextPage(){
		String version = (String)slots.get(VERSION_KEY);
		return version != null && !version.equals("");
	}
	
	private void onEvent(TypedEvent e){
		if(e.getSource() == versionField) {
			slots.put(VERSION_KEY, ((Text)e.getSource()).getText());
			getWizard().getContainer().updateButtons();
		}
	}

	@Override
	public void modifyText(ModifyEvent e) {
		onEvent(e);
	}
}
