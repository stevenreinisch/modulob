package de.dubmas.modulob.ui.contentassist.antlr.internal; 

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
import de.dubmas.modulob.services.DataDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'persistency'", "'CoreData'", "'entities for module'", "'version'", "'entity'", "'{'", "'}'", "':'", "'@'", "';'", "'='", "'<->'", "'primitive type'", "'any type'", "'-'", "'.'", "'current'", "'abstract'", "'indexed'", "'-['", "'[]'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:60:1: entryRuleEntityModel : ruleEntityModel EOF ;
    public final void entryRuleEntityModel() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:61:1: ( ruleEntityModel EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:62:1: ruleEntityModel EOF
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:69:1: ruleEntityModel : ( ( rule__EntityModel__Group__0 ) ) ;
    public final void ruleEntityModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:73:2: ( ( ( rule__EntityModel__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:74:1: ( ( rule__EntityModel__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:74:1: ( ( rule__EntityModel__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:75:1: ( rule__EntityModel__Group__0 )
            {
             before(grammarAccess.getEntityModelAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:76:1: ( rule__EntityModel__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:76:2: rule__EntityModel__Group__0
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:88:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:89:1: ( ruleEntity EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:90:1: ruleEntity EOF
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:97:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:101:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:102:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:102:1: ( ( rule__Entity__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:103:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:104:1: ( rule__Entity__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:104:2: rule__Entity__Group__0
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:116:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:117:1: ( ruleAnnotation EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:118:1: ruleAnnotation EOF
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:125:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:129:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:130:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:130:1: ( ( rule__Annotation__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:131:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:132:1: ( rule__Annotation__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:132:2: rule__Annotation__Group__0
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:144:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:145:1: ( ruleFeature EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:146:1: ruleFeature EOF
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:153:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:157:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:158:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:158:1: ( ( rule__Feature__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:159:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:160:1: ( rule__Feature__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:160:2: rule__Feature__Group__0
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


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:174:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:175:1: ( rulePrimitive EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:176:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive303);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive310); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:183:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:187:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:188:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:188:1: ( ( rule__Primitive__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:189:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:190:1: ( rule__Primitive__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:190:2: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0_in_rulePrimitive336);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:202:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:203:1: ( ruleAny EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:204:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny363);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny370); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:211:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:215:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:216:1: ( ( rule__Any__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:216:1: ( ( rule__Any__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:217:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:218:1: ( rule__Any__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:218:2: rule__Any__Group__0
            {
            pushFollow(FOLLOW_rule__Any__Group__0_in_ruleAny396);
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


    // $ANTLR start "entryRuleTypeRef"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:230:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:231:1: ( ruleTypeRef EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:232:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef423);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef430); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:239:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:243:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:244:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:244:1: ( ( rule__TypeRef__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:245:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:246:1: ( rule__TypeRef__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:246:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef456);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:258:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:259:1: ( ruleValueObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:260:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject483);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject490); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:267:1: ruleValueObject : ( ( rule__ValueObject__Alternatives ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:271:2: ( ( ( rule__ValueObject__Alternatives ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:272:1: ( ( rule__ValueObject__Alternatives ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:272:1: ( ( rule__ValueObject__Alternatives ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:273:1: ( rule__ValueObject__Alternatives )
            {
             before(grammarAccess.getValueObjectAccess().getAlternatives()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:274:1: ( rule__ValueObject__Alternatives )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:274:2: rule__ValueObject__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject516);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:286:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:287:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:288:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue543);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue550); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:295:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:299:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:300:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:300:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:301:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:302:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:302:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue576);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:314:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:315:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:316:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject603);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject610); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:323:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:327:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:328:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:328:1: ( RULE_STRING )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:329:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject636); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:342:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:343:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:344:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue662);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue669); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:351:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:355:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:356:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:356:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:357:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:358:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:358:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue695);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:370:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:371:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:372:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject722);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject729); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:379:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:383:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:384:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:384:1: ( RULE_INT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:385:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject755); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:398:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:399:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:400:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue781);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue788); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:407:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:411:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:412:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:412:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:413:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:414:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:414:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue814);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:426:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:427:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:428:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject841);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject848); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:435:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:439:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:440:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:440:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:441:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:442:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:442:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject874);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:454:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:455:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:456:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName901);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName908); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:463:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:467:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:468:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:468:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:469:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:470:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:470:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName934);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:483:1: ruleConfigOption : ( ( 'persistency' ) ) ;
    public final void ruleConfigOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:487:1: ( ( ( 'persistency' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:488:1: ( ( 'persistency' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:488:1: ( ( 'persistency' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:489:1: ( 'persistency' )
            {
             before(grammarAccess.getConfigOptionAccess().getPersistencyEnumLiteralDeclaration()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:490:1: ( 'persistency' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:490:3: 'persistency'
            {
            match(input,12,FOLLOW_12_in_ruleConfigOption972); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:503:1: ruleConfigValue : ( ( 'CoreData' ) ) ;
    public final void ruleConfigValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:507:1: ( ( ( 'CoreData' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:508:1: ( ( 'CoreData' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:508:1: ( ( 'CoreData' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:509:1: ( 'CoreData' )
            {
             before(grammarAccess.getConfigValueAccess().getCoreDataEnumLiteralDeclaration()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:510:1: ( 'CoreData' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:510:3: 'CoreData'
            {
            match(input,13,FOLLOW_13_in_ruleConfigValue1011); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:522:1: rule__ValueObject__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) );
    public final void rule__ValueObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:526:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) )
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

                if ( (LA1_2==27) ) {
                    alt1=3;
                }
                else if ( (LA1_2==EOF||LA1_2==21||LA1_2==23) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 26:
            case 27:
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
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:527:1: ( ruleStringValue )
                    {
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:527:1: ( ruleStringValue )
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:528:1: ruleStringValue
                    {
                     before(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives1048);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:533:6: ( ruleIntegerValue )
                    {
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:533:6: ( ruleIntegerValue )
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:534:1: ruleIntegerValue
                    {
                     before(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives1065);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:539:6: ( ruleFloatValue )
                    {
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:539:6: ( ruleFloatValue )
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:540:1: ruleFloatValue
                    {
                     before(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives1082);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:552:1: rule__EntityModel__Group__0 : rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 ;
    public final void rule__EntityModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:556:1: ( rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:557:2: rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__0__Impl_in_rule__EntityModel__Group__01112);
            rule__EntityModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__1_in_rule__EntityModel__Group__01115);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:564:1: rule__EntityModel__Group__0__Impl : ( ( rule__EntityModel__CurrentAssignment_0 )? ) ;
    public final void rule__EntityModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:568:1: ( ( ( rule__EntityModel__CurrentAssignment_0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:569:1: ( ( rule__EntityModel__CurrentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:569:1: ( ( rule__EntityModel__CurrentAssignment_0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:570:1: ( rule__EntityModel__CurrentAssignment_0 )?
            {
             before(grammarAccess.getEntityModelAccess().getCurrentAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:571:1: ( rule__EntityModel__CurrentAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:571:2: rule__EntityModel__CurrentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EntityModel__CurrentAssignment_0_in_rule__EntityModel__Group__0__Impl1142);
                    rule__EntityModel__CurrentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityModelAccess().getCurrentAssignment_0()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:581:1: rule__EntityModel__Group__1 : rule__EntityModel__Group__1__Impl rule__EntityModel__Group__2 ;
    public final void rule__EntityModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:585:1: ( rule__EntityModel__Group__1__Impl rule__EntityModel__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:586:2: rule__EntityModel__Group__1__Impl rule__EntityModel__Group__2
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__1__Impl_in_rule__EntityModel__Group__11173);
            rule__EntityModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__2_in_rule__EntityModel__Group__11176);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:593:1: rule__EntityModel__Group__1__Impl : ( 'entities for module' ) ;
    public final void rule__EntityModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:597:1: ( ( 'entities for module' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:598:1: ( 'entities for module' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:598:1: ( 'entities for module' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:599:1: 'entities for module'
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__EntityModel__Group__1__Impl1204); 
             after(grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_1()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:612:1: rule__EntityModel__Group__2 : rule__EntityModel__Group__2__Impl rule__EntityModel__Group__3 ;
    public final void rule__EntityModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:616:1: ( rule__EntityModel__Group__2__Impl rule__EntityModel__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:617:2: rule__EntityModel__Group__2__Impl rule__EntityModel__Group__3
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__2__Impl_in_rule__EntityModel__Group__21235);
            rule__EntityModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__3_in_rule__EntityModel__Group__21238);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:624:1: rule__EntityModel__Group__2__Impl : ( ( rule__EntityModel__ModuleAssignment_2 ) ) ;
    public final void rule__EntityModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:628:1: ( ( ( rule__EntityModel__ModuleAssignment_2 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:629:1: ( ( rule__EntityModel__ModuleAssignment_2 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:629:1: ( ( rule__EntityModel__ModuleAssignment_2 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:630:1: ( rule__EntityModel__ModuleAssignment_2 )
            {
             before(grammarAccess.getEntityModelAccess().getModuleAssignment_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:631:1: ( rule__EntityModel__ModuleAssignment_2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:631:2: rule__EntityModel__ModuleAssignment_2
            {
            pushFollow(FOLLOW_rule__EntityModel__ModuleAssignment_2_in_rule__EntityModel__Group__2__Impl1265);
            rule__EntityModel__ModuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityModelAccess().getModuleAssignment_2()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:641:1: rule__EntityModel__Group__3 : rule__EntityModel__Group__3__Impl rule__EntityModel__Group__4 ;
    public final void rule__EntityModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:645:1: ( rule__EntityModel__Group__3__Impl rule__EntityModel__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:646:2: rule__EntityModel__Group__3__Impl rule__EntityModel__Group__4
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__3__Impl_in_rule__EntityModel__Group__31295);
            rule__EntityModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__4_in_rule__EntityModel__Group__31298);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:653:1: rule__EntityModel__Group__3__Impl : ( 'version' ) ;
    public final void rule__EntityModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:657:1: ( ( 'version' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:658:1: ( 'version' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:658:1: ( 'version' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:659:1: 'version'
            {
             before(grammarAccess.getEntityModelAccess().getVersionKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__EntityModel__Group__3__Impl1326); 
             after(grammarAccess.getEntityModelAccess().getVersionKeyword_3()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:672:1: rule__EntityModel__Group__4 : rule__EntityModel__Group__4__Impl rule__EntityModel__Group__5 ;
    public final void rule__EntityModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:676:1: ( rule__EntityModel__Group__4__Impl rule__EntityModel__Group__5 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:677:2: rule__EntityModel__Group__4__Impl rule__EntityModel__Group__5
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__4__Impl_in_rule__EntityModel__Group__41357);
            rule__EntityModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__5_in_rule__EntityModel__Group__41360);
            rule__EntityModel__Group__5();

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:684:1: rule__EntityModel__Group__4__Impl : ( ( rule__EntityModel__VersionAssignment_4 ) ) ;
    public final void rule__EntityModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:688:1: ( ( ( rule__EntityModel__VersionAssignment_4 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:689:1: ( ( rule__EntityModel__VersionAssignment_4 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:689:1: ( ( rule__EntityModel__VersionAssignment_4 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:690:1: ( rule__EntityModel__VersionAssignment_4 )
            {
             before(grammarAccess.getEntityModelAccess().getVersionAssignment_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:691:1: ( rule__EntityModel__VersionAssignment_4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:691:2: rule__EntityModel__VersionAssignment_4
            {
            pushFollow(FOLLOW_rule__EntityModel__VersionAssignment_4_in_rule__EntityModel__Group__4__Impl1387);
            rule__EntityModel__VersionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityModelAccess().getVersionAssignment_4()); 

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


    // $ANTLR start "rule__EntityModel__Group__5"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:701:1: rule__EntityModel__Group__5 : rule__EntityModel__Group__5__Impl ;
    public final void rule__EntityModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:705:1: ( rule__EntityModel__Group__5__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:706:2: rule__EntityModel__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__5__Impl_in_rule__EntityModel__Group__51417);
            rule__EntityModel__Group__5__Impl();

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
    // $ANTLR end "rule__EntityModel__Group__5"


    // $ANTLR start "rule__EntityModel__Group__5__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:712:1: rule__EntityModel__Group__5__Impl : ( ( rule__EntityModel__EntitiesAssignment_5 )* ) ;
    public final void rule__EntityModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:716:1: ( ( ( rule__EntityModel__EntitiesAssignment_5 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:717:1: ( ( rule__EntityModel__EntitiesAssignment_5 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:717:1: ( ( rule__EntityModel__EntitiesAssignment_5 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:718:1: ( rule__EntityModel__EntitiesAssignment_5 )*
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesAssignment_5()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:719:1: ( rule__EntityModel__EntitiesAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOC_COMMENT||LA3_0==16||LA3_0==20||LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:719:2: rule__EntityModel__EntitiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__EntityModel__EntitiesAssignment_5_in_rule__EntityModel__Group__5__Impl1444);
            	    rule__EntityModel__EntitiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEntityModelAccess().getEntitiesAssignment_5()); 

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
    // $ANTLR end "rule__EntityModel__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:741:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:745:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:746:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01487);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01490);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:753:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__CommentAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:757:1: ( ( ( rule__Entity__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:758:1: ( ( rule__Entity__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:758:1: ( ( rule__Entity__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:759:1: ( rule__Entity__CommentAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:760:1: ( rule__Entity__CommentAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:760:2: rule__Entity__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Entity__CommentAssignment_0_in_rule__Entity__Group__0__Impl1517);
                    rule__Entity__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getCommentAssignment_0()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:770:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:774:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:775:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11548);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11551);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:782:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__AnnotationsAssignment_1 )* ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:786:1: ( ( ( rule__Entity__AnnotationsAssignment_1 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:787:1: ( ( rule__Entity__AnnotationsAssignment_1 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:787:1: ( ( rule__Entity__AnnotationsAssignment_1 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:788:1: ( rule__Entity__AnnotationsAssignment_1 )*
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:789:1: ( rule__Entity__AnnotationsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:789:2: rule__Entity__AnnotationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AnnotationsAssignment_1_in_rule__Entity__Group__1__Impl1578);
            	    rule__Entity__AnnotationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_1()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:799:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:803:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:804:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21609);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21612);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:811:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__IsAbstractAssignment_2 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:815:1: ( ( ( rule__Entity__IsAbstractAssignment_2 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:816:1: ( ( rule__Entity__IsAbstractAssignment_2 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:816:1: ( ( rule__Entity__IsAbstractAssignment_2 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:817:1: ( rule__Entity__IsAbstractAssignment_2 )?
            {
             before(grammarAccess.getEntityAccess().getIsAbstractAssignment_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:818:1: ( rule__Entity__IsAbstractAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:818:2: rule__Entity__IsAbstractAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Entity__IsAbstractAssignment_2_in_rule__Entity__Group__2__Impl1639);
                    rule__Entity__IsAbstractAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getIsAbstractAssignment_2()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:828:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:832:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:833:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31670);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31673);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:840:1: rule__Entity__Group__3__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:844:1: ( ( 'entity' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:845:1: ( 'entity' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:845:1: ( 'entity' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:846:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__3__Impl1701); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_3()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:859:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:863:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:864:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41732);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41735);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:871:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__NameAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:875:1: ( ( ( rule__Entity__NameAssignment_4 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:876:1: ( ( rule__Entity__NameAssignment_4 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:876:1: ( ( rule__Entity__NameAssignment_4 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:877:1: ( rule__Entity__NameAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:878:1: ( rule__Entity__NameAssignment_4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:878:2: rule__Entity__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_4_in_rule__Entity__Group__4__Impl1762);
            rule__Entity__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_4()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:888:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:892:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:893:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51792);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51795);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:900:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:904:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:905:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:905:1: ( ( rule__Entity__Group_5__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:906:1: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:907:1: ( rule__Entity__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:907:2: rule__Entity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl1822);
                    rule__Entity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_5()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:917:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:921:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:922:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61853);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61856);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:929:1: rule__Entity__Group__6__Impl : ( '{' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:933:1: ( ( '{' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:934:1: ( '{' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:934:1: ( '{' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:935:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__6__Impl1884); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:948:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:952:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:953:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71915);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71918);
            rule__Entity__Group__8();

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:960:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__FeaturesAssignment_7 )* ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:964:1: ( ( ( rule__Entity__FeaturesAssignment_7 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:965:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:965:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:966:1: ( rule__Entity__FeaturesAssignment_7 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:967:1: ( rule__Entity__FeaturesAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_DOC_COMMENT)||(LA8_0>=30 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:967:2: rule__Entity__FeaturesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl1945);
            	    rule__Entity__FeaturesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 

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


    // $ANTLR start "rule__Entity__Group__8"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:977:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:981:1: ( rule__Entity__Group__8__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:982:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81976);
            rule__Entity__Group__8__Impl();

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
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:988:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:992:1: ( ( '}' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:993:1: ( '}' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:993:1: ( '}' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:994:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__8__Impl2004); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group_5__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1025:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1029:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1030:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02053);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02056);
            rule__Entity__Group_5__1();

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
    // $ANTLR end "rule__Entity__Group_5__0"


    // $ANTLR start "rule__Entity__Group_5__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1037:1: rule__Entity__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1041:1: ( ( ':' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1042:1: ( ':' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1042:1: ( ':' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1043:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_5_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group_5__0__Impl2084); 
             after(grammarAccess.getEntityAccess().getColonKeyword_5_0()); 

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
    // $ANTLR end "rule__Entity__Group_5__0__Impl"


    // $ANTLR start "rule__Entity__Group_5__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1056:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1060:1: ( rule__Entity__Group_5__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1061:2: rule__Entity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12115);
            rule__Entity__Group_5__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_5__1"


    // $ANTLR start "rule__Entity__Group_5__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1067:1: rule__Entity__Group_5__1__Impl : ( ( rule__Entity__SuperAssignment_5_1 ) ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1071:1: ( ( ( rule__Entity__SuperAssignment_5_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1072:1: ( ( rule__Entity__SuperAssignment_5_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1072:1: ( ( rule__Entity__SuperAssignment_5_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1073:1: ( rule__Entity__SuperAssignment_5_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperAssignment_5_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1074:1: ( rule__Entity__SuperAssignment_5_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1074:2: rule__Entity__SuperAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperAssignment_5_1_in_rule__Entity__Group_5__1__Impl2142);
            rule__Entity__SuperAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperAssignment_5_1()); 

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
    // $ANTLR end "rule__Entity__Group_5__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1088:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1092:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1093:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__02176);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__02179);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1100:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1104:1: ( ( '@' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1105:1: ( '@' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1105:1: ( '@' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1106:1: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Annotation__Group__0__Impl2207); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1119:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1123:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1124:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__12238);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__12241);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1131:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__OptionAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1135:1: ( ( ( rule__Annotation__OptionAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1136:1: ( ( rule__Annotation__OptionAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1136:1: ( ( rule__Annotation__OptionAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1137:1: ( rule__Annotation__OptionAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getOptionAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1138:1: ( rule__Annotation__OptionAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1138:2: rule__Annotation__OptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__OptionAssignment_1_in_rule__Annotation__Group__1__Impl2268);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1148:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1152:1: ( rule__Annotation__Group__2__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1153:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__22298);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1159:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1163:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1164:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1164:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1165:1: ( rule__Annotation__Group_2__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1166:1: ( rule__Annotation__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1166:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl2325);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1182:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1186:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1187:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__02362);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__02365);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1194:1: rule__Annotation__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1198:1: ( ( ':' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1199:1: ( ':' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1199:1: ( ':' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1200:1: ':'
            {
             before(grammarAccess.getAnnotationAccess().getColonKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Annotation__Group_2__0__Impl2393); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1213:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1217:1: ( rule__Annotation__Group_2__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1218:2: rule__Annotation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__12424);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1224:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ValueAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1228:1: ( ( ( rule__Annotation__ValueAssignment_2_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1229:1: ( ( rule__Annotation__ValueAssignment_2_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1229:1: ( ( rule__Annotation__ValueAssignment_2_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1230:1: ( rule__Annotation__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_2_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1231:1: ( rule__Annotation__ValueAssignment_2_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1231:2: rule__Annotation__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_2_1_in_rule__Annotation__Group_2__1__Impl2451);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1245:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1249:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1250:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02485);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02488);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1257:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__CommentAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1261:1: ( ( ( rule__Feature__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1262:1: ( ( rule__Feature__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1262:1: ( ( rule__Feature__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1263:1: ( rule__Feature__CommentAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1264:1: ( rule__Feature__CommentAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DOC_COMMENT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1264:2: rule__Feature__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Feature__CommentAssignment_0_in_rule__Feature__Group__0__Impl2515);
                    rule__Feature__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getCommentAssignment_0()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1274:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1278:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1279:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12546);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12549);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1286:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__IsIndexedAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1290:1: ( ( ( rule__Feature__IsIndexedAssignment_1 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1291:1: ( ( rule__Feature__IsIndexedAssignment_1 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1291:1: ( ( rule__Feature__IsIndexedAssignment_1 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1292:1: ( rule__Feature__IsIndexedAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1293:1: ( rule__Feature__IsIndexedAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1293:2: rule__Feature__IsIndexedAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__IsIndexedAssignment_1_in_rule__Feature__Group__1__Impl2576);
                    rule__Feature__IsIndexedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getIsIndexedAssignment_1()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1303:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1307:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1308:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22607);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__22610);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1315:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__IsContainmentAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1319:1: ( ( ( rule__Feature__IsContainmentAssignment_2 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1320:1: ( ( rule__Feature__IsContainmentAssignment_2 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1320:1: ( ( rule__Feature__IsContainmentAssignment_2 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1321:1: ( rule__Feature__IsContainmentAssignment_2 )?
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentAssignment_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1322:1: ( rule__Feature__IsContainmentAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1322:2: rule__Feature__IsContainmentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Feature__IsContainmentAssignment_2_in_rule__Feature__Group__2__Impl2637);
                    rule__Feature__IsContainmentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getIsContainmentAssignment_2()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1332:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1336:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1337:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__32668);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__32671);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1344:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1348:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1349:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1349:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1350:1: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1351:1: ( rule__Feature__TypeAssignment_3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1351:2: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl2698);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1361:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1365:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1366:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__42728);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__42731);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1373:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__NameAssignment_4 ) ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1377:1: ( ( ( rule__Feature__NameAssignment_4 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1378:1: ( ( rule__Feature__NameAssignment_4 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1378:1: ( ( rule__Feature__NameAssignment_4 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1379:1: ( rule__Feature__NameAssignment_4 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1380:1: ( rule__Feature__NameAssignment_4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1380:2: rule__Feature__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_4_in_rule__Feature__Group__4__Impl2758);
            rule__Feature__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_4()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1390:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1394:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1395:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__52788);
            rule__Feature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__52791);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1402:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__Group_5__0 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1406:1: ( ( ( rule__Feature__Group_5__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1407:1: ( ( rule__Feature__Group_5__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1407:1: ( ( rule__Feature__Group_5__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1408:1: ( rule__Feature__Group_5__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_5()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1409:1: ( rule__Feature__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1409:2: rule__Feature__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl2818);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1419:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl rule__Feature__Group__7 ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1423:1: ( rule__Feature__Group__6__Impl rule__Feature__Group__7 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1424:2: rule__Feature__Group__6__Impl rule__Feature__Group__7
            {
            pushFollow(FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__62849);
            rule__Feature__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__7_in_rule__Feature__Group__62852);
            rule__Feature__Group__7();

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1431:1: rule__Feature__Group__6__Impl : ( ( rule__Feature__Group_6__0 )? ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1435:1: ( ( ( rule__Feature__Group_6__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1436:1: ( ( rule__Feature__Group_6__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1436:1: ( ( rule__Feature__Group_6__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1437:1: ( rule__Feature__Group_6__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_6()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1438:1: ( rule__Feature__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1438:2: rule__Feature__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_6__0_in_rule__Feature__Group__6__Impl2879);
                    rule__Feature__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_6()); 

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


    // $ANTLR start "rule__Feature__Group__7"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1448:1: rule__Feature__Group__7 : rule__Feature__Group__7__Impl ;
    public final void rule__Feature__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1452:1: ( rule__Feature__Group__7__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1453:2: rule__Feature__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__7__Impl_in_rule__Feature__Group__72910);
            rule__Feature__Group__7__Impl();

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
    // $ANTLR end "rule__Feature__Group__7"


    // $ANTLR start "rule__Feature__Group__7__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1459:1: rule__Feature__Group__7__Impl : ( ';' ) ;
    public final void rule__Feature__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1463:1: ( ( ';' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1464:1: ( ';' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1464:1: ( ';' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1465:1: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__Feature__Group__7__Impl2938); 
             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__Feature__Group__7__Impl"


    // $ANTLR start "rule__Feature__Group_5__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1494:1: rule__Feature__Group_5__0 : rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 ;
    public final void rule__Feature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1498:1: ( rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1499:2: rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__02985);
            rule__Feature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__02988);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1506:1: rule__Feature__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Feature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1510:1: ( ( '=' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1511:1: ( '=' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1511:1: ( '=' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1512:1: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Feature__Group_5__0__Impl3016); 
             after(grammarAccess.getFeatureAccess().getEqualsSignKeyword_5_0()); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1525:1: rule__Feature__Group_5__1 : rule__Feature__Group_5__1__Impl ;
    public final void rule__Feature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1529:1: ( rule__Feature__Group_5__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1530:2: rule__Feature__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__13047);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1536:1: rule__Feature__Group_5__1__Impl : ( ( rule__Feature__DefaultValueAssignment_5_1 ) ) ;
    public final void rule__Feature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1540:1: ( ( ( rule__Feature__DefaultValueAssignment_5_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1541:1: ( ( rule__Feature__DefaultValueAssignment_5_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1541:1: ( ( rule__Feature__DefaultValueAssignment_5_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1542:1: ( rule__Feature__DefaultValueAssignment_5_1 )
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueAssignment_5_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1543:1: ( rule__Feature__DefaultValueAssignment_5_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1543:2: rule__Feature__DefaultValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Feature__DefaultValueAssignment_5_1_in_rule__Feature__Group_5__1__Impl3074);
            rule__Feature__DefaultValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDefaultValueAssignment_5_1()); 

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


    // $ANTLR start "rule__Feature__Group_6__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1557:1: rule__Feature__Group_6__0 : rule__Feature__Group_6__0__Impl rule__Feature__Group_6__1 ;
    public final void rule__Feature__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1561:1: ( rule__Feature__Group_6__0__Impl rule__Feature__Group_6__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1562:2: rule__Feature__Group_6__0__Impl rule__Feature__Group_6__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_6__0__Impl_in_rule__Feature__Group_6__03108);
            rule__Feature__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_6__1_in_rule__Feature__Group_6__03111);
            rule__Feature__Group_6__1();

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
    // $ANTLR end "rule__Feature__Group_6__0"


    // $ANTLR start "rule__Feature__Group_6__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1569:1: rule__Feature__Group_6__0__Impl : ( '<->' ) ;
    public final void rule__Feature__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1573:1: ( ( '<->' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1574:1: ( '<->' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1574:1: ( '<->' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1575:1: '<->'
            {
             before(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_6_0()); 
            match(input,23,FOLLOW_23_in_rule__Feature__Group_6__0__Impl3139); 
             after(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_6_0()); 

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
    // $ANTLR end "rule__Feature__Group_6__0__Impl"


    // $ANTLR start "rule__Feature__Group_6__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1588:1: rule__Feature__Group_6__1 : rule__Feature__Group_6__1__Impl ;
    public final void rule__Feature__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1592:1: ( rule__Feature__Group_6__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1593:2: rule__Feature__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_6__1__Impl_in_rule__Feature__Group_6__13170);
            rule__Feature__Group_6__1__Impl();

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
    // $ANTLR end "rule__Feature__Group_6__1"


    // $ANTLR start "rule__Feature__Group_6__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1599:1: rule__Feature__Group_6__1__Impl : ( ( rule__Feature__InverseAssignment_6_1 ) ) ;
    public final void rule__Feature__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1603:1: ( ( ( rule__Feature__InverseAssignment_6_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1604:1: ( ( rule__Feature__InverseAssignment_6_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1604:1: ( ( rule__Feature__InverseAssignment_6_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1605:1: ( rule__Feature__InverseAssignment_6_1 )
            {
             before(grammarAccess.getFeatureAccess().getInverseAssignment_6_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1606:1: ( rule__Feature__InverseAssignment_6_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1606:2: rule__Feature__InverseAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Feature__InverseAssignment_6_1_in_rule__Feature__Group_6__1__Impl3197);
            rule__Feature__InverseAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getInverseAssignment_6_1()); 

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
    // $ANTLR end "rule__Feature__Group_6__1__Impl"


    // $ANTLR start "rule__Primitive__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1621:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1625:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1626:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03232);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03235);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1633:1: rule__Primitive__Group__0__Impl : ( 'primitive type' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1637:1: ( ( 'primitive type' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1638:1: ( 'primitive type' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1638:1: ( 'primitive type' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1639:1: 'primitive type'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Primitive__Group__0__Impl3263); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1652:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1656:1: ( rule__Primitive__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1657:2: rule__Primitive__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13294);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1663:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1667:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1668:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1668:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1669:1: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1670:1: ( rule__Primitive__NameAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1670:2: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl3321);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1684:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1688:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1689:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__03355);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Any__Group__1_in_rule__Any__Group__03358);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1696:1: rule__Any__Group__0__Impl : ( 'any type' ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1700:1: ( ( 'any type' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1701:1: ( 'any type' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1701:1: ( 'any type' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1702:1: 'any type'
            {
             before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Any__Group__0__Impl3386); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1715:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1719:1: ( rule__Any__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1720:2: rule__Any__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__13417);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1726:1: rule__Any__Group__1__Impl : ( ( rule__Any__NameAssignment_1 ) ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1730:1: ( ( ( rule__Any__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1731:1: ( ( rule__Any__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1731:1: ( ( rule__Any__NameAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1732:1: ( rule__Any__NameAssignment_1 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1733:1: ( rule__Any__NameAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1733:2: rule__Any__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl3444);
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


    // $ANTLR start "rule__TypeRef__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1747:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1751:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1752:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__03478);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__03481);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1759:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1763:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1764:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1764:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1765:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1766:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1766:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl3508);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1776:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1780:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1781:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__13538);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1787:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1791:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1792:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1792:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1793:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1794:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1794:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl3565);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1808:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1812:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1813:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__03600);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__03603);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1820:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1824:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1825:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1825:1: ( ( '-' )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1826:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1827:1: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1828:2: '-'
                    {
                    match(input,26,FOLLOW_26_in_rule__EFloatObject__Group__0__Impl3632); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1839:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1843:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1844:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__13665);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__13668);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1851:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1855:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1856:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1856:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1857:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1858:1: ( RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1858:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl3696); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1868:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1872:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1873:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__23727);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__23730);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1880:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1884:1: ( ( '.' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1885:1: ( '.' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1885:1: ( '.' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1886:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__EFloatObject__Group__2__Impl3758); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1899:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1903:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1904:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__33789);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1910:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1914:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1915:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1915:1: ( RULE_INT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1916:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl3816); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1935:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1939:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1940:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03853);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03856);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1947:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1951:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1952:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1952:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1953:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3883); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1964:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1968:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1969:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13912);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1975:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1979:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1980:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1980:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1981:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1982:1: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1982:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3939);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1996:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2000:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2001:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03974);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03977);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2008:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2012:1: ( ( '.' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2013:1: ( '.' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2013:1: ( '.' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2014:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__QualifiedName__Group_1__0__Impl4005); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2027:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2031:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2032:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14036);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2038:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2042:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2043:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2043:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2044:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4063); 
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


    // $ANTLR start "rule__EntityModel__CurrentAssignment_0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2060:1: rule__EntityModel__CurrentAssignment_0 : ( ( 'current' ) ) ;
    public final void rule__EntityModel__CurrentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2064:1: ( ( ( 'current' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2065:1: ( ( 'current' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2065:1: ( ( 'current' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2066:1: ( 'current' )
            {
             before(grammarAccess.getEntityModelAccess().getCurrentCurrentKeyword_0_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2067:1: ( 'current' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2068:1: 'current'
            {
             before(grammarAccess.getEntityModelAccess().getCurrentCurrentKeyword_0_0()); 
            match(input,28,FOLLOW_28_in_rule__EntityModel__CurrentAssignment_04106); 
             after(grammarAccess.getEntityModelAccess().getCurrentCurrentKeyword_0_0()); 

            }

             after(grammarAccess.getEntityModelAccess().getCurrentCurrentKeyword_0_0()); 

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
    // $ANTLR end "rule__EntityModel__CurrentAssignment_0"


    // $ANTLR start "rule__EntityModel__ModuleAssignment_2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2083:1: rule__EntityModel__ModuleAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EntityModel__ModuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2087:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2088:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2088:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2089:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_2_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2090:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2091:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityModelAccess().getModuleModuleQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EntityModel__ModuleAssignment_24149);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityModelAccess().getModuleModuleQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_2_0()); 

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
    // $ANTLR end "rule__EntityModel__ModuleAssignment_2"


    // $ANTLR start "rule__EntityModel__VersionAssignment_4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2102:1: rule__EntityModel__VersionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EntityModel__VersionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2106:1: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2107:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2107:1: ( RULE_STRING )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2108:1: RULE_STRING
            {
             before(grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EntityModel__VersionAssignment_44184); 
             after(grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__EntityModel__VersionAssignment_4"


    // $ANTLR start "rule__EntityModel__EntitiesAssignment_5"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2117:1: rule__EntityModel__EntitiesAssignment_5 : ( ruleEntity ) ;
    public final void rule__EntityModel__EntitiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2121:1: ( ( ruleEntity ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2122:1: ( ruleEntity )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2122:1: ( ruleEntity )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2123:1: ruleEntity
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__EntityModel__EntitiesAssignment_54215);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__EntityModel__EntitiesAssignment_5"


    // $ANTLR start "rule__Entity__CommentAssignment_0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2132:1: rule__Entity__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Entity__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2136:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2137:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2137:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2138:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getEntityAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Entity__CommentAssignment_04246); 
             after(grammarAccess.getEntityAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Entity__CommentAssignment_0"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2147:1: rule__Entity__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2151:1: ( ( ruleAnnotation ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2152:1: ( ruleAnnotation )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2152:1: ( ruleAnnotation )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2153:1: ruleAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_14277);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__AnnotationsAssignment_1"


    // $ANTLR start "rule__Entity__IsAbstractAssignment_2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2162:1: rule__Entity__IsAbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__Entity__IsAbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2166:1: ( ( ( 'abstract' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2167:1: ( ( 'abstract' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2167:1: ( ( 'abstract' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2168:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_2_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2169:1: ( 'abstract' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2170:1: 'abstract'
            {
             before(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__Entity__IsAbstractAssignment_24313); 
             after(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_2_0()); 

            }

             after(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_2_0()); 

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
    // $ANTLR end "rule__Entity__IsAbstractAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2185:1: rule__Entity__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2189:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2190:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2190:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2191:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_44352); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_4"


    // $ANTLR start "rule__Entity__SuperAssignment_5_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2200:1: rule__Entity__SuperAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2204:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2205:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2205:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2206:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityCrossReference_5_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2207:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2208:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperEntityQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Entity__SuperAssignment_5_14387);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSuperEntityQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Entity__SuperAssignment_5_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_7"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2219:1: rule__Entity__FeaturesAssignment_7 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2223:1: ( ( ruleFeature ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2224:1: ( ruleFeature )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2224:1: ( ruleFeature )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2225:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_74422);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Entity__FeaturesAssignment_7"


    // $ANTLR start "rule__Annotation__OptionAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2234:1: rule__Annotation__OptionAssignment_1 : ( ruleConfigOption ) ;
    public final void rule__Annotation__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2238:1: ( ( ruleConfigOption ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2239:1: ( ruleConfigOption )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2239:1: ( ruleConfigOption )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2240:1: ruleConfigOption
            {
             before(grammarAccess.getAnnotationAccess().getOptionConfigOptionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConfigOption_in_rule__Annotation__OptionAssignment_14453);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2249:1: rule__Annotation__ValueAssignment_2_1 : ( ruleConfigValue ) ;
    public final void rule__Annotation__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2253:1: ( ( ruleConfigValue ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2254:1: ( ruleConfigValue )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2254:1: ( ruleConfigValue )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2255:1: ruleConfigValue
            {
             before(grammarAccess.getAnnotationAccess().getValueConfigValueEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConfigValue_in_rule__Annotation__ValueAssignment_2_14484);
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


    // $ANTLR start "rule__Feature__CommentAssignment_0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2264:1: rule__Feature__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Feature__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2268:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2269:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2269:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2270:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getFeatureAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Feature__CommentAssignment_04515); 
             after(grammarAccess.getFeatureAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Feature__CommentAssignment_0"


    // $ANTLR start "rule__Feature__IsIndexedAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2279:1: rule__Feature__IsIndexedAssignment_1 : ( ( 'indexed' ) ) ;
    public final void rule__Feature__IsIndexedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2283:1: ( ( ( 'indexed' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2284:1: ( ( 'indexed' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2284:1: ( ( 'indexed' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2285:1: ( 'indexed' )
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2286:1: ( 'indexed' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2287:1: 'indexed'
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Feature__IsIndexedAssignment_14551); 
             after(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_1_0()); 

            }

             after(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_1_0()); 

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
    // $ANTLR end "rule__Feature__IsIndexedAssignment_1"


    // $ANTLR start "rule__Feature__IsContainmentAssignment_2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2302:1: rule__Feature__IsContainmentAssignment_2 : ( ( '-[' ) ) ;
    public final void rule__Feature__IsContainmentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2306:1: ( ( ( '-[' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2307:1: ( ( '-[' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2307:1: ( ( '-[' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2308:1: ( '-[' )
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2309:1: ( '-[' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2310:1: '-['
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Feature__IsContainmentAssignment_24595); 
             after(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__Feature__IsContainmentAssignment_2"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2325:1: rule__Feature__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2329:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2330:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2330:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2331:1: ruleTypeRef
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_34634);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Feature__TypeAssignment_3"


    // $ANTLR start "rule__Feature__NameAssignment_4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2340:1: rule__Feature__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2344:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2345:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2345:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2346:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_44665); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_4"


    // $ANTLR start "rule__Feature__DefaultValueAssignment_5_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2355:1: rule__Feature__DefaultValueAssignment_5_1 : ( ruleValueObject ) ;
    public final void rule__Feature__DefaultValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2359:1: ( ( ruleValueObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2360:1: ( ruleValueObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2360:1: ( ruleValueObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2361:1: ruleValueObject
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_5_14696);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Feature__DefaultValueAssignment_5_1"


    // $ANTLR start "rule__Feature__InverseAssignment_6_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2370:1: rule__Feature__InverseAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Feature__InverseAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2374:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2375:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2375:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2376:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_6_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2377:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2378:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Feature__InverseAssignment_6_14731);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getInverseFeatureQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Feature__InverseAssignment_6_1"


    // $ANTLR start "rule__Primitive__NameAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2391:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2395:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2396:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2396:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2397:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_14768); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2406:1: rule__Any__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Any__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2410:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2411:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2411:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2412:1: RULE_ID
            {
             before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Any__NameAssignment_14799); 
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


    // $ANTLR start "rule__TypeRef__ReferencedAssignment_0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2421:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2425:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2426:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2426:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2427:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2428:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2429:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_04834);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2440:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2444:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2445:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2445:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2446:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2447:1: ( '[]' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2448:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__TypeRef__IsMultiAssignment_14874); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2463:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2467:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2468:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2468:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2469:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment4913);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2478:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2482:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2483:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2483:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2484:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment4944);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2493:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2497:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2498:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2498:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2499:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment4975);
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
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleConfigOption972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleConfigValue1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__0__Impl_in_rule__EntityModel__Group__01112 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__1_in_rule__EntityModel__Group__01115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__CurrentAssignment_0_in_rule__EntityModel__Group__0__Impl1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__1__Impl_in_rule__EntityModel__Group__11173 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__2_in_rule__EntityModel__Group__11176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EntityModel__Group__1__Impl1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__2__Impl_in_rule__EntityModel__Group__21235 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__3_in_rule__EntityModel__Group__21238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__ModuleAssignment_2_in_rule__EntityModel__Group__2__Impl1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__3__Impl_in_rule__EntityModel__Group__31295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__4_in_rule__EntityModel__Group__31298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EntityModel__Group__3__Impl1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__4__Impl_in_rule__EntityModel__Group__41357 = new BitSet(new long[]{0x0000000020110080L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__5_in_rule__EntityModel__Group__41360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__VersionAssignment_4_in_rule__EntityModel__Group__4__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__5__Impl_in_rule__EntityModel__Group__51417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__EntitiesAssignment_5_in_rule__EntityModel__Group__5__Impl1444 = new BitSet(new long[]{0x0000000020110082L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01487 = new BitSet(new long[]{0x0000000020110080L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__CommentAssignment_0_in_rule__Entity__Group__0__Impl1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11548 = new BitSet(new long[]{0x0000000020110080L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_1_in_rule__Entity__Group__1__Impl1578 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21609 = new BitSet(new long[]{0x0000000020110080L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__IsAbstractAssignment_2_in_rule__Entity__Group__2__Impl1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31670 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__3__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41732 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_4_in_rule__Entity__Group__4__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51792 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61853 = new BitSet(new long[]{0x00000000C00400C0L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__6__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71915 = new BitSet(new long[]{0x00000000C00400C0L});
    public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl1945 = new BitSet(new long[]{0x00000000C00000C2L});
    public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__8__Impl2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02053 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group_5__0__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperAssignment_5_1_in_rule__Entity__Group_5__1__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__02176 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__02179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Annotation__Group__0__Impl2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__12238 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__12241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__OptionAssignment_1_in_rule__Annotation__Group__1__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__22298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__02362 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__02365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Annotation__Group_2__0__Impl2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__12424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_2_1_in_rule__Annotation__Group_2__1__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02485 = new BitSet(new long[]{0x00000000C00000C0L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__CommentAssignment_0_in_rule__Feature__Group__0__Impl2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12546 = new BitSet(new long[]{0x00000000C00000C0L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsIndexedAssignment_1_in_rule__Feature__Group__1__Impl2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22607 = new BitSet(new long[]{0x00000000C00000C0L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__22610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsContainmentAssignment_2_in_rule__Feature__Group__2__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__32668 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__32671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__42728 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__42731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_4_in_rule__Feature__Group__4__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__52788 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__52791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__62849 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Feature__Group__7_in_rule__Feature__Group__62852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_6__0_in_rule__Feature__Group__6__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__7__Impl_in_rule__Feature__Group__72910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Feature__Group__7__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__02985 = new BitSet(new long[]{0x000000000C000030L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__02988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Feature__Group_5__0__Impl3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__13047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__DefaultValueAssignment_5_1_in_rule__Feature__Group_5__1__Impl3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_6__0__Impl_in_rule__Feature__Group_6__03108 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group_6__1_in_rule__Feature__Group_6__03111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Feature__Group_6__0__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_6__1__Impl_in_rule__Feature__Group_6__13170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__InverseAssignment_6_1_in_rule__Feature__Group_6__1__Impl3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03232 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Primitive__Group__0__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__03355 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__03358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Any__Group__0__Impl3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__13417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__03478 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__03481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__13538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__03600 = new BitSet(new long[]{0x000000000C000030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__03603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EFloatObject__Group__0__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__13665 = new BitSet(new long[]{0x000000000C000030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__13668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__23727 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__23730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EFloatObject__Group__2__Impl3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__33789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03853 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3939 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03974 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__QualifiedName__Group_1__0__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EntityModel__CurrentAssignment_04106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EntityModel__ModuleAssignment_24149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EntityModel__VersionAssignment_44184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__EntityModel__EntitiesAssignment_54215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Entity__CommentAssignment_04246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_14277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Entity__IsAbstractAssignment_24313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_44352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__SuperAssignment_5_14387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_74422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigOption_in_rule__Annotation__OptionAssignment_14453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigValue_in_rule__Annotation__ValueAssignment_2_14484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Feature__CommentAssignment_04515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Feature__IsIndexedAssignment_14551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Feature__IsContainmentAssignment_24595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_34634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_44665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_5_14696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Feature__InverseAssignment_6_14731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_14768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Any__NameAssignment_14799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_04834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TypeRef__IsMultiAssignment_14874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment4975 = new BitSet(new long[]{0x0000000000000002L});

}