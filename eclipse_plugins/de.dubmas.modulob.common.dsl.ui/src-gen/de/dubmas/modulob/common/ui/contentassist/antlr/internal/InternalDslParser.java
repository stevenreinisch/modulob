package de.dubmas.modulob.common.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'<->'", "'-'", "'.'", "'indexed'", "'-['", "'[]'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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




    // $ANTLR start "entryRuleFeature"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:61:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:62:1: ( ruleFeature EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:63:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature61);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature68); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:70:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:74:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( ( rule__Feature__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:76:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:77:1: ( rule__Feature__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:77:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature94);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleTypeRef"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:89:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:90:1: ( ruleTypeRef EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:91:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef121);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef128); 

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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:98:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:102:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:103:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:103:1: ( ( rule__TypeRef__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:104:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:105:1: ( rule__TypeRef__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:105:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef154);
            rule__TypeRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleValueObject"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:117:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:118:1: ( ruleValueObject EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:119:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject181);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject188); 

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
    // $ANTLR end "entryRuleValueObject"


    // $ANTLR start "ruleValueObject"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:126:1: ruleValueObject : ( ( rule__ValueObject__Alternatives ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:130:2: ( ( ( rule__ValueObject__Alternatives ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:131:1: ( ( rule__ValueObject__Alternatives ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:131:1: ( ( rule__ValueObject__Alternatives ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:132:1: ( rule__ValueObject__Alternatives )
            {
             before(grammarAccess.getValueObjectAccess().getAlternatives()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:133:1: ( rule__ValueObject__Alternatives )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:133:2: rule__ValueObject__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject214);
            rule__ValueObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueObjectAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValueObject"


    // $ANTLR start "entryRuleStringValue"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:145:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:146:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:147:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue241);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue248); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:154:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:158:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:159:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:159:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:161:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:161:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue274);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:173:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:174:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:175:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject301);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject308); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:182:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:186:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:187:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:187:1: ( RULE_STRING )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:188:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject334); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:201:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:202:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:203:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue360);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue367); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:210:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:214:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:215:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:215:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:216:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:217:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:217:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue393);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:229:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:230:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:231:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject420);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject427); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:238:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:242:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:243:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:243:1: ( RULE_INT )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:244:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject453); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:257:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:258:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:259:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue479);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue486); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:266:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:270:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:271:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:271:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:272:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:273:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:273:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue512);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:285:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:286:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:287:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject539);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject546); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:294:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:298:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:299:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:299:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:300:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:301:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:301:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject572);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:313:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:314:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:315:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName599);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName606); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:322:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:326:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:327:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:327:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:328:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:329:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:329:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName632);
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


    // $ANTLR start "rule__ValueObject__Alternatives"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:341:1: rule__ValueObject__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) );
    public final void rule__ValueObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:345:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF||LA1_2==11||LA1_2==13) ) {
                    alt1=2;
                }
                else if ( (LA1_2==15) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
            case 15:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:346:1: ( ruleStringValue )
                    {
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:346:1: ( ruleStringValue )
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:347:1: ruleStringValue
                    {
                     before(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives668);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:352:6: ( ruleIntegerValue )
                    {
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:352:6: ( ruleIntegerValue )
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:353:1: ruleIntegerValue
                    {
                     before(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives685);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:358:6: ( ruleFloatValue )
                    {
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:358:6: ( ruleFloatValue )
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:359:1: ruleFloatValue
                    {
                     before(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives702);
                    ruleFloatValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ValueObject__Alternatives"


    // $ANTLR start "rule__Feature__Group__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:371:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:375:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:376:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__0732);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__0735);
            rule__Feature__Group__1();

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
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:383:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__IsIndexedAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:387:1: ( ( ( rule__Feature__IsIndexedAssignment_0 )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:388:1: ( ( rule__Feature__IsIndexedAssignment_0 )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:388:1: ( ( rule__Feature__IsIndexedAssignment_0 )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:389:1: ( rule__Feature__IsIndexedAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedAssignment_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:390:1: ( rule__Feature__IsIndexedAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:390:2: rule__Feature__IsIndexedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Feature__IsIndexedAssignment_0_in_rule__Feature__Group__0__Impl762);
                    rule__Feature__IsIndexedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getIsIndexedAssignment_0()); 

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
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:400:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:404:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:405:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__1793);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__1796);
            rule__Feature__Group__2();

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
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:412:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__IsContainmentAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:416:1: ( ( ( rule__Feature__IsContainmentAssignment_1 )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:417:1: ( ( rule__Feature__IsContainmentAssignment_1 )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:417:1: ( ( rule__Feature__IsContainmentAssignment_1 )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:418:1: ( rule__Feature__IsContainmentAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentAssignment_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:419:1: ( rule__Feature__IsContainmentAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:419:2: rule__Feature__IsContainmentAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__IsContainmentAssignment_1_in_rule__Feature__Group__1__Impl823);
                    rule__Feature__IsContainmentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getIsContainmentAssignment_1()); 

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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:429:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:433:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:434:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__2854);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__2857);
            rule__Feature__Group__3();

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
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:441:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__TypeAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:445:1: ( ( ( rule__Feature__TypeAssignment_2 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:446:1: ( ( rule__Feature__TypeAssignment_2 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:446:1: ( ( rule__Feature__TypeAssignment_2 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:447:1: ( rule__Feature__TypeAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_2()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:448:1: ( rule__Feature__TypeAssignment_2 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:448:2: rule__Feature__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_2_in_rule__Feature__Group__2__Impl884);
            rule__Feature__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:458:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:462:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:463:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__3914);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__3917);
            rule__Feature__Group__4();

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
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:470:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__NameAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:474:1: ( ( ( rule__Feature__NameAssignment_3 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:475:1: ( ( rule__Feature__NameAssignment_3 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:475:1: ( ( rule__Feature__NameAssignment_3 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:476:1: ( rule__Feature__NameAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_3()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:477:1: ( rule__Feature__NameAssignment_3 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:477:2: rule__Feature__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_3_in_rule__Feature__Group__3__Impl944);
            rule__Feature__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:487:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:491:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:492:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__4974);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__4977);
            rule__Feature__Group__5();

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
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:499:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__Group_4__0 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:503:1: ( ( ( rule__Feature__Group_4__0 )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:504:1: ( ( rule__Feature__Group_4__0 )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:504:1: ( ( rule__Feature__Group_4__0 )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:505:1: ( rule__Feature__Group_4__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_4()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:506:1: ( rule__Feature__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:506:2: rule__Feature__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_4__0_in_rule__Feature__Group__4__Impl1004);
                    rule__Feature__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__5"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:516:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:520:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:521:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__51035);
            rule__Feature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__51038);
            rule__Feature__Group__6();

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
    // $ANTLR end "rule__Feature__Group__5"


    // $ANTLR start "rule__Feature__Group__5__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:528:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__Group_5__0 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:532:1: ( ( ( rule__Feature__Group_5__0 )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:533:1: ( ( rule__Feature__Group_5__0 )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:533:1: ( ( rule__Feature__Group_5__0 )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:534:1: ( rule__Feature__Group_5__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_5()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:535:1: ( rule__Feature__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:535:2: rule__Feature__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl1065);
                    rule__Feature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Feature__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group__6"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:545:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:549:1: ( rule__Feature__Group__6__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:550:2: rule__Feature__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__61096);
            rule__Feature__Group__6__Impl();

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
    // $ANTLR end "rule__Feature__Group__6"


    // $ANTLR start "rule__Feature__Group__6__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:556:1: rule__Feature__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:560:1: ( ( ( ';' )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:561:1: ( ( ';' )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:561:1: ( ( ';' )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:562:1: ( ';' )?
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_6()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:563:1: ( ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:564:2: ';'
                    {
                    match(input,11,FOLLOW_11_in_rule__Feature__Group__6__Impl1125); 

                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Feature__Group__6__Impl"


    // $ANTLR start "rule__Feature__Group_4__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:589:1: rule__Feature__Group_4__0 : rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 ;
    public final void rule__Feature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:593:1: ( rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:594:2: rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_4__0__Impl_in_rule__Feature__Group_4__01172);
            rule__Feature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_4__1_in_rule__Feature__Group_4__01175);
            rule__Feature__Group_4__1();

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
    // $ANTLR end "rule__Feature__Group_4__0"


    // $ANTLR start "rule__Feature__Group_4__0__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:601:1: rule__Feature__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Feature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:605:1: ( ( '=' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:606:1: ( '=' )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:606:1: ( '=' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:607:1: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0()); 
            match(input,12,FOLLOW_12_in_rule__Feature__Group_4__0__Impl1203); 
             after(grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0()); 

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
    // $ANTLR end "rule__Feature__Group_4__0__Impl"


    // $ANTLR start "rule__Feature__Group_4__1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:620:1: rule__Feature__Group_4__1 : rule__Feature__Group_4__1__Impl ;
    public final void rule__Feature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:624:1: ( rule__Feature__Group_4__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:625:2: rule__Feature__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_4__1__Impl_in_rule__Feature__Group_4__11234);
            rule__Feature__Group_4__1__Impl();

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
    // $ANTLR end "rule__Feature__Group_4__1"


    // $ANTLR start "rule__Feature__Group_4__1__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:631:1: rule__Feature__Group_4__1__Impl : ( ( rule__Feature__DefaultValueAssignment_4_1 ) ) ;
    public final void rule__Feature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:635:1: ( ( ( rule__Feature__DefaultValueAssignment_4_1 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:636:1: ( ( rule__Feature__DefaultValueAssignment_4_1 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:636:1: ( ( rule__Feature__DefaultValueAssignment_4_1 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:637:1: ( rule__Feature__DefaultValueAssignment_4_1 )
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueAssignment_4_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:638:1: ( rule__Feature__DefaultValueAssignment_4_1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:638:2: rule__Feature__DefaultValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Feature__DefaultValueAssignment_4_1_in_rule__Feature__Group_4__1__Impl1261);
            rule__Feature__DefaultValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDefaultValueAssignment_4_1()); 

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
    // $ANTLR end "rule__Feature__Group_4__1__Impl"


    // $ANTLR start "rule__Feature__Group_5__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:652:1: rule__Feature__Group_5__0 : rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 ;
    public final void rule__Feature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:656:1: ( rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:657:2: rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__01295);
            rule__Feature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__01298);
            rule__Feature__Group_5__1();

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
    // $ANTLR end "rule__Feature__Group_5__0"


    // $ANTLR start "rule__Feature__Group_5__0__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:664:1: rule__Feature__Group_5__0__Impl : ( '<->' ) ;
    public final void rule__Feature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:668:1: ( ( '<->' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:669:1: ( '<->' )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:669:1: ( '<->' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:670:1: '<->'
            {
             before(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_0()); 
            match(input,13,FOLLOW_13_in_rule__Feature__Group_5__0__Impl1326); 
             after(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_0()); 

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
    // $ANTLR end "rule__Feature__Group_5__0__Impl"


    // $ANTLR start "rule__Feature__Group_5__1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:683:1: rule__Feature__Group_5__1 : rule__Feature__Group_5__1__Impl ;
    public final void rule__Feature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:687:1: ( rule__Feature__Group_5__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:688:2: rule__Feature__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__11357);
            rule__Feature__Group_5__1__Impl();

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
    // $ANTLR end "rule__Feature__Group_5__1"


    // $ANTLR start "rule__Feature__Group_5__1__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:694:1: rule__Feature__Group_5__1__Impl : ( ( rule__Feature__InverseAssignment_5_1 ) ) ;
    public final void rule__Feature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:698:1: ( ( ( rule__Feature__InverseAssignment_5_1 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:699:1: ( ( rule__Feature__InverseAssignment_5_1 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:699:1: ( ( rule__Feature__InverseAssignment_5_1 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:700:1: ( rule__Feature__InverseAssignment_5_1 )
            {
             before(grammarAccess.getFeatureAccess().getInverseAssignment_5_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:701:1: ( rule__Feature__InverseAssignment_5_1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:701:2: rule__Feature__InverseAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Feature__InverseAssignment_5_1_in_rule__Feature__Group_5__1__Impl1384);
            rule__Feature__InverseAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getInverseAssignment_5_1()); 

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
    // $ANTLR end "rule__Feature__Group_5__1__Impl"


    // $ANTLR start "rule__TypeRef__Group__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:715:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:719:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:720:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__01418);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__01421);
            rule__TypeRef__Group__1();

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
    // $ANTLR end "rule__TypeRef__Group__0"


    // $ANTLR start "rule__TypeRef__Group__0__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:727:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:731:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:732:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:732:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:733:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:734:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:734:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl1448);
            rule__TypeRef__ReferencedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 

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
    // $ANTLR end "rule__TypeRef__Group__0__Impl"


    // $ANTLR start "rule__TypeRef__Group__1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:744:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:748:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:749:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__11478);
            rule__TypeRef__Group__1__Impl();

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
    // $ANTLR end "rule__TypeRef__Group__1"


    // $ANTLR start "rule__TypeRef__Group__1__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:755:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:759:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:760:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:760:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:761:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:762:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:762:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl1505);
                    rule__TypeRef__IsMultiAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 

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
    // $ANTLR end "rule__TypeRef__Group__1__Impl"


    // $ANTLR start "rule__EFloatObject__Group__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:776:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:780:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:781:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__01540);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__01543);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:788:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:792:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:793:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:793:1: ( ( '-' )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:794:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:795:1: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:796:2: '-'
                    {
                    match(input,14,FOLLOW_14_in_rule__EFloatObject__Group__0__Impl1572); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:807:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:811:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:812:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__11605);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__11608);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:819:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:823:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:824:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:824:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:825:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:826:1: ( RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:826:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl1636); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:836:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:840:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:841:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__21667);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__21670);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:848:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:852:1: ( ( '.' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:853:1: ( '.' )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:853:1: ( '.' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:854:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__EFloatObject__Group__2__Impl1698); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:867:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:871:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:872:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__31729);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:878:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:882:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:883:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:883:1: ( RULE_INT )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:884:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl1756); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:903:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:907:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:908:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01793);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01796);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:915:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:919:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:920:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:920:1: ( RULE_ID )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:921:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1823); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:932:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:936:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:937:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11852);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:943:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:947:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:948:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:948:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:949:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:950:1: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:950:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1879);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:964:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:968:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:969:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01914);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01917);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:976:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:980:1: ( ( '.' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:981:1: ( '.' )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:981:1: ( '.' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:982:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1945); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:995:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:999:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1000:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11976);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1006:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1010:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1011:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1011:1: ( RULE_ID )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1012:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2003); 
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


    // $ANTLR start "rule__Feature__IsIndexedAssignment_0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1028:1: rule__Feature__IsIndexedAssignment_0 : ( ( 'indexed' ) ) ;
    public final void rule__Feature__IsIndexedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1032:1: ( ( ( 'indexed' ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1033:1: ( ( 'indexed' ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1033:1: ( ( 'indexed' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1034:1: ( 'indexed' )
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1035:1: ( 'indexed' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1036:1: 'indexed'
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Feature__IsIndexedAssignment_02046); 
             after(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); 

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
    // $ANTLR end "rule__Feature__IsIndexedAssignment_0"


    // $ANTLR start "rule__Feature__IsContainmentAssignment_1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1051:1: rule__Feature__IsContainmentAssignment_1 : ( ( '-[' ) ) ;
    public final void rule__Feature__IsContainmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1055:1: ( ( ( '-[' ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1056:1: ( ( '-[' ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1056:1: ( ( '-[' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1057:1: ( '-[' )
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1058:1: ( '-[' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1059:1: '-['
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__Feature__IsContainmentAssignment_12090); 
             after(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Feature__IsContainmentAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_2"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1074:1: rule__Feature__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Feature__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1078:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1079:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1079:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1080:1: ruleTypeRef
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_22129);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Feature__TypeAssignment_2"


    // $ANTLR start "rule__Feature__NameAssignment_3"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1089:1: rule__Feature__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1093:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1094:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1094:1: ( RULE_ID )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1095:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_32160); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_3"


    // $ANTLR start "rule__Feature__DefaultValueAssignment_4_1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1104:1: rule__Feature__DefaultValueAssignment_4_1 : ( ruleValueObject ) ;
    public final void rule__Feature__DefaultValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1108:1: ( ( ruleValueObject ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1109:1: ( ruleValueObject )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1109:1: ( ruleValueObject )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1110:1: ruleValueObject
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_4_12191);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Feature__DefaultValueAssignment_4_1"


    // $ANTLR start "rule__Feature__InverseAssignment_5_1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1119:1: rule__Feature__InverseAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__InverseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1123:1: ( ( ( RULE_ID ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1124:1: ( ( RULE_ID ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1124:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1125:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_5_1_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1126:1: ( RULE_ID )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1127:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__InverseAssignment_5_12226); 
             after(grammarAccess.getFeatureAccess().getInverseFeatureIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Feature__InverseAssignment_5_1"


    // $ANTLR start "rule__TypeRef__ReferencedAssignment_0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1138:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1142:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1143:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1143:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1144:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1145:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1146:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_02265);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__TypeRef__ReferencedAssignment_0"


    // $ANTLR start "rule__TypeRef__IsMultiAssignment_1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1157:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1161:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1162:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1162:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1163:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1164:1: ( '[]' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1165:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__TypeRef__IsMultiAssignment_12305); 
             after(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__TypeRef__IsMultiAssignment_1"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1180:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1184:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1185:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1185:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1186:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment2344);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1195:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1199:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1200:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1200:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1201:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment2375);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1210:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1214:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1215:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1215:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1216:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment2406);
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


 

    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__0732 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__0735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsIndexedAssignment_0_in_rule__Feature__Group__0__Impl762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__1793 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsContainmentAssignment_1_in_rule__Feature__Group__1__Impl823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__2854 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_2_in_rule__Feature__Group__2__Impl884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__3914 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_3_in_rule__Feature__Group__3__Impl944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__4974 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__0_in_rule__Feature__Group__4__Impl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__51035 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__51038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__61096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Feature__Group__6__Impl1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__0__Impl_in_rule__Feature__Group_4__01172 = new BitSet(new long[]{0x000000000000C030L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__1_in_rule__Feature__Group_4__01175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Feature__Group_4__0__Impl1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__1__Impl_in_rule__Feature__Group_4__11234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__DefaultValueAssignment_4_1_in_rule__Feature__Group_4__1__Impl1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__01295 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__01298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Feature__Group_5__0__Impl1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__11357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__InverseAssignment_5_1_in_rule__Feature__Group_5__1__Impl1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__01418 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__01421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__11478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__01540 = new BitSet(new long[]{0x000000000000C030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__01543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EFloatObject__Group__0__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__11605 = new BitSet(new long[]{0x000000000000C030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__11608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__21667 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__21670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EFloatObject__Group__2__Impl1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__31729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01793 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1879 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01914 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Feature__IsIndexedAssignment_02046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Feature__IsContainmentAssignment_12090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_22129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_32160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_4_12191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__InverseAssignment_5_12226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_02265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TypeRef__IsMultiAssignment_12305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment2406 = new BitSet(new long[]{0x0000000000000002L});

}