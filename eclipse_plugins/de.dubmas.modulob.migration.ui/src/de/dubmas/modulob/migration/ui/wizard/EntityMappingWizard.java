package de.dubmas.modulob.migration.ui.wizard;

import java.util.HashMap;
import java.util.Map;

import de.dubmas.modulob.psee.ui.wizard.AbstractInteractiveActivityWizard;

public class EntityMappingWizard extends AbstractInteractiveActivityWizard{
	
	public EntityMappingWizard() {
		Map<String, String> pageMap = new HashMap<String, String>();
		
		pageMap.put("1. Select source and destination", "de.dubmas.modulob.migration.ui.wizard.EntityModelsSelectionPage");
		pageMap.put("2. Compare source and destination, \n and transform diff model into migration model", "de.dubmas.modulob.migration.ui.wizard.InvokeCompareAndTransform");
//		pageMap.put("3. Invoke ...", "de.dubmas.modulob.migration.ui.newversion.InvokeNewFileCreation");
		
		super.setPageMap(pageMap);
		super.setSlots(new HashMap<String, Object>());
	}
	
	@Override
	public boolean canFinish() {
		return true;
	}
}
