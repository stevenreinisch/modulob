
package de.dubmas.modulob;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DataDslStandaloneSetup extends DataDslStandaloneSetupGenerated{

	public static void doSetup() {
		new DataDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

