package de.dubmas.modulob.psee.ui.wizard;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class InvokeOperationXYPage extends AbstractToolInvocationPage {

	public InvokeOperationXYPage(String pageName) {
		super(pageName);
	}
	
	@Override
	public void createControl(Composite parent) {
		
		super.createControl(parent);
	    
	    /*
	     * param2
	     */
	    new Label (mainComposite, SWT.NONE).setText("String name:");
	    
	    Combo param1DropDown = new Combo(mainComposite, SWT.DROP_DOWN);
	    String[] param1Items = new ArrayList<String>(slots.keySet()).toArray(new String[slots.keySet().size()]);
	    param1DropDown.setItems (param1Items);
	    
	    /*
	     * param2
	     */
	    new Label (mainComposite, SWT.NONE).setText("EntityModel em:");
	    
	    Combo param2DropDown = new Combo(mainComposite, SWT.DROP_DOWN);
	    String[] param2Items = new ArrayList<String>(slots.keySet()).toArray(new String[slots.keySet().size()]);
	    param2DropDown.setItems (param2Items);
	}
}
