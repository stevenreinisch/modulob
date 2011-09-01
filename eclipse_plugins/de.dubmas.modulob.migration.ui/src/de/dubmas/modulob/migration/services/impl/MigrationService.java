package de.dubmas.modulob.migration.services.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.util.stdlib.CloningExtensions;
import org.eclipse.xtext.parsetree.reconstr.XtextSerializationException;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.EmfFormatter;

import com.google.inject.Injector;

import de.dubmas.modulob.migration.services.IMigrationService;
import de.dubmas.modulob.system.EntityModel;
import de.dubmas.modulob.ui.internal.DataDslActivator;

public class MigrationService implements IMigrationService {

	@Override
	public void createNewEntityModelVersionFile(IFile oldVersionFile, String newVersion) {
		try {
			/*
			 * load the old entityModel into memory
			 */
			Injector injector             = DataDslActivator.getInstance().getInjector("de.dubmas.modulob.DataDsl");
			IResourceSetProvider provider = injector.getInstance(IResourceSetProvider.class);
			
			ResourceSet xrs = provider.get(oldVersionFile.getProject());
			URI uri         = URI.createPlatformResourceURI(oldVersionFile.getFullPath().toString(), true);
			
			Resource resource = xrs.getResource(uri, true);
			EObject eobject   = resource.getContents().get(0);
		
			if (eobject instanceof EntityModel) {
				EntityModel oldEM = (EntityModel) eobject;
				String oldVersion = oldEM.getVersion();
			
				/*
				 * change file extension of old version's file
				 */
				IPath destination = new Path(oldVersionFile.getFullPath() + "_v" + oldVersion);
				oldVersionFile.move(destination, false, null);
				
				/*
				 * copy old entity model into new file 
				 */
				EntityModel newEM = (EntityModel)CloningExtensions.clone(oldEM);
				newEM.setVersion(newVersion);
				
				
				XtextResource     xr = (XtextResource) xrs.getResource(
											URI.createPlatformResourceURI(oldVersionFile.getFullPath().toString(), true) , 
															  			  true);
				xr.getContents().set(0, newEM);
				
				System.out.println(EmfFormatter.objToStr(newEM));
				
				Map<Object, Object> options = new HashMap<Object, Object>();
				SaveOptions.defaultOptions().addTo(options);
				xr.save(options);
				
			
			} else {
				throw new RuntimeException("file does not contain an EntityModel");
			}
		} 
		catch (XtextSerializationException e) {
			System.out.println("XXXXXXXXXX");
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
