
package de.dubmas.modulob;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BehaviourDslStandaloneSetup extends BehaviourDslStandaloneSetupGenerated{

	public static void doSetup() {
		new BehaviourDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

