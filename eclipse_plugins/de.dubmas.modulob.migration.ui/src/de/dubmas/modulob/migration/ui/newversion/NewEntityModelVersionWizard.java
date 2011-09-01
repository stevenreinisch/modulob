package de.dubmas.modulob.migration.ui.newversion;

import java.util.HashMap;
import java.util.Map;

import de.dubmas.modulob.psee.ui.wizard.AbstractInteractiveActivityWizard;

public class NewEntityModelVersionWizard extends AbstractInteractiveActivityWizard {
	
	public NewEntityModelVersionWizard() {
		Map<String, String> pageMap = new HashMap<String, String>();
		
		pageMap.put("1. Select a file", "de.dubmas.modulob.migration.ui.newversion.SelectFilePage");
		pageMap.put("2. Specify a new Version", "de.dubmas.modulob.migration.ui.newversion.SpecifyVersionPage");
		pageMap.put("3. Invoke ...", "de.dubmas.modulob.migration.ui.newversion.InvokeNewFileCreation");
		
		super.setPageMap(pageMap);
		super.setSlots(new HashMap<String, Object>());
	}
	
	@Override
	public boolean canFinish() {
		return true;
	}
}
