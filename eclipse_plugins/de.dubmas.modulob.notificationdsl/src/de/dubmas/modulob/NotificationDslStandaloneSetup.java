
package de.dubmas.modulob;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class NotificationDslStandaloneSetup extends NotificationDslStandaloneSetupGenerated{

	public static void doSetup() {
		new NotificationDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

