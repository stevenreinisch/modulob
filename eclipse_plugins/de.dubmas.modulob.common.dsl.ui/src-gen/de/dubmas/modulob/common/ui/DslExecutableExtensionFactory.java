/*
 * generated by Xtext
 */
package de.dubmas.modulob.common.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return de.dubmas.modulob.common.ui.internal.DslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return de.dubmas.modulob.common.ui.internal.DslActivator.getInstance().getInjector("de.dubmas.modulob.common.Dsl");
	}
	
}
