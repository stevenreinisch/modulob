package de.dubmas.modulob.migration.services.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.util.stdlib.CloningExtensions;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.xtext.example.mydsl.ui.internal.MyDslActivator;

import com.google.inject.Injector;

import de.dubmas.modulob.migration.services.IMigrationService;
import de.dubmas.modulob.system.EntityModel;

public class MigrationService implements IMigrationService {

	@Override
	public void createNewEntityModelVersionFile(IFile oldVersionFile, String newVersion) {
		try {
			/*
			 * load the old entityModel into memory
			 */
			//ResourceSet rs    = new ResourceSetImpl();
			
			//Injector injector    = DataDslActivator.getInstance().getInjector("de.dubmas.modulob.DataDsl");
			Injector injector    = MyDslActivator.getInstance().getInjector("org.xtext.example.mydsl.MyDsl");
			
			IResourceSetProvider provider = injector.getInstance(IResourceSetProvider.class);
			
			//XtextResourceSet xrs = injector.getInstance(XtextResourceSet.class);
			
			ResourceSet xrs = provider.get(oldVersionFile.getProject());
			
			//xrs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			
			URI uri = URI.createPlatformResourceURI(oldVersionFile.getFullPath().toString(), true);
			
//			xrs.createResource(URI.createPlatformResourceURI(oldVersionFile.getFullPath().toString(), true));
//			xrs.createResource(URI.createPlatformResourceURI("platform:/resource/iPhoneApp/src/iPhoneApp/Reporting/Reporting.moif", true));
//			xrs.createResource(URI.createPlatformResourceURI("platform:/resource/iPhoneApp/src/iPhoneApp/iPhoneApp.mosys", true));
//			xrs.createResource(URI.createPlatformResourceURI("platform:/resource/iPhoneApp/src/iPhoneApp/lib.modulob", true));
			
			Resource resource = xrs.getResource(uri, true);
			resource.load(null);
			EObject eobject   = resource.getContents().get(0);
		
			if (eobject instanceof EntityModel) {
				EntityModel oldEM = (EntityModel) eobject;
				String oldVersion = oldEM.getVersion();
			
			
				/*
				 * change file extension of old version's file
				 */
				IPath destination = ((IPath)oldVersionFile.getFullPath().clone()).append("v" + oldVersion);
				oldVersionFile.move(destination, false, null);
				
				/*
				 * copy old entity model into new file 
				 */
				EntityModel newEM = (EntityModel)CloningExtensions.clone(oldEM);
				newEM.setVersion(newVersion);
				
				
				XtextResource     xr = (XtextResource) xrs.getResource(
											URI.createURI(oldVersionFile.getProjectRelativePath().toString()) , 
															  true);
				xr.getContents().set(0, newEM);
				
				Map<Object, Object> options = new HashMap<Object, Object>();
				SaveOptions.defaultOptions().addTo(options);
				xr.save(options);
				
			
			} else {
				throw new RuntimeException("file does not contain an EntityModel");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
