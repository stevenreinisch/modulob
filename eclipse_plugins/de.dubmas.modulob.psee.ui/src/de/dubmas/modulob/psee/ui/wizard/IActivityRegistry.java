package de.dubmas.modulob.psee.ui.wizard;

/**
 * An activity registry holds mappings from activity names to wizard class names.
 */
public interface IActivityRegistry {
	
	/**
	 * 
	 * @param activityName
	 * @return the class name of the wizard that must be shown to the
	 * user in order to execute the activity denoted by <code>activityName</code>
	 */
	public String wizardClassNameForActivityName(String activityName);
}
