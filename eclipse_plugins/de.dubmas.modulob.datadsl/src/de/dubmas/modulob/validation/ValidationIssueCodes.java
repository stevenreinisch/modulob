package de.dubmas.modulob.validation;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;

import de.dubmas.modulob.system.EntityModel;
import de.dubmas.modulob.system.SystemPackage;
import de.dubmas.modulob.util.ModulobResourceDescriptionStrategy;

public class ValidationIssueCodes {
	
	public static final String INDEXED_ALLOWED_CODE = "INDEXED_ALLOWED_CODE";
	public static final String PROPER_FEATURE_TYPES_CODE = "PROPER_FEATURE_TYPES_CODE";
	public static final String ENTIYFEATURES_HAVE_SAME_PERSISTENCY_CODE = "ENTIYFEATURES_HAVE_SAME_PERSISTENCY_CODE";
	public static final String ENTIY_REF_MODULE_BOUNDARIES_CODE = "ENTIY_REF_MODULE_BOUNDARIES_CODE";
	public static final String UUID_REQUIRED_CODE = "UUID_REQUIRED_CODE";
	public static final String ENTITY_SUPER_SAME_MODULE_CODE = "ENTITY_SUPER_SAME_MODULE_CODE";
	public static final String FEATURE_NAME_CODE = "FEATURE_NAME_CODE";
	public static final String FEATURE_MULTI_TYPE_CODE = "FEATURE_MULTI_TYPE_CODE";
	public static final String FEATURE_IN_HIERARCHY_CODE = "FEATURE_IN_HIERARCHY_CODE";
	public static final String FEATURE_NOT_ID_CODE = "FEATURE_NOT_ID_CODE";
	public static final String DEFAULT_VALUE_EXISTENCE_CODE = "DEFAULT_VALUE_EXISTENCE_CODE";
	public static final String DEFAULT_VALUE_CORRECTNESS_CODE = "DEFAULT_VALUE_CORRECTNESS_CODE";
	public static final String INVERSE_ALLOWED_CODE = "INVERSE_ALLOWED_CODE";
	public static final String INVERSE_IS_ENTITY_CODE = "INVERSE_IS_ENTITY_CODE";
	public static final String INVERSE_MODULE_BOUNDARIES_CODE = "INVERSE_MODULE_BOUNDARIES_CODE";
	
	public static final String ENTITY_NAME_NOT_UNIQUE_CODE = "ENTITY_NAME_NOT_UNIQUE_CODE";
	public static final String FEATURE_NAME_NOT_UNIQUE_CODE = "FEATURE_NAME_NOT_UNIQUE";
	
	public static final String MODULE_NAME_NOT_UNIQUE_CODE = "MODULE_NAME_NOT_UNIQUE";
	public static final String CURRENT_ENTITY_MODEL_CODE = "CURRENT_ENTITY_MODEL_CODE";
	
	
	public void indexFoo(IResourceDescriptions index){
		
		Iterable<IEObjectDescription> ems = 
				index.getExportedObjectsByType(SystemPackage.eINSTANCE.getEntityModel());
		
		for(IEObjectDescription emDesc: ems){
			EntityModel em = (EntityModel)emDesc.getEObjectOrProxy();
			boolean isCurrent = Boolean.parseBoolean(
									emDesc.getUserData(ModulobResourceDescriptionStrategy.
																	ENTITY_MODEL_CURRENT_KEY));
			
			if(isCurrent){
				System.out.println("Found current em: " + em);
			}
		}
	}
	
	public static void foo(EntityModel em){
		try{
			URI uri = em.eResource().getURI();
			String fileString = URI.decode(uri.path());
			IPath path = new Path(fileString);
			
			IPath rootPath = ResourcesPlugin.getWorkspace().getRoot().getLocation();
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			IProject project = file.getProject();
			IPath projectPath = project.getLocation();
			IPath projectRelativePath = file.getProjectRelativePath();
			path = file.getLocation();
			
			IPath absolutPath = rootPath.append(projectRelativePath);
			file = ResourcesPlugin.getWorkspace().getRoot().getFile(absolutPath);
			
			File file_ = absolutPath.toFile();
			//file_.getParentFile().listFiles(filter)
			IFolder folder = (IFolder) file.getParent();
			for (IResource res : folder.members()) {
				if((res instanceof IFile) && ((IFile)res).getFileExtension().equals("modat")){
					System.out.println("found entity model");
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
