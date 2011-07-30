
package de.dubmas.modulob;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SystemDslStandaloneSetup extends SystemDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SystemDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

