package de.dubmas.modulob.ui.contentassist.antlr.internal; 

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
import de.dubmas.modulob.services.DataDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'persistency'", "'CoreData'", "'entities for module'", "'version'", "'entity'", "'{'", "'}'", "':'", "'@'", "';'", "'='", "'<->'", "'-'", "'.'", "'abstract'", "'indexed'", "'-['", "'[]'"
    };
    public static final int RULE_ID=6;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDataDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g"; }


     
     	private DataDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DataDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleEntityModel"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:61:1: entryRuleEntityModel : ruleEntityModel EOF ;
    public final void entryRuleEntityModel() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:62:1: ( ruleEntityModel EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:63:1: ruleEntityModel EOF
            {
             before(grammarAccess.getEntityModelRule()); 
            pushFollow(FOLLOW_ruleEntityModel_in_entryRuleEntityModel61);
            ruleEntityModel();

            state._fsp--;

             after(grammarAccess.getEntityModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityModel68); 

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
    // $ANTLR end "entryRuleEntityModel"


    // $ANTLR start "ruleEntityModel"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:70:1: ruleEntityModel : ( ( rule__EntityModel__Group__0 ) ) ;
    public final void ruleEntityModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:74:2: ( ( ( rule__EntityModel__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:75:1: ( ( rule__EntityModel__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:75:1: ( ( rule__EntityModel__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:76:1: ( rule__EntityModel__Group__0 )
            {
             before(grammarAccess.getEntityModelAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:77:1: ( rule__EntityModel__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:77:2: rule__EntityModel__Group__0
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__0_in_ruleEntityModel94);
            rule__EntityModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityModelAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityModel"


    // $ANTLR start "entryRuleEntity"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:89:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:90:1: ( ruleEntity EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:91:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity121);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity128); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:98:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:102:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:103:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:103:1: ( ( rule__Entity__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:104:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:105:1: ( rule__Entity__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:105:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity154);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:117:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:118:1: ( ruleAnnotation EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:119:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation181);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation188); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:126:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:130:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:131:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:131:1: ( ( rule__Annotation__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:132:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:133:1: ( rule__Annotation__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:133:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation214);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleFeature"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:145:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:146:1: ( ruleFeature EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:147:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature241);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature248); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:154:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:158:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:159:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:159:1: ( ( rule__Feature__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:160:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:161:1: ( rule__Feature__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:161:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature274);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:173:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:174:1: ( ruleTypeRef EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:175:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef301);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef308); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:182:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:186:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:187:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:187:1: ( ( rule__TypeRef__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:188:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:189:1: ( rule__TypeRef__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:189:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef334);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:201:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:202:1: ( ruleValueObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:203:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject361);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject368); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:210:1: ruleValueObject : ( ( rule__ValueObject__Alternatives ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:214:2: ( ( ( rule__ValueObject__Alternatives ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:215:1: ( ( rule__ValueObject__Alternatives ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:215:1: ( ( rule__ValueObject__Alternatives ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:216:1: ( rule__ValueObject__Alternatives )
            {
             before(grammarAccess.getValueObjectAccess().getAlternatives()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:217:1: ( rule__ValueObject__Alternatives )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:217:2: rule__ValueObject__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject394);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:229:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:230:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:231:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue421);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue428); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:238:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:242:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:243:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:243:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:244:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:245:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:245:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue454);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:257:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:258:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:259:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject481);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject488); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:266:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:270:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:271:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:271:1: ( RULE_STRING )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:272:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject514); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:285:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:286:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:287:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue540);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue547); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:294:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:298:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:299:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:299:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:300:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:301:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:301:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue573);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:313:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:314:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:315:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject600);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject607); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:322:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:326:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:327:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:327:1: ( RULE_INT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:328:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject633); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:341:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:342:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:343:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue659);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue666); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:350:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:354:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:355:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:355:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:356:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:357:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:357:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue692);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:369:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:370:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:371:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject719);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject726); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:378:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:382:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:383:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:383:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:384:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:385:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:385:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject752);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:397:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:398:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:399:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName779);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName786); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:406:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:410:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:411:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:411:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:412:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:413:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:413:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName812);
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


    // $ANTLR start "ruleConfigOption"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:426:1: ruleConfigOption : ( ( 'persistency' ) ) ;
    public final void ruleConfigOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:430:1: ( ( ( 'persistency' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:431:1: ( ( 'persistency' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:431:1: ( ( 'persistency' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:432:1: ( 'persistency' )
            {
             before(grammarAccess.getConfigOptionAccess().getPersistencyEnumLiteralDeclaration()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:433:1: ( 'persistency' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:433:3: 'persistency'
            {
            match(input,11,FOLLOW_11_in_ruleConfigOption850); 

            }

             after(grammarAccess.getConfigOptionAccess().getPersistencyEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleConfigOption"


    // $ANTLR start "ruleConfigValue"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:446:1: ruleConfigValue : ( ( 'CoreData' ) ) ;
    public final void ruleConfigValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:450:1: ( ( ( 'CoreData' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:451:1: ( ( 'CoreData' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:451:1: ( ( 'CoreData' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:452:1: ( 'CoreData' )
            {
             before(grammarAccess.getConfigValueAccess().getCoreDataEnumLiteralDeclaration()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:453:1: ( 'CoreData' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:453:3: 'CoreData'
            {
            match(input,12,FOLLOW_12_in_ruleConfigValue889); 

            }

             after(grammarAccess.getConfigValueAccess().getCoreDataEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleConfigValue"


    // $ANTLR start "rule__ValueObject__Alternatives"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:465:1: rule__ValueObject__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) );
    public final void rule__ValueObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:469:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) )
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

                if ( (LA1_2==EOF||LA1_2==RULE_ID||LA1_2==17||LA1_2==20||LA1_2==22||(LA1_2>=26 && LA1_2<=27)) ) {
                    alt1=2;
                }
                else if ( (LA1_2==24) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
            case 24:
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
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:470:1: ( ruleStringValue )
                    {
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:470:1: ( ruleStringValue )
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:471:1: ruleStringValue
                    {
                     before(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives926);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:476:6: ( ruleIntegerValue )
                    {
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:476:6: ( ruleIntegerValue )
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:477:1: ruleIntegerValue
                    {
                     before(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives943);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:482:6: ( ruleFloatValue )
                    {
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:482:6: ( ruleFloatValue )
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:483:1: ruleFloatValue
                    {
                     before(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives960);
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


    // $ANTLR start "rule__EntityModel__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:495:1: rule__EntityModel__Group__0 : rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 ;
    public final void rule__EntityModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:499:1: ( rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:500:2: rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__0__Impl_in_rule__EntityModel__Group__0990);
            rule__EntityModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__1_in_rule__EntityModel__Group__0993);
            rule__EntityModel__Group__1();

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
    // $ANTLR end "rule__EntityModel__Group__0"


    // $ANTLR start "rule__EntityModel__Group__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:507:1: rule__EntityModel__Group__0__Impl : ( 'entities for module' ) ;
    public final void rule__EntityModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:511:1: ( ( 'entities for module' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:512:1: ( 'entities for module' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:512:1: ( 'entities for module' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:513:1: 'entities for module'
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__EntityModel__Group__0__Impl1021); 
             after(grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_0()); 

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
    // $ANTLR end "rule__EntityModel__Group__0__Impl"


    // $ANTLR start "rule__EntityModel__Group__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:526:1: rule__EntityModel__Group__1 : rule__EntityModel__Group__1__Impl rule__EntityModel__Group__2 ;
    public final void rule__EntityModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:530:1: ( rule__EntityModel__Group__1__Impl rule__EntityModel__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:531:2: rule__EntityModel__Group__1__Impl rule__EntityModel__Group__2
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__1__Impl_in_rule__EntityModel__Group__11052);
            rule__EntityModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__2_in_rule__EntityModel__Group__11055);
            rule__EntityModel__Group__2();

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
    // $ANTLR end "rule__EntityModel__Group__1"


    // $ANTLR start "rule__EntityModel__Group__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:538:1: rule__EntityModel__Group__1__Impl : ( ( rule__EntityModel__ModuleAssignment_1 ) ) ;
    public final void rule__EntityModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:542:1: ( ( ( rule__EntityModel__ModuleAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:543:1: ( ( rule__EntityModel__ModuleAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:543:1: ( ( rule__EntityModel__ModuleAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:544:1: ( rule__EntityModel__ModuleAssignment_1 )
            {
             before(grammarAccess.getEntityModelAccess().getModuleAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:545:1: ( rule__EntityModel__ModuleAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:545:2: rule__EntityModel__ModuleAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityModel__ModuleAssignment_1_in_rule__EntityModel__Group__1__Impl1082);
            rule__EntityModel__ModuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityModelAccess().getModuleAssignment_1()); 

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
    // $ANTLR end "rule__EntityModel__Group__1__Impl"


    // $ANTLR start "rule__EntityModel__Group__2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:555:1: rule__EntityModel__Group__2 : rule__EntityModel__Group__2__Impl rule__EntityModel__Group__3 ;
    public final void rule__EntityModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:559:1: ( rule__EntityModel__Group__2__Impl rule__EntityModel__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:560:2: rule__EntityModel__Group__2__Impl rule__EntityModel__Group__3
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__2__Impl_in_rule__EntityModel__Group__21112);
            rule__EntityModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__3_in_rule__EntityModel__Group__21115);
            rule__EntityModel__Group__3();

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
    // $ANTLR end "rule__EntityModel__Group__2"


    // $ANTLR start "rule__EntityModel__Group__2__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:567:1: rule__EntityModel__Group__2__Impl : ( 'version' ) ;
    public final void rule__EntityModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:571:1: ( ( 'version' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:572:1: ( 'version' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:572:1: ( 'version' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:573:1: 'version'
            {
             before(grammarAccess.getEntityModelAccess().getVersionKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__EntityModel__Group__2__Impl1143); 
             after(grammarAccess.getEntityModelAccess().getVersionKeyword_2()); 

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
    // $ANTLR end "rule__EntityModel__Group__2__Impl"


    // $ANTLR start "rule__EntityModel__Group__3"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:586:1: rule__EntityModel__Group__3 : rule__EntityModel__Group__3__Impl rule__EntityModel__Group__4 ;
    public final void rule__EntityModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:590:1: ( rule__EntityModel__Group__3__Impl rule__EntityModel__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:591:2: rule__EntityModel__Group__3__Impl rule__EntityModel__Group__4
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__3__Impl_in_rule__EntityModel__Group__31174);
            rule__EntityModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__4_in_rule__EntityModel__Group__31177);
            rule__EntityModel__Group__4();

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
    // $ANTLR end "rule__EntityModel__Group__3"


    // $ANTLR start "rule__EntityModel__Group__3__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:598:1: rule__EntityModel__Group__3__Impl : ( ( rule__EntityModel__VersionAssignment_3 ) ) ;
    public final void rule__EntityModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:602:1: ( ( ( rule__EntityModel__VersionAssignment_3 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:603:1: ( ( rule__EntityModel__VersionAssignment_3 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:603:1: ( ( rule__EntityModel__VersionAssignment_3 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:604:1: ( rule__EntityModel__VersionAssignment_3 )
            {
             before(grammarAccess.getEntityModelAccess().getVersionAssignment_3()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:605:1: ( rule__EntityModel__VersionAssignment_3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:605:2: rule__EntityModel__VersionAssignment_3
            {
            pushFollow(FOLLOW_rule__EntityModel__VersionAssignment_3_in_rule__EntityModel__Group__3__Impl1204);
            rule__EntityModel__VersionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityModelAccess().getVersionAssignment_3()); 

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
    // $ANTLR end "rule__EntityModel__Group__3__Impl"


    // $ANTLR start "rule__EntityModel__Group__4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:615:1: rule__EntityModel__Group__4 : rule__EntityModel__Group__4__Impl ;
    public final void rule__EntityModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:619:1: ( rule__EntityModel__Group__4__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:620:2: rule__EntityModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__4__Impl_in_rule__EntityModel__Group__41234);
            rule__EntityModel__Group__4__Impl();

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
    // $ANTLR end "rule__EntityModel__Group__4"


    // $ANTLR start "rule__EntityModel__Group__4__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:626:1: rule__EntityModel__Group__4__Impl : ( ( ( rule__EntityModel__EntitiesAssignment_4 ) ) ( ( rule__EntityModel__EntitiesAssignment_4 )* ) ) ;
    public final void rule__EntityModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:630:1: ( ( ( ( rule__EntityModel__EntitiesAssignment_4 ) ) ( ( rule__EntityModel__EntitiesAssignment_4 )* ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:631:1: ( ( ( rule__EntityModel__EntitiesAssignment_4 ) ) ( ( rule__EntityModel__EntitiesAssignment_4 )* ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:631:1: ( ( ( rule__EntityModel__EntitiesAssignment_4 ) ) ( ( rule__EntityModel__EntitiesAssignment_4 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:632:1: ( ( rule__EntityModel__EntitiesAssignment_4 ) ) ( ( rule__EntityModel__EntitiesAssignment_4 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:632:1: ( ( rule__EntityModel__EntitiesAssignment_4 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:633:1: ( rule__EntityModel__EntitiesAssignment_4 )
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesAssignment_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:634:1: ( rule__EntityModel__EntitiesAssignment_4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:634:2: rule__EntityModel__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_rule__EntityModel__EntitiesAssignment_4_in_rule__EntityModel__Group__4__Impl1263);
            rule__EntityModel__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityModelAccess().getEntitiesAssignment_4()); 

            }

            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:637:1: ( ( rule__EntityModel__EntitiesAssignment_4 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:638:1: ( rule__EntityModel__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesAssignment_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:639:1: ( rule__EntityModel__EntitiesAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==19||LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:639:2: rule__EntityModel__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__EntityModel__EntitiesAssignment_4_in_rule__EntityModel__Group__4__Impl1275);
            	    rule__EntityModel__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getEntityModelAccess().getEntitiesAssignment_4()); 

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
    // $ANTLR end "rule__EntityModel__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:660:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:664:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:665:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01318);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01321);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:672:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__AnnotationsAssignment_0 )* ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:676:1: ( ( ( rule__Entity__AnnotationsAssignment_0 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:677:1: ( ( rule__Entity__AnnotationsAssignment_0 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:677:1: ( ( rule__Entity__AnnotationsAssignment_0 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:678:1: ( rule__Entity__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:679:1: ( rule__Entity__AnnotationsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:679:2: rule__Entity__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AnnotationsAssignment_0_in_rule__Entity__Group__0__Impl1348);
            	    rule__Entity__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:689:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:693:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:694:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11379);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11382);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:701:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__IsAbstractAssignment_1 )? ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:705:1: ( ( ( rule__Entity__IsAbstractAssignment_1 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:706:1: ( ( rule__Entity__IsAbstractAssignment_1 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:706:1: ( ( rule__Entity__IsAbstractAssignment_1 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:707:1: ( rule__Entity__IsAbstractAssignment_1 )?
            {
             before(grammarAccess.getEntityAccess().getIsAbstractAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:708:1: ( rule__Entity__IsAbstractAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:708:2: rule__Entity__IsAbstractAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Entity__IsAbstractAssignment_1_in_rule__Entity__Group__1__Impl1409);
                    rule__Entity__IsAbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getIsAbstractAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:718:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:722:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:723:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21440);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21443);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:730:1: rule__Entity__Group__2__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:734:1: ( ( 'entity' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:735:1: ( 'entity' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:735:1: ( 'entity' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:736:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__2__Impl1471); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:749:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:753:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:754:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31502);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31505);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:761:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__NameAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:765:1: ( ( ( rule__Entity__NameAssignment_3 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:766:1: ( ( rule__Entity__NameAssignment_3 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:766:1: ( ( rule__Entity__NameAssignment_3 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:767:1: ( rule__Entity__NameAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_3()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:768:1: ( rule__Entity__NameAssignment_3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:768:2: rule__Entity__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_3_in_rule__Entity__Group__3__Impl1532);
            rule__Entity__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:778:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:782:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:783:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41562);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41565);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:790:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:794:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:795:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:795:1: ( ( rule__Entity__Group_4__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:796:1: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:797:1: ( rule__Entity__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:797:2: rule__Entity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl1592);
                    rule__Entity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:807:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:811:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:812:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51623);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51626);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:819:1: rule__Entity__Group__5__Impl : ( '{' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:823:1: ( ( '{' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:824:1: ( '{' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:824:1: ( '{' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:825:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__5__Impl1654); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:838:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:842:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:843:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61685);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61688);
            rule__Entity__Group__7();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:850:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__FeaturesAssignment_6 )* ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:854:1: ( ( ( rule__Entity__FeaturesAssignment_6 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:855:1: ( ( rule__Entity__FeaturesAssignment_6 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:855:1: ( ( rule__Entity__FeaturesAssignment_6 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:856:1: ( rule__Entity__FeaturesAssignment_6 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_6()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:857:1: ( rule__Entity__FeaturesAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=26 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:857:2: rule__Entity__FeaturesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_6_in_rule__Entity__Group__6__Impl1715);
            	    rule__Entity__FeaturesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:867:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:871:1: ( rule__Entity__Group__7__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:872:2: rule__Entity__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71746);
            rule__Entity__Group__7__Impl();

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
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:878:1: rule__Entity__Group__7__Impl : ( '}' ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:882:1: ( ( '}' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:883:1: ( '}' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:883:1: ( '}' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:884:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__7__Impl1774); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:913:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:917:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:918:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__01821);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__01824);
            rule__Entity__Group_4__1();

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
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:925:1: rule__Entity__Group_4__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:929:1: ( ( ':' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:930:1: ( ':' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:930:1: ( ':' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:931:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group_4__0__Impl1852); 
             after(grammarAccess.getEntityAccess().getColonKeyword_4_0()); 

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
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:944:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:948:1: ( rule__Entity__Group_4__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:949:2: rule__Entity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__11883);
            rule__Entity__Group_4__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:955:1: rule__Entity__Group_4__1__Impl : ( ( rule__Entity__SuperAssignment_4_1 ) ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:959:1: ( ( ( rule__Entity__SuperAssignment_4_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:960:1: ( ( rule__Entity__SuperAssignment_4_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:960:1: ( ( rule__Entity__SuperAssignment_4_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:961:1: ( rule__Entity__SuperAssignment_4_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperAssignment_4_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:962:1: ( rule__Entity__SuperAssignment_4_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:962:2: rule__Entity__SuperAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperAssignment_4_1_in_rule__Entity__Group_4__1__Impl1910);
            rule__Entity__SuperAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperAssignment_4_1()); 

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
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:976:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:980:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:981:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__01944);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__01947);
            rule__Annotation__Group__1();

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
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:988:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:992:1: ( ( '@' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:993:1: ( '@' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:993:1: ( '@' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:994:1: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Annotation__Group__0__Impl1975); 
             after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1007:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1011:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1012:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__12006);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__12009);
            rule__Annotation__Group__2();

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
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1019:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__OptionAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1023:1: ( ( ( rule__Annotation__OptionAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1024:1: ( ( rule__Annotation__OptionAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1024:1: ( ( rule__Annotation__OptionAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1025:1: ( rule__Annotation__OptionAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getOptionAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1026:1: ( rule__Annotation__OptionAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1026:2: rule__Annotation__OptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__OptionAssignment_1_in_rule__Annotation__Group__1__Impl2036);
            rule__Annotation__OptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getOptionAssignment_1()); 

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
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1036:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1040:1: ( rule__Annotation__Group__2__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1041:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__22066);
            rule__Annotation__Group__2__Impl();

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
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1047:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1051:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1052:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1052:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1053:1: ( rule__Annotation__Group_2__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1054:1: ( rule__Annotation__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1054:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl2093);
                    rule__Annotation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group_2__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1070:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1074:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1075:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__02130);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__02133);
            rule__Annotation__Group_2__1();

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
    // $ANTLR end "rule__Annotation__Group_2__0"


    // $ANTLR start "rule__Annotation__Group_2__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1082:1: rule__Annotation__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1086:1: ( ( ':' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1087:1: ( ':' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1087:1: ( ':' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1088:1: ':'
            {
             before(grammarAccess.getAnnotationAccess().getColonKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__Annotation__Group_2__0__Impl2161); 
             after(grammarAccess.getAnnotationAccess().getColonKeyword_2_0()); 

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
    // $ANTLR end "rule__Annotation__Group_2__0__Impl"


    // $ANTLR start "rule__Annotation__Group_2__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1101:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1105:1: ( rule__Annotation__Group_2__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1106:2: rule__Annotation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__12192);
            rule__Annotation__Group_2__1__Impl();

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
    // $ANTLR end "rule__Annotation__Group_2__1"


    // $ANTLR start "rule__Annotation__Group_2__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1112:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ValueAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1116:1: ( ( ( rule__Annotation__ValueAssignment_2_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1117:1: ( ( rule__Annotation__ValueAssignment_2_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1117:1: ( ( rule__Annotation__ValueAssignment_2_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1118:1: ( rule__Annotation__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_2_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1119:1: ( rule__Annotation__ValueAssignment_2_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1119:2: rule__Annotation__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_2_1_in_rule__Annotation__Group_2__1__Impl2219);
            rule__Annotation__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__Annotation__Group_2__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1133:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1137:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1138:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02253);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02256);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1145:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__IsIndexedAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1149:1: ( ( ( rule__Feature__IsIndexedAssignment_0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1150:1: ( ( rule__Feature__IsIndexedAssignment_0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1150:1: ( ( rule__Feature__IsIndexedAssignment_0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1151:1: ( rule__Feature__IsIndexedAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1152:1: ( rule__Feature__IsIndexedAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1152:2: rule__Feature__IsIndexedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Feature__IsIndexedAssignment_0_in_rule__Feature__Group__0__Impl2283);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1162:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1166:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1167:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12314);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12317);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1174:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__IsContainmentAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1178:1: ( ( ( rule__Feature__IsContainmentAssignment_1 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1179:1: ( ( rule__Feature__IsContainmentAssignment_1 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1179:1: ( ( rule__Feature__IsContainmentAssignment_1 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1180:1: ( rule__Feature__IsContainmentAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1181:1: ( rule__Feature__IsContainmentAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1181:2: rule__Feature__IsContainmentAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__IsContainmentAssignment_1_in_rule__Feature__Group__1__Impl2344);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1191:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1195:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1196:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22375);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__22378);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1203:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__TypeAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1207:1: ( ( ( rule__Feature__TypeAssignment_2 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1208:1: ( ( rule__Feature__TypeAssignment_2 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1208:1: ( ( rule__Feature__TypeAssignment_2 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1209:1: ( rule__Feature__TypeAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1210:1: ( rule__Feature__TypeAssignment_2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1210:2: rule__Feature__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_2_in_rule__Feature__Group__2__Impl2405);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1220:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1224:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1225:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__32435);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__32438);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1232:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__NameAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1236:1: ( ( ( rule__Feature__NameAssignment_3 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1237:1: ( ( rule__Feature__NameAssignment_3 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1237:1: ( ( rule__Feature__NameAssignment_3 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1238:1: ( rule__Feature__NameAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_3()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1239:1: ( rule__Feature__NameAssignment_3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1239:2: rule__Feature__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_3_in_rule__Feature__Group__3__Impl2465);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1249:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1253:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1254:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__42495);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__42498);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1261:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__Group_4__0 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1265:1: ( ( ( rule__Feature__Group_4__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1266:1: ( ( rule__Feature__Group_4__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1266:1: ( ( rule__Feature__Group_4__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1267:1: ( rule__Feature__Group_4__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1268:1: ( rule__Feature__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1268:2: rule__Feature__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_4__0_in_rule__Feature__Group__4__Impl2525);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1278:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1282:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1283:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__52556);
            rule__Feature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__52559);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1290:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__Group_5__0 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1294:1: ( ( ( rule__Feature__Group_5__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1295:1: ( ( rule__Feature__Group_5__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1295:1: ( ( rule__Feature__Group_5__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1296:1: ( rule__Feature__Group_5__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_5()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1297:1: ( rule__Feature__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1297:2: rule__Feature__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl2586);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1307:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1311:1: ( rule__Feature__Group__6__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1312:2: rule__Feature__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__62617);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1318:1: rule__Feature__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1322:1: ( ( ( ';' )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1323:1: ( ( ';' )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1323:1: ( ( ';' )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1324:1: ( ';' )?
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_6()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1325:1: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1326:2: ';'
                    {
                    match(input,20,FOLLOW_20_in_rule__Feature__Group__6__Impl2646); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1351:1: rule__Feature__Group_4__0 : rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 ;
    public final void rule__Feature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1355:1: ( rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1356:2: rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_4__0__Impl_in_rule__Feature__Group_4__02693);
            rule__Feature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_4__1_in_rule__Feature__Group_4__02696);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1363:1: rule__Feature__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Feature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1367:1: ( ( '=' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1368:1: ( '=' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1368:1: ( '=' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1369:1: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Feature__Group_4__0__Impl2724); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1382:1: rule__Feature__Group_4__1 : rule__Feature__Group_4__1__Impl ;
    public final void rule__Feature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1386:1: ( rule__Feature__Group_4__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1387:2: rule__Feature__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_4__1__Impl_in_rule__Feature__Group_4__12755);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1393:1: rule__Feature__Group_4__1__Impl : ( ( rule__Feature__DefaultValueAssignment_4_1 ) ) ;
    public final void rule__Feature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1397:1: ( ( ( rule__Feature__DefaultValueAssignment_4_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1398:1: ( ( rule__Feature__DefaultValueAssignment_4_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1398:1: ( ( rule__Feature__DefaultValueAssignment_4_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1399:1: ( rule__Feature__DefaultValueAssignment_4_1 )
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueAssignment_4_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1400:1: ( rule__Feature__DefaultValueAssignment_4_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1400:2: rule__Feature__DefaultValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Feature__DefaultValueAssignment_4_1_in_rule__Feature__Group_4__1__Impl2782);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1414:1: rule__Feature__Group_5__0 : rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 ;
    public final void rule__Feature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1418:1: ( rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1419:2: rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__02816);
            rule__Feature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__02819);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1426:1: rule__Feature__Group_5__0__Impl : ( '<->' ) ;
    public final void rule__Feature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1430:1: ( ( '<->' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1431:1: ( '<->' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1431:1: ( '<->' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1432:1: '<->'
            {
             before(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Feature__Group_5__0__Impl2847); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1445:1: rule__Feature__Group_5__1 : rule__Feature__Group_5__1__Impl ;
    public final void rule__Feature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1449:1: ( rule__Feature__Group_5__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1450:2: rule__Feature__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__12878);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1456:1: rule__Feature__Group_5__1__Impl : ( ( rule__Feature__InverseAssignment_5_1 ) ) ;
    public final void rule__Feature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1460:1: ( ( ( rule__Feature__InverseAssignment_5_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1461:1: ( ( rule__Feature__InverseAssignment_5_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1461:1: ( ( rule__Feature__InverseAssignment_5_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1462:1: ( rule__Feature__InverseAssignment_5_1 )
            {
             before(grammarAccess.getFeatureAccess().getInverseAssignment_5_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1463:1: ( rule__Feature__InverseAssignment_5_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1463:2: rule__Feature__InverseAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Feature__InverseAssignment_5_1_in_rule__Feature__Group_5__1__Impl2905);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1477:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1481:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1482:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__02939);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__02942);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1489:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1493:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1494:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1494:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1495:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1496:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1496:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl2969);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1506:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1510:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1511:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__12999);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1517:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1521:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1522:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1522:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1523:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1524:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1524:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl3026);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1538:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1542:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1543:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__03061);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__03064);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1550:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1554:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1555:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1555:1: ( ( '-' )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1556:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1557:1: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1558:2: '-'
                    {
                    match(input,23,FOLLOW_23_in_rule__EFloatObject__Group__0__Impl3093); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1569:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1573:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1574:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__13126);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__13129);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1581:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1585:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1586:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1586:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1587:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1588:1: ( RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1588:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl3157); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1598:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1602:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1603:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__23188);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__23191);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1610:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1614:1: ( ( '.' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1615:1: ( '.' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1615:1: ( '.' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1616:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__EFloatObject__Group__2__Impl3219); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1629:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1633:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1634:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__33250);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1640:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1644:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1645:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1645:1: ( RULE_INT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1646:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl3277); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1665:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1669:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1670:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03314);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03317);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1677:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1681:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1682:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1682:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1683:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3344); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1694:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1698:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1699:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13373);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1705:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1709:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1710:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1710:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1711:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1712:1: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1712:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3400);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1726:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1730:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1731:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03435);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03438);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1738:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1742:1: ( ( '.' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1743:1: ( '.' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1743:1: ( '.' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1744:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__QualifiedName__Group_1__0__Impl3466); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1757:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1761:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1762:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13497);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1768:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1772:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1773:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1773:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1774:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3524); 
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


    // $ANTLR start "rule__EntityModel__ModuleAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1790:1: rule__EntityModel__ModuleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EntityModel__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1794:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1795:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1795:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1796:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1797:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1798:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EntityModel__ModuleAssignment_13566);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_1_0()); 

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
    // $ANTLR end "rule__EntityModel__ModuleAssignment_1"


    // $ANTLR start "rule__EntityModel__VersionAssignment_3"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1809:1: rule__EntityModel__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__EntityModel__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1813:1: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1814:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1814:1: ( RULE_STRING )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1815:1: RULE_STRING
            {
             before(grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EntityModel__VersionAssignment_33601); 
             after(grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__EntityModel__VersionAssignment_3"


    // $ANTLR start "rule__EntityModel__EntitiesAssignment_4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1824:1: rule__EntityModel__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__EntityModel__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1828:1: ( ( ruleEntity ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1829:1: ( ruleEntity )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1829:1: ( ruleEntity )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1830:1: ruleEntity
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__EntityModel__EntitiesAssignment_43632);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__EntityModel__EntitiesAssignment_4"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1839:1: rule__Entity__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1843:1: ( ( ruleAnnotation ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1844:1: ( ruleAnnotation )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1844:1: ( ruleAnnotation )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1845:1: ruleAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_03663);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Entity__AnnotationsAssignment_0"


    // $ANTLR start "rule__Entity__IsAbstractAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1854:1: rule__Entity__IsAbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Entity__IsAbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1858:1: ( ( ( 'abstract' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1859:1: ( ( 'abstract' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1859:1: ( ( 'abstract' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1860:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1861:1: ( 'abstract' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1862:1: 'abstract'
            {
             before(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Entity__IsAbstractAssignment_13699); 
             after(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_1_0()); 

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
    // $ANTLR end "rule__Entity__IsAbstractAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_3"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1877:1: rule__Entity__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1881:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1882:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1882:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1883:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_33738); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_3"


    // $ANTLR start "rule__Entity__SuperAssignment_4_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1892:1: rule__Entity__SuperAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1896:1: ( ( ( RULE_ID ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1897:1: ( ( RULE_ID ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1897:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1898:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityCrossReference_4_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1899:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1900:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperAssignment_4_13773); 
             after(grammarAccess.getEntityAccess().getSuperEntityIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Entity__SuperAssignment_4_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_6"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1911:1: rule__Entity__FeaturesAssignment_6 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1915:1: ( ( ruleFeature ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1916:1: ( ruleFeature )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1916:1: ( ruleFeature )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1917:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_63808);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Entity__FeaturesAssignment_6"


    // $ANTLR start "rule__Annotation__OptionAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1926:1: rule__Annotation__OptionAssignment_1 : ( ruleConfigOption ) ;
    public final void rule__Annotation__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1930:1: ( ( ruleConfigOption ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1931:1: ( ruleConfigOption )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1931:1: ( ruleConfigOption )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1932:1: ruleConfigOption
            {
             before(grammarAccess.getAnnotationAccess().getOptionConfigOptionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConfigOption_in_rule__Annotation__OptionAssignment_13839);
            ruleConfigOption();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getOptionConfigOptionEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Annotation__OptionAssignment_1"


    // $ANTLR start "rule__Annotation__ValueAssignment_2_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1941:1: rule__Annotation__ValueAssignment_2_1 : ( ruleConfigValue ) ;
    public final void rule__Annotation__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1945:1: ( ( ruleConfigValue ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1946:1: ( ruleConfigValue )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1946:1: ( ruleConfigValue )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1947:1: ruleConfigValue
            {
             before(grammarAccess.getAnnotationAccess().getValueConfigValueEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConfigValue_in_rule__Annotation__ValueAssignment_2_13870);
            ruleConfigValue();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getValueConfigValueEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Annotation__ValueAssignment_2_1"


    // $ANTLR start "rule__Feature__IsIndexedAssignment_0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1956:1: rule__Feature__IsIndexedAssignment_0 : ( ( 'indexed' ) ) ;
    public final void rule__Feature__IsIndexedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1960:1: ( ( ( 'indexed' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1961:1: ( ( 'indexed' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1961:1: ( ( 'indexed' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1962:1: ( 'indexed' )
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1963:1: ( 'indexed' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1964:1: 'indexed'
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Feature__IsIndexedAssignment_03906); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1979:1: rule__Feature__IsContainmentAssignment_1 : ( ( '-[' ) ) ;
    public final void rule__Feature__IsContainmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1983:1: ( ( ( '-[' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1984:1: ( ( '-[' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1984:1: ( ( '-[' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1985:1: ( '-[' )
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1986:1: ( '-[' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1987:1: '-['
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Feature__IsContainmentAssignment_13950); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2002:1: rule__Feature__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Feature__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2006:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2007:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2007:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2008:1: ruleTypeRef
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_23989);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2017:1: rule__Feature__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2021:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2022:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2022:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2023:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_34020); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2032:1: rule__Feature__DefaultValueAssignment_4_1 : ( ruleValueObject ) ;
    public final void rule__Feature__DefaultValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2036:1: ( ( ruleValueObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2037:1: ( ruleValueObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2037:1: ( ruleValueObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2038:1: ruleValueObject
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_4_14051);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2047:1: rule__Feature__InverseAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__InverseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2051:1: ( ( ( RULE_ID ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2052:1: ( ( RULE_ID ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2052:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2053:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_5_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2054:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2055:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__InverseAssignment_5_14086); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2066:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2070:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2071:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2071:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2072:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2073:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2074:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_04125);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2085:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2089:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2090:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2090:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2091:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2092:1: ( '[]' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2093:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__TypeRef__IsMultiAssignment_14165); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2108:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2112:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2113:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2113:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2114:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment4204);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2123:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2127:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2128:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2128:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2129:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment4235);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2138:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2142:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2143:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2143:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2144:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment4266);
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


 

    public static final BitSet FOLLOW_ruleEntityModel_in_entryRuleEntityModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__0_in_ruleEntityModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConfigOption850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleConfigValue889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__0__Impl_in_rule__EntityModel__Group__0990 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__1_in_rule__EntityModel__Group__0993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EntityModel__Group__0__Impl1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__1__Impl_in_rule__EntityModel__Group__11052 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__2_in_rule__EntityModel__Group__11055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__ModuleAssignment_1_in_rule__EntityModel__Group__1__Impl1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__2__Impl_in_rule__EntityModel__Group__21112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__3_in_rule__EntityModel__Group__21115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EntityModel__Group__2__Impl1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__3__Impl_in_rule__EntityModel__Group__31174 = new BitSet(new long[]{0x0000000002088000L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__4_in_rule__EntityModel__Group__31177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__VersionAssignment_3_in_rule__EntityModel__Group__3__Impl1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__4__Impl_in_rule__EntityModel__Group__41234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__EntitiesAssignment_4_in_rule__EntityModel__Group__4__Impl1263 = new BitSet(new long[]{0x0000000002088002L});
    public static final BitSet FOLLOW_rule__EntityModel__EntitiesAssignment_4_in_rule__EntityModel__Group__4__Impl1275 = new BitSet(new long[]{0x0000000002088002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01318 = new BitSet(new long[]{0x0000000002088000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_0_in_rule__Entity__Group__0__Impl1348 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11379 = new BitSet(new long[]{0x0000000002088000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__IsAbstractAssignment_1_in_rule__Entity__Group__1__Impl1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21440 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__2__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31502 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_3_in_rule__Entity__Group__3__Impl1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41562 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51623 = new BitSet(new long[]{0x000000000C020040L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__5__Impl1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61685 = new BitSet(new long[]{0x000000000C020040L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_6_in_rule__Entity__Group__6__Impl1715 = new BitSet(new long[]{0x000000000C000042L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__7__Impl1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__01821 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__01824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group_4__0__Impl1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__11883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperAssignment_4_1_in_rule__Entity__Group_4__1__Impl1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__01944 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__01947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Annotation__Group__0__Impl1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__12006 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__12009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__OptionAssignment_1_in_rule__Annotation__Group__1__Impl2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__22066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__02130 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__02133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Annotation__Group_2__0__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__12192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_2_1_in_rule__Annotation__Group_2__1__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02253 = new BitSet(new long[]{0x000000000C000040L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsIndexedAssignment_0_in_rule__Feature__Group__0__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12314 = new BitSet(new long[]{0x000000000C000040L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsContainmentAssignment_1_in_rule__Feature__Group__1__Impl2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22375 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__22378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_2_in_rule__Feature__Group__2__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__32435 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__32438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_3_in_rule__Feature__Group__3__Impl2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__42495 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__42498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__0_in_rule__Feature__Group__4__Impl2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__52556 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__52559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__62617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Feature__Group__6__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__0__Impl_in_rule__Feature__Group_4__02693 = new BitSet(new long[]{0x0000000001800030L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__1_in_rule__Feature__Group_4__02696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Feature__Group_4__0__Impl2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__1__Impl_in_rule__Feature__Group_4__12755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__DefaultValueAssignment_4_1_in_rule__Feature__Group_4__1__Impl2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__02816 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__02819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Feature__Group_5__0__Impl2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__12878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__InverseAssignment_5_1_in_rule__Feature__Group_5__1__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__02939 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__02942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__12999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__03061 = new BitSet(new long[]{0x0000000001800030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__03064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EFloatObject__Group__0__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__13126 = new BitSet(new long[]{0x0000000001800030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__13129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__23188 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__23191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EFloatObject__Group__2__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__33250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03314 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3400 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03435 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__QualifiedName__Group_1__0__Impl3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EntityModel__ModuleAssignment_13566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EntityModel__VersionAssignment_33601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__EntityModel__EntitiesAssignment_43632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_03663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Entity__IsAbstractAssignment_13699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_33738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperAssignment_4_13773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_63808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigOption_in_rule__Annotation__OptionAssignment_13839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigValue_in_rule__Annotation__ValueAssignment_2_13870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Feature__IsIndexedAssignment_03906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Feature__IsContainmentAssignment_13950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_23989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_34020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_4_14051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__InverseAssignment_5_14086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_04125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TypeRef__IsMultiAssignment_14165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment4266 = new BitSet(new long[]{0x0000000000000002L});

}