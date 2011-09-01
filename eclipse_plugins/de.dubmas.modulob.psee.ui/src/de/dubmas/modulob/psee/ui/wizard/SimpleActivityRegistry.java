package de.dubmas.modulob.psee.ui.wizard;

import java.util.HashMap;
import java.util.Map;

public class SimpleActivityRegistry implements IActivityRegistry {

	private Map<String, String> map;
	
	public SimpleActivityRegistry() {
		map = new HashMap<String, String>();
		
		map.put("newEntityModelVersion", "de.dubmas.modulob.migration.ui.newversion.NewEntityModelVersionWizard");
	}
	
	@Override
	public String wizardClassNameForActivityName(String activityName) {
		return map.get(activityName);
	}

}
