
package de.dubmas.modulob.common;

import org.eclipse.emf.ecore.EPackage;

import de.dubmas.modulob.ModulobPackage;
import de.dubmas.modulob.system.SystemPackage;
import de.dubmas.modulob.types.TypesPackage;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DslStandaloneSetup extends DslStandaloneSetupGenerated{

	public static void doSetup() {
		registerAllRequiredPackages();
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	private static void registerAllRequiredPackages () {
		if (!EPackage.Registry.INSTANCE.containsKey(ModulobPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(ModulobPackage.eNS_URI, 
										   ModulobPackage.eINSTANCE);
		}
		
		if (!EPackage.Registry.INSTANCE.containsKey(SystemPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(SystemPackage.eNS_URI, 
										   SystemPackage.eINSTANCE);
		}
		
		if (!EPackage.Registry.INSTANCE.containsKey(TypesPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, 
										   TypesPackage.eINSTANCE);
		}
	}
}

