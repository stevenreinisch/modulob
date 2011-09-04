package de.dubmas.modulob.psee.ui.wizard;

import java.util.Map;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This is the base class for all wizard pages that 
 * are used to collect user input.<br/><br/>
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
 * Sequential pages communicate via {@link AbstractWizardPage#slots}.<br> 
 * Each pages can put objects into {@link AbstractWizardPage#slots} that can be retrieved by its successors.<br>
 * It is common practice to declare the keys by which the objects can be retrieved form {@link AbstractWizardPage#slots}
 * as static public Strings in the page class that puts these objects. For instance:<br><br>
 * 
 * <code>public static final String SELECTED_FILE_KEY = "selectedFile";</code>
 * 
 * @author steffen
 *
 */
abstract public class AbstractWizardPage extends WizardPage {

	protected Map<String, Object> slots;
	
	protected AbstractWizardPage(String pageName) {
		super(pageName);
		this.setTitle(pageName);
	}
	
	public void createControl(Composite parent) {
		this.slots = ((AbstractInteractiveActivityWizard)this.getWizard()).slots;
	}
}
