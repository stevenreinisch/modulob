package de.dubmas.modulob.common.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.dubmas.modulob.common.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'primitive type'", "'any type'", "'-'", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=4;
    public static final int RULE_DOC_COMMENT=7;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g"; }


     
     	private DslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleTypeLib"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:60:1: entryRuleTypeLib : ruleTypeLib EOF ;
    public final void entryRuleTypeLib() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:61:1: ( ruleTypeLib EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:62:1: ruleTypeLib EOF
            {
             before(grammarAccess.getTypeLibRule()); 
            pushFollow(FOLLOW_ruleTypeLib_in_entryRuleTypeLib61);
            ruleTypeLib();

            state._fsp--;

             after(grammarAccess.getTypeLibRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLib68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeLib"


    // $ANTLR start "ruleTypeLib"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:69:1: ruleTypeLib : ( ( rule__TypeLib__Group__0 ) ) ;
    public final void ruleTypeLib() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:73:2: ( ( ( rule__TypeLib__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__TypeLib__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__TypeLib__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( rule__TypeLib__Group__0 )
            {
             before(grammarAccess.getTypeLibAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:76:1: ( rule__TypeLib__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:76:2: rule__TypeLib__Group__0
            {
            pushFollow(FOLLOW_rule__TypeLib__Group__0_in_ruleTypeLib94);
            rule__TypeLib__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeLibAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeLib"


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:88:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:89:1: ( rulePrimitive EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:90:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive121);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:97:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:101:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__Primitive__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:103:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:104:1: ( rule__Primitive__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:104:2: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0_in_rulePrimitive154);
            rule__Primitive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleAny"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:116:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:117:1: ( ruleAny EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:118:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny181);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:125:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:129:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__Any__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__Any__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:131:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:132:1: ( rule__Any__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:132:2: rule__Any__Group__0
            {
            pushFollow(FOLLOW_rule__Any__Group__0_in_ruleAny214);
            rule__Any__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleStringValue"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:148:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:149:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:150:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue245);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue252); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:157:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:161:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:162:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:162:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:163:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:164:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:164:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue278);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleEStringObject"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:176:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:177:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:178:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject305);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject312); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEStringObject"


    // $ANTLR start "ruleEStringObject"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:185:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:189:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:190:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:190:1: ( RULE_STRING )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:191:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject338); 
             after(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEStringObject"


    // $ANTLR start "entryRuleIntegerValue"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:204:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:205:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:206:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue364);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue371); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:213:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:217:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:218:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:218:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:219:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:220:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:220:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue397);
            rule__IntegerValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleEIntegerObject"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:232:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:233:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:234:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject424);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject431); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:241:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:245:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:246:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:246:1: ( RULE_INT )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:247:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject457); 
             after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:260:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:261:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:262:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue483);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:269:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:273:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:274:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:274:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:275:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:276:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:276:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue516);
            rule__FloatValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFloatValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleEFloatObject"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:288:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:289:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:290:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject543);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloatObject"


    // $ANTLR start "ruleEFloatObject"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:297:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:301:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:302:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:302:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:303:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:304:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:304:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject576);
            rule__EFloatObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloatObject"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:316:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:317:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:318:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName603);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:325:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:329:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:330:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:330:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:331:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:332:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:332:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName636);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__TypeLib__Group__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:347:1: rule__TypeLib__Group__0 : rule__TypeLib__Group__0__Impl rule__TypeLib__Group__1 ;
    public final void rule__TypeLib__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:351:1: ( rule__TypeLib__Group__0__Impl rule__TypeLib__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:352:2: rule__TypeLib__Group__0__Impl rule__TypeLib__Group__1
            {
            pushFollow(FOLLOW_rule__TypeLib__Group__0__Impl_in_rule__TypeLib__Group__0671);
            rule__TypeLib__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeLib__Group__1_in_rule__TypeLib__Group__0674);
            rule__TypeLib__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLib__Group__0"


    // $ANTLR start "rule__TypeLib__Group__0__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:359:1: rule__TypeLib__Group__0__Impl : ( ( ( rule__TypeLib__PrimitiveTypesAssignment_0 ) ) ( ( rule__TypeLib__PrimitiveTypesAssignment_0 )* ) ) ;
    public final void rule__TypeLib__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:363:1: ( ( ( ( rule__TypeLib__PrimitiveTypesAssignment_0 ) ) ( ( rule__TypeLib__PrimitiveTypesAssignment_0 )* ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:364:1: ( ( ( rule__TypeLib__PrimitiveTypesAssignment_0 ) ) ( ( rule__TypeLib__PrimitiveTypesAssignment_0 )* ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:364:1: ( ( ( rule__TypeLib__PrimitiveTypesAssignment_0 ) ) ( ( rule__TypeLib__PrimitiveTypesAssignment_0 )* ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:365:1: ( ( rule__TypeLib__PrimitiveTypesAssignment_0 ) ) ( ( rule__TypeLib__PrimitiveTypesAssignment_0 )* )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:365:1: ( ( rule__TypeLib__PrimitiveTypesAssignment_0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:366:1: ( rule__TypeLib__PrimitiveTypesAssignment_0 )
            {
             before(grammarAccess.getTypeLibAccess().getPrimitiveTypesAssignment_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:367:1: ( rule__TypeLib__PrimitiveTypesAssignment_0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:367:2: rule__TypeLib__PrimitiveTypesAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeLib__PrimitiveTypesAssignment_0_in_rule__TypeLib__Group__0__Impl703);
            rule__TypeLib__PrimitiveTypesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeLibAccess().getPrimitiveTypesAssignment_0()); 

            }

            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:370:1: ( ( rule__TypeLib__PrimitiveTypesAssignment_0 )* )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:371:1: ( rule__TypeLib__PrimitiveTypesAssignment_0 )*
            {
             before(grammarAccess.getTypeLibAccess().getPrimitiveTypesAssignment_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:372:1: ( rule__TypeLib__PrimitiveTypesAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:372:2: rule__TypeLib__PrimitiveTypesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__TypeLib__PrimitiveTypesAssignment_0_in_rule__TypeLib__Group__0__Impl715);
            	    rule__TypeLib__PrimitiveTypesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTypeLibAccess().getPrimitiveTypesAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLib__Group__0__Impl"


    // $ANTLR start "rule__TypeLib__Group__1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:383:1: rule__TypeLib__Group__1 : rule__TypeLib__Group__1__Impl ;
    public final void rule__TypeLib__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:387:1: ( rule__TypeLib__Group__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:388:2: rule__TypeLib__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeLib__Group__1__Impl_in_rule__TypeLib__Group__1748);
            rule__TypeLib__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLib__Group__1"


    // $ANTLR start "rule__TypeLib__Group__1__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:394:1: rule__TypeLib__Group__1__Impl : ( ( rule__TypeLib__AnyTypeAssignment_1 ) ) ;
    public final void rule__TypeLib__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:398:1: ( ( ( rule__TypeLib__AnyTypeAssignment_1 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:399:1: ( ( rule__TypeLib__AnyTypeAssignment_1 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:399:1: ( ( rule__TypeLib__AnyTypeAssignment_1 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:400:1: ( rule__TypeLib__AnyTypeAssignment_1 )
            {
             before(grammarAccess.getTypeLibAccess().getAnyTypeAssignment_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:401:1: ( rule__TypeLib__AnyTypeAssignment_1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:401:2: rule__TypeLib__AnyTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeLib__AnyTypeAssignment_1_in_rule__TypeLib__Group__1__Impl775);
            rule__TypeLib__AnyTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeLibAccess().getAnyTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLib__Group__1__Impl"


    // $ANTLR start "rule__Primitive__Group__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:415:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:419:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:420:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__0809);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__0812);
            rule__Primitive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__0"


    // $ANTLR start "rule__Primitive__Group__0__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:427:1: rule__Primitive__Group__0__Impl : ( 'primitive type' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:431:1: ( ( 'primitive type' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:432:1: ( 'primitive type' )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:432:1: ( 'primitive type' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:433:1: 'primitive type'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Primitive__Group__0__Impl840); 
             after(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__0__Impl"


    // $ANTLR start "rule__Primitive__Group__1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:446:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:450:1: ( rule__Primitive__Group__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:451:2: rule__Primitive__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__1871);
            rule__Primitive__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__1"


    // $ANTLR start "rule__Primitive__Group__1__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:457:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:461:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:462:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:462:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:463:1: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:464:1: ( rule__Primitive__NameAssignment_1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:464:2: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl898);
            rule__Primitive__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group__1__Impl"


    // $ANTLR start "rule__Any__Group__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:478:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:482:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:483:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__0932);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Any__Group__1_in_rule__Any__Group__0935);
            rule__Any__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__0"


    // $ANTLR start "rule__Any__Group__0__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:490:1: rule__Any__Group__0__Impl : ( 'any type' ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:494:1: ( ( 'any type' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:495:1: ( 'any type' )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:495:1: ( 'any type' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:496:1: 'any type'
            {
             before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Any__Group__0__Impl963); 
             after(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__0__Impl"


    // $ANTLR start "rule__Any__Group__1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:509:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:513:1: ( rule__Any__Group__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:514:2: rule__Any__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__1994);
            rule__Any__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__1"


    // $ANTLR start "rule__Any__Group__1__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:520:1: rule__Any__Group__1__Impl : ( ( rule__Any__NameAssignment_1 ) ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:524:1: ( ( ( rule__Any__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:525:1: ( ( rule__Any__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:525:1: ( ( rule__Any__NameAssignment_1 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:526:1: ( rule__Any__NameAssignment_1 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:527:1: ( rule__Any__NameAssignment_1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:527:2: rule__Any__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl1021);
            rule__Any__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__1__Impl"


    // $ANTLR start "rule__EFloatObject__Group__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:542:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:546:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:547:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__01056);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__01059);
            rule__EFloatObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__0"


    // $ANTLR start "rule__EFloatObject__Group__0__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:554:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:558:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:559:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:559:1: ( ( '-' )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:560:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:561:1: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:562:2: '-'
                    {
                    match(input,14,FOLLOW_14_in_rule__EFloatObject__Group__0__Impl1088); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__0__Impl"


    // $ANTLR start "rule__EFloatObject__Group__1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:573:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:577:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:578:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__11121);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__11124);
            rule__EFloatObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__1"


    // $ANTLR start "rule__EFloatObject__Group__1__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:585:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:589:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:590:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:590:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:591:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:592:1: ( RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:592:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl1152); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__1__Impl"


    // $ANTLR start "rule__EFloatObject__Group__2"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:602:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:606:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:607:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__21183);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__21186);
            rule__EFloatObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__2"


    // $ANTLR start "rule__EFloatObject__Group__2__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:614:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:618:1: ( ( '.' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:619:1: ( '.' )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:619:1: ( '.' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:620:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__EFloatObject__Group__2__Impl1214); 
             after(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__2__Impl"


    // $ANTLR start "rule__EFloatObject__Group__3"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:633:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:637:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:638:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__31245);
            rule__EFloatObject__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__3"


    // $ANTLR start "rule__EFloatObject__Group__3__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:644:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:648:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:649:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:649:1: ( RULE_INT )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:650:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl1272); 
             after(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:669:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:673:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:674:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01309);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01312);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:681:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:685:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:686:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:686:1: ( RULE_ID )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:687:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1339); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:698:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:702:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:703:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11368);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:709:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:713:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:714:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:714:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:715:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:716:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:716:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1395);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:730:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:734:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:735:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01430);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01433);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:742:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:746:1: ( ( '.' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:747:1: ( '.' )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:747:1: ( '.' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:748:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1461); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:761:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:765:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:766:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11492);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:772:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:776:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:777:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:777:1: ( RULE_ID )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:778:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1519); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__TypeLib__PrimitiveTypesAssignment_0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:794:1: rule__TypeLib__PrimitiveTypesAssignment_0 : ( rulePrimitive ) ;
    public final void rule__TypeLib__PrimitiveTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:798:1: ( ( rulePrimitive ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:799:1: ( rulePrimitive )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:799:1: ( rulePrimitive )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:800:1: rulePrimitive
            {
             before(grammarAccess.getTypeLibAccess().getPrimitiveTypesPrimitiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__TypeLib__PrimitiveTypesAssignment_01557);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getTypeLibAccess().getPrimitiveTypesPrimitiveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLib__PrimitiveTypesAssignment_0"


    // $ANTLR start "rule__TypeLib__AnyTypeAssignment_1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:809:1: rule__TypeLib__AnyTypeAssignment_1 : ( ruleAny ) ;
    public final void rule__TypeLib__AnyTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:813:1: ( ( ruleAny ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:814:1: ( ruleAny )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:814:1: ( ruleAny )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:815:1: ruleAny
            {
             before(grammarAccess.getTypeLibAccess().getAnyTypeAnyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAny_in_rule__TypeLib__AnyTypeAssignment_11588);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getTypeLibAccess().getAnyTypeAnyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLib__AnyTypeAssignment_1"


    // $ANTLR start "rule__Primitive__NameAssignment_1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:824:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:828:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:829:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:829:1: ( RULE_ID )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:830:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_11619); 
             after(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__NameAssignment_1"


    // $ANTLR start "rule__Any__NameAssignment_1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:839:1: rule__Any__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Any__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:843:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:844:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:844:1: ( RULE_ID )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:845:1: RULE_ID
            {
             before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Any__NameAssignment_11650); 
             after(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__NameAssignment_1"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:856:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:860:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:861:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:861:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:862:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment1683);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__IntegerValue__ValueAssignment"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:871:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:875:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:876:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:876:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:877:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment1714);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__ValueAssignment"


    // $ANTLR start "rule__FloatValue__ValueAssignment"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:886:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:890:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:891:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:891:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:892:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment1745);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTypeLib_in_entryRuleTypeLib61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLib68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLib__Group__0_in_ruleTypeLib94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLib__Group__0__Impl_in_rule__TypeLib__Group__0671 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__TypeLib__Group__1_in_rule__TypeLib__Group__0674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLib__PrimitiveTypesAssignment_0_in_rule__TypeLib__Group__0__Impl703 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__TypeLib__PrimitiveTypesAssignment_0_in_rule__TypeLib__Group__0__Impl715 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__TypeLib__Group__1__Impl_in_rule__TypeLib__Group__1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLib__AnyTypeAssignment_1_in_rule__TypeLib__Group__1__Impl775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__0809 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__0812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Primitive__Group__0__Impl840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__0932 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__0935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Any__Group__0__Impl963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__01056 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__01059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EFloatObject__Group__0__Impl1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__11121 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__11124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__21183 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__21186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EFloatObject__Group__2__Impl1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__31245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01309 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1395 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01430 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__TypeLib__PrimitiveTypesAssignment_01557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_rule__TypeLib__AnyTypeAssignment_11588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Any__NameAssignment_11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment1745 = new BitSet(new long[]{0x0000000000000002L});

}