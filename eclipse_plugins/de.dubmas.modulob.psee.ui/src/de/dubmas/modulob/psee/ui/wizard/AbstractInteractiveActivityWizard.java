package de.dubmas.modulob.psee.ui.wizard;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

public class AbstractInteractiveActivityWizard extends Wizard {

	/**
	 * key: page title
	 * value: page class name
	 */
	private Map<String, String> pageMap;
	
	/**
	 * This map is used to hand over objects among pages. Get the slots from a page like this:<br/>
	 * <code>Map<String, Object> slots = ((AbstractInteractiveActivityWizard)this.getWizard()).slots;</code>
	 * 
	 */
	Map<String, Object> slots;
	
	public AbstractInteractiveActivityWizard(Map<String, String> pageMap,
											 Map<String, Object> slots) 
	{
		super();
		this.pageMap = pageMap;
		this.slots   = slots;
	}
	
	public AbstractInteractiveActivityWizard() {
		super();
	}
	
	public void setPageMap(Map<String, String> map){
		this.pageMap = map;
	}
	
	public void setSlots(Map<String, Object> slots){
		this.slots = slots;
	}
	
	public Map<String, Object> getSlots() {
		return slots;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void addPages() {
		SortedSet<String> sortedKeys = new TreeSet<String>(pageMap.keySet());
		for(String pageTitle: sortedKeys) {
			try {
				Class pageClass          = Class.forName(pageMap.get(pageTitle));
				Constructor ctor         = pageClass.getConstructor(new Class[]{String.class});
				
				IWizardPage pageInstance = (IWizardPage)ctor.newInstance(new Object[]{ pageTitle });
				
				this.addPage(pageInstance);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

}
