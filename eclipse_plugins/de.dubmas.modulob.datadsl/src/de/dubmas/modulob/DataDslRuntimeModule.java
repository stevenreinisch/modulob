/*
 * generated by Xtext
 */
package de.dubmas.modulob;

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;

import de.dubmas.modulob.serializer.DataDslTransientValueService;
import de.dubmas.modulob.serializer.SequencerTransientValueService;
import de.dubmas.modulob.util.ModulobResourceDescriptionStrategy;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("restriction")
public class DataDslRuntimeModule extends de.dubmas.modulob.AbstractDataDslRuntimeModule {
	
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return de.dubmas.modulob.DataDslNameProvider.class;
	}
	
	public Class <? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return ModulobResourceDescriptionStrategy.class;
	}
	
	public Class <? extends org.eclipse.xtext.parsetree.reconstr.ITransientValueService> bindITransientValueService() {
		return DataDslTransientValueService.class;
	}
	
	public Class<? extends org.eclipse.xtext.serializer.sequencer.ITransientValueService> bindITransientValueService2() {
		return SequencerTransientValueService.class;
	}

//	public Class<? extends ICrossReferenceSerializer> bindICrossReferenceSerializer(){
//		return DataDslCrossReferenceSerializer.class;
//	}
}
