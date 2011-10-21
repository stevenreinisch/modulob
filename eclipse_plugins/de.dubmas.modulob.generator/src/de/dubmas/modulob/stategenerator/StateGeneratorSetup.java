package de.dubmas.modulob.stategenerator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.dubmas.modulob.state.StatePackage;

public class StateGeneratorSetup implements ISetup{

	public Injector createInjectorAndDoEMFRegistration() {
		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new StateGeneratorModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey(StatePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(StatePackage.eNS_URI, 
										   StatePackage.eINSTANCE);
		}
	}

}
