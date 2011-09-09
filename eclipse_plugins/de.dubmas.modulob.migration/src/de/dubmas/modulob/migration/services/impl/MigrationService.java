package de.dubmas.modulob.migration.services.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.eclipse.xtend.util.stdlib.CloningExtensions;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Injector;

import de.dubmas.modulob.migration.Migration;
import de.dubmas.modulob.migration.services.IMigrationService;
import de.dubmas.modulob.migration.services.MigrationResult;
import de.dubmas.modulob.system.EntityModel;
import de.dubmas.modulob.system.Module;
import de.dubmas.modulob.ui.internal.DataDslActivator;

public class MigrationService implements IMigrationService {

	private Injector injector;
	private IResourceSetProvider provider;
	
	public MigrationService() {
		injector = DataDslActivator.getInstance().getInjector("de.dubmas.modulob.DataDsl");
		provider = injector.getInstance(IResourceSetProvider.class);
	}
	
	@Override
	public void createNewEntityModelVersionFile(IFile oldVersionFile, String newVersion) {
		try {
			EntityModel oldEM = loadEntityModelFromFile(oldVersionFile);
			
			/*
			 * change file name of old version's file
			 */
			IPath destination = newVersionPath(oldVersionFile, newVersion);
			oldVersionFile.copy(destination, false, null);
				
			/*
			 * copy old entity model into new file 
			 */
			EntityModel newEM = (EntityModel)CloningExtensions.clone(oldEM);
			newEM.setVersion(newVersion);
				
			ResourceSet xrs  = provider.get(oldVersionFile.getProject());	
			XtextResource xr = (XtextResource) xrs.getResource(
										URI.createPlatformResourceURI(destination.toString(), true) , 
														  			  true);
			xr.getContents().set(0, newEM);
				
			Map<Object, Object> options = new HashMap<Object, Object>();
			SaveOptions.defaultOptions().addTo(options);
			xr.save(options);
		} 
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public MigrationResult createMigrationModel(IFile sourceFile, IFile destinationFile) {
		 try {
			 EntityModel source      = loadEntityModelFromFile(sourceFile);
			 EntityModel destination = loadEntityModelFromFile(destinationFile);
			 
			 Map<String, Object> options = new HashMap<String, Object>();
			 options.put(MatchOptions.OPTION_DISTINCT_METAMODELS, false);
			 options.put(MatchOptions.OPTION_IGNORE_XMI_ID, true);
			 
			 MatchModel matchModel   = MatchService.doMatch(destination, source, options);
			 DiffModel diffModel     = DiffService.doDiff(matchModel, false);
			 
			 XtendFacade xf = XtendFacade.create("de::dubmas::modulob::migration::transformation::DiffToMigration");
			 xf.registerMetaModel(new EmfRegistryMetaModel());
			 
			 /*
			  * We have to set Module->EntityModel because this is
			  * not done by Xtext.
			  */
			 Module sourceModule = source.getModule();
			 sourceModule.setEntityModel(source);
			 
			 Module destinationModule = destination.getModule();
			 destinationModule.setEntityModel(destination);
			 
			 /*
			  * Call the transformation
			  */
			 Migration migration = (Migration)xf.call("transform", diffModel, sourceModule);  
			 MigrationResult mr  = new MigrationResult(source, destination, migration);
			 
			 return mr;
			 
		 } catch (Exception e) {
			 throw new RuntimeException(e);
		 }
	}
	
	@Override
	public boolean generateMigration(EntityModel sourceModel, EntityModel destinationModel, Migration migration, IProject project){
		try {
			Generator gen = new Generator();
			gen.addMetaModel(new EmfRegistryMetaModel());
			gen.setExpand("de::dubmas::modulob::migration::generator::Main::main(source, destination) FOR migration");
			
			
			IFolder srcGenFolder = (IFolder)project.findMember("src-gen");
			String path = srcGenFolder.getLocation().toOSString();
			
			Outlet outlet = new Outlet();
			outlet.setFileEncoding("UTF-8");
			outlet.setPath(path);
			gen.addOutlet(outlet);
			
			IWorkflowContext ctx = new WorkflowContextImpl();
			ctx.put("source", sourceModel);
			ctx.put("destination", destinationModel);
			ctx.put("migration", migration);
			gen.invoke(ctx);
			
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	
	private EntityModel loadEntityModelFromFile(IFile file) {
		try {
			
			IFile tmpFile = createDummyCopyIfNeccessary(file);
			
			ResourceSet xrs   = provider.get(tmpFile.getProject());
			URI uri           = URI.createPlatformResourceURI(tmpFile.getFullPath().toString(), true);
			Resource resource = xrs.getResource(uri, true);
			
			EntityModel em = (EntityModel)resource.getContents().get(0); 

			deleteDummyCopyIfNeccessary(file, tmpFile);
			
			return em;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private IFile createDummyCopyIfNeccessary(IFile file) throws Exception{
		
		String fileExtension = Util.getFileExtension(file.getName());
		
		if(!fileExtension.equals("modat")){			
			IPath dummyDestination = new Path(file.getFullPath() + ".modat");
			file.copy(dummyDestination, true, null);
			return (IFile)file.getParent().findMember(file.getName() + ".modat");
		}
		
		return file;
	}
	
	private void deleteDummyCopyIfNeccessary(IFile original, IFile dummy) throws Exception{
		if(!original.equals(dummy)){
			dummy.delete(true, null);
		}
	}
	
	private IPath newVersionPath(IFile oldVersionFile, String newVersion){
		String newFileName = fileNameWithVersion(oldVersionFile, newVersion);
		return oldVersionFile.getParent().getFullPath().append(newFileName + ".modat");
	}
	
	private String fileNameWithVersion(IFile file, String version){
		int index       = file.getName().lastIndexOf("_v");
		String fileName = file.getName().substring(0, index);
		
		return fileName + "_v" + version;
	}
}
