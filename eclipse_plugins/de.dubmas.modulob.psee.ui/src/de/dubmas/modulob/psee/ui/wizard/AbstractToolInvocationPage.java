package de.dubmas.modulob.psee.ui.wizard;

import java.util.Map;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This is the base class for all wizard pages that 
 * are used to invoke a tool resp. an operation provided
 * by a tool. <br/><br/>
 * A subclass has to provide the widgets that are required
 * to collect the necessary input from a user.<br/><br/> 
 * Example:<br/>
 * <code>
	public void createControl(Composite parent) {<br/><br/>
		
		super.createControl(parent);<br/><br/>
	    
	    //widget for param1 <br/>
	    new Label (mainComposite, SWT.NONE).setText("String name:");<br/><br/>
	    
	    Combo param1DropDown = new Combo(mainComposite, SWT.DROP_DOWN);<br/>
	    String[] param1Items = new ArrayList<String>(slots.keySet()).toArray(new String[slots.keySet().size()]);<br/>
	    param1DropDown.setItems (param1Items);<br/>
	}<br/>
 * </code>
 * 
 * @author steffen
 *
 */
public class AbstractToolInvocationPage extends WizardPage {

	protected Map<String, Object> slots;
	protected Composite mainComposite;
	
	protected AbstractToolInvocationPage(String pageName) {
		super(pageName);
		
		this.setTitle(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		
		this.slots = ((AbstractInteractiveActivityWizard)this.getWizard()).slots;
		
		mainComposite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
	    int ncol = 2;
	    gl.numColumns = ncol;
	    mainComposite.setLayout(gl);
	    setControl(mainComposite);
	    
	    new Label (mainComposite, SWT.NONE).setText("Parameters:");
	    new Label (mainComposite, SWT.NONE).setText("Parameters slot:");
	    
	}

}
