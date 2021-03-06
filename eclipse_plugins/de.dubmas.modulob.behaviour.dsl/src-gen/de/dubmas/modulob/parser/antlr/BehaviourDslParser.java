/*
* generated by Xtext
*/
package de.dubmas.modulob.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import de.dubmas.modulob.services.BehaviourDslGrammarAccess;

public class BehaviourDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private BehaviourDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected de.dubmas.modulob.parser.antlr.internal.InternalBehaviourDslParser createParser(XtextTokenStream stream) {
		return new de.dubmas.modulob.parser.antlr.internal.InternalBehaviourDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "BehaviouralModel";
	}
	
	public BehaviourDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BehaviourDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
