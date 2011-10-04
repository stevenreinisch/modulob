/*
 * generated by Xtext
 */
package de.dubmas.modulob.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

import de.dubmas.modulob.util.HighlightingConfiguration;
import de.dubmas.modulob.util.TokenToAttributeIDMapper;

/**
 * Use this class to register components to be used within the IDE.
 */
public class DataDslUiModule extends de.dubmas.modulob.ui.AbstractDataDslUiModule {
	public DataDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return HighlightingConfiguration.class;
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return TokenToAttributeIDMapper.class;
	}
}
