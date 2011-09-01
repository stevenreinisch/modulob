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
import de.dubmas.modulob.services.SystemDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSystemDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'consistsOf'", "','", "'module'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
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


        public InternalSystemDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSystemDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSystemDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g"; }


     
     	private SystemDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SystemDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSystem"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:60:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:61:1: ( ruleSystem EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:62:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem61);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem68); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:69:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:73:2: ( ( ( rule__System__Group__0 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:74:1: ( ( rule__System__Group__0 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:74:1: ( ( rule__System__Group__0 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:75:1: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:76:1: ( rule__System__Group__0 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:76:2: rule__System__Group__0
            {
            pushFollow(FOLLOW_rule__System__Group__0_in_ruleSystem94);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleModule"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:88:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:89:1: ( ruleModule EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:90:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule121);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule128); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:97:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:101:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:102:1: ( ( rule__Module__Group__0 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:102:1: ( ( rule__Module__Group__0 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:103:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:104:1: ( rule__Module__Group__0 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:104:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule154);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "rule__System__Group__0"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:118:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:122:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:123:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__0188);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__0191);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:130:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:134:1: ( ( 'system' ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:135:1: ( 'system' )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:135:1: ( 'system' )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:136:1: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__System__Group__0__Impl219); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:149:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:153:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:154:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__1250);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__1253);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:161:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:165:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:166:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:166:1: ( ( rule__System__NameAssignment_1 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:167:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:168:1: ( rule__System__NameAssignment_1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:168:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl280);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:178:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:182:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:183:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__2310);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__2313);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:190:1: rule__System__Group__2__Impl : ( 'consistsOf' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:194:1: ( ( 'consistsOf' ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:195:1: ( 'consistsOf' )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:195:1: ( 'consistsOf' )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:196:1: 'consistsOf'
            {
             before(grammarAccess.getSystemAccess().getConsistsOfKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__System__Group__2__Impl341); 
             after(grammarAccess.getSystemAccess().getConsistsOfKeyword_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:209:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:213:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:214:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__3372);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__3375);
            rule__System__Group__4();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:221:1: rule__System__Group__3__Impl : ( ( rule__System__ModulesAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:225:1: ( ( ( rule__System__ModulesAssignment_3 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:226:1: ( ( rule__System__ModulesAssignment_3 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:226:1: ( ( rule__System__ModulesAssignment_3 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:227:1: ( rule__System__ModulesAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getModulesAssignment_3()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:228:1: ( rule__System__ModulesAssignment_3 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:228:2: rule__System__ModulesAssignment_3
            {
            pushFollow(FOLLOW_rule__System__ModulesAssignment_3_in_rule__System__Group__3__Impl402);
            rule__System__ModulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getModulesAssignment_3()); 

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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:238:1: rule__System__Group__4 : rule__System__Group__4__Impl ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:242:1: ( rule__System__Group__4__Impl )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:243:2: rule__System__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__4432);
            rule__System__Group__4__Impl();

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:249:1: rule__System__Group__4__Impl : ( ( rule__System__Group_4__0 )* ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:253:1: ( ( ( rule__System__Group_4__0 )* ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:254:1: ( ( rule__System__Group_4__0 )* )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:254:1: ( ( rule__System__Group_4__0 )* )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:255:1: ( rule__System__Group_4__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_4()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:256:1: ( rule__System__Group_4__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:256:2: rule__System__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__System__Group_4__0_in_rule__System__Group__4__Impl459);
            	    rule__System__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_4()); 

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
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group_4__0"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:276:1: rule__System__Group_4__0 : rule__System__Group_4__0__Impl rule__System__Group_4__1 ;
    public final void rule__System__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:280:1: ( rule__System__Group_4__0__Impl rule__System__Group_4__1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:281:2: rule__System__Group_4__0__Impl rule__System__Group_4__1
            {
            pushFollow(FOLLOW_rule__System__Group_4__0__Impl_in_rule__System__Group_4__0500);
            rule__System__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group_4__1_in_rule__System__Group_4__0503);
            rule__System__Group_4__1();

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
    // $ANTLR end "rule__System__Group_4__0"


    // $ANTLR start "rule__System__Group_4__0__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:288:1: rule__System__Group_4__0__Impl : ( ',' ) ;
    public final void rule__System__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:292:1: ( ( ',' ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:293:1: ( ',' )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:293:1: ( ',' )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:294:1: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__System__Group_4__0__Impl531); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__System__Group_4__0__Impl"


    // $ANTLR start "rule__System__Group_4__1"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:307:1: rule__System__Group_4__1 : rule__System__Group_4__1__Impl ;
    public final void rule__System__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:311:1: ( rule__System__Group_4__1__Impl )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:312:2: rule__System__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__System__Group_4__1__Impl_in_rule__System__Group_4__1562);
            rule__System__Group_4__1__Impl();

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
    // $ANTLR end "rule__System__Group_4__1"


    // $ANTLR start "rule__System__Group_4__1__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:318:1: rule__System__Group_4__1__Impl : ( ( rule__System__ModulesAssignment_4_1 ) ) ;
    public final void rule__System__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:322:1: ( ( ( rule__System__ModulesAssignment_4_1 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:323:1: ( ( rule__System__ModulesAssignment_4_1 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:323:1: ( ( rule__System__ModulesAssignment_4_1 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:324:1: ( rule__System__ModulesAssignment_4_1 )
            {
             before(grammarAccess.getSystemAccess().getModulesAssignment_4_1()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:325:1: ( rule__System__ModulesAssignment_4_1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:325:2: rule__System__ModulesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__System__ModulesAssignment_4_1_in_rule__System__Group_4__1__Impl589);
            rule__System__ModulesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getModulesAssignment_4_1()); 

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
    // $ANTLR end "rule__System__Group_4__1__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:339:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:343:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:344:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0623);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0626);
            rule__Module__Group__1();

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
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:351:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:355:1: ( ( 'module' ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:356:1: ( 'module' )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:356:1: ( 'module' )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:357:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Module__Group__0__Impl654); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 

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
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:370:1: rule__Module__Group__1 : rule__Module__Group__1__Impl ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:374:1: ( rule__Module__Group__1__Impl )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:375:2: rule__Module__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1685);
            rule__Module__Group__1__Impl();

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
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:381:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:385:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:386:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:386:1: ( ( rule__Module__NameAssignment_1 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:387:1: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:388:1: ( rule__Module__NameAssignment_1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:388:2: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl712);
            rule__Module__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__System__NameAssignment_1"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:403:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:407:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:408:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:408:1: ( RULE_ID )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:409:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_1751); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__ModulesAssignment_3"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:418:1: rule__System__ModulesAssignment_3 : ( ruleModule ) ;
    public final void rule__System__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:422:1: ( ( ruleModule ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:423:1: ( ruleModule )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:423:1: ( ruleModule )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:424:1: ruleModule
            {
             before(grammarAccess.getSystemAccess().getModulesModuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__System__ModulesAssignment_3782);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getModulesModuleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__System__ModulesAssignment_3"


    // $ANTLR start "rule__System__ModulesAssignment_4_1"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:433:1: rule__System__ModulesAssignment_4_1 : ( ruleModule ) ;
    public final void rule__System__ModulesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:437:1: ( ( ruleModule ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:438:1: ( ruleModule )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:438:1: ( ruleModule )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:439:1: ruleModule
            {
             before(grammarAccess.getSystemAccess().getModulesModuleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__System__ModulesAssignment_4_1813);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getModulesModuleParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__System__ModulesAssignment_4_1"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:448:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:452:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:453:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:453:1: ( RULE_ID )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:454:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_1844); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Module__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__0188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__0191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__System__Group__0__Impl219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__1250 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__2310 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__System__Group__2__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__3372 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ModulesAssignment_3_in_rule__System__Group__3__Impl402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_4__0_in_rule__System__Group__4__Impl459 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__System__Group_4__0__Impl_in_rule__System__Group_4__0500 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__System__Group_4__1_in_rule__System__Group_4__0503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__System__Group_4__0__Impl531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_4__1__Impl_in_rule__System__Group_4__1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ModulesAssignment_4_1_in_rule__System__Group_4__1__Impl589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Module__Group__0__Impl654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__System__ModulesAssignment_3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__System__ModulesAssignment_4_1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_1844 = new BitSet(new long[]{0x0000000000000002L});

}