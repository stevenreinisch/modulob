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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOC_COMMENT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interfaces for module'", "'version'", "'interface'", "'requires'", "','", "'{'", "'}'", "'static'", "';'", "':'", "'primitive type'", "'any type'", "'[]'", "'-'", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=5;
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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:76:1: ruleInterfaceModel returns [EObject current=null] : (otherlv_0= 'interfaces for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_interfaces_4_0= ruleInterface ) )* ) ;
    public final EObject ruleInterfaceModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        EObject lv_interfaces_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:79:28: ( (otherlv_0= 'interfaces for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_interfaces_4_0= ruleInterface ) )* ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:80:1: (otherlv_0= 'interfaces for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_interfaces_4_0= ruleInterface ) )* )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:80:1: (otherlv_0= 'interfaces for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_interfaces_4_0= ruleInterface ) )* )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:80:3: otherlv_0= 'interfaces for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_interfaces_4_0= ruleInterface ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleInterfaceModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceModelAccess().getInterfacesForModuleKeyword_0());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:84:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:85:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:85:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:86:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceModelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInterfaceModelAccess().getModuleModuleCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterfaceModel145);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleInterfaceModel157); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceModelAccess().getVersionKeyword_2());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:103:1: ( (lv_version_3_0= RULE_STRING ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:104:1: (lv_version_3_0= RULE_STRING )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:104:1: (lv_version_3_0= RULE_STRING )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:105:3: lv_version_3_0= RULE_STRING
            {
            lv_version_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterfaceModel174); 

            			newLeafNode(lv_version_3_0, grammarAccess.getInterfaceModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:121:2: ( (lv_interfaces_4_0= ruleInterface ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_DOC_COMMENT||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:122:1: (lv_interfaces_4_0= ruleInterface )
            	    {
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:122:1: (lv_interfaces_4_0= ruleInterface )
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:123:3: lv_interfaces_4_0= ruleInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceModelAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterface_in_ruleInterfaceModel200);
            	    lv_interfaces_4_0=ruleInterface();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interfaces",
            	            		lv_interfaces_4_0, 
            	            		"Interface");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:147:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:148:2: (iv_ruleInterface= ruleInterface EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:149:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface237);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface247); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:156:1: ruleInterface returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_methods_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:159:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:160:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:160:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:160:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_methods_8_0= ruleMethod ) )* otherlv_9= '}'
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:160:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOC_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:161:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:161:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:162:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleInterface289); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleInterface307); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:182:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:183:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:183:1: (lv_name_2_0= RULE_ID )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:184:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface324); 

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

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:200:2: (otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:200:4: otherlv_3= 'requires' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleInterface342); 

                        	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getRequiresKeyword_3_0());
                        
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:204:1: ( ( ruleQualifiedName ) )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:205:1: ( ruleQualifiedName )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:205:1: ( ruleQualifiedName )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:206:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterface365);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:219:2: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:219:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleInterface378); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:223:1: ( ( ruleQualifiedName ) )
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:224:1: ( ruleQualifiedName )
                    	    {
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:224:1: ( ruleQualifiedName )
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:225:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterface401);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleInterface417); 

                	newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:242:1: ( (lv_methods_8_0= ruleMethod ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_DOC_COMMENT && LA5_0<=RULE_ID)||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:243:1: (lv_methods_8_0= ruleMethod )
            	    {
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:243:1: (lv_methods_8_0= ruleMethod )
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:244:3: lv_methods_8_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleInterface438);
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
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleInterface451); 

                	newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:272:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:273:2: (iv_ruleMethod= ruleMethod EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:274:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod487);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod497); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:281:1: ruleMethod returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameter ) )* (otherlv_5= ';' )? ) ;
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
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:284:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameter ) )* (otherlv_5= ';' )? ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:285:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameter ) )* (otherlv_5= ';' )? )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:285:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameter ) )* (otherlv_5= ';' )? )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:285:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_parameters_4_0= ruleParameter ) )* (otherlv_5= ';' )?
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:285:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOC_COMMENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:286:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:286:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:287:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleMethod539); 

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

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:303:3: ( (lv_isStatic_1_0= 'static' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:304:1: (lv_isStatic_1_0= 'static' )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:304:1: (lv_isStatic_1_0= 'static' )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:305:3: lv_isStatic_1_0= 'static'
                    {
                    lv_isStatic_1_0=(Token)match(input,19,FOLLOW_19_in_ruleMethod563); 

                            newLeafNode(lv_isStatic_1_0, grammarAccess.getMethodAccess().getIsStaticStaticKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(current, "isStatic", true, "static");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:318:3: ( (lv_type_2_0= ruleTypeRef ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:319:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:319:1: (lv_type_2_0= ruleTypeRef )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:320:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getMethodAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleMethod598);
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

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:336:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:337:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:337:1: (lv_name_3_0= RULE_ID )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:338:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod615); 

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

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:354:2: ( (lv_parameters_4_0= ruleParameter ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==21) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:355:1: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:355:1: (lv_parameters_4_0= ruleParameter )
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:356:3: lv_parameters_4_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod641);
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
            	    break loop8;
                }
            } while (true);

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:372:3: (otherlv_5= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:372:5: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleMethod655); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:384:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:385:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:386:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter693);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter703); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:393:1: ruleParameter returns [EObject current=null] : ( ( (lv_signaturePart_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_signaturePart_0_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:396:28: ( ( ( (lv_signaturePart_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:397:1: ( ( (lv_signaturePart_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:397:1: ( ( (lv_signaturePart_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:397:2: ( (lv_signaturePart_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:397:2: ( (lv_signaturePart_0_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:398:1: (lv_signaturePart_0_0= RULE_ID )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:398:1: (lv_signaturePart_0_0= RULE_ID )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:399:3: lv_signaturePart_0_0= RULE_ID
                    {
                    lv_signaturePart_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter745); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleParameter763); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:419:1: ( (lv_type_2_0= ruleTypeRef ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:420:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:420:1: (lv_type_2_0= ruleTypeRef )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:421:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleParameter784);
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

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:437:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:438:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:438:1: (lv_name_3_0= RULE_ID )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:439:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter801); 

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


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:465:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:466:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:467:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive844);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive854); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:474:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:477:28: ( (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:478:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:478:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:478:3: otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulePrimitive891); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:482:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:483:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:483:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:484:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive908); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:508:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:509:2: (iv_ruleAny= ruleAny EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:510:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny949);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny959); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:517:1: ruleAny returns [EObject current=null] : (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:520:28: ( (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:521:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:521:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:521:3: otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAny996); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:525:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:526:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:526:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:527:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAny1013); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:551:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:552:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:553:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef1054);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef1064); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:560:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isMulti_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:563:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:564:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:564:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:564:2: ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )?
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:564:2: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:565:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:565:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:566:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef1112);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:579:2: ( (lv_isMulti_1_0= '[]' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:580:1: (lv_isMulti_1_0= '[]' )
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:580:1: (lv_isMulti_1_0= '[]' )
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:581:3: lv_isMulti_1_0= '[]'
                    {
                    lv_isMulti_1_0=(Token)match(input,24,FOLLOW_24_in_ruleTypeRef1130); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:604:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:605:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:606:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1182);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1192); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:613:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:616:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:617:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:617:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:618:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:618:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:619:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue1237);
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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:643:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:644:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:645:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject1273);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject1284); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:652:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:655:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:656:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject1323); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:671:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:672:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:673:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1367);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1377); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:680:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:683:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:684:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:684:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:685:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:685:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:686:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1422);
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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:710:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:711:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:712:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1458);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject1469); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:719:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:722:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:723:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject1508); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:738:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:739:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:740:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1552);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1562); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:747:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:750:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:751:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:751:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:752:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:752:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:753:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1607);
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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:777:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:778:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:779:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1643);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1654); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:786:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:789:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:790:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:790:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:790:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:790:2: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:791:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleEFloatObject1693); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:796:3: (this_INT_1= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:796:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1711); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,26,FOLLOW_26_in_ruleEFloatObject1731); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1746); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:824:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:825:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:826:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1792);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1803); 

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
    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:833:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:836:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:837:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:837:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:837:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1843); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:844:1: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:845:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_ruleQualifiedName1862); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1877); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
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
    public static final BitSet FOLLOW_12_in_ruleInterfaceModel122 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceModel145 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInterfaceModel157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterfaceModel174 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleInterfaceModel200 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleInterface289 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface307 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface324 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleInterface342 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterface365 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleInterface378 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterface401 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleInterface417 = new BitSet(new long[]{0x00000000000C0060L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleInterface438 = new BitSet(new long[]{0x00000000000C0060L});
    public static final BitSet FOLLOW_18_in_ruleInterface451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleMethod539 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_19_in_ruleMethod563 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleMethod598 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod615 = new BitSet(new long[]{0x0000000000300042L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod641 = new BitSet(new long[]{0x0000000000300042L});
    public static final BitSet FOLLOW_20_in_ruleMethod655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter745 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleParameter763 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleParameter784 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePrimitive891 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAny996 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef1054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef1112 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleTypeRef1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEFloatObject1693 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1711 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEFloatObject1731 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1843 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQualifiedName1862 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1877 = new BitSet(new long[]{0x0000000004000002L});

}