package de.dubmas.modulob.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class TokenToAttributeIDMapper extends
		DefaultAntlrTokenToAttributeIdMapper 
{
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if("RULE_DOC_COMMENT".equals(tokenName)){
			return HighlightingConfiguration.DOC_COMMENT_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}
}
