/*
 * generated by Xtext
 */
package de.dubmas.modulob;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class DataDslRuntimeModule extends de.dubmas.modulob.AbstractDataDslRuntimeModule {
	
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return de.dubmas.modulob.DataDslNameProvider.class;
	}
	
	public Class<? extends de.dubmas.modulob.ICommentExtractor> bindICommentExtractor() {
		return de.dubmas.modulob.CommentExtractor.class;
	}
}
