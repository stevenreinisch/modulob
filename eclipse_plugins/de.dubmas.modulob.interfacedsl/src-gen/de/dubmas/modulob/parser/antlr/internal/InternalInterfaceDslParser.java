package de.dubmas.modulob.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dubmas.modulob.services.InterfaceDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInterfaceDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOC_COMMENT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'current'", "'interfaces for module'", "'version'", "'interface'", "'requires'", "','", "'{'", "'}'", "'static'", "';'", "':'", "'delegate'", "'primitive type'", "'any type'", "'[]'", "'-'", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=5;
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
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalInterfaceDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInterfaceDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInterfaceDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g"; }



     	private InterfaceDslGrammarAccess grammarAccess;
     	
        public InternalInterfaceDslParser(TokenStream input, InterfaceDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "InterfaceModel";	
       	}
       	
       	@Override
       	protected InterfaceDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleInterfaceModel"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:67:1: entryRuleInterfaceModel returns [EObject current=null] : iv_ruleInterfaceModel= ruleInterfaceModel EOF ;
    public final EObject entryRuleInterfaceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceModel = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:68:2: (iv_ruleInterfaceModel= ruleInterfaceModel EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:69:2: iv_ruleInterfaceModel= ruleInterfaceModel EOF
            {
             newCompositeNode(grammarAccess.getInterfaceModelRule()); 
            pushFollow(FOLLOW_ruleInterfaceModel_in_entryRuleInterfaceModel75);
            iv_ruleInterfaceModel=ruleInterfaceModel();

            state._fsp--;

             current =iv_ruleInterfaceModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceModel"


    // $ANTLR start "ruleInterfaceModel"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:76:1: ruleInterfaceModel returns [EObject current=null] : ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'interfaces for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_interfaces_5_0= ruleInterface ) )* ) ;
    public final EObject ruleInterfaceModel() throws RecognitionException {
        EObject current = null;

        Token lv_current_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        EObject lv_interfaces_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:79:28: ( ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'interfaces for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_interfaces_5_0= ruleInterface ) )* ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:80:1: ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'interfaces for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_interfaces_5_0= ruleInterface ) )* )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:80:1: ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'interfaces for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_interfaces_5_0= ruleInterface ) )* )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:80:2: ( (lv_current_0_0= 'current' ) )? otherlv_1= 'interfaces for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_interfaces_5_0= ruleInterface ) )*
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:80:2: ( (lv_current_0_0= 'current' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:81:1: (lv_current_0_0= 'current' )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:81:1: (lv_current_0_0= 'current' )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:82:3: lv_current_0_0= 'current'
                    {
                    lv_current_0_0=(Token)match(input,12,FOLLOW_12_in_ruleInterfaceModel128); 

                            newLeafNode(lv_current_0_0, grammarAccess.getInterfaceModelAccess().getCurrentCurrentKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceModelRule());
                    	        }
                           		setWithLastConsumed(current, "current", true, "current");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleInterfaceModel154); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfaceModelAccess().getInterfacesForModuleKeyword_1());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:99:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:100:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:100:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:101:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceModelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInterfaceModelAccess().getModuleModuleCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterfaceModel177);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleInterfaceModel189); 

                	newLeafNode(otherlv_3, grammarAccess.getInterfaceModelAccess().getVersionKeyword_3());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:118:1: ( (lv_version_4_0= RULE_STRING ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:119:1: (lv_version_4_0= RULE_STRING )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:119:1: (lv_version_4_0= RULE_STRING )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:120:3: lv_version_4_0= RULE_STRING
            {
            lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterfaceModel206); 

            			newLeafNode(lv_version_4_0, grammarAccess.getInterfaceModelAccess().getVersionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:136:2: ( (lv_interfaces_5_0= ruleInterface ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DOC_COMMENT||LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:137:1: (lv_interfaces_5_0= ruleInterface )
            	    {
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:137:1: (lv_interfaces_5_0= ruleInterface )
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:138:3: lv_interfaces_5_0= ruleInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceModelAccess().getInterfacesInterfaceParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterface_in_ruleInterfaceModel232);
            	    lv_interfaces_5_0=ruleInterface();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interfaces",
            	            		lv_interfaces_5_0, 
            	            		"Interface");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceModel"


    // $ANTLR start "entryRuleInterface"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:162:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:163:2: (iv_ruleInterface= ruleInterface EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:164:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface269);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface279); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:171:1: ruleInterface returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* ( (lv_delegates_9_0= ruleDelegate ) )* otherlv_10= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_methods_8_0 = null;

        EObject lv_delegates_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:174:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* ( (lv_delegates_9_0= ruleDelegate ) )* otherlv_10= '}' ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:175:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* ( (lv_delegates_9_0= ruleDelegate ) )* otherlv_10= '}' )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:175:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* ( (lv_delegates_9_0= ruleDelegate ) )* otherlv_10= '}' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:175:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* ( (lv_delegates_9_0= ruleDelegate ) )* otherlv_10= '}'
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:175:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DOC_COMMENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:176:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:176:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:177:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleInterface321); 

                    			newLeafNode(lv_comment_0_0, grammarAccess.getInterfaceAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_0_0, 
                            		"DOC_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleInterface339); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:197:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:198:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:198:1: (lv_name_2_0= RULE_ID )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:199:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface356); 

            			newLeafNode(lv_name_2_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:215:2: (otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:215:4: otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleInterface374); 

                        	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getRequiresKeyword_3_0());
                        
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:219:1: ( ( ruleQualifiedName ) )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:220:1: ( ruleQualifiedName )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:220:1: ( ruleQualifiedName )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:221:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterface397);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:234:2: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:234:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleInterface410); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:238:1: ( ( ruleQualifiedName ) )
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:239:1: ( ruleQualifiedName )
                    	    {
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:239:1: ( ruleQualifiedName )
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:240:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterface433);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleInterface449); 

                	newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:257:1: ( (lv_methods_8_0= ruleMethod ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_DOC_COMMENT && LA6_0<=RULE_ID)||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:258:1: (lv_methods_8_0= ruleMethod )
            	    {
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:258:1: (lv_methods_8_0= ruleMethod )
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:259:3: lv_methods_8_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleInterface470);
            	    lv_methods_8_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_8_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:275:3: ( (lv_delegates_9_0= ruleDelegate ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:276:1: (lv_delegates_9_0= ruleDelegate )
            	    {
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:276:1: (lv_delegates_9_0= ruleDelegate )
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:277:3: lv_delegates_9_0= ruleDelegate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getDelegatesDelegateParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDelegate_in_ruleInterface492);
            	    lv_delegates_9_0=ruleDelegate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"delegates",
            	            		lv_delegates_9_0, 
            	            		"Delegate");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleInterface505); 

                	newLeafNode(otherlv_10, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMethod"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:305:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:306:2: (iv_ruleMethod= ruleMethod EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:307:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod541);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod551); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:314:1: ruleMethod returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameter ) )* (otherlv_5= ';' )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token lv_isStatic_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        EObject lv_type_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:317:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameter ) )* (otherlv_5= ';' )? ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:318:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameter ) )* (otherlv_5= ';' )? )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:318:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameter ) )* (otherlv_5= ';' )? )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:318:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameter ) )* (otherlv_5= ';' )?
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:318:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DOC_COMMENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:319:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:319:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:320:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleMethod593); 

                    			newLeafNode(lv_comment_0_0, grammarAccess.getMethodAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_0_0, 
                            		"DOC_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:336:3: ( (lv_isStatic_1_0= 'static' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:337:1: (lv_isStatic_1_0= 'static' )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:337:1: (lv_isStatic_1_0= 'static' )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:338:3: lv_isStatic_1_0= 'static'
                    {
                    lv_isStatic_1_0=(Token)match(input,20,FOLLOW_20_in_ruleMethod617); 

                            newLeafNode(lv_isStatic_1_0, grammarAccess.getMethodAccess().getIsStaticStaticKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(current, "isStatic", true, "static");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:351:3: ( (lv_type_2_0= ruleTypeRef ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:352:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:352:1: (lv_type_2_0= ruleTypeRef )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:353:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getMethodAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleMethod652);
            lv_type_2_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:369:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:370:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:370:1: (lv_name_3_0= RULE_ID )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:371:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod669); 

            			newLeafNode(lv_name_3_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:387:2: ( (lv_parameters_4_0= ruleParameter ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==22) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:388:1: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:388:1: (lv_parameters_4_0= ruleParameter )
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:389:3: lv_parameters_4_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod695);
            	    lv_parameters_4_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_4_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:405:3: (otherlv_5= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:405:5: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleMethod709); 

                        	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getSemicolonKeyword_5());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:417:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:418:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:419:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter747);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter757); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:426:1: ruleParameter returns [EObject current=null] : ( ( (lv_signaturePart_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_signaturePart_0_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:429:28: ( ( ( (lv_signaturePart_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:430:1: ( ( (lv_signaturePart_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:430:1: ( ( (lv_signaturePart_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:430:2: ( (lv_signaturePart_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:430:2: ( (lv_signaturePart_0_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:431:1: (lv_signaturePart_0_0= RULE_ID )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:431:1: (lv_signaturePart_0_0= RULE_ID )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:432:3: lv_signaturePart_0_0= RULE_ID
                    {
                    lv_signaturePart_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter799); 

                    			newLeafNode(lv_signaturePart_0_0, grammarAccess.getParameterAccess().getSignaturePartIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"signaturePart",
                            		lv_signaturePart_0_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleParameter817); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:452:1: ( (lv_type_2_0= ruleTypeRef ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:453:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:453:1: (lv_type_2_0= ruleTypeRef )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:454:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleParameter838);
            lv_type_2_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:470:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:471:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:471:1: (lv_name_3_0= RULE_ID )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:472:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter855); 

            			newLeafNode(lv_name_3_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleDelegate"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:496:1: entryRuleDelegate returns [EObject current=null] : iv_ruleDelegate= ruleDelegate EOF ;
    public final EObject entryRuleDelegate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegate = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:497:2: (iv_ruleDelegate= ruleDelegate EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:498:2: iv_ruleDelegate= ruleDelegate EOF
            {
             newCompositeNode(grammarAccess.getDelegateRule()); 
            pushFollow(FOLLOW_ruleDelegate_in_entryRuleDelegate896);
            iv_ruleDelegate=ruleDelegate();

            state._fsp--;

             current =iv_ruleDelegate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelegate906); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelegate"


    // $ANTLR start "ruleDelegate"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:505:1: ruleDelegate returns [EObject current=null] : (otherlv_0= 'delegate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}' ) ;
    public final EObject ruleDelegate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_methods_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:508:28: ( (otherlv_0= 'delegate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}' ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:509:1: (otherlv_0= 'delegate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}' )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:509:1: (otherlv_0= 'delegate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:509:3: otherlv_0= 'delegate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMethod ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDelegate943); 

                	newLeafNode(otherlv_0, grammarAccess.getDelegateAccess().getDelegateKeyword_0());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:513:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:514:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:514:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:515:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegate960); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDelegateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDelegateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDelegate977); 

                	newLeafNode(otherlv_2, grammarAccess.getDelegateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:535:1: ( (lv_methods_3_0= ruleMethod ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_DOC_COMMENT && LA13_0<=RULE_ID)||LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:536:1: (lv_methods_3_0= ruleMethod )
            	    {
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:536:1: (lv_methods_3_0= ruleMethod )
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:537:3: lv_methods_3_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDelegateAccess().getMethodsMethodParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleDelegate998);
            	    lv_methods_3_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDelegateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_3_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleDelegate1011); 

                	newLeafNode(otherlv_4, grammarAccess.getDelegateAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelegate"


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:567:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:568:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:569:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive1049);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive1059); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:576:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:579:28: ( (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:580:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:580:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:580:3: otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulePrimitive1096); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:584:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:585:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:585:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:586:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive1113); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleAny"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:610:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:611:2: (iv_ruleAny= ruleAny EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:612:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny1154);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny1164); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:619:1: ruleAny returns [EObject current=null] : (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:622:28: ( (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:623:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:623:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:623:3: otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleAny1201); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:627:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:628:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:628:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:629:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAny1218); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleTypeRef"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:653:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:654:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:655:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef1259);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef1269); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:662:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isMulti_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:665:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:666:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:666:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:666:2: ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )?
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:666:2: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:667:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:667:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:668:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef1317);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:681:2: ( (lv_isMulti_1_0= '[]' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:682:1: (lv_isMulti_1_0= '[]' )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:682:1: (lv_isMulti_1_0= '[]' )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:683:3: lv_isMulti_1_0= '[]'
                    {
                    lv_isMulti_1_0=(Token)match(input,26,FOLLOW_26_in_ruleTypeRef1335); 

                            newLeafNode(lv_isMulti_1_0, grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRefRule());
                    	        }
                           		setWithLastConsumed(current, "isMulti", true, "[]");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleStringValue"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:706:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:707:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:708:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1387);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1397); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:715:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:718:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:719:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:719:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:720:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:720:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:721:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue1442);
            lv_value_0_0=ruleEStringObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EStringObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleEStringObject"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:745:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:746:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:747:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject1478);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject1489); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringObject"


    // $ANTLR start "ruleEStringObject"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:754:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:757:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:758:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject1528); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEStringObject"


    // $ANTLR start "entryRuleIntegerValue"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:773:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:774:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:775:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1572);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1582); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:782:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:785:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:786:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:786:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:787:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:787:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:788:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1627);
            lv_value_0_0=ruleEIntegerObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EIntegerObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleEIntegerObject"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:812:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:813:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:814:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1663);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject1674); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:821:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:824:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:825:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject1713); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:840:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:841:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:842:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1757);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1767); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:849:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:852:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:853:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:853:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:854:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:854:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:855:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1812);
            lv_value_0_0=ruleEFloatObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFloatValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EFloatObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleEFloatObject"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:879:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:880:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:881:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1848);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1859); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloatObject"


    // $ANTLR start "ruleEFloatObject"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:888:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:891:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:892:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:892:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:892:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:892:2: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:893:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleEFloatObject1898); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:898:3: (this_INT_1= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:898:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1916); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,28,FOLLOW_28_in_ruleEFloatObject1936); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1951); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloatObject"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:926:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:927:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:928:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1997);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2008); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:935:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:938:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:939:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:939:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:939:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2048); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:946:1: (kw= '.' this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:947:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleQualifiedName2067); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2082); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleInterfaceModel_in_entryRuleInterfaceModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleInterfaceModel128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInterfaceModel154 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceModel177 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterfaceModel189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterfaceModel206 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleInterfaceModel232 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleInterface321 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface339 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface356 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_ruleInterface374 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterface397 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleInterface410 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterface433 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleInterface449 = new BitSet(new long[]{0x0000000000980060L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleInterface470 = new BitSet(new long[]{0x0000000000980060L});
    public static final BitSet FOLLOW_ruleDelegate_in_ruleInterface492 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_19_in_ruleInterface505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleMethod593 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_20_in_ruleMethod617 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleMethod652 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod669 = new BitSet(new long[]{0x0000000000600042L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod695 = new BitSet(new long[]{0x0000000000600042L});
    public static final BitSet FOLLOW_21_in_ruleMethod709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter799 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleParameter817 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleParameter838 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegate_in_entryRuleDelegate896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelegate906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDelegate943 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegate960 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDelegate977 = new BitSet(new long[]{0x0000000000180060L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleDelegate998 = new BitSet(new long[]{0x0000000000180060L});
    public static final BitSet FOLLOW_19_in_ruleDelegate1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive1049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrimitive1096 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny1154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAny1201 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef1259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef1317 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleTypeRef1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject1478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEFloatObject1898 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1916 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEFloatObject1936 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2048 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleQualifiedName2067 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2082 = new BitSet(new long[]{0x0000000010000002L});

}