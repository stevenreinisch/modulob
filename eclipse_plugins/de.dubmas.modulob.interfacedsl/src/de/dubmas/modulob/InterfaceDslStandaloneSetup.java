
package de.dubmas.modulob;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class InterfaceDslStandaloneSetup extends InterfaceDslStandaloneSetupGenerated{

	public static void doSetup() {
		new InterfaceDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

