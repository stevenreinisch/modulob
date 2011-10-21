package de.dubmas.modulob.stategenerator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Binder;

public class StateGeneratorModule extends AbstractGenericModule{
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
	}
	
	public Class<? extends JavaIoFileSystemAccess> bindJavaIoFileSystemAccess() {
		return JavaIoFileSystemAccess.class;
	}
	
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return Compiler.class;
	}
	
	public java.lang.ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}
	
	public EPackage.Registry bindEPackageRegistry() {
		return EPackage.Registry.INSTANCE;
	}
	
	public IResourceServiceProvider.Registry bindIResourceServiceProvider$Registry() {
		return IResourceServiceProvider.Registry.INSTANCE;
	}

}
