package de.dubmas.modulob.migration.ui.mapping;

import java.util.HashMap;
import java.util.Map;

import de.dubmas.modulob.psee.ui.wizard.AbstractInteractiveActivityWizard;

public class EntityMappingWizard extends AbstractInteractiveActivityWizard{
	
	public EntityMappingWizard() {
		Map<String, String> pageMap = new HashMap<String, String>();
		
//		pageMap.put("1. Select source and destination", "de.dubmas.modulob.migration.ui.mapping.EntityModelsSelectionPage");
//		pageMap.put("2. Create migration model", "de.dubmas.modulob.migration.ui.mapping.InvokeCompareAndTransform");
		pageMap.put("3. Map entity: ", "de.dubmas.modulob.migration.ui.mapping.EntityMappingPage");
		
		super.setPageMap(pageMap);
		super.setSlots(new HashMap<String, Object>());
	}
	
	@Override
	public boolean canFinish() {
		return true;
	}
}
