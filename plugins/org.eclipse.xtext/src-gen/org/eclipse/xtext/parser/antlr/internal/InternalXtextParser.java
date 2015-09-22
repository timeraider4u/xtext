package org.eclipse.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.services.XtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
 * @since 2.9
 */
public class InternalXtextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grammar'", "'with'", "','", "'hidden'", "'('", "')'", "'.'", "'generate'", "'as'", "'import'", "'fragment'", "'*'", "'returns'", "':'", "';'", "'initRuleAction'", "'{'", "'}'", "'afterRuleAction'", "'<'", "'>'", "'::'", "'|'", "'&'", "'preAction{'", "'?'", "'postAction{'", "'+'", "'='", "'+='", "'current'", "'true'", "'false'", "'!'", "'=>'", "'->'", "'?='", "'['", "']'", "'terminal'", "'EOF'", "'..'", "'enum'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalXtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXtextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXtext.g"; }



     	private XtextGrammarAccess grammarAccess;
     	
        public InternalXtextParser(TokenStream input, XtextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Grammar";	
       	}
       	
       	@Override
       	protected XtextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGrammar"
    // InternalXtext.g:68:1: entryRuleGrammar returns [EObject current=null] : iv_ruleGrammar= ruleGrammar EOF ;
    public final EObject entryRuleGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammar = null;


        try {
            // InternalXtext.g:69:2: (iv_ruleGrammar= ruleGrammar EOF )
            // InternalXtext.g:70:2: iv_ruleGrammar= ruleGrammar EOF
            {
             newCompositeNode(grammarAccess.getGrammarRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGrammar=ruleGrammar();

            state._fsp--;

             current =iv_ruleGrammar; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // InternalXtext.g:77:1: ruleGrammar returns [EObject current=null] : (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ ) ;
    public final EObject ruleGrammar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_definesHiddenTokens_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_metamodelDeclarations_12_0 = null;

        EObject lv_rules_13_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:83:7: ( (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ ) )
            // InternalXtext.g:85:1: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ )
            {
            // InternalXtext.g:85:1: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ )
            // InternalXtext.g:86:2: otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getGrammarAccess().getGrammarKeyword_0());
                
            // InternalXtext.g:93:1: ( (lv_name_1_0= ruleGrammarID ) )
            // InternalXtext.g:94:1: (lv_name_1_0= ruleGrammarID )
            {
            // InternalXtext.g:94:1: (lv_name_1_0= ruleGrammarID )
            // InternalXtext.g:95:3: lv_name_1_0= ruleGrammarID
            {
             
            	        newCompositeNode(grammarAccess.getGrammarAccess().getNameGrammarIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_4);
            lv_name_1_0=ruleGrammarID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGrammarRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.Xtext.GrammarID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalXtext.g:114:1: (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXtext.g:115:2: otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getGrammarAccess().getWithKeyword_2_0());
                        
                    // InternalXtext.g:122:1: ( ( ruleGrammarID ) )
                    // InternalXtext.g:123:1: ( ruleGrammarID )
                    {
                    // InternalXtext.g:123:1: ( ruleGrammarID )
                    // InternalXtext.g:124:3: ruleGrammarID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGrammarRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_5);
                    ruleGrammarID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalXtext.g:140:1: (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalXtext.g:141:2: otherlv_4= ',' ( ( ruleGrammarID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getGrammarAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // InternalXtext.g:148:1: ( ( ruleGrammarID ) )
                    	    // InternalXtext.g:149:1: ( ruleGrammarID )
                    	    {
                    	    // InternalXtext.g:149:1: ( ruleGrammarID )
                    	    // InternalXtext.g:150:3: ruleGrammarID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getGrammarRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_5);
                    	    ruleGrammarID();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalXtext.g:170:1: ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXtext.g:171:1: ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )? otherlv_11= ')'
                    {
                    // InternalXtext.g:171:1: ( (lv_definesHiddenTokens_6_0= 'hidden' ) )
                    // InternalXtext.g:172:1: (lv_definesHiddenTokens_6_0= 'hidden' )
                    {
                    // InternalXtext.g:172:1: (lv_definesHiddenTokens_6_0= 'hidden' )
                    // InternalXtext.g:173:3: lv_definesHiddenTokens_6_0= 'hidden'
                    {
                    lv_definesHiddenTokens_6_0=(Token)match(input,14,FollowSets000.FOLLOW_6); 

                            newLeafNode(lv_definesHiddenTokens_6_0, grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGrammarRule());
                    	        }
                           		setWithLastConsumed(current, "definesHiddenTokens", true, "hidden");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_7, grammarAccess.getGrammarAccess().getLeftParenthesisKeyword_3_1());
                        
                    // InternalXtext.g:199:1: ( ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID||(LA4_0>=42 && LA4_0<=43)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalXtext.g:200:1: ( ( ruleRuleID ) ) (otherlv_9= ',' ( ( ruleRuleID ) ) )*
                            {
                            // InternalXtext.g:200:1: ( ( ruleRuleID ) )
                            // InternalXtext.g:201:1: ( ruleRuleID )
                            {
                            // InternalXtext.g:201:1: ( ruleRuleID )
                            // InternalXtext.g:202:3: ruleRuleID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getGrammarRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_8);
                            ruleRuleID();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalXtext.g:218:1: (otherlv_9= ',' ( ( ruleRuleID ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==13) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalXtext.g:219:2: otherlv_9= ',' ( ( ruleRuleID ) )
                            	    {
                            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getGrammarAccess().getCommaKeyword_3_2_1_0());
                            	        
                            	    // InternalXtext.g:226:1: ( ( ruleRuleID ) )
                            	    // InternalXtext.g:227:1: ( ruleRuleID )
                            	    {
                            	    // InternalXtext.g:227:1: ( ruleRuleID )
                            	    // InternalXtext.g:228:3: ruleRuleID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getGrammarRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_8);
                            	    ruleRuleID();

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

                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_11, grammarAccess.getGrammarAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            // InternalXtext.g:257:1: ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXtext.g:258:1: (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration )
            	    {
            	    // InternalXtext.g:258:1: (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration )
            	    // InternalXtext.g:259:3: lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_metamodelDeclarations_12_0=ruleAbstractMetamodelDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metamodelDeclarations",
            	            		lv_metamodelDeclarations_12_0, 
            	            		"org.eclipse.xtext.Xtext.AbstractMetamodelDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalXtext.g:278:1: ( (lv_rules_13_0= ruleAbstractRule ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==21||(LA7_0>=42 && LA7_0<=43)||LA7_0==50||LA7_0==53) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXtext.g:279:1: (lv_rules_13_0= ruleAbstractRule )
            	    {
            	    // InternalXtext.g:279:1: (lv_rules_13_0= ruleAbstractRule )
            	    // InternalXtext.g:280:3: lv_rules_13_0= ruleAbstractRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGrammarAccess().getRulesAbstractRuleParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_rules_13_0=ruleAbstractRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_13_0, 
            	            		"org.eclipse.xtext.Xtext.AbstractRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleGrammarID"
    // InternalXtext.g:308:1: entryRuleGrammarID returns [String current=null] : iv_ruleGrammarID= ruleGrammarID EOF ;
    public final String entryRuleGrammarID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGrammarID = null;


        try {
            // InternalXtext.g:309:2: (iv_ruleGrammarID= ruleGrammarID EOF )
            // InternalXtext.g:310:2: iv_ruleGrammarID= ruleGrammarID EOF
            {
             newCompositeNode(grammarAccess.getGrammarIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGrammarID=ruleGrammarID();

            state._fsp--;

             current =iv_ruleGrammarID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleGrammarID"


    // $ANTLR start "ruleGrammarID"
    // InternalXtext.g:317:1: ruleGrammarID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleGrammarID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // InternalXtext.g:320:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // InternalXtext.g:321:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // InternalXtext.g:321:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // InternalXtext.g:322:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
             
                    newCompositeNode(grammarAccess.getGrammarIDAccess().getValidIDParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_10);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            		current.merge(this_ValidID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:332:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXtext.g:333:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,17,FollowSets000.FOLLOW_3); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getGrammarIDAccess().getValidIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleGrammarID"


    // $ANTLR start "entryRuleAbstractRule"
    // InternalXtext.g:357:1: entryRuleAbstractRule returns [EObject current=null] : iv_ruleAbstractRule= ruleAbstractRule EOF ;
    public final EObject entryRuleAbstractRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRule = null;


        try {
            // InternalXtext.g:358:2: (iv_ruleAbstractRule= ruleAbstractRule EOF )
            // InternalXtext.g:359:2: iv_ruleAbstractRule= ruleAbstractRule EOF
            {
             newCompositeNode(grammarAccess.getAbstractRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractRule=ruleAbstractRule();

            state._fsp--;

             current =iv_ruleAbstractRule; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractRule"


    // $ANTLR start "ruleAbstractRule"
    // InternalXtext.g:366:1: ruleAbstractRule returns [EObject current=null] : (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule ) ;
    public final EObject ruleAbstractRule() throws RecognitionException {
        EObject current = null;

        EObject this_ParserRule_0 = null;

        EObject this_TerminalRule_1 = null;

        EObject this_EnumRule_2 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:372:7: ( (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule ) )
            // InternalXtext.g:374:1: (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule )
            {
            // InternalXtext.g:374:1: (this_ParserRule_0= ruleParserRule | this_TerminalRule_1= ruleTerminalRule | this_EnumRule_2= ruleEnumRule )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 21:
            case 42:
            case 43:
                {
                alt9=1;
                }
                break;
            case 50:
                {
                alt9=2;
                }
                break;
            case 53:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXtext.g:376:5: this_ParserRule_0= ruleParserRule
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractRuleAccess().getParserRuleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParserRule_0=ruleParserRule();

                    state._fsp--;

                     
                            current = this_ParserRule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:389:5: this_TerminalRule_1= ruleTerminalRule
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractRuleAccess().getTerminalRuleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TerminalRule_1=ruleTerminalRule();

                    state._fsp--;

                     
                            current = this_TerminalRule_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXtext.g:402:5: this_EnumRule_2= ruleEnumRule
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractRuleAccess().getEnumRuleParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EnumRule_2=ruleEnumRule();

                    state._fsp--;

                     
                            current = this_EnumRule_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAbstractRule"


    // $ANTLR start "entryRuleAbstractMetamodelDeclaration"
    // InternalXtext.g:422:1: entryRuleAbstractMetamodelDeclaration returns [EObject current=null] : iv_ruleAbstractMetamodelDeclaration= ruleAbstractMetamodelDeclaration EOF ;
    public final EObject entryRuleAbstractMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMetamodelDeclaration = null;


        try {
            // InternalXtext.g:423:2: (iv_ruleAbstractMetamodelDeclaration= ruleAbstractMetamodelDeclaration EOF )
            // InternalXtext.g:424:2: iv_ruleAbstractMetamodelDeclaration= ruleAbstractMetamodelDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractMetamodelDeclaration=ruleAbstractMetamodelDeclaration();

            state._fsp--;

             current =iv_ruleAbstractMetamodelDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractMetamodelDeclaration"


    // $ANTLR start "ruleAbstractMetamodelDeclaration"
    // InternalXtext.g:431:1: ruleAbstractMetamodelDeclaration returns [EObject current=null] : (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel ) ;
    public final EObject ruleAbstractMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_GeneratedMetamodel_0 = null;

        EObject this_ReferencedMetamodel_1 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:437:7: ( (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel ) )
            // InternalXtext.g:439:1: (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel )
            {
            // InternalXtext.g:439:1: (this_GeneratedMetamodel_0= ruleGeneratedMetamodel | this_ReferencedMetamodel_1= ruleReferencedMetamodel )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXtext.g:441:5: this_GeneratedMetamodel_0= ruleGeneratedMetamodel
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationAccess().getGeneratedMetamodelParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GeneratedMetamodel_0=ruleGeneratedMetamodel();

                    state._fsp--;

                     
                            current = this_GeneratedMetamodel_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:454:5: this_ReferencedMetamodel_1= ruleReferencedMetamodel
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationAccess().getReferencedMetamodelParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferencedMetamodel_1=ruleReferencedMetamodel();

                    state._fsp--;

                     
                            current = this_ReferencedMetamodel_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAbstractMetamodelDeclaration"


    // $ANTLR start "entryRuleGeneratedMetamodel"
    // InternalXtext.g:474:1: entryRuleGeneratedMetamodel returns [EObject current=null] : iv_ruleGeneratedMetamodel= ruleGeneratedMetamodel EOF ;
    public final EObject entryRuleGeneratedMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratedMetamodel = null;


        try {
            // InternalXtext.g:475:2: (iv_ruleGeneratedMetamodel= ruleGeneratedMetamodel EOF )
            // InternalXtext.g:476:2: iv_ruleGeneratedMetamodel= ruleGeneratedMetamodel EOF
            {
             newCompositeNode(grammarAccess.getGeneratedMetamodelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGeneratedMetamodel=ruleGeneratedMetamodel();

            state._fsp--;

             current =iv_ruleGeneratedMetamodel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleGeneratedMetamodel"


    // $ANTLR start "ruleGeneratedMetamodel"
    // InternalXtext.g:483:1: ruleGeneratedMetamodel returns [EObject current=null] : (otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )? ) ;
    public final EObject ruleGeneratedMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_alias_4_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:489:7: ( (otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )? ) )
            // InternalXtext.g:491:1: (otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )? )
            {
            // InternalXtext.g:491:1: (otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )? )
            // InternalXtext.g:492:2: otherlv_0= 'generate' ( (lv_name_1_0= ruleValidID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )?
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getGeneratedMetamodelAccess().getGenerateKeyword_0());
                
            // InternalXtext.g:499:1: ( (lv_name_1_0= ruleValidID ) )
            // InternalXtext.g:500:1: (lv_name_1_0= ruleValidID )
            {
            // InternalXtext.g:500:1: (lv_name_1_0= ruleValidID )
            // InternalXtext.g:501:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getGeneratedMetamodelAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_11);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneratedMetamodelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.Xtext.ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalXtext.g:520:1: ( (otherlv_2= RULE_STRING ) )
            // InternalXtext.g:521:1: (otherlv_2= RULE_STRING )
            {
            // InternalXtext.g:521:1: (otherlv_2= RULE_STRING )
            // InternalXtext.g:522:3: otherlv_2= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneratedMetamodelRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); 

            		newLeafNode(otherlv_2, grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageCrossReference_2_0()); 
            	

            }


            }

            // InternalXtext.g:536:1: (otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXtext.g:537:2: otherlv_3= 'as' ( (lv_alias_4_0= ruleValidID ) )
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_3, grammarAccess.getGeneratedMetamodelAccess().getAsKeyword_3_0());
                        
                    // InternalXtext.g:544:1: ( (lv_alias_4_0= ruleValidID ) )
                    // InternalXtext.g:545:1: (lv_alias_4_0= ruleValidID )
                    {
                    // InternalXtext.g:545:1: (lv_alias_4_0= ruleValidID )
                    // InternalXtext.g:546:3: lv_alias_4_0= ruleValidID
                    {
                     
                    	        newCompositeNode(grammarAccess.getGeneratedMetamodelAccess().getAliasValidIDParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_alias_4_0=ruleValidID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGeneratedMetamodelRule());
                    	        }
                           		set(
                           			current, 
                           			"alias",
                            		lv_alias_4_0, 
                            		"org.eclipse.xtext.Xtext.ValidID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleGeneratedMetamodel"


    // $ANTLR start "entryRuleReferencedMetamodel"
    // InternalXtext.g:576:1: entryRuleReferencedMetamodel returns [EObject current=null] : iv_ruleReferencedMetamodel= ruleReferencedMetamodel EOF ;
    public final EObject entryRuleReferencedMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencedMetamodel = null;


        try {
            // InternalXtext.g:577:2: (iv_ruleReferencedMetamodel= ruleReferencedMetamodel EOF )
            // InternalXtext.g:578:2: iv_ruleReferencedMetamodel= ruleReferencedMetamodel EOF
            {
             newCompositeNode(grammarAccess.getReferencedMetamodelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferencedMetamodel=ruleReferencedMetamodel();

            state._fsp--;

             current =iv_ruleReferencedMetamodel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleReferencedMetamodel"


    // $ANTLR start "ruleReferencedMetamodel"
    // InternalXtext.g:585:1: ruleReferencedMetamodel returns [EObject current=null] : (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? ) ;
    public final EObject ruleReferencedMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_alias_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:591:7: ( (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? ) )
            // InternalXtext.g:593:1: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )
            {
            // InternalXtext.g:593:1: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )? )
            // InternalXtext.g:594:2: otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )?
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getReferencedMetamodelAccess().getImportKeyword_0());
                
            // InternalXtext.g:601:1: ( (otherlv_1= RULE_STRING ) )
            // InternalXtext.g:602:1: (otherlv_1= RULE_STRING )
            {
            // InternalXtext.g:602:1: (otherlv_1= RULE_STRING )
            // InternalXtext.g:603:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferencedMetamodelRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); 

            		newLeafNode(otherlv_1, grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageCrossReference_1_0()); 
            	

            }


            }

            // InternalXtext.g:617:1: (otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXtext.g:618:2: otherlv_2= 'as' ( (lv_alias_3_0= ruleValidID ) )
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getReferencedMetamodelAccess().getAsKeyword_2_0());
                        
                    // InternalXtext.g:625:1: ( (lv_alias_3_0= ruleValidID ) )
                    // InternalXtext.g:626:1: (lv_alias_3_0= ruleValidID )
                    {
                    // InternalXtext.g:626:1: (lv_alias_3_0= ruleValidID )
                    // InternalXtext.g:627:3: lv_alias_3_0= ruleValidID
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferencedMetamodelAccess().getAliasValidIDParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_alias_3_0=ruleValidID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferencedMetamodelRule());
                    	        }
                           		set(
                           			current, 
                           			"alias",
                            		lv_alias_3_0, 
                            		"org.eclipse.xtext.Xtext.ValidID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleReferencedMetamodel"


    // $ANTLR start "entryRuleParserRule"
    // InternalXtext.g:657:1: entryRuleParserRule returns [EObject current=null] : iv_ruleParserRule= ruleParserRule EOF ;
    public final EObject entryRuleParserRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserRule = null;


        try {
            // InternalXtext.g:658:2: (iv_ruleParserRule= ruleParserRule EOF )
            // InternalXtext.g:659:2: iv_ruleParserRule= ruleParserRule EOF
            {
             newCompositeNode(grammarAccess.getParserRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParserRule=ruleParserRule();

            state._fsp--;

             current =iv_ruleParserRule; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParserRule"


    // $ANTLR start "ruleParserRule"
    // InternalXtext.g:666:1: ruleParserRule returns [EObject current=null] : ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) this_RuleNameAndParams_1= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | (this_RuleNameAndParams_5= ruleRuleNameAndParams[$current] (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) ( (lv_initAfterActions_8_0= ruleInitAfterActions ) ) ( ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')' )? otherlv_15= ':' ( (lv_alternatives_16_0= ruleAlternatives ) ) otherlv_17= ';' ) ;
    public final EObject ruleParserRule() throws RecognitionException {
        EObject current = null;

        Token lv_fragment_0_0=null;
        Token lv_wildcard_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token lv_definesHiddenTokens_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject this_RuleNameAndParams_1 = null;

        EObject lv_type_4_0 = null;

        EObject this_RuleNameAndParams_5 = null;

        EObject lv_type_7_0 = null;

        EObject lv_initAfterActions_8_0 = null;

        EObject lv_alternatives_16_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:672:7: ( ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) this_RuleNameAndParams_1= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | (this_RuleNameAndParams_5= ruleRuleNameAndParams[$current] (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) ( (lv_initAfterActions_8_0= ruleInitAfterActions ) ) ( ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')' )? otherlv_15= ':' ( (lv_alternatives_16_0= ruleAlternatives ) ) otherlv_17= ';' ) )
            // InternalXtext.g:674:1: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) this_RuleNameAndParams_1= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | (this_RuleNameAndParams_5= ruleRuleNameAndParams[$current] (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) ( (lv_initAfterActions_8_0= ruleInitAfterActions ) ) ( ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')' )? otherlv_15= ':' ( (lv_alternatives_16_0= ruleAlternatives ) ) otherlv_17= ';' )
            {
            // InternalXtext.g:674:1: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) this_RuleNameAndParams_1= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | (this_RuleNameAndParams_5= ruleRuleNameAndParams[$current] (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) ( (lv_initAfterActions_8_0= ruleInitAfterActions ) ) ( ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')' )? otherlv_15= ':' ( (lv_alternatives_16_0= ruleAlternatives ) ) otherlv_17= ';' )
            // InternalXtext.g:675:1: ( ( ( (lv_fragment_0_0= 'fragment' ) ) this_RuleNameAndParams_1= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | (this_RuleNameAndParams_5= ruleRuleNameAndParams[$current] (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) ( (lv_initAfterActions_8_0= ruleInitAfterActions ) ) ( ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')' )? otherlv_15= ':' ( (lv_alternatives_16_0= ruleAlternatives ) ) otherlv_17= ';'
            {
            // InternalXtext.g:675:1: ( ( ( (lv_fragment_0_0= 'fragment' ) ) this_RuleNameAndParams_1= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | (this_RuleNameAndParams_5= ruleRuleNameAndParams[$current] (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID||(LA16_0>=42 && LA16_0<=43)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalXtext.g:676:1: ( ( (lv_fragment_0_0= 'fragment' ) ) this_RuleNameAndParams_1= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) )
                    {
                    // InternalXtext.g:676:1: ( ( (lv_fragment_0_0= 'fragment' ) ) this_RuleNameAndParams_1= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) )
                    // InternalXtext.g:677:1: ( (lv_fragment_0_0= 'fragment' ) ) this_RuleNameAndParams_1= ruleRuleNameAndParams[$current] ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? )
                    {
                    // InternalXtext.g:677:1: ( (lv_fragment_0_0= 'fragment' ) )
                    // InternalXtext.g:678:1: (lv_fragment_0_0= 'fragment' )
                    {
                    // InternalXtext.g:678:1: (lv_fragment_0_0= 'fragment' )
                    // InternalXtext.g:679:3: lv_fragment_0_0= 'fragment'
                    {
                    lv_fragment_0_0=(Token)match(input,21,FollowSets000.FOLLOW_13); 

                            newLeafNode(lv_fragment_0_0, grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_0_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParserRuleRule());
                    	        }
                           		setWithLastConsumed(current, "fragment", true, "fragment");
                    	    

                    }


                    }

                     
                    		if (current==null) {
                    			current = createModelElement(grammarAccess.getParserRuleRule());
                    		}
                            newCompositeNode(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_0_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_14);
                    this_RuleNameAndParams_1=ruleRuleNameAndParams(current);

                    state._fsp--;

                     
                            current = this_RuleNameAndParams_1; 
                            afterParserOrEnumRuleCall();
                        
                    // InternalXtext.g:713:1: ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==22) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==EOF||LA14_0==14||(LA14_0>=23 && LA14_0<=24)||LA14_0==26||LA14_0==29) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalXtext.g:714:1: ( (lv_wildcard_2_0= '*' ) )
                            {
                            // InternalXtext.g:714:1: ( (lv_wildcard_2_0= '*' ) )
                            // InternalXtext.g:715:1: (lv_wildcard_2_0= '*' )
                            {
                            // InternalXtext.g:715:1: (lv_wildcard_2_0= '*' )
                            // InternalXtext.g:716:3: lv_wildcard_2_0= '*'
                            {
                            lv_wildcard_2_0=(Token)match(input,22,FollowSets000.FOLLOW_15); 

                                    newLeafNode(lv_wildcard_2_0, grammarAccess.getParserRuleAccess().getWildcardAsteriskKeyword_0_0_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getParserRuleRule());
                            	        }
                                   		setWithLastConsumed(current, "wildcard", true, "*");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalXtext.g:736:1: (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )?
                            {
                            // InternalXtext.g:736:1: (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==23) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalXtext.g:737:2: otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) )
                                    {
                                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_16); 

                                        	newLeafNode(otherlv_3, grammarAccess.getParserRuleAccess().getReturnsKeyword_0_0_2_1_0());
                                        
                                    // InternalXtext.g:744:1: ( (lv_type_4_0= ruleTypeRef ) )
                                    // InternalXtext.g:745:1: (lv_type_4_0= ruleTypeRef )
                                    {
                                    // InternalXtext.g:745:1: (lv_type_4_0= ruleTypeRef )
                                    // InternalXtext.g:746:3: lv_type_4_0= ruleTypeRef
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_0_0_2_1_1_0()); 
                                    	    
                                    pushFollow(FollowSets000.FOLLOW_15);
                                    lv_type_4_0=ruleTypeRef();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getParserRuleRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"type",
                                            		lv_type_4_0, 
                                            		"org.eclipse.xtext.Xtext.TypeRef");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:772:1: (this_RuleNameAndParams_5= ruleRuleNameAndParams[$current] (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? )
                    {
                    // InternalXtext.g:772:1: (this_RuleNameAndParams_5= ruleRuleNameAndParams[$current] (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? )
                    // InternalXtext.g:774:5: this_RuleNameAndParams_5= ruleRuleNameAndParams[$current] (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )?
                    {
                     
                    		if (current==null) {
                    			current = createModelElement(grammarAccess.getParserRuleRule());
                    		}
                            newCompositeNode(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_0_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_17);
                    this_RuleNameAndParams_5=ruleRuleNameAndParams(current);

                    state._fsp--;

                     
                            current = this_RuleNameAndParams_5; 
                            afterParserOrEnumRuleCall();
                        
                    // InternalXtext.g:788:1: (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==23) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalXtext.g:789:2: otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) )
                            {
                            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_16); 

                                	newLeafNode(otherlv_6, grammarAccess.getParserRuleAccess().getReturnsKeyword_0_1_1_0());
                                
                            // InternalXtext.g:796:1: ( (lv_type_7_0= ruleTypeRef ) )
                            // InternalXtext.g:797:1: (lv_type_7_0= ruleTypeRef )
                            {
                            // InternalXtext.g:797:1: (lv_type_7_0= ruleTypeRef )
                            // InternalXtext.g:798:3: lv_type_7_0= ruleTypeRef
                            {
                             
                            	        newCompositeNode(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_0_1_1_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_15);
                            lv_type_7_0=ruleTypeRef();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getParserRuleRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_7_0, 
                                    		"org.eclipse.xtext.Xtext.TypeRef");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalXtext.g:823:1: ( (lv_initAfterActions_8_0= ruleInitAfterActions ) )
            // InternalXtext.g:824:1: (lv_initAfterActions_8_0= ruleInitAfterActions )
            {
            // InternalXtext.g:824:1: (lv_initAfterActions_8_0= ruleInitAfterActions )
            // InternalXtext.g:825:3: lv_initAfterActions_8_0= ruleInitAfterActions
            {
             
            	        newCompositeNode(grammarAccess.getParserRuleAccess().getInitAfterActionsInitAfterActionsParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
            lv_initAfterActions_8_0=ruleInitAfterActions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParserRuleRule());
            	        }
                   		set(
                   			current, 
                   			"initAfterActions",
                    		lv_initAfterActions_8_0, 
                    		"org.eclipse.xtext.Xtext.InitAfterActions");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalXtext.g:844:1: ( ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXtext.g:845:1: ( (lv_definesHiddenTokens_9_0= 'hidden' ) ) otherlv_10= '(' ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )? otherlv_14= ')'
                    {
                    // InternalXtext.g:845:1: ( (lv_definesHiddenTokens_9_0= 'hidden' ) )
                    // InternalXtext.g:846:1: (lv_definesHiddenTokens_9_0= 'hidden' )
                    {
                    // InternalXtext.g:846:1: (lv_definesHiddenTokens_9_0= 'hidden' )
                    // InternalXtext.g:847:3: lv_definesHiddenTokens_9_0= 'hidden'
                    {
                    lv_definesHiddenTokens_9_0=(Token)match(input,14,FollowSets000.FOLLOW_6); 

                            newLeafNode(lv_definesHiddenTokens_9_0, grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParserRuleRule());
                    	        }
                           		setWithLastConsumed(current, "definesHiddenTokens", true, "hidden");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_10, grammarAccess.getParserRuleAccess().getLeftParenthesisKeyword_2_1());
                        
                    // InternalXtext.g:873:1: ( ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID||(LA18_0>=42 && LA18_0<=43)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalXtext.g:874:1: ( ( ruleRuleID ) ) (otherlv_12= ',' ( ( ruleRuleID ) ) )*
                            {
                            // InternalXtext.g:874:1: ( ( ruleRuleID ) )
                            // InternalXtext.g:875:1: ( ruleRuleID )
                            {
                            // InternalXtext.g:875:1: ( ruleRuleID )
                            // InternalXtext.g:876:3: ruleRuleID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getParserRuleRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_8);
                            ruleRuleID();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalXtext.g:892:1: (otherlv_12= ',' ( ( ruleRuleID ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==13) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalXtext.g:893:2: otherlv_12= ',' ( ( ruleRuleID ) )
                            	    {
                            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                            	        	newLeafNode(otherlv_12, grammarAccess.getParserRuleAccess().getCommaKeyword_2_2_1_0());
                            	        
                            	    // InternalXtext.g:900:1: ( ( ruleRuleID ) )
                            	    // InternalXtext.g:901:1: ( ruleRuleID )
                            	    {
                            	    // InternalXtext.g:901:1: ( ruleRuleID )
                            	    // InternalXtext.g:902:3: ruleRuleID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getParserRuleRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_8);
                            	    ruleRuleID();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_19); 

                        	newLeafNode(otherlv_14, grammarAccess.getParserRuleAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_20); 

                	newLeafNode(otherlv_15, grammarAccess.getParserRuleAccess().getColonKeyword_3());
                
            // InternalXtext.g:938:1: ( (lv_alternatives_16_0= ruleAlternatives ) )
            // InternalXtext.g:939:1: (lv_alternatives_16_0= ruleAlternatives )
            {
            // InternalXtext.g:939:1: (lv_alternatives_16_0= ruleAlternatives )
            // InternalXtext.g:940:3: lv_alternatives_16_0= ruleAlternatives
            {
             
            	        newCompositeNode(grammarAccess.getParserRuleAccess().getAlternativesAlternativesParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            lv_alternatives_16_0=ruleAlternatives();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParserRuleRule());
            	        }
                   		set(
                   			current, 
                   			"alternatives",
                    		lv_alternatives_16_0, 
                    		"org.eclipse.xtext.Xtext.Alternatives");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_17, grammarAccess.getParserRuleAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleParserRule"


    // $ANTLR start "entryRuleInitAfterActions"
    // InternalXtext.g:975:1: entryRuleInitAfterActions returns [EObject current=null] : iv_ruleInitAfterActions= ruleInitAfterActions EOF ;
    public final EObject entryRuleInitAfterActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitAfterActions = null;


        try {
            // InternalXtext.g:976:2: (iv_ruleInitAfterActions= ruleInitAfterActions EOF )
            // InternalXtext.g:977:2: iv_ruleInitAfterActions= ruleInitAfterActions EOF
            {
             newCompositeNode(grammarAccess.getInitAfterActionsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInitAfterActions=ruleInitAfterActions();

            state._fsp--;

             current =iv_ruleInitAfterActions; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitAfterActions"


    // $ANTLR start "ruleInitAfterActions"
    // InternalXtext.g:984:1: ruleInitAfterActions returns [EObject current=null] : ( () (otherlv_1= 'initRuleAction' otherlv_2= '{' ( (lv_initAction_3_0= ruleActionCall ) ) otherlv_4= '}' )? (otherlv_5= 'afterRuleAction' otherlv_6= '{' ( (lv_afterAction_7_0= ruleActionCall ) ) otherlv_8= '}' )? ) ;
    public final EObject ruleInitAfterActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_initAction_3_0 = null;

        AntlrDatatypeRuleToken lv_afterAction_7_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:990:7: ( ( () (otherlv_1= 'initRuleAction' otherlv_2= '{' ( (lv_initAction_3_0= ruleActionCall ) ) otherlv_4= '}' )? (otherlv_5= 'afterRuleAction' otherlv_6= '{' ( (lv_afterAction_7_0= ruleActionCall ) ) otherlv_8= '}' )? ) )
            // InternalXtext.g:992:1: ( () (otherlv_1= 'initRuleAction' otherlv_2= '{' ( (lv_initAction_3_0= ruleActionCall ) ) otherlv_4= '}' )? (otherlv_5= 'afterRuleAction' otherlv_6= '{' ( (lv_afterAction_7_0= ruleActionCall ) ) otherlv_8= '}' )? )
            {
            // InternalXtext.g:992:1: ( () (otherlv_1= 'initRuleAction' otherlv_2= '{' ( (lv_initAction_3_0= ruleActionCall ) ) otherlv_4= '}' )? (otherlv_5= 'afterRuleAction' otherlv_6= '{' ( (lv_afterAction_7_0= ruleActionCall ) ) otherlv_8= '}' )? )
            // InternalXtext.g:993:1: () (otherlv_1= 'initRuleAction' otherlv_2= '{' ( (lv_initAction_3_0= ruleActionCall ) ) otherlv_4= '}' )? (otherlv_5= 'afterRuleAction' otherlv_6= '{' ( (lv_afterAction_7_0= ruleActionCall ) ) otherlv_8= '}' )?
            {
            // InternalXtext.g:993:1: ()
            // InternalXtext.g:994:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitAfterActionsAccess().getInitAfterActionsAction_0(),
                        current);
                

            }

            // InternalXtext.g:1002:1: (otherlv_1= 'initRuleAction' otherlv_2= '{' ( (lv_initAction_3_0= ruleActionCall ) ) otherlv_4= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXtext.g:1003:2: otherlv_1= 'initRuleAction' otherlv_2= '{' ( (lv_initAction_3_0= ruleActionCall ) ) otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_22); 

                        	newLeafNode(otherlv_1, grammarAccess.getInitAfterActionsAccess().getInitRuleActionKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getInitAfterActionsAccess().getLeftCurlyBracketKeyword_1_1());
                        
                    // InternalXtext.g:1017:1: ( (lv_initAction_3_0= ruleActionCall ) )
                    // InternalXtext.g:1018:1: (lv_initAction_3_0= ruleActionCall )
                    {
                    // InternalXtext.g:1018:1: (lv_initAction_3_0= ruleActionCall )
                    // InternalXtext.g:1019:3: lv_initAction_3_0= ruleActionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getInitAfterActionsAccess().getInitActionActionCallParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_initAction_3_0=ruleActionCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInitAfterActionsRule());
                    	        }
                           		set(
                           			current, 
                           			"initAction",
                            		lv_initAction_3_0, 
                            		"org.eclipse.xtext.Xtext.ActionCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_24); 

                        	newLeafNode(otherlv_4, grammarAccess.getInitAfterActionsAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }
                    break;

            }

            // InternalXtext.g:1047:1: (otherlv_5= 'afterRuleAction' otherlv_6= '{' ( (lv_afterAction_7_0= ruleActionCall ) ) otherlv_8= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXtext.g:1048:2: otherlv_5= 'afterRuleAction' otherlv_6= '{' ( (lv_afterAction_7_0= ruleActionCall ) ) otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_22); 

                        	newLeafNode(otherlv_5, grammarAccess.getInitAfterActionsAccess().getAfterRuleActionKeyword_2_0());
                        
                    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_6, grammarAccess.getInitAfterActionsAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // InternalXtext.g:1062:1: ( (lv_afterAction_7_0= ruleActionCall ) )
                    // InternalXtext.g:1063:1: (lv_afterAction_7_0= ruleActionCall )
                    {
                    // InternalXtext.g:1063:1: (lv_afterAction_7_0= ruleActionCall )
                    // InternalXtext.g:1064:3: lv_afterAction_7_0= ruleActionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getInitAfterActionsAccess().getAfterActionActionCallParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_afterAction_7_0=ruleActionCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInitAfterActionsRule());
                    	        }
                           		set(
                           			current, 
                           			"afterAction",
                            		lv_afterAction_7_0, 
                            		"org.eclipse.xtext.Xtext.ActionCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_8, grammarAccess.getInitAfterActionsAccess().getRightCurlyBracketKeyword_2_3());
                        

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
    // $ANTLR end "ruleInitAfterActions"


    // $ANTLR start "entryRuleActionCall"
    // InternalXtext.g:1101:1: entryRuleActionCall returns [String current=null] : iv_ruleActionCall= ruleActionCall EOF ;
    public final String entryRuleActionCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActionCall = null;


        try {
            // InternalXtext.g:1102:2: (iv_ruleActionCall= ruleActionCall EOF )
            // InternalXtext.g:1103:2: iv_ruleActionCall= ruleActionCall EOF
            {
             newCompositeNode(grammarAccess.getActionCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActionCall=ruleActionCall();

            state._fsp--;

             current =iv_ruleActionCall.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionCall"


    // $ANTLR start "ruleActionCall"
    // InternalXtext.g:1110:1: ruleActionCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )+ (kw= '(' (this_ActionCallParameters_4= ruleActionCallParameters )? kw= ')' ) (kw= ';' )? ) ;
    public final AntlrDatatypeRuleToken ruleActionCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;

        AntlrDatatypeRuleToken this_ActionCallParameters_4 = null;


         enterRule(); 
            
        try {
            // InternalXtext.g:1113:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )+ (kw= '(' (this_ActionCallParameters_4= ruleActionCallParameters )? kw= ')' ) (kw= ';' )? ) )
            // InternalXtext.g:1114:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )+ (kw= '(' (this_ActionCallParameters_4= ruleActionCallParameters )? kw= ')' ) (kw= ';' )? )
            {
            // InternalXtext.g:1114:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )+ (kw= '(' (this_ActionCallParameters_4= ruleActionCallParameters )? kw= ')' ) (kw= ';' )? )
            // InternalXtext.g:1115:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )+ (kw= '(' (this_ActionCallParameters_4= ruleActionCallParameters )? kw= ')' ) (kw= ';' )?
            {
             
                    newCompositeNode(grammarAccess.getActionCallAccess().getValidIDParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_25);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            		current.merge(this_ValidID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:1125:1: (kw= '.' this_ValidID_2= ruleValidID )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==17) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXtext.g:1126:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,17,FollowSets000.FOLLOW_3); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getActionCallAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getActionCallAccess().getValidIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalXtext.g:1142:3: (kw= '(' (this_ActionCallParameters_4= ruleActionCallParameters )? kw= ')' )
            // InternalXtext.g:1143:2: kw= '(' (this_ActionCallParameters_4= ruleActionCallParameters )? kw= ')'
            {
            kw=(Token)match(input,15,FollowSets000.FOLLOW_27); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getActionCallAccess().getLeftParenthesisKeyword_2_0()); 
                
            // InternalXtext.g:1148:1: (this_ActionCallParameters_4= ruleActionCallParameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)||(LA23_0>=42 && LA23_0<=43)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXtext.g:1149:5: this_ActionCallParameters_4= ruleActionCallParameters
                    {
                     
                            newCompositeNode(grammarAccess.getActionCallAccess().getActionCallParametersParserRuleCall_2_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_28);
                    this_ActionCallParameters_4=ruleActionCallParameters();

                    state._fsp--;


                    		current.merge(this_ActionCallParameters_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,16,FollowSets000.FOLLOW_29); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getActionCallAccess().getRightParenthesisKeyword_2_2()); 
                

            }

            // InternalXtext.g:1165:2: (kw= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXtext.g:1166:2: kw= ';'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getActionCallAccess().getSemicolonKeyword_3()); 
                        

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
    // $ANTLR end "ruleActionCall"


    // $ANTLR start "entryRuleActionCallParameters"
    // InternalXtext.g:1179:1: entryRuleActionCallParameters returns [String current=null] : iv_ruleActionCallParameters= ruleActionCallParameters EOF ;
    public final String entryRuleActionCallParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActionCallParameters = null;


        try {
            // InternalXtext.g:1180:2: (iv_ruleActionCallParameters= ruleActionCallParameters EOF )
            // InternalXtext.g:1181:2: iv_ruleActionCallParameters= ruleActionCallParameters EOF
            {
             newCompositeNode(grammarAccess.getActionCallParametersRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActionCallParameters=ruleActionCallParameters();

            state._fsp--;

             current =iv_ruleActionCallParameters.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionCallParameters"


    // $ANTLR start "ruleActionCallParameters"
    // InternalXtext.g:1188:1: ruleActionCallParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ActionCallParameter_0= ruleActionCallParameter (kw= ',' this_ActionCallParameter_2= ruleActionCallParameter )* ) ;
    public final AntlrDatatypeRuleToken ruleActionCallParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ActionCallParameter_0 = null;

        AntlrDatatypeRuleToken this_ActionCallParameter_2 = null;


         enterRule(); 
            
        try {
            // InternalXtext.g:1191:28: ( (this_ActionCallParameter_0= ruleActionCallParameter (kw= ',' this_ActionCallParameter_2= ruleActionCallParameter )* ) )
            // InternalXtext.g:1192:1: (this_ActionCallParameter_0= ruleActionCallParameter (kw= ',' this_ActionCallParameter_2= ruleActionCallParameter )* )
            {
            // InternalXtext.g:1192:1: (this_ActionCallParameter_0= ruleActionCallParameter (kw= ',' this_ActionCallParameter_2= ruleActionCallParameter )* )
            // InternalXtext.g:1193:5: this_ActionCallParameter_0= ruleActionCallParameter (kw= ',' this_ActionCallParameter_2= ruleActionCallParameter )*
            {
             
                    newCompositeNode(grammarAccess.getActionCallParametersAccess().getActionCallParameterParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_30);
            this_ActionCallParameter_0=ruleActionCallParameter();

            state._fsp--;


            		current.merge(this_ActionCallParameter_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:1203:1: (kw= ',' this_ActionCallParameter_2= ruleActionCallParameter )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==13) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXtext.g:1204:2: kw= ',' this_ActionCallParameter_2= ruleActionCallParameter
            	    {
            	    kw=(Token)match(input,13,FollowSets000.FOLLOW_31); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getActionCallParametersAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getActionCallParametersAccess().getActionCallParameterParserRuleCall_1_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    this_ActionCallParameter_2=ruleActionCallParameter();

            	    state._fsp--;


            	    		current.merge(this_ActionCallParameter_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleActionCallParameters"


    // $ANTLR start "entryRuleActionCallParameter"
    // InternalXtext.g:1228:1: entryRuleActionCallParameter returns [String current=null] : iv_ruleActionCallParameter= ruleActionCallParameter EOF ;
    public final String entryRuleActionCallParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActionCallParameter = null;


        try {
            // InternalXtext.g:1229:2: (iv_ruleActionCallParameter= ruleActionCallParameter EOF )
            // InternalXtext.g:1230:2: iv_ruleActionCallParameter= ruleActionCallParameter EOF
            {
             newCompositeNode(grammarAccess.getActionCallParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActionCallParameter=ruleActionCallParameter();

            state._fsp--;

             current =iv_ruleActionCallParameter.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionCallParameter"


    // $ANTLR start "ruleActionCallParameter"
    // InternalXtext.g:1237:1: ruleActionCallParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ValidID_1= ruleValidID ) ;
    public final AntlrDatatypeRuleToken ruleActionCallParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ValidID_1 = null;


         enterRule(); 
            
        try {
            // InternalXtext.g:1240:28: ( (this_STRING_0= RULE_STRING | this_ValidID_1= ruleValidID ) )
            // InternalXtext.g:1241:1: (this_STRING_0= RULE_STRING | this_ValidID_1= ruleValidID )
            {
            // InternalXtext.g:1241:1: (this_STRING_0= RULE_STRING | this_ValidID_1= ruleValidID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID||(LA26_0>=42 && LA26_0<=43)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalXtext.g:1241:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getActionCallParameterAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:1250:5: this_ValidID_1= ruleValidID
                    {
                     
                            newCompositeNode(grammarAccess.getActionCallParameterAccess().getValidIDParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValidID_1=ruleValidID();

                    state._fsp--;


                    		current.merge(this_ValidID_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleActionCallParameter"


    // $ANTLR start "ruleRuleNameAndParams"
    // InternalXtext.g:1269:1: ruleRuleNameAndParams[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )? ) ;
    public final EObject ruleRuleNameAndParams(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:1275:7: ( ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )? ) )
            // InternalXtext.g:1277:1: ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )? )
            {
            // InternalXtext.g:1277:1: ( ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )? )
            // InternalXtext.g:1278:1: ( (lv_name_0_0= ruleValidID ) ) (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )?
            {
            // InternalXtext.g:1278:1: ( (lv_name_0_0= ruleValidID ) )
            // InternalXtext.g:1279:1: (lv_name_0_0= ruleValidID )
            {
            // InternalXtext.g:1279:1: (lv_name_0_0= ruleValidID )
            // InternalXtext.g:1280:3: lv_name_0_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getRuleNameAndParamsAccess().getNameValidIDParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
            lv_name_0_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleNameAndParamsRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.Xtext.ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalXtext.g:1299:1: (otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXtext.g:1300:2: otherlv_1= '<' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_33); 

                        	newLeafNode(otherlv_1, grammarAccess.getRuleNameAndParamsAccess().getLessThanSignKeyword_1_0());
                        
                    // InternalXtext.g:1307:1: ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_ID) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalXtext.g:1308:1: ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                            {
                            // InternalXtext.g:1308:1: ( (lv_parameters_2_0= ruleParameter ) )
                            // InternalXtext.g:1309:1: (lv_parameters_2_0= ruleParameter )
                            {
                            // InternalXtext.g:1309:1: (lv_parameters_2_0= ruleParameter )
                            // InternalXtext.g:1310:3: lv_parameters_2_0= ruleParameter
                            {
                             
                            	        newCompositeNode(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_34);
                            lv_parameters_2_0=ruleParameter();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRuleNameAndParamsRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_2_0, 
                                    		"org.eclipse.xtext.Xtext.Parameter");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalXtext.g:1329:1: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==13) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // InternalXtext.g:1330:2: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_16); 

                            	        	newLeafNode(otherlv_3, grammarAccess.getRuleNameAndParamsAccess().getCommaKeyword_1_1_1_0());
                            	        
                            	    // InternalXtext.g:1337:1: ( (lv_parameters_4_0= ruleParameter ) )
                            	    // InternalXtext.g:1338:1: (lv_parameters_4_0= ruleParameter )
                            	    {
                            	    // InternalXtext.g:1338:1: (lv_parameters_4_0= ruleParameter )
                            	    // InternalXtext.g:1339:3: lv_parameters_4_0= ruleParameter
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_34);
                            	    lv_parameters_4_0=ruleParameter();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getRuleNameAndParamsRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"parameters",
                            	            		lv_parameters_4_0, 
                            	            		"org.eclipse.xtext.Xtext.Parameter");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_5, grammarAccess.getRuleNameAndParamsAccess().getGreaterThanSignKeyword_1_2());
                        

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
    // $ANTLR end "ruleRuleNameAndParams"


    // $ANTLR start "entryRuleParameter"
    // InternalXtext.g:1380:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalXtext.g:1381:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalXtext.g:1382:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXtext.g:1389:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule();
           		
            
        try {
            // InternalXtext.g:1395:7: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalXtext.g:1397:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalXtext.g:1397:1: ( (lv_name_0_0= RULE_ID ) )
            // InternalXtext.g:1398:1: (lv_name_0_0= RULE_ID )
            {
            // InternalXtext.g:1398:1: (lv_name_0_0= RULE_ID )
            // InternalXtext.g:1399:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

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


    // $ANTLR start "entryRuleTypeRef"
    // InternalXtext.g:1425:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // InternalXtext.g:1426:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // InternalXtext.g:1427:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXtext.g:1434:1: ruleTypeRef returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule();
           		
            
        try {
            // InternalXtext.g:1440:7: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalXtext.g:1442:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalXtext.g:1442:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // InternalXtext.g:1443:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalXtext.g:1443:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==32) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalXtext.g:1444:1: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // InternalXtext.g:1444:1: ( (otherlv_0= RULE_ID ) )
                    // InternalXtext.g:1445:1: (otherlv_0= RULE_ID )
                    {
                    // InternalXtext.g:1445:1: (otherlv_0= RULE_ID )
                    // InternalXtext.g:1446:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRefRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); 

                    		newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_16); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeRefAccess().getColonColonKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalXtext.g:1469:1: ( (otherlv_2= RULE_ID ) )
            // InternalXtext.g:1470:1: (otherlv_2= RULE_ID )
            {
            // InternalXtext.g:1470:1: (otherlv_2= RULE_ID )
            // InternalXtext.g:1471:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_2, grammarAccess.getTypeRefAccess().getClassifierEClassifierCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleAlternatives"
    // InternalXtext.g:1494:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // InternalXtext.g:1495:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // InternalXtext.g:1496:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // InternalXtext.g:1503:1: ruleAlternatives returns [EObject current=null] : (this_ConditionalBranch_0= ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConditionalBranch_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:1509:7: ( (this_ConditionalBranch_0= ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? ) )
            // InternalXtext.g:1511:1: (this_ConditionalBranch_0= ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? )
            {
            // InternalXtext.g:1511:1: (this_ConditionalBranch_0= ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? )
            // InternalXtext.g:1513:5: this_ConditionalBranch_0= ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getAlternativesAccess().getConditionalBranchParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_36);
            this_ConditionalBranch_0=ruleConditionalBranch();

            state._fsp--;

             
                    current = this_ConditionalBranch_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:1524:1: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXtext.g:1525:1: () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+
                    {
                    // InternalXtext.g:1525:1: ()
                    // InternalXtext.g:1526:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getAlternativesAccess().getAlternativesElementsAction_1_0(),
                                current);
                        

                    }

                    // InternalXtext.g:1534:1: (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==33) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalXtext.g:1535:2: otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) )
                    	    {
                    	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_20); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	        
                    	    // InternalXtext.g:1542:1: ( (lv_elements_3_0= ruleConditionalBranch ) )
                    	    // InternalXtext.g:1543:1: (lv_elements_3_0= ruleConditionalBranch )
                    	    {
                    	    // InternalXtext.g:1543:1: (lv_elements_3_0= ruleConditionalBranch )
                    	    // InternalXtext.g:1544:3: lv_elements_3_0= ruleConditionalBranch
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlternativesAccess().getElementsConditionalBranchParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_36);
                    	    lv_elements_3_0=ruleConditionalBranch();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlternativesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"org.eclipse.xtext.Xtext.ConditionalBranch");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);


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
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleConditionalBranch"
    // InternalXtext.g:1576:1: entryRuleConditionalBranch returns [EObject current=null] : iv_ruleConditionalBranch= ruleConditionalBranch EOF ;
    public final EObject entryRuleConditionalBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalBranch = null;


        try {
            // InternalXtext.g:1577:2: (iv_ruleConditionalBranch= ruleConditionalBranch EOF )
            // InternalXtext.g:1578:2: iv_ruleConditionalBranch= ruleConditionalBranch EOF
            {
             newCompositeNode(grammarAccess.getConditionalBranchRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConditionalBranch=ruleConditionalBranch();

            state._fsp--;

             current =iv_ruleConditionalBranch; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionalBranch"


    // $ANTLR start "ruleConditionalBranch"
    // InternalXtext.g:1585:1: ruleConditionalBranch returns [EObject current=null] : (this_UnorderedGroup_0= ruleUnorderedGroup | ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ ) ) ;
    public final EObject ruleConditionalBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UnorderedGroup_0 = null;

        EObject lv_guardCondition_3_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:1591:7: ( (this_UnorderedGroup_0= ruleUnorderedGroup | ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ ) ) )
            // InternalXtext.g:1593:1: (this_UnorderedGroup_0= ruleUnorderedGroup | ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ ) )
            {
            // InternalXtext.g:1593:1: (this_UnorderedGroup_0= ruleUnorderedGroup | ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)||LA34_0==15||LA34_0==27||(LA34_0>=42 && LA34_0<=43)||(LA34_0>=45 && LA34_0<=46)) ) {
                alt34=1;
            }
            else if ( (LA34_0==30) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalXtext.g:1595:5: this_UnorderedGroup_0= ruleUnorderedGroup
                    {
                     
                            newCompositeNode(grammarAccess.getConditionalBranchAccess().getUnorderedGroupParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UnorderedGroup_0=ruleUnorderedGroup();

                    state._fsp--;

                     
                            current = this_UnorderedGroup_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:1607:1: ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ )
                    {
                    // InternalXtext.g:1607:1: ( () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+ )
                    // InternalXtext.g:1608:1: () otherlv_2= '<' ( (lv_guardCondition_3_0= ruleDisjunction ) ) otherlv_4= '>' ( (lv_elements_5_0= ruleAbstractToken ) )+
                    {
                    // InternalXtext.g:1608:1: ()
                    // InternalXtext.g:1609:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConditionalBranchAccess().getGroupAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_37); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionalBranchAccess().getLessThanSignKeyword_1_1());
                        
                    // InternalXtext.g:1624:1: ( (lv_guardCondition_3_0= ruleDisjunction ) )
                    // InternalXtext.g:1625:1: (lv_guardCondition_3_0= ruleDisjunction )
                    {
                    // InternalXtext.g:1625:1: (lv_guardCondition_3_0= ruleDisjunction )
                    // InternalXtext.g:1626:3: lv_guardCondition_3_0= ruleDisjunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalBranchAccess().getGuardConditionDisjunctionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_guardCondition_3_0=ruleDisjunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"guardCondition",
                            		lv_guardCondition_3_0, 
                            		"org.eclipse.xtext.Xtext.Disjunction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_39); 

                        	newLeafNode(otherlv_4, grammarAccess.getConditionalBranchAccess().getGreaterThanSignKeyword_1_3());
                        
                    // InternalXtext.g:1652:1: ( (lv_elements_5_0= ruleAbstractToken ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)||LA33_0==15||LA33_0==27||(LA33_0>=42 && LA33_0<=43)||(LA33_0>=45 && LA33_0<=46)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalXtext.g:1653:1: (lv_elements_5_0= ruleAbstractToken )
                    	    {
                    	    // InternalXtext.g:1653:1: (lv_elements_5_0= ruleAbstractToken )
                    	    // InternalXtext.g:1654:3: lv_elements_5_0= ruleAbstractToken
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConditionalBranchAccess().getElementsAbstractTokenParserRuleCall_1_4_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_elements_5_0=ruleAbstractToken();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConditionalBranchRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_5_0, 
                    	            		"org.eclipse.xtext.Xtext.AbstractToken");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


                    }


                    }
                    break;

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
    // $ANTLR end "ruleConditionalBranch"


    // $ANTLR start "entryRuleUnorderedGroup"
    // InternalXtext.g:1684:1: entryRuleUnorderedGroup returns [EObject current=null] : iv_ruleUnorderedGroup= ruleUnorderedGroup EOF ;
    public final EObject entryRuleUnorderedGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedGroup = null;


        try {
            // InternalXtext.g:1685:2: (iv_ruleUnorderedGroup= ruleUnorderedGroup EOF )
            // InternalXtext.g:1686:2: iv_ruleUnorderedGroup= ruleUnorderedGroup EOF
            {
             newCompositeNode(grammarAccess.getUnorderedGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnorderedGroup=ruleUnorderedGroup();

            state._fsp--;

             current =iv_ruleUnorderedGroup; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnorderedGroup"


    // $ANTLR start "ruleUnorderedGroup"
    // InternalXtext.g:1693:1: ruleUnorderedGroup returns [EObject current=null] : (this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) ;
    public final EObject ruleUnorderedGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Group_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:1699:7: ( (this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) )
            // InternalXtext.g:1701:1: (this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            {
            // InternalXtext.g:1701:1: (this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            // InternalXtext.g:1703:5: this_Group_0= ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getUnorderedGroupAccess().getGroupParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_41);
            this_Group_0=ruleGroup();

            state._fsp--;

             
                    current = this_Group_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:1714:1: ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXtext.g:1715:1: () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    {
                    // InternalXtext.g:1715:1: ()
                    // InternalXtext.g:1716:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getUnorderedGroupAccess().getUnorderedGroupElementsAction_1_0(),
                                current);
                        

                    }

                    // InternalXtext.g:1724:1: (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==34) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalXtext.g:1725:2: otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_39); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getUnorderedGroupAccess().getAmpersandKeyword_1_1_0());
                    	        
                    	    // InternalXtext.g:1732:1: ( (lv_elements_3_0= ruleGroup ) )
                    	    // InternalXtext.g:1733:1: (lv_elements_3_0= ruleGroup )
                    	    {
                    	    // InternalXtext.g:1733:1: (lv_elements_3_0= ruleGroup )
                    	    // InternalXtext.g:1734:3: lv_elements_3_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUnorderedGroupAccess().getElementsGroupParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_41);
                    	    lv_elements_3_0=ruleGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUnorderedGroupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"org.eclipse.xtext.Xtext.Group");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


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
    // $ANTLR end "ruleUnorderedGroup"


    // $ANTLR start "entryRuleGroup"
    // InternalXtext.g:1766:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalXtext.g:1767:2: (iv_ruleGroup= ruleGroup EOF )
            // InternalXtext.g:1768:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalXtext.g:1775:1: ruleGroup returns [EObject current=null] : (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractToken_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:1781:7: ( (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) )
            // InternalXtext.g:1783:1: (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            {
            // InternalXtext.g:1783:1: (this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            // InternalXtext.g:1785:5: this_AbstractToken_0= ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getGroupAccess().getAbstractTokenParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_40);
            this_AbstractToken_0=ruleAbstractToken();

            state._fsp--;

             
                    current = this_AbstractToken_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:1796:1: ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)||LA38_0==15||LA38_0==27||(LA38_0>=42 && LA38_0<=43)||(LA38_0>=45 && LA38_0<=46)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXtext.g:1797:1: () ( (lv_elements_2_0= ruleAbstractToken ) )+
                    {
                    // InternalXtext.g:1797:1: ()
                    // InternalXtext.g:1798:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getGroupAccess().getGroupElementsAction_1_0(),
                                current);
                        

                    }

                    // InternalXtext.g:1806:1: ( (lv_elements_2_0= ruleAbstractToken ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)||LA37_0==15||LA37_0==27||(LA37_0>=42 && LA37_0<=43)||(LA37_0>=45 && LA37_0<=46)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalXtext.g:1807:1: (lv_elements_2_0= ruleAbstractToken )
                    	    {
                    	    // InternalXtext.g:1807:1: (lv_elements_2_0= ruleAbstractToken )
                    	    // InternalXtext.g:1808:3: lv_elements_2_0= ruleAbstractToken
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGroupAccess().getElementsAbstractTokenParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_elements_2_0=ruleAbstractToken();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_2_0, 
                    	            		"org.eclipse.xtext.Xtext.AbstractToken");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);


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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAbstractToken"
    // InternalXtext.g:1838:1: entryRuleAbstractToken returns [EObject current=null] : iv_ruleAbstractToken= ruleAbstractToken EOF ;
    public final EObject entryRuleAbstractToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractToken = null;


        try {
            // InternalXtext.g:1839:2: (iv_ruleAbstractToken= ruleAbstractToken EOF )
            // InternalXtext.g:1840:2: iv_ruleAbstractToken= ruleAbstractToken EOF
            {
             newCompositeNode(grammarAccess.getAbstractTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractToken=ruleAbstractToken();

            state._fsp--;

             current =iv_ruleAbstractToken; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractToken"


    // $ANTLR start "ruleAbstractToken"
    // InternalXtext.g:1847:1: ruleAbstractToken returns [EObject current=null] : (this_AbstractTokenAntlrAction_0= ruleAbstractTokenAntlrAction | this_Action_1= ruleAction ) ;
    public final EObject ruleAbstractToken() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractTokenAntlrAction_0 = null;

        EObject this_Action_1 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:1853:7: ( (this_AbstractTokenAntlrAction_0= ruleAbstractTokenAntlrAction | this_Action_1= ruleAction ) )
            // InternalXtext.g:1855:1: (this_AbstractTokenAntlrAction_0= ruleAbstractTokenAntlrAction | this_Action_1= ruleAction )
            {
            // InternalXtext.g:1855:1: (this_AbstractTokenAntlrAction_0= ruleAbstractTokenAntlrAction | this_Action_1= ruleAction )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)||LA39_0==15||(LA39_0>=42 && LA39_0<=43)||(LA39_0>=45 && LA39_0<=46)) ) {
                alt39=1;
            }
            else if ( (LA39_0==27) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalXtext.g:1857:5: this_AbstractTokenAntlrAction_0= ruleAbstractTokenAntlrAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTokenAccess().getAbstractTokenAntlrActionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AbstractTokenAntlrAction_0=ruleAbstractTokenAntlrAction();

                    state._fsp--;

                     
                            current = this_AbstractTokenAntlrAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:1870:5: this_Action_1= ruleAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTokenAccess().getActionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Action_1=ruleAction();

                    state._fsp--;

                     
                            current = this_Action_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAbstractToken"


    // $ANTLR start "entryRuleAbstractTokenAntlrAction"
    // InternalXtext.g:1890:1: entryRuleAbstractTokenAntlrAction returns [EObject current=null] : iv_ruleAbstractTokenAntlrAction= ruleAbstractTokenAntlrAction EOF ;
    public final EObject entryRuleAbstractTokenAntlrAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTokenAntlrAction = null;


        try {
            // InternalXtext.g:1891:2: (iv_ruleAbstractTokenAntlrAction= ruleAbstractTokenAntlrAction EOF )
            // InternalXtext.g:1892:2: iv_ruleAbstractTokenAntlrAction= ruleAbstractTokenAntlrAction EOF
            {
             newCompositeNode(grammarAccess.getAbstractTokenAntlrActionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractTokenAntlrAction=ruleAbstractTokenAntlrAction();

            state._fsp--;

             current =iv_ruleAbstractTokenAntlrAction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractTokenAntlrAction"


    // $ANTLR start "ruleAbstractTokenAntlrAction"
    // InternalXtext.g:1899:1: ruleAbstractTokenAntlrAction returns [EObject current=null] : (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality (otherlv_1= 'preAction{' otherlv_2= '{' ( (lv_preAntlrAction_3_0= ruleActionCall ) ) otherlv_4= '}' ( (lv_isSemanticPredicate_5_0= '?' ) )? otherlv_6= '}' )? (otherlv_7= 'postAction{' otherlv_8= '{' ( (lv_postAntlrAction_9_0= ruleActionCall ) ) otherlv_10= '}' otherlv_11= '}' )? ) ;
    public final EObject ruleAbstractTokenAntlrAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_isSemanticPredicate_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject this_AbstractTokenWithCardinality_0 = null;

        AntlrDatatypeRuleToken lv_preAntlrAction_3_0 = null;

        AntlrDatatypeRuleToken lv_postAntlrAction_9_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:1905:7: ( (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality (otherlv_1= 'preAction{' otherlv_2= '{' ( (lv_preAntlrAction_3_0= ruleActionCall ) ) otherlv_4= '}' ( (lv_isSemanticPredicate_5_0= '?' ) )? otherlv_6= '}' )? (otherlv_7= 'postAction{' otherlv_8= '{' ( (lv_postAntlrAction_9_0= ruleActionCall ) ) otherlv_10= '}' otherlv_11= '}' )? ) )
            // InternalXtext.g:1907:1: (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality (otherlv_1= 'preAction{' otherlv_2= '{' ( (lv_preAntlrAction_3_0= ruleActionCall ) ) otherlv_4= '}' ( (lv_isSemanticPredicate_5_0= '?' ) )? otherlv_6= '}' )? (otherlv_7= 'postAction{' otherlv_8= '{' ( (lv_postAntlrAction_9_0= ruleActionCall ) ) otherlv_10= '}' otherlv_11= '}' )? )
            {
            // InternalXtext.g:1907:1: (this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality (otherlv_1= 'preAction{' otherlv_2= '{' ( (lv_preAntlrAction_3_0= ruleActionCall ) ) otherlv_4= '}' ( (lv_isSemanticPredicate_5_0= '?' ) )? otherlv_6= '}' )? (otherlv_7= 'postAction{' otherlv_8= '{' ( (lv_postAntlrAction_9_0= ruleActionCall ) ) otherlv_10= '}' otherlv_11= '}' )? )
            // InternalXtext.g:1909:5: this_AbstractTokenWithCardinality_0= ruleAbstractTokenWithCardinality (otherlv_1= 'preAction{' otherlv_2= '{' ( (lv_preAntlrAction_3_0= ruleActionCall ) ) otherlv_4= '}' ( (lv_isSemanticPredicate_5_0= '?' ) )? otherlv_6= '}' )? (otherlv_7= 'postAction{' otherlv_8= '{' ( (lv_postAntlrAction_9_0= ruleActionCall ) ) otherlv_10= '}' otherlv_11= '}' )?
            {
             
                    newCompositeNode(grammarAccess.getAbstractTokenAntlrActionAccess().getAbstractTokenWithCardinalityParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_42);
            this_AbstractTokenWithCardinality_0=ruleAbstractTokenWithCardinality();

            state._fsp--;

             
                    current = this_AbstractTokenWithCardinality_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:1920:1: (otherlv_1= 'preAction{' otherlv_2= '{' ( (lv_preAntlrAction_3_0= ruleActionCall ) ) otherlv_4= '}' ( (lv_isSemanticPredicate_5_0= '?' ) )? otherlv_6= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXtext.g:1921:2: otherlv_1= 'preAction{' otherlv_2= '{' ( (lv_preAntlrAction_3_0= ruleActionCall ) ) otherlv_4= '}' ( (lv_isSemanticPredicate_5_0= '?' ) )? otherlv_6= '}'
                    {
                    otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_22); 

                        	newLeafNode(otherlv_1, grammarAccess.getAbstractTokenAntlrActionAccess().getPreActionKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getAbstractTokenAntlrActionAccess().getLeftCurlyBracketKeyword_1_1());
                        
                    // InternalXtext.g:1935:1: ( (lv_preAntlrAction_3_0= ruleActionCall ) )
                    // InternalXtext.g:1936:1: (lv_preAntlrAction_3_0= ruleActionCall )
                    {
                    // InternalXtext.g:1936:1: (lv_preAntlrAction_3_0= ruleActionCall )
                    // InternalXtext.g:1937:3: lv_preAntlrAction_3_0= ruleActionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTokenAntlrActionAccess().getPreAntlrActionActionCallParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_preAntlrAction_3_0=ruleActionCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractTokenAntlrActionRule());
                    	        }
                           		set(
                           			current, 
                           			"preAntlrAction",
                            		lv_preAntlrAction_3_0, 
                            		"org.eclipse.xtext.Xtext.ActionCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_43); 

                        	newLeafNode(otherlv_4, grammarAccess.getAbstractTokenAntlrActionAccess().getRightCurlyBracketKeyword_1_3());
                        
                    // InternalXtext.g:1963:1: ( (lv_isSemanticPredicate_5_0= '?' ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==36) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalXtext.g:1964:1: (lv_isSemanticPredicate_5_0= '?' )
                            {
                            // InternalXtext.g:1964:1: (lv_isSemanticPredicate_5_0= '?' )
                            // InternalXtext.g:1965:3: lv_isSemanticPredicate_5_0= '?'
                            {
                            lv_isSemanticPredicate_5_0=(Token)match(input,36,FollowSets000.FOLLOW_23); 

                                    newLeafNode(lv_isSemanticPredicate_5_0, grammarAccess.getAbstractTokenAntlrActionAccess().getIsSemanticPredicateQuestionMarkKeyword_1_4_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAbstractTokenAntlrActionRule());
                            	        }
                                   		setWithLastConsumed(current, "isSemanticPredicate", true, "?");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_44); 

                        	newLeafNode(otherlv_6, grammarAccess.getAbstractTokenAntlrActionAccess().getRightCurlyBracketKeyword_1_5());
                        

                    }
                    break;

            }

            // InternalXtext.g:1993:1: (otherlv_7= 'postAction{' otherlv_8= '{' ( (lv_postAntlrAction_9_0= ruleActionCall ) ) otherlv_10= '}' otherlv_11= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXtext.g:1994:2: otherlv_7= 'postAction{' otherlv_8= '{' ( (lv_postAntlrAction_9_0= ruleActionCall ) ) otherlv_10= '}' otherlv_11= '}'
                    {
                    otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_22); 

                        	newLeafNode(otherlv_7, grammarAccess.getAbstractTokenAntlrActionAccess().getPostActionKeyword_2_0());
                        
                    otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_8, grammarAccess.getAbstractTokenAntlrActionAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // InternalXtext.g:2008:1: ( (lv_postAntlrAction_9_0= ruleActionCall ) )
                    // InternalXtext.g:2009:1: (lv_postAntlrAction_9_0= ruleActionCall )
                    {
                    // InternalXtext.g:2009:1: (lv_postAntlrAction_9_0= ruleActionCall )
                    // InternalXtext.g:2010:3: lv_postAntlrAction_9_0= ruleActionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractTokenAntlrActionAccess().getPostAntlrActionActionCallParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_postAntlrAction_9_0=ruleActionCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractTokenAntlrActionRule());
                    	        }
                           		set(
                           			current, 
                           			"postAntlrAction",
                            		lv_postAntlrAction_9_0, 
                            		"org.eclipse.xtext.Xtext.ActionCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_23); 

                        	newLeafNode(otherlv_10, grammarAccess.getAbstractTokenAntlrActionAccess().getRightCurlyBracketKeyword_2_3());
                        
                    otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_11, grammarAccess.getAbstractTokenAntlrActionAccess().getRightCurlyBracketKeyword_2_4());
                        

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
    // $ANTLR end "ruleAbstractTokenAntlrAction"


    // $ANTLR start "entryRuleAbstractTokenWithCardinality"
    // InternalXtext.g:2054:1: entryRuleAbstractTokenWithCardinality returns [EObject current=null] : iv_ruleAbstractTokenWithCardinality= ruleAbstractTokenWithCardinality EOF ;
    public final EObject entryRuleAbstractTokenWithCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTokenWithCardinality = null;


        try {
            // InternalXtext.g:2055:2: (iv_ruleAbstractTokenWithCardinality= ruleAbstractTokenWithCardinality EOF )
            // InternalXtext.g:2056:2: iv_ruleAbstractTokenWithCardinality= ruleAbstractTokenWithCardinality EOF
            {
             newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractTokenWithCardinality=ruleAbstractTokenWithCardinality();

            state._fsp--;

             current =iv_ruleAbstractTokenWithCardinality; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractTokenWithCardinality"


    // $ANTLR start "ruleAbstractTokenWithCardinality"
    // InternalXtext.g:2063:1: ruleAbstractTokenWithCardinality returns [EObject current=null] : ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) ;
    public final EObject ruleAbstractTokenWithCardinality() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;
        EObject this_Assignment_0 = null;

        EObject this_AbstractTerminal_1 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:2069:7: ( ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) )
            // InternalXtext.g:2071:1: ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            {
            // InternalXtext.g:2071:1: ( (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            // InternalXtext.g:2072:1: (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            {
            // InternalXtext.g:2072:1: (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // InternalXtext.g:2074:5: this_Assignment_0= ruleAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityAccess().getAssignmentParserRuleCall_0_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_45);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;

                     
                            current = this_Assignment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:2087:5: this_AbstractTerminal_1= ruleAbstractTerminal
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityAccess().getAbstractTerminalParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_45);
                    this_AbstractTerminal_1=ruleAbstractTerminal();

                    state._fsp--;

                     
                            current = this_AbstractTerminal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalXtext.g:2100:1: ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==22||LA45_0==36||LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXtext.g:2101:1: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    {
                    // InternalXtext.g:2101:1: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    // InternalXtext.g:2102:1: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    {
                    // InternalXtext.g:2102:1: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    int alt44=3;
                    switch ( input.LA(1) ) {
                    case 36:
                        {
                        alt44=1;
                        }
                        break;
                    case 22:
                        {
                        alt44=2;
                        }
                        break;
                    case 38:
                        {
                        alt44=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }

                    switch (alt44) {
                        case 1 :
                            // InternalXtext.g:2103:3: lv_cardinality_2_1= '?'
                            {
                            lv_cardinality_2_1=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                                    newLeafNode(lv_cardinality_2_1, grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityQuestionMarkKeyword_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
                            	        }
                                   		setWithLastConsumed(current, "cardinality", lv_cardinality_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // InternalXtext.g:2118:8: lv_cardinality_2_2= '*'
                            {
                            lv_cardinality_2_2=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                                    newLeafNode(lv_cardinality_2_2, grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAsteriskKeyword_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
                            	        }
                                   		setWithLastConsumed(current, "cardinality", lv_cardinality_2_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // InternalXtext.g:2133:8: lv_cardinality_2_3= '+'
                            {
                            lv_cardinality_2_3=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                                    newLeafNode(lv_cardinality_2_3, grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityPlusSignKeyword_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
                            	        }
                                   		setWithLastConsumed(current, "cardinality", lv_cardinality_2_3, null);
                            	    

                            }
                            break;

                    }


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
    // $ANTLR end "ruleAbstractTokenWithCardinality"


    // $ANTLR start "entryRuleAction"
    // InternalXtext.g:2163:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalXtext.g:2164:2: (iv_ruleAction= ruleAction EOF )
            // InternalXtext.g:2165:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalXtext.g:2172:1: ruleAction returns [EObject current=null] : (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_operator_4_1=null;
        Token lv_operator_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_feature_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:2178:7: ( (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) )
            // InternalXtext.g:2180:1: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            {
            // InternalXtext.g:2180:1: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            // InternalXtext.g:2181:2: otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0());
                
            // InternalXtext.g:2188:1: ( (lv_type_1_0= ruleTypeRef ) )
            // InternalXtext.g:2189:1: (lv_type_1_0= ruleTypeRef )
            {
            // InternalXtext.g:2189:1: (lv_type_1_0= ruleTypeRef )
            // InternalXtext.g:2190:3: lv_type_1_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getTypeTypeRefParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_46);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"org.eclipse.xtext.Xtext.TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalXtext.g:2209:1: (otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==17) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXtext.g:2210:2: otherlv_2= '.' ( (lv_feature_3_0= ruleValidID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current'
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getFullStopKeyword_2_0());
                        
                    // InternalXtext.g:2217:1: ( (lv_feature_3_0= ruleValidID ) )
                    // InternalXtext.g:2218:1: (lv_feature_3_0= ruleValidID )
                    {
                    // InternalXtext.g:2218:1: (lv_feature_3_0= ruleValidID )
                    // InternalXtext.g:2219:3: lv_feature_3_0= ruleValidID
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getFeatureValidIDParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_47);
                    lv_feature_3_0=ruleValidID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"feature",
                            		lv_feature_3_0, 
                            		"org.eclipse.xtext.Xtext.ValidID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalXtext.g:2238:1: ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) )
                    // InternalXtext.g:2239:1: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    {
                    // InternalXtext.g:2239:1: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    // InternalXtext.g:2240:1: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    {
                    // InternalXtext.g:2240:1: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==39) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==40) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalXtext.g:2241:3: lv_operator_4_1= '='
                            {
                            lv_operator_4_1=(Token)match(input,39,FollowSets000.FOLLOW_48); 

                                    newLeafNode(lv_operator_4_1, grammarAccess.getActionAccess().getOperatorEqualsSignKeyword_2_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_4_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // InternalXtext.g:2256:8: lv_operator_4_2= '+='
                            {
                            lv_operator_4_2=(Token)match(input,40,FollowSets000.FOLLOW_48); 

                                    newLeafNode(lv_operator_4_2, grammarAccess.getActionAccess().getOperatorPlusSignEqualsSignKeyword_2_2_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_4_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_23); 

                        	newLeafNode(otherlv_5, grammarAccess.getActionAccess().getCurrentKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAbstractTerminal"
    // InternalXtext.g:2302:1: entryRuleAbstractTerminal returns [EObject current=null] : iv_ruleAbstractTerminal= ruleAbstractTerminal EOF ;
    public final EObject entryRuleAbstractTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTerminal = null;


        try {
            // InternalXtext.g:2303:2: (iv_ruleAbstractTerminal= ruleAbstractTerminal EOF )
            // InternalXtext.g:2304:2: iv_ruleAbstractTerminal= ruleAbstractTerminal EOF
            {
             newCompositeNode(grammarAccess.getAbstractTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractTerminal=ruleAbstractTerminal();

            state._fsp--;

             current =iv_ruleAbstractTerminal; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractTerminal"


    // $ANTLR start "ruleAbstractTerminal"
    // InternalXtext.g:2311:1: ruleAbstractTerminal returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement | this_PredicatedKeyword_3= rulePredicatedKeyword | this_PredicatedRuleCall_4= rulePredicatedRuleCall | this_PredicatedGroup_5= rulePredicatedGroup ) ;
    public final EObject ruleAbstractTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_RuleCall_1 = null;

        EObject this_ParenthesizedElement_2 = null;

        EObject this_PredicatedKeyword_3 = null;

        EObject this_PredicatedRuleCall_4 = null;

        EObject this_PredicatedGroup_5 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:2317:7: ( (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement | this_PredicatedKeyword_3= rulePredicatedKeyword | this_PredicatedRuleCall_4= rulePredicatedRuleCall | this_PredicatedGroup_5= rulePredicatedGroup ) )
            // InternalXtext.g:2319:1: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement | this_PredicatedKeyword_3= rulePredicatedKeyword | this_PredicatedRuleCall_4= rulePredicatedRuleCall | this_PredicatedGroup_5= rulePredicatedGroup )
            {
            // InternalXtext.g:2319:1: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedElement_2= ruleParenthesizedElement | this_PredicatedKeyword_3= rulePredicatedKeyword | this_PredicatedRuleCall_4= rulePredicatedRuleCall | this_PredicatedGroup_5= rulePredicatedGroup )
            int alt48=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt48=1;
                }
                break;
            case RULE_ID:
            case 42:
            case 43:
                {
                alt48=2;
                }
                break;
            case 15:
                {
                alt48=3;
                }
                break;
            case 45:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt48=6;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt48=4;
                    }
                    break;
                case RULE_ID:
                case 42:
                case 43:
                    {
                    alt48=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 4, input);

                    throw nvae;
                }

                }
                break;
            case 46:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt48=6;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt48=4;
                    }
                    break;
                case RULE_ID:
                case 42:
                case 43:
                    {
                    alt48=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalXtext.g:2321:5: this_Keyword_0= ruleKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTerminalAccess().getKeywordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;

                     
                            current = this_Keyword_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:2334:5: this_RuleCall_1= ruleRuleCall
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTerminalAccess().getRuleCallParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;

                     
                            current = this_RuleCall_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXtext.g:2347:5: this_ParenthesizedElement_2= ruleParenthesizedElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTerminalAccess().getParenthesizedElementParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParenthesizedElement_2=ruleParenthesizedElement();

                    state._fsp--;

                     
                            current = this_ParenthesizedElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalXtext.g:2360:5: this_PredicatedKeyword_3= rulePredicatedKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTerminalAccess().getPredicatedKeywordParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PredicatedKeyword_3=rulePredicatedKeyword();

                    state._fsp--;

                     
                            current = this_PredicatedKeyword_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalXtext.g:2373:5: this_PredicatedRuleCall_4= rulePredicatedRuleCall
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTerminalAccess().getPredicatedRuleCallParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PredicatedRuleCall_4=rulePredicatedRuleCall();

                    state._fsp--;

                     
                            current = this_PredicatedRuleCall_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalXtext.g:2386:5: this_PredicatedGroup_5= rulePredicatedGroup
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTerminalAccess().getPredicatedGroupParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PredicatedGroup_5=rulePredicatedGroup();

                    state._fsp--;

                     
                            current = this_PredicatedGroup_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAbstractTerminal"


    // $ANTLR start "entryRuleKeyword"
    // InternalXtext.g:2406:1: entryRuleKeyword returns [EObject current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final EObject entryRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyword = null;


        try {
            // InternalXtext.g:2407:2: (iv_ruleKeyword= ruleKeyword EOF )
            // InternalXtext.g:2408:2: iv_ruleKeyword= ruleKeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;

             current =iv_ruleKeyword; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalXtext.g:2415:1: ruleKeyword returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule();
           		
            
        try {
            // InternalXtext.g:2421:7: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalXtext.g:2423:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalXtext.g:2423:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalXtext.g:2424:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalXtext.g:2424:1: (lv_value_0_0= RULE_STRING )
            // InternalXtext.g:2425:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_value_0_0, grammarAccess.getKeywordAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKeywordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleRuleCall"
    // InternalXtext.g:2451:1: entryRuleRuleCall returns [EObject current=null] : iv_ruleRuleCall= ruleRuleCall EOF ;
    public final EObject entryRuleRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleCall = null;


        try {
            // InternalXtext.g:2452:2: (iv_ruleRuleCall= ruleRuleCall EOF )
            // InternalXtext.g:2453:2: iv_ruleRuleCall= ruleRuleCall EOF
            {
             newCompositeNode(grammarAccess.getRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRuleCall=ruleRuleCall();

            state._fsp--;

             current =iv_ruleRuleCall; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRuleCall"


    // $ANTLR start "ruleRuleCall"
    // InternalXtext.g:2460:1: ruleRuleCall returns [EObject current=null] : ( ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleRuleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:2466:7: ( ( ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )? ) )
            // InternalXtext.g:2468:1: ( ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )? )
            {
            // InternalXtext.g:2468:1: ( ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )? )
            // InternalXtext.g:2469:1: ( ( ruleRuleID ) ) (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )?
            {
            // InternalXtext.g:2469:1: ( ( ruleRuleID ) )
            // InternalXtext.g:2470:1: ( ruleRuleID )
            {
            // InternalXtext.g:2470:1: ( ruleRuleID )
            // InternalXtext.g:2471:3: ruleRuleID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRuleCallAccess().getRuleAbstractRuleCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
            ruleRuleID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalXtext.g:2487:1: (otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalXtext.g:2488:2: otherlv_1= '<' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_37); 

                        	newLeafNode(otherlv_1, grammarAccess.getRuleCallAccess().getLessThanSignKeyword_1_0());
                        
                    // InternalXtext.g:2495:1: ( (lv_arguments_2_0= ruleNamedArgument ) )
                    // InternalXtext.g:2496:1: (lv_arguments_2_0= ruleNamedArgument )
                    {
                    // InternalXtext.g:2496:1: (lv_arguments_2_0= ruleNamedArgument )
                    // InternalXtext.g:2497:3: lv_arguments_2_0= ruleNamedArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_arguments_2_0=ruleNamedArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleCallRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_2_0, 
                            		"org.eclipse.xtext.Xtext.NamedArgument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalXtext.g:2516:1: (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==13) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalXtext.g:2517:2: otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_37); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getRuleCallAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // InternalXtext.g:2524:1: ( (lv_arguments_4_0= ruleNamedArgument ) )
                    	    // InternalXtext.g:2525:1: (lv_arguments_4_0= ruleNamedArgument )
                    	    {
                    	    // InternalXtext.g:2525:1: (lv_arguments_4_0= ruleNamedArgument )
                    	    // InternalXtext.g:2526:3: lv_arguments_4_0= ruleNamedArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_34);
                    	    lv_arguments_4_0=ruleNamedArgument();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRuleCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_4_0, 
                    	            		"org.eclipse.xtext.Xtext.NamedArgument");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_5, grammarAccess.getRuleCallAccess().getGreaterThanSignKeyword_1_3());
                        

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
    // $ANTLR end "ruleRuleCall"


    // $ANTLR start "entryRuleNamedArgument"
    // InternalXtext.g:2565:1: entryRuleNamedArgument returns [EObject current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final EObject entryRuleNamedArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArgument = null;


        try {
            // InternalXtext.g:2566:2: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalXtext.g:2567:2: iv_ruleNamedArgument= ruleNamedArgument EOF
            {
             newCompositeNode(grammarAccess.getNamedArgumentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNamedArgument=ruleNamedArgument();

            state._fsp--;

             current =iv_ruleNamedArgument; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // InternalXtext.g:2574:1: ruleNamedArgument returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) ) ) ;
    public final EObject ruleNamedArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_calledByName_1_0=null;
        EObject lv_value_2_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:2580:7: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) ) ) )
            // InternalXtext.g:2582:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) ) )
            {
            // InternalXtext.g:2582:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) ) )
            // InternalXtext.g:2583:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )? ( (lv_value_2_0= ruleDisjunction ) )
            {
            // InternalXtext.g:2583:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==39) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // InternalXtext.g:2584:1: ( (otherlv_0= RULE_ID ) ) ( (lv_calledByName_1_0= '=' ) )
                    {
                    // InternalXtext.g:2584:1: ( (otherlv_0= RULE_ID ) )
                    // InternalXtext.g:2585:1: (otherlv_0= RULE_ID )
                    {
                    // InternalXtext.g:2585:1: (otherlv_0= RULE_ID )
                    // InternalXtext.g:2586:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedArgumentRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_49); 

                    		newLeafNode(otherlv_0, grammarAccess.getNamedArgumentAccess().getParameterParameterCrossReference_0_0_0()); 
                    	

                    }


                    }

                    // InternalXtext.g:2600:1: ( (lv_calledByName_1_0= '=' ) )
                    // InternalXtext.g:2601:1: (lv_calledByName_1_0= '=' )
                    {
                    // InternalXtext.g:2601:1: (lv_calledByName_1_0= '=' )
                    // InternalXtext.g:2602:3: lv_calledByName_1_0= '='
                    {
                    lv_calledByName_1_0=(Token)match(input,39,FollowSets000.FOLLOW_37); 

                            newLeafNode(lv_calledByName_1_0, grammarAccess.getNamedArgumentAccess().getCalledByNameEqualsSignKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamedArgumentRule());
                    	        }
                           		setWithLastConsumed(current, "calledByName", true, "=");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalXtext.g:2623:1: ( (lv_value_2_0= ruleDisjunction ) )
            // InternalXtext.g:2624:1: (lv_value_2_0= ruleDisjunction )
            {
            // InternalXtext.g:2624:1: (lv_value_2_0= ruleDisjunction )
            // InternalXtext.g:2625:3: lv_value_2_0= ruleDisjunction
            {
             
            	        newCompositeNode(grammarAccess.getNamedArgumentAccess().getValueDisjunctionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleDisjunction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamedArgumentRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"org.eclipse.xtext.Xtext.Disjunction");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleLiteralCondition"
    // InternalXtext.g:2653:1: entryRuleLiteralCondition returns [EObject current=null] : iv_ruleLiteralCondition= ruleLiteralCondition EOF ;
    public final EObject entryRuleLiteralCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralCondition = null;


        try {
            // InternalXtext.g:2654:2: (iv_ruleLiteralCondition= ruleLiteralCondition EOF )
            // InternalXtext.g:2655:2: iv_ruleLiteralCondition= ruleLiteralCondition EOF
            {
             newCompositeNode(grammarAccess.getLiteralConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteralCondition=ruleLiteralCondition();

            state._fsp--;

             current =iv_ruleLiteralCondition; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleLiteralCondition"


    // $ANTLR start "ruleLiteralCondition"
    // InternalXtext.g:2662:1: ruleLiteralCondition returns [EObject current=null] : ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleLiteralCondition() throws RecognitionException {
        EObject current = null;

        Token lv_true_1_0=null;
        Token otherlv_2=null;

         enterRule();
           		
            
        try {
            // InternalXtext.g:2668:7: ( ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalXtext.g:2670:1: ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalXtext.g:2670:1: ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalXtext.g:2671:1: () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalXtext.g:2671:1: ()
            // InternalXtext.g:2672:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLiteralConditionAccess().getLiteralConditionAction_0(),
                        current);
                

            }

            // InternalXtext.g:2680:1: ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==42) ) {
                alt52=1;
            }
            else if ( (LA52_0==43) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalXtext.g:2681:1: ( (lv_true_1_0= 'true' ) )
                    {
                    // InternalXtext.g:2681:1: ( (lv_true_1_0= 'true' ) )
                    // InternalXtext.g:2682:1: (lv_true_1_0= 'true' )
                    {
                    // InternalXtext.g:2682:1: (lv_true_1_0= 'true' )
                    // InternalXtext.g:2683:3: lv_true_1_0= 'true'
                    {
                    lv_true_1_0=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                            newLeafNode(lv_true_1_0, grammarAccess.getLiteralConditionAccess().getTrueTrueKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralConditionRule());
                    	        }
                           		setWithLastConsumed(current, "true", true, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2703:2: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_2, grammarAccess.getLiteralConditionAccess().getFalseKeyword_1_1());
                        

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
    // $ANTLR end "ruleLiteralCondition"


    // $ANTLR start "entryRuleDisjunction"
    // InternalXtext.g:2721:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // InternalXtext.g:2722:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // InternalXtext.g:2723:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
             newCompositeNode(grammarAccess.getDisjunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;

             current =iv_ruleDisjunction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // InternalXtext.g:2730:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Conjunction_0 = null;

        EObject lv_right_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:2736:7: ( (this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // InternalXtext.g:2738:1: (this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // InternalXtext.g:2738:1: (this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )* )
            // InternalXtext.g:2740:5: this_Conjunction_0= ruleConjunction ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_36);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;

             
                    current = this_Conjunction_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:2751:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==33) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalXtext.g:2752:1: () otherlv_2= '|' ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // InternalXtext.g:2752:1: ()
            	    // InternalXtext.g:2753:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_37); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_1_1());
            	        
            	    // InternalXtext.g:2768:1: ( (lv_right_3_0= ruleConjunction ) )
            	    // InternalXtext.g:2769:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // InternalXtext.g:2769:1: (lv_right_3_0= ruleConjunction )
            	    // InternalXtext.g:2770:3: lv_right_3_0= ruleConjunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    lv_right_3_0=ruleConjunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDisjunctionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"org.eclipse.xtext.Xtext.Conjunction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // InternalXtext.g:2800:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalXtext.g:2801:2: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalXtext.g:2802:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // InternalXtext.g:2809:1: ruleConjunction returns [EObject current=null] : (this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:2815:7: ( (this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )* ) )
            // InternalXtext.g:2817:1: (this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )* )
            {
            // InternalXtext.g:2817:1: (this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )* )
            // InternalXtext.g:2819:5: this_Negation_0= ruleNegation ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_41);
            this_Negation_0=ruleNegation();

            state._fsp--;

             
                    current = this_Negation_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:2830:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==34) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalXtext.g:2831:1: () otherlv_2= '&' ( (lv_right_3_0= ruleNegation ) )
            	    {
            	    // InternalXtext.g:2831:1: ()
            	    // InternalXtext.g:2832:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_37); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConjunctionAccess().getAmpersandKeyword_1_1());
            	        
            	    // InternalXtext.g:2847:1: ( (lv_right_3_0= ruleNegation ) )
            	    // InternalXtext.g:2848:1: (lv_right_3_0= ruleNegation )
            	    {
            	    // InternalXtext.g:2848:1: (lv_right_3_0= ruleNegation )
            	    // InternalXtext.g:2849:3: lv_right_3_0= ruleNegation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightNegationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    lv_right_3_0=ruleNegation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"org.eclipse.xtext.Xtext.Negation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNegation"
    // InternalXtext.g:2879:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalXtext.g:2880:2: (iv_ruleNegation= ruleNegation EOF )
            // InternalXtext.g:2881:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalXtext.g:2888:1: ruleNegation returns [EObject current=null] : (this_Atom_0= ruleAtom | ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Atom_0 = null;

        EObject lv_value_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:2894:7: ( (this_Atom_0= ruleAtom | ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) ) ) )
            // InternalXtext.g:2896:1: (this_Atom_0= ruleAtom | ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) ) )
            {
            // InternalXtext.g:2896:1: (this_Atom_0= ruleAtom | ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID||LA55_0==15||(LA55_0>=42 && LA55_0<=43)) ) {
                alt55=1;
            }
            else if ( (LA55_0==44) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalXtext.g:2898:5: this_Atom_0= ruleAtom
                    {
                     
                            newCompositeNode(grammarAccess.getNegationAccess().getAtomParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Atom_0=ruleAtom();

                    state._fsp--;

                     
                            current = this_Atom_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:2910:1: ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) )
                    {
                    // InternalXtext.g:2910:1: ( () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) ) )
                    // InternalXtext.g:2911:1: () otherlv_2= '!' ( (lv_value_3_0= ruleNegation ) )
                    {
                    // InternalXtext.g:2911:1: ()
                    // InternalXtext.g:2912:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNegationAccess().getNegationAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_37); 

                        	newLeafNode(otherlv_2, grammarAccess.getNegationAccess().getExclamationMarkKeyword_1_1());
                        
                    // InternalXtext.g:2927:1: ( (lv_value_3_0= ruleNegation ) )
                    // InternalXtext.g:2928:1: (lv_value_3_0= ruleNegation )
                    {
                    // InternalXtext.g:2928:1: (lv_value_3_0= ruleNegation )
                    // InternalXtext.g:2929:3: lv_value_3_0= ruleNegation
                    {
                     
                    	        newCompositeNode(grammarAccess.getNegationAccess().getValueNegationParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_3_0=ruleNegation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNegationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"org.eclipse.xtext.Xtext.Negation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleAtom"
    // InternalXtext.g:2959:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalXtext.g:2960:2: (iv_ruleAtom= ruleAtom EOF )
            // InternalXtext.g:2961:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalXtext.g:2968:1: ruleAtom returns [EObject current=null] : (this_ParameterReference_0= ruleParameterReference | this_ParenthesizedCondition_1= ruleParenthesizedCondition | this_LiteralCondition_2= ruleLiteralCondition ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterReference_0 = null;

        EObject this_ParenthesizedCondition_1 = null;

        EObject this_LiteralCondition_2 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:2974:7: ( (this_ParameterReference_0= ruleParameterReference | this_ParenthesizedCondition_1= ruleParenthesizedCondition | this_LiteralCondition_2= ruleLiteralCondition ) )
            // InternalXtext.g:2976:1: (this_ParameterReference_0= ruleParameterReference | this_ParenthesizedCondition_1= ruleParenthesizedCondition | this_LiteralCondition_2= ruleLiteralCondition )
            {
            // InternalXtext.g:2976:1: (this_ParameterReference_0= ruleParameterReference | this_ParenthesizedCondition_1= ruleParenthesizedCondition | this_LiteralCondition_2= ruleLiteralCondition )
            int alt56=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt56=1;
                }
                break;
            case 15:
                {
                alt56=2;
                }
                break;
            case 42:
            case 43:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalXtext.g:2978:5: this_ParameterReference_0= ruleParameterReference
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getParameterReferenceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParameterReference_0=ruleParameterReference();

                    state._fsp--;

                     
                            current = this_ParameterReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:2991:5: this_ParenthesizedCondition_1= ruleParenthesizedCondition
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getParenthesizedConditionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParenthesizedCondition_1=ruleParenthesizedCondition();

                    state._fsp--;

                     
                            current = this_ParenthesizedCondition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXtext.g:3004:5: this_LiteralCondition_2= ruleLiteralCondition
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getLiteralConditionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LiteralCondition_2=ruleLiteralCondition();

                    state._fsp--;

                     
                            current = this_LiteralCondition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleParenthesizedCondition"
    // InternalXtext.g:3024:1: entryRuleParenthesizedCondition returns [EObject current=null] : iv_ruleParenthesizedCondition= ruleParenthesizedCondition EOF ;
    public final EObject entryRuleParenthesizedCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedCondition = null;


        try {
            // InternalXtext.g:3025:2: (iv_ruleParenthesizedCondition= ruleParenthesizedCondition EOF )
            // InternalXtext.g:3026:2: iv_ruleParenthesizedCondition= ruleParenthesizedCondition EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParenthesizedCondition=ruleParenthesizedCondition();

            state._fsp--;

             current =iv_ruleParenthesizedCondition; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesizedCondition"


    // $ANTLR start "ruleParenthesizedCondition"
    // InternalXtext.g:3033:1: ruleParenthesizedCondition returns [EObject current=null] : (otherlv_0= '(' this_Disjunction_1= ruleDisjunction otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Disjunction_1 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:3039:7: ( (otherlv_0= '(' this_Disjunction_1= ruleDisjunction otherlv_2= ')' ) )
            // InternalXtext.g:3041:1: (otherlv_0= '(' this_Disjunction_1= ruleDisjunction otherlv_2= ')' )
            {
            // InternalXtext.g:3041:1: (otherlv_0= '(' this_Disjunction_1= ruleDisjunction otherlv_2= ')' )
            // InternalXtext.g:3042:2: otherlv_0= '(' this_Disjunction_1= ruleDisjunction otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_37); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesizedConditionAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesizedConditionAccess().getDisjunctionParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_28);
            this_Disjunction_1=ruleDisjunction();

            state._fsp--;

             
                    current = this_Disjunction_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getParenthesizedConditionAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleParenthesizedCondition"


    // $ANTLR start "entryRuleParameterReference"
    // InternalXtext.g:3077:1: entryRuleParameterReference returns [EObject current=null] : iv_ruleParameterReference= ruleParameterReference EOF ;
    public final EObject entryRuleParameterReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterReference = null;


        try {
            // InternalXtext.g:3078:2: (iv_ruleParameterReference= ruleParameterReference EOF )
            // InternalXtext.g:3079:2: iv_ruleParameterReference= ruleParameterReference EOF
            {
             newCompositeNode(grammarAccess.getParameterReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameterReference=ruleParameterReference();

            state._fsp--;

             current =iv_ruleParameterReference; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterReference"


    // $ANTLR start "ruleParameterReference"
    // InternalXtext.g:3086:1: ruleParameterReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParameterReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule();
           		
            
        try {
            // InternalXtext.g:3092:7: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalXtext.g:3094:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalXtext.g:3094:1: ( (otherlv_0= RULE_ID ) )
            // InternalXtext.g:3095:1: (otherlv_0= RULE_ID )
            {
            // InternalXtext.g:3095:1: (otherlv_0= RULE_ID )
            // InternalXtext.g:3096:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0()); 
            	

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
    // $ANTLR end "ruleParameterReference"


    // $ANTLR start "entryRuleTerminalRuleCall"
    // InternalXtext.g:3117:1: entryRuleTerminalRuleCall returns [EObject current=null] : iv_ruleTerminalRuleCall= ruleTerminalRuleCall EOF ;
    public final EObject entryRuleTerminalRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalRuleCall = null;


        try {
            // InternalXtext.g:3118:2: (iv_ruleTerminalRuleCall= ruleTerminalRuleCall EOF )
            // InternalXtext.g:3119:2: iv_ruleTerminalRuleCall= ruleTerminalRuleCall EOF
            {
             newCompositeNode(grammarAccess.getTerminalRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerminalRuleCall=ruleTerminalRuleCall();

            state._fsp--;

             current =iv_ruleTerminalRuleCall; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalRuleCall"


    // $ANTLR start "ruleTerminalRuleCall"
    // InternalXtext.g:3126:1: ruleTerminalRuleCall returns [EObject current=null] : ( ( ruleRuleID ) ) ;
    public final EObject ruleTerminalRuleCall() throws RecognitionException {
        EObject current = null;

         enterRule();
           		
            
        try {
            // InternalXtext.g:3132:7: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:3134:1: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:3134:1: ( ( ruleRuleID ) )
            // InternalXtext.g:3135:1: ( ruleRuleID )
            {
            // InternalXtext.g:3135:1: ( ruleRuleID )
            // InternalXtext.g:3136:3: ruleRuleID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTerminalRuleCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTerminalRuleCallAccess().getRuleAbstractRuleCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             
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
    // $ANTLR end "ruleTerminalRuleCall"


    // $ANTLR start "entryRuleRuleID"
    // InternalXtext.g:3159:1: entryRuleRuleID returns [String current=null] : iv_ruleRuleID= ruleRuleID EOF ;
    public final String entryRuleRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleID = null;


        try {
            // InternalXtext.g:3160:2: (iv_ruleRuleID= ruleRuleID EOF )
            // InternalXtext.g:3161:2: iv_ruleRuleID= ruleRuleID EOF
            {
             newCompositeNode(grammarAccess.getRuleIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRuleID=ruleRuleID();

            state._fsp--;

             current =iv_ruleRuleID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRuleID"


    // $ANTLR start "ruleRuleID"
    // InternalXtext.g:3168:1: ruleRuleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleRuleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // InternalXtext.g:3171:28: ( (this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )* ) )
            // InternalXtext.g:3172:1: (this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )* )
            {
            // InternalXtext.g:3172:1: (this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )* )
            // InternalXtext.g:3173:5: this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )*
            {
             
                    newCompositeNode(grammarAccess.getRuleIDAccess().getValidIDParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_50);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            		current.merge(this_ValidID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:3183:1: (kw= '::' this_ValidID_2= ruleValidID )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==32) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalXtext.g:3184:2: kw= '::' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_3); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getRuleIDAccess().getColonColonKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getRuleIDAccess().getValidIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // $ANTLR end "ruleRuleID"


    // $ANTLR start "entryRuleValidID"
    // InternalXtext.g:3208:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalXtext.g:3209:2: (iv_ruleValidID= ruleValidID EOF )
            // InternalXtext.g:3210:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalXtext.g:3217:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXtext.g:3220:28: ( (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' ) )
            // InternalXtext.g:3221:1: (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' )
            {
            // InternalXtext.g:3221:1: (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' )
            int alt58=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt58=1;
                }
                break;
            case 42:
                {
                alt58=2;
                }
                break;
            case 43:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalXtext.g:3221:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:3230:2: kw= 'true'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValidIDAccess().getTrueKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalXtext.g:3237:2: kw= 'false'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValidIDAccess().getFalseKeyword_2()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRulePredicatedKeyword"
    // InternalXtext.g:3250:1: entryRulePredicatedKeyword returns [EObject current=null] : iv_rulePredicatedKeyword= rulePredicatedKeyword EOF ;
    public final EObject entryRulePredicatedKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatedKeyword = null;


        try {
            // InternalXtext.g:3251:2: (iv_rulePredicatedKeyword= rulePredicatedKeyword EOF )
            // InternalXtext.g:3252:2: iv_rulePredicatedKeyword= rulePredicatedKeyword EOF
            {
             newCompositeNode(grammarAccess.getPredicatedKeywordRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePredicatedKeyword=rulePredicatedKeyword();

            state._fsp--;

             current =iv_rulePredicatedKeyword; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePredicatedKeyword"


    // $ANTLR start "rulePredicatedKeyword"
    // InternalXtext.g:3259:1: rulePredicatedKeyword returns [EObject current=null] : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePredicatedKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_value_2_0=null;

         enterRule();
           		
            
        try {
            // InternalXtext.g:3265:7: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalXtext.g:3267:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalXtext.g:3267:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalXtext.g:3268:1: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalXtext.g:3268:1: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==45) ) {
                alt59=1;
            }
            else if ( (LA59_0==46) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalXtext.g:3269:1: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // InternalXtext.g:3269:1: ( (lv_predicated_0_0= '=>' ) )
                    // InternalXtext.g:3270:1: (lv_predicated_0_0= '=>' )
                    {
                    // InternalXtext.g:3270:1: (lv_predicated_0_0= '=>' )
                    // InternalXtext.g:3271:3: lv_predicated_0_0= '=>'
                    {
                    lv_predicated_0_0=(Token)match(input,45,FollowSets000.FOLLOW_11); 

                            newLeafNode(lv_predicated_0_0, grammarAccess.getPredicatedKeywordAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicatedKeywordRule());
                    	        }
                           		setWithLastConsumed(current, "predicated", true, "=>");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:3291:1: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // InternalXtext.g:3291:1: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // InternalXtext.g:3292:1: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // InternalXtext.g:3292:1: (lv_firstSetPredicated_1_0= '->' )
                    // InternalXtext.g:3293:3: lv_firstSetPredicated_1_0= '->'
                    {
                    lv_firstSetPredicated_1_0=(Token)match(input,46,FollowSets000.FOLLOW_11); 

                            newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicatedKeywordRule());
                    	        }
                           		setWithLastConsumed(current, "firstSetPredicated", true, "->");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalXtext.g:3314:1: ( (lv_value_2_0= RULE_STRING ) )
            // InternalXtext.g:3315:1: (lv_value_2_0= RULE_STRING )
            {
            // InternalXtext.g:3315:1: (lv_value_2_0= RULE_STRING )
            // InternalXtext.g:3316:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_value_2_0, grammarAccess.getPredicatedKeywordAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPredicatedKeywordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "rulePredicatedKeyword"


    // $ANTLR start "entryRulePredicatedRuleCall"
    // InternalXtext.g:3344:1: entryRulePredicatedRuleCall returns [EObject current=null] : iv_rulePredicatedRuleCall= rulePredicatedRuleCall EOF ;
    public final EObject entryRulePredicatedRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatedRuleCall = null;


        try {
            // InternalXtext.g:3345:2: (iv_rulePredicatedRuleCall= rulePredicatedRuleCall EOF )
            // InternalXtext.g:3346:2: iv_rulePredicatedRuleCall= rulePredicatedRuleCall EOF
            {
             newCompositeNode(grammarAccess.getPredicatedRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePredicatedRuleCall=rulePredicatedRuleCall();

            state._fsp--;

             current =iv_rulePredicatedRuleCall; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePredicatedRuleCall"


    // $ANTLR start "rulePredicatedRuleCall"
    // InternalXtext.g:3353:1: rulePredicatedRuleCall returns [EObject current=null] : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )? ) ;
    public final EObject rulePredicatedRuleCall() throws RecognitionException {
        EObject current = null;

        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:3359:7: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )? ) )
            // InternalXtext.g:3361:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )? )
            {
            // InternalXtext.g:3361:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )? )
            // InternalXtext.g:3362:1: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( ( ruleRuleID ) ) (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )?
            {
            // InternalXtext.g:3362:1: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==45) ) {
                alt60=1;
            }
            else if ( (LA60_0==46) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalXtext.g:3363:1: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // InternalXtext.g:3363:1: ( (lv_predicated_0_0= '=>' ) )
                    // InternalXtext.g:3364:1: (lv_predicated_0_0= '=>' )
                    {
                    // InternalXtext.g:3364:1: (lv_predicated_0_0= '=>' )
                    // InternalXtext.g:3365:3: lv_predicated_0_0= '=>'
                    {
                    lv_predicated_0_0=(Token)match(input,45,FollowSets000.FOLLOW_3); 

                            newLeafNode(lv_predicated_0_0, grammarAccess.getPredicatedRuleCallAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicatedRuleCallRule());
                    	        }
                           		setWithLastConsumed(current, "predicated", true, "=>");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:3385:1: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // InternalXtext.g:3385:1: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // InternalXtext.g:3386:1: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // InternalXtext.g:3386:1: (lv_firstSetPredicated_1_0= '->' )
                    // InternalXtext.g:3387:3: lv_firstSetPredicated_1_0= '->'
                    {
                    lv_firstSetPredicated_1_0=(Token)match(input,46,FollowSets000.FOLLOW_3); 

                            newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicatedRuleCallRule());
                    	        }
                           		setWithLastConsumed(current, "firstSetPredicated", true, "->");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalXtext.g:3408:1: ( ( ruleRuleID ) )
            // InternalXtext.g:3409:1: ( ruleRuleID )
            {
            // InternalXtext.g:3409:1: ( ruleRuleID )
            // InternalXtext.g:3410:3: ruleRuleID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPredicatedRuleCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPredicatedRuleCallAccess().getRuleAbstractRuleCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
            ruleRuleID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalXtext.g:3426:1: (otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==30) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalXtext.g:3427:2: otherlv_3= '<' ( (lv_arguments_4_0= ruleNamedArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_37); 

                        	newLeafNode(otherlv_3, grammarAccess.getPredicatedRuleCallAccess().getLessThanSignKeyword_2_0());
                        
                    // InternalXtext.g:3434:1: ( (lv_arguments_4_0= ruleNamedArgument ) )
                    // InternalXtext.g:3435:1: (lv_arguments_4_0= ruleNamedArgument )
                    {
                    // InternalXtext.g:3435:1: (lv_arguments_4_0= ruleNamedArgument )
                    // InternalXtext.g:3436:3: lv_arguments_4_0= ruleNamedArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicatedRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_arguments_4_0=ruleNamedArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPredicatedRuleCallRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_4_0, 
                            		"org.eclipse.xtext.Xtext.NamedArgument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalXtext.g:3455:1: (otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==13) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalXtext.g:3456:2: otherlv_5= ',' ( (lv_arguments_6_0= ruleNamedArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_37); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getPredicatedRuleCallAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // InternalXtext.g:3463:1: ( (lv_arguments_6_0= ruleNamedArgument ) )
                    	    // InternalXtext.g:3464:1: (lv_arguments_6_0= ruleNamedArgument )
                    	    {
                    	    // InternalXtext.g:3464:1: (lv_arguments_6_0= ruleNamedArgument )
                    	    // InternalXtext.g:3465:3: lv_arguments_6_0= ruleNamedArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPredicatedRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_34);
                    	    lv_arguments_6_0=ruleNamedArgument();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPredicatedRuleCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_6_0, 
                    	            		"org.eclipse.xtext.Xtext.NamedArgument");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_7, grammarAccess.getPredicatedRuleCallAccess().getGreaterThanSignKeyword_2_3());
                        

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
    // $ANTLR end "rulePredicatedRuleCall"


    // $ANTLR start "entryRuleAssignment"
    // InternalXtext.g:3504:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalXtext.g:3505:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalXtext.g:3506:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalXtext.g:3513:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_operator_3_1=null;
        Token lv_operator_3_2=null;
        Token lv_operator_3_3=null;
        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_terminal_4_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:3519:7: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) )
            // InternalXtext.g:3521:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            {
            // InternalXtext.g:3521:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            // InternalXtext.g:3522:1: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= ruleValidID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            {
            // InternalXtext.g:3522:1: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )?
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==45) ) {
                alt63=1;
            }
            else if ( (LA63_0==46) ) {
                alt63=2;
            }
            switch (alt63) {
                case 1 :
                    // InternalXtext.g:3523:1: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // InternalXtext.g:3523:1: ( (lv_predicated_0_0= '=>' ) )
                    // InternalXtext.g:3524:1: (lv_predicated_0_0= '=>' )
                    {
                    // InternalXtext.g:3524:1: (lv_predicated_0_0= '=>' )
                    // InternalXtext.g:3525:3: lv_predicated_0_0= '=>'
                    {
                    lv_predicated_0_0=(Token)match(input,45,FollowSets000.FOLLOW_3); 

                            newLeafNode(lv_predicated_0_0, grammarAccess.getAssignmentAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(current, "predicated", true, "=>");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:3545:1: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // InternalXtext.g:3545:1: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // InternalXtext.g:3546:1: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // InternalXtext.g:3546:1: (lv_firstSetPredicated_1_0= '->' )
                    // InternalXtext.g:3547:3: lv_firstSetPredicated_1_0= '->'
                    {
                    lv_firstSetPredicated_1_0=(Token)match(input,46,FollowSets000.FOLLOW_3); 

                            newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getAssignmentAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(current, "firstSetPredicated", true, "->");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalXtext.g:3568:1: ( (lv_feature_2_0= ruleValidID ) )
            // InternalXtext.g:3569:1: (lv_feature_2_0= ruleValidID )
            {
            // InternalXtext.g:3569:1: (lv_feature_2_0= ruleValidID )
            // InternalXtext.g:3570:3: lv_feature_2_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getFeatureValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_51);
            lv_feature_2_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"feature",
                    		lv_feature_2_0, 
                    		"org.eclipse.xtext.Xtext.ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalXtext.g:3589:1: ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) )
            // InternalXtext.g:3590:1: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            {
            // InternalXtext.g:3590:1: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            // InternalXtext.g:3591:1: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            {
            // InternalXtext.g:3591:1: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt64=1;
                }
                break;
            case 39:
                {
                alt64=2;
                }
                break;
            case 47:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalXtext.g:3592:3: lv_operator_3_1= '+='
                    {
                    lv_operator_3_1=(Token)match(input,40,FollowSets000.FOLLOW_52); 

                            newLeafNode(lv_operator_3_1, grammarAccess.getAssignmentAccess().getOperatorPlusSignEqualsSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalXtext.g:3607:8: lv_operator_3_2= '='
                    {
                    lv_operator_3_2=(Token)match(input,39,FollowSets000.FOLLOW_52); 

                            newLeafNode(lv_operator_3_2, grammarAccess.getAssignmentAccess().getOperatorEqualsSignKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalXtext.g:3622:8: lv_operator_3_3= '?='
                    {
                    lv_operator_3_3=(Token)match(input,47,FollowSets000.FOLLOW_52); 

                            newLeafNode(lv_operator_3_3, grammarAccess.getAssignmentAccess().getOperatorQuestionMarkEqualsSignKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_3_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // InternalXtext.g:3643:1: ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            // InternalXtext.g:3644:1: (lv_terminal_4_0= ruleAssignableTerminal )
            {
            // InternalXtext.g:3644:1: (lv_terminal_4_0= ruleAssignableTerminal )
            // InternalXtext.g:3645:3: lv_terminal_4_0= ruleAssignableTerminal
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getTerminalAssignableTerminalParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_terminal_4_0=ruleAssignableTerminal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"terminal",
                    		lv_terminal_4_0, 
                    		"org.eclipse.xtext.Xtext.AssignableTerminal");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignableTerminal"
    // InternalXtext.g:3673:1: entryRuleAssignableTerminal returns [EObject current=null] : iv_ruleAssignableTerminal= ruleAssignableTerminal EOF ;
    public final EObject entryRuleAssignableTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableTerminal = null;


        try {
            // InternalXtext.g:3674:2: (iv_ruleAssignableTerminal= ruleAssignableTerminal EOF )
            // InternalXtext.g:3675:2: iv_ruleAssignableTerminal= ruleAssignableTerminal EOF
            {
             newCompositeNode(grammarAccess.getAssignableTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignableTerminal=ruleAssignableTerminal();

            state._fsp--;

             current =iv_ruleAssignableTerminal; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignableTerminal"


    // $ANTLR start "ruleAssignableTerminal"
    // InternalXtext.g:3682:1: ruleAssignableTerminal returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference ) ;
    public final EObject ruleAssignableTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_RuleCall_1 = null;

        EObject this_ParenthesizedAssignableElement_2 = null;

        EObject this_CrossReference_3 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:3688:7: ( (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference ) )
            // InternalXtext.g:3690:1: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference )
            {
            // InternalXtext.g:3690:1: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall | this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement | this_CrossReference_3= ruleCrossReference )
            int alt65=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt65=1;
                }
                break;
            case RULE_ID:
            case 42:
            case 43:
                {
                alt65=2;
                }
                break;
            case 15:
                {
                alt65=3;
                }
                break;
            case 48:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalXtext.g:3692:5: this_Keyword_0= ruleKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getAssignableTerminalAccess().getKeywordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;

                     
                            current = this_Keyword_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:3705:5: this_RuleCall_1= ruleRuleCall
                    {
                     
                            newCompositeNode(grammarAccess.getAssignableTerminalAccess().getRuleCallParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;

                     
                            current = this_RuleCall_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXtext.g:3718:5: this_ParenthesizedAssignableElement_2= ruleParenthesizedAssignableElement
                    {
                     
                            newCompositeNode(grammarAccess.getAssignableTerminalAccess().getParenthesizedAssignableElementParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParenthesizedAssignableElement_2=ruleParenthesizedAssignableElement();

                    state._fsp--;

                     
                            current = this_ParenthesizedAssignableElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalXtext.g:3731:5: this_CrossReference_3= ruleCrossReference
                    {
                     
                            newCompositeNode(grammarAccess.getAssignableTerminalAccess().getCrossReferenceParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CrossReference_3=ruleCrossReference();

                    state._fsp--;

                     
                            current = this_CrossReference_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAssignableTerminal"


    // $ANTLR start "entryRuleParenthesizedAssignableElement"
    // InternalXtext.g:3751:1: entryRuleParenthesizedAssignableElement returns [EObject current=null] : iv_ruleParenthesizedAssignableElement= ruleParenthesizedAssignableElement EOF ;
    public final EObject entryRuleParenthesizedAssignableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedAssignableElement = null;


        try {
            // InternalXtext.g:3752:2: (iv_ruleParenthesizedAssignableElement= ruleParenthesizedAssignableElement EOF )
            // InternalXtext.g:3753:2: iv_ruleParenthesizedAssignableElement= ruleParenthesizedAssignableElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedAssignableElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParenthesizedAssignableElement=ruleParenthesizedAssignableElement();

            state._fsp--;

             current =iv_ruleParenthesizedAssignableElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesizedAssignableElement"


    // $ANTLR start "ruleParenthesizedAssignableElement"
    // InternalXtext.g:3760:1: ruleParenthesizedAssignableElement returns [EObject current=null] : (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedAssignableElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AssignableAlternatives_1 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:3766:7: ( (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' ) )
            // InternalXtext.g:3768:1: (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' )
            {
            // InternalXtext.g:3768:1: (otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')' )
            // InternalXtext.g:3769:2: otherlv_0= '(' this_AssignableAlternatives_1= ruleAssignableAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_52); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesizedAssignableElementAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesizedAssignableElementAccess().getAssignableAlternativesParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_28);
            this_AssignableAlternatives_1=ruleAssignableAlternatives();

            state._fsp--;

             
                    current = this_AssignableAlternatives_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getParenthesizedAssignableElementAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleParenthesizedAssignableElement"


    // $ANTLR start "entryRuleAssignableAlternatives"
    // InternalXtext.g:3804:1: entryRuleAssignableAlternatives returns [EObject current=null] : iv_ruleAssignableAlternatives= ruleAssignableAlternatives EOF ;
    public final EObject entryRuleAssignableAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableAlternatives = null;


        try {
            // InternalXtext.g:3805:2: (iv_ruleAssignableAlternatives= ruleAssignableAlternatives EOF )
            // InternalXtext.g:3806:2: iv_ruleAssignableAlternatives= ruleAssignableAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAssignableAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignableAlternatives=ruleAssignableAlternatives();

            state._fsp--;

             current =iv_ruleAssignableAlternatives; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignableAlternatives"


    // $ANTLR start "ruleAssignableAlternatives"
    // InternalXtext.g:3813:1: ruleAssignableAlternatives returns [EObject current=null] : (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) ;
    public final EObject ruleAssignableAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AssignableTerminal_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:3819:7: ( (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) )
            // InternalXtext.g:3821:1: (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            {
            // InternalXtext.g:3821:1: (this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            // InternalXtext.g:3823:5: this_AssignableTerminal_0= ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getAssignableAlternativesAccess().getAssignableTerminalParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_36);
            this_AssignableTerminal_0=ruleAssignableTerminal();

            state._fsp--;

             
                    current = this_AssignableTerminal_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:3834:1: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==33) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalXtext.g:3835:1: () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    {
                    // InternalXtext.g:3835:1: ()
                    // InternalXtext.g:3836:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getAssignableAlternativesAccess().getAlternativesElementsAction_1_0(),
                                current);
                        

                    }

                    // InternalXtext.g:3844:1: (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    int cnt66=0;
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==33) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalXtext.g:3845:2: otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    {
                    	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_52); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getAssignableAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	        
                    	    // InternalXtext.g:3852:1: ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    // InternalXtext.g:3853:1: (lv_elements_3_0= ruleAssignableTerminal )
                    	    {
                    	    // InternalXtext.g:3853:1: (lv_elements_3_0= ruleAssignableTerminal )
                    	    // InternalXtext.g:3854:3: lv_elements_3_0= ruleAssignableTerminal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssignableAlternativesAccess().getElementsAssignableTerminalParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_36);
                    	    lv_elements_3_0=ruleAssignableTerminal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssignableAlternativesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"org.eclipse.xtext.Xtext.AssignableTerminal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt66 >= 1 ) break loop66;
                                EarlyExitException eee =
                                    new EarlyExitException(66, input);
                                throw eee;
                        }
                        cnt66++;
                    } while (true);


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
    // $ANTLR end "ruleAssignableAlternatives"


    // $ANTLR start "entryRuleCrossReference"
    // InternalXtext.g:3886:1: entryRuleCrossReference returns [EObject current=null] : iv_ruleCrossReference= ruleCrossReference EOF ;
    public final EObject entryRuleCrossReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossReference = null;


        try {
            // InternalXtext.g:3887:2: (iv_ruleCrossReference= ruleCrossReference EOF )
            // InternalXtext.g:3888:2: iv_ruleCrossReference= ruleCrossReference EOF
            {
             newCompositeNode(grammarAccess.getCrossReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCrossReference=ruleCrossReference();

            state._fsp--;

             current =iv_ruleCrossReference; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCrossReference"


    // $ANTLR start "ruleCrossReference"
    // InternalXtext.g:3895:1: ruleCrossReference returns [EObject current=null] : (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleCrossReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_terminal_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:3901:7: ( (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) )
            // InternalXtext.g:3903:1: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            {
            // InternalXtext.g:3903:1: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            // InternalXtext.g:3904:2: otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_0, grammarAccess.getCrossReferenceAccess().getLeftSquareBracketKeyword_0());
                
            // InternalXtext.g:3911:1: ( (lv_type_1_0= ruleTypeRef ) )
            // InternalXtext.g:3912:1: (lv_type_1_0= ruleTypeRef )
            {
            // InternalXtext.g:3912:1: (lv_type_1_0= ruleTypeRef )
            // InternalXtext.g:3913:3: lv_type_1_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getCrossReferenceAccess().getTypeTypeRefParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_53);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCrossReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"org.eclipse.xtext.Xtext.TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalXtext.g:3932:1: (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==33) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXtext.g:3933:2: otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_31); 

                        	newLeafNode(otherlv_2, grammarAccess.getCrossReferenceAccess().getVerticalLineKeyword_2_0());
                        
                    // InternalXtext.g:3940:1: ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    // InternalXtext.g:3941:1: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    {
                    // InternalXtext.g:3941:1: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    // InternalXtext.g:3942:3: lv_terminal_3_0= ruleCrossReferenceableTerminal
                    {
                     
                    	        newCompositeNode(grammarAccess.getCrossReferenceAccess().getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_54);
                    lv_terminal_3_0=ruleCrossReferenceableTerminal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCrossReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"terminal",
                            		lv_terminal_3_0, 
                            		"org.eclipse.xtext.Xtext.CrossReferenceableTerminal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getCrossReferenceAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleCrossReference"


    // $ANTLR start "entryRuleCrossReferenceableTerminal"
    // InternalXtext.g:3979:1: entryRuleCrossReferenceableTerminal returns [EObject current=null] : iv_ruleCrossReferenceableTerminal= ruleCrossReferenceableTerminal EOF ;
    public final EObject entryRuleCrossReferenceableTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossReferenceableTerminal = null;


        try {
            // InternalXtext.g:3980:2: (iv_ruleCrossReferenceableTerminal= ruleCrossReferenceableTerminal EOF )
            // InternalXtext.g:3981:2: iv_ruleCrossReferenceableTerminal= ruleCrossReferenceableTerminal EOF
            {
             newCompositeNode(grammarAccess.getCrossReferenceableTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCrossReferenceableTerminal=ruleCrossReferenceableTerminal();

            state._fsp--;

             current =iv_ruleCrossReferenceableTerminal; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCrossReferenceableTerminal"


    // $ANTLR start "ruleCrossReferenceableTerminal"
    // InternalXtext.g:3988:1: ruleCrossReferenceableTerminal returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall ) ;
    public final EObject ruleCrossReferenceableTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_RuleCall_1 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:3994:7: ( (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall ) )
            // InternalXtext.g:3996:1: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall )
            {
            // InternalXtext.g:3996:1: (this_Keyword_0= ruleKeyword | this_RuleCall_1= ruleRuleCall )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_STRING) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_ID||(LA69_0>=42 && LA69_0<=43)) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalXtext.g:3998:5: this_Keyword_0= ruleKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getCrossReferenceableTerminalAccess().getKeywordParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;

                     
                            current = this_Keyword_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:4011:5: this_RuleCall_1= ruleRuleCall
                    {
                     
                            newCompositeNode(grammarAccess.getCrossReferenceableTerminalAccess().getRuleCallParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RuleCall_1=ruleRuleCall();

                    state._fsp--;

                     
                            current = this_RuleCall_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleCrossReferenceableTerminal"


    // $ANTLR start "entryRuleParenthesizedElement"
    // InternalXtext.g:4031:1: entryRuleParenthesizedElement returns [EObject current=null] : iv_ruleParenthesizedElement= ruleParenthesizedElement EOF ;
    public final EObject entryRuleParenthesizedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedElement = null;


        try {
            // InternalXtext.g:4032:2: (iv_ruleParenthesizedElement= ruleParenthesizedElement EOF )
            // InternalXtext.g:4033:2: iv_ruleParenthesizedElement= ruleParenthesizedElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParenthesizedElement=ruleParenthesizedElement();

            state._fsp--;

             current =iv_ruleParenthesizedElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesizedElement"


    // $ANTLR start "ruleParenthesizedElement"
    // InternalXtext.g:4040:1: ruleParenthesizedElement returns [EObject current=null] : (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Alternatives_1 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:4046:7: ( (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' ) )
            // InternalXtext.g:4048:1: (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' )
            {
            // InternalXtext.g:4048:1: (otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')' )
            // InternalXtext.g:4049:2: otherlv_0= '(' this_Alternatives_1= ruleAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_20); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesizedElementAccess().getAlternativesParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_28);
            this_Alternatives_1=ruleAlternatives();

            state._fsp--;

             
                    current = this_Alternatives_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleParenthesizedElement"


    // $ANTLR start "entryRulePredicatedGroup"
    // InternalXtext.g:4084:1: entryRulePredicatedGroup returns [EObject current=null] : iv_rulePredicatedGroup= rulePredicatedGroup EOF ;
    public final EObject entryRulePredicatedGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatedGroup = null;


        try {
            // InternalXtext.g:4085:2: (iv_rulePredicatedGroup= rulePredicatedGroup EOF )
            // InternalXtext.g:4086:2: iv_rulePredicatedGroup= rulePredicatedGroup EOF
            {
             newCompositeNode(grammarAccess.getPredicatedGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePredicatedGroup=rulePredicatedGroup();

            state._fsp--;

             current =iv_rulePredicatedGroup; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePredicatedGroup"


    // $ANTLR start "rulePredicatedGroup"
    // InternalXtext.g:4093:1: rulePredicatedGroup returns [EObject current=null] : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) ;
    public final EObject rulePredicatedGroup() throws RecognitionException {
        EObject current = null;

        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:4099:7: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) )
            // InternalXtext.g:4101:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            {
            // InternalXtext.g:4101:1: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            // InternalXtext.g:4102:1: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')'
            {
            // InternalXtext.g:4102:1: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==45) ) {
                alt70=1;
            }
            else if ( (LA70_0==46) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalXtext.g:4103:1: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // InternalXtext.g:4103:1: ( (lv_predicated_0_0= '=>' ) )
                    // InternalXtext.g:4104:1: (lv_predicated_0_0= '=>' )
                    {
                    // InternalXtext.g:4104:1: (lv_predicated_0_0= '=>' )
                    // InternalXtext.g:4105:3: lv_predicated_0_0= '=>'
                    {
                    lv_predicated_0_0=(Token)match(input,45,FollowSets000.FOLLOW_6); 

                            newLeafNode(lv_predicated_0_0, grammarAccess.getPredicatedGroupAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicatedGroupRule());
                    	        }
                           		setWithLastConsumed(current, "predicated", true, "=>");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:4125:1: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // InternalXtext.g:4125:1: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // InternalXtext.g:4126:1: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // InternalXtext.g:4126:1: (lv_firstSetPredicated_1_0= '->' )
                    // InternalXtext.g:4127:3: lv_firstSetPredicated_1_0= '->'
                    {
                    lv_firstSetPredicated_1_0=(Token)match(input,46,FollowSets000.FOLLOW_6); 

                            newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicatedGroupRule());
                    	        }
                           		setWithLastConsumed(current, "firstSetPredicated", true, "->");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_20); 

                	newLeafNode(otherlv_2, grammarAccess.getPredicatedGroupAccess().getLeftParenthesisKeyword_1());
                
            // InternalXtext.g:4155:1: ( (lv_elements_3_0= ruleAlternatives ) )
            // InternalXtext.g:4156:1: (lv_elements_3_0= ruleAlternatives )
            {
            // InternalXtext.g:4156:1: (lv_elements_3_0= ruleAlternatives )
            // InternalXtext.g:4157:3: lv_elements_3_0= ruleAlternatives
            {
             
            	        newCompositeNode(grammarAccess.getPredicatedGroupAccess().getElementsAlternativesParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_28);
            lv_elements_3_0=ruleAlternatives();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicatedGroupRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_3_0, 
                    		"org.eclipse.xtext.Xtext.Alternatives");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getPredicatedGroupAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "rulePredicatedGroup"


    // $ANTLR start "entryRuleTerminalRule"
    // InternalXtext.g:4192:1: entryRuleTerminalRule returns [EObject current=null] : iv_ruleTerminalRule= ruleTerminalRule EOF ;
    public final EObject entryRuleTerminalRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalRule = null;


        try {
            // InternalXtext.g:4193:2: (iv_ruleTerminalRule= ruleTerminalRule EOF )
            // InternalXtext.g:4194:2: iv_ruleTerminalRule= ruleTerminalRule EOF
            {
             newCompositeNode(grammarAccess.getTerminalRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerminalRule=ruleTerminalRule();

            state._fsp--;

             current =iv_ruleTerminalRule; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalRule"


    // $ANTLR start "ruleTerminalRule"
    // InternalXtext.g:4201:1: ruleTerminalRule returns [EObject current=null] : (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) ) | ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) ;
    public final EObject ruleTerminalRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fragment_1_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_alternatives_7_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:4207:7: ( (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) ) | ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) )
            // InternalXtext.g:4209:1: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) ) | ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            {
            // InternalXtext.g:4209:1: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) ) | ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            // InternalXtext.g:4210:2: otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) ) | ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_13); 

                	newLeafNode(otherlv_0, grammarAccess.getTerminalRuleAccess().getTerminalKeyword_0());
                
            // InternalXtext.g:4217:1: ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) ) | ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==21) ) {
                alt72=1;
            }
            else if ( (LA72_0==RULE_ID||(LA72_0>=42 && LA72_0<=43)) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalXtext.g:4218:1: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) )
                    {
                    // InternalXtext.g:4218:1: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) ) )
                    // InternalXtext.g:4219:1: ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= ruleValidID ) )
                    {
                    // InternalXtext.g:4219:1: ( (lv_fragment_1_0= 'fragment' ) )
                    // InternalXtext.g:4220:1: (lv_fragment_1_0= 'fragment' )
                    {
                    // InternalXtext.g:4220:1: (lv_fragment_1_0= 'fragment' )
                    // InternalXtext.g:4221:3: lv_fragment_1_0= 'fragment'
                    {
                    lv_fragment_1_0=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                            newLeafNode(lv_fragment_1_0, grammarAccess.getTerminalRuleAccess().getFragmentFragmentKeyword_1_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalRuleRule());
                    	        }
                           		setWithLastConsumed(current, "fragment", true, "fragment");
                    	    

                    }


                    }

                    // InternalXtext.g:4240:1: ( (lv_name_2_0= ruleValidID ) )
                    // InternalXtext.g:4241:1: (lv_name_2_0= ruleValidID )
                    {
                    // InternalXtext.g:4241:1: (lv_name_2_0= ruleValidID )
                    // InternalXtext.g:4242:3: lv_name_2_0= ruleValidID
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalRuleAccess().getNameValidIDParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_name_2_0=ruleValidID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"org.eclipse.xtext.Xtext.ValidID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:4264:1: ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    {
                    // InternalXtext.g:4264:1: ( ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    // InternalXtext.g:4265:1: ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    {
                    // InternalXtext.g:4265:1: ( (lv_name_3_0= ruleValidID ) )
                    // InternalXtext.g:4266:1: (lv_name_3_0= ruleValidID )
                    {
                    // InternalXtext.g:4266:1: (lv_name_3_0= ruleValidID )
                    // InternalXtext.g:4267:3: lv_name_3_0= ruleValidID
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalRuleAccess().getNameValidIDParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_55);
                    lv_name_3_0=ruleValidID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"org.eclipse.xtext.Xtext.ValidID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalXtext.g:4286:1: (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==23) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalXtext.g:4287:2: otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) )
                            {
                            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_16); 

                                	newLeafNode(otherlv_4, grammarAccess.getTerminalRuleAccess().getReturnsKeyword_1_1_1_0());
                                
                            // InternalXtext.g:4294:1: ( (lv_type_5_0= ruleTypeRef ) )
                            // InternalXtext.g:4295:1: (lv_type_5_0= ruleTypeRef )
                            {
                            // InternalXtext.g:4295:1: (lv_type_5_0= ruleTypeRef )
                            // InternalXtext.g:4296:3: lv_type_5_0= ruleTypeRef
                            {
                             
                            	        newCompositeNode(grammarAccess.getTerminalRuleAccess().getTypeTypeRefParserRuleCall_1_1_1_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_19);
                            lv_type_5_0=ruleTypeRef();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_5_0, 
                                    		"org.eclipse.xtext.Xtext.TypeRef");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_56); 

                	newLeafNode(otherlv_6, grammarAccess.getTerminalRuleAccess().getColonKeyword_2());
                
            // InternalXtext.g:4328:1: ( (lv_alternatives_7_0= ruleTerminalAlternatives ) )
            // InternalXtext.g:4329:1: (lv_alternatives_7_0= ruleTerminalAlternatives )
            {
            // InternalXtext.g:4329:1: (lv_alternatives_7_0= ruleTerminalAlternatives )
            // InternalXtext.g:4330:3: lv_alternatives_7_0= ruleTerminalAlternatives
            {
             
            	        newCompositeNode(grammarAccess.getTerminalRuleAccess().getAlternativesTerminalAlternativesParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            lv_alternatives_7_0=ruleTerminalAlternatives();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
            	        }
                   		set(
                   			current, 
                   			"alternatives",
                    		lv_alternatives_7_0, 
                    		"org.eclipse.xtext.Xtext.TerminalAlternatives");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getTerminalRuleAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleTerminalRule"


    // $ANTLR start "entryRuleTerminalAlternatives"
    // InternalXtext.g:4365:1: entryRuleTerminalAlternatives returns [EObject current=null] : iv_ruleTerminalAlternatives= ruleTerminalAlternatives EOF ;
    public final EObject entryRuleTerminalAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalAlternatives = null;


        try {
            // InternalXtext.g:4366:2: (iv_ruleTerminalAlternatives= ruleTerminalAlternatives EOF )
            // InternalXtext.g:4367:2: iv_ruleTerminalAlternatives= ruleTerminalAlternatives EOF
            {
             newCompositeNode(grammarAccess.getTerminalAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerminalAlternatives=ruleTerminalAlternatives();

            state._fsp--;

             current =iv_ruleTerminalAlternatives; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalAlternatives"


    // $ANTLR start "ruleTerminalAlternatives"
    // InternalXtext.g:4374:1: ruleTerminalAlternatives returns [EObject current=null] : (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) ;
    public final EObject ruleTerminalAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TerminalGroup_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:4380:7: ( (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) )
            // InternalXtext.g:4382:1: (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            {
            // InternalXtext.g:4382:1: (this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            // InternalXtext.g:4384:5: this_TerminalGroup_0= ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getTerminalAlternativesAccess().getTerminalGroupParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_36);
            this_TerminalGroup_0=ruleTerminalGroup();

            state._fsp--;

             
                    current = this_TerminalGroup_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:4395:1: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==33) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalXtext.g:4396:1: () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    {
                    // InternalXtext.g:4396:1: ()
                    // InternalXtext.g:4397:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getTerminalAlternativesAccess().getAlternativesElementsAction_1_0(),
                                current);
                        

                    }

                    // InternalXtext.g:4405:1: (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    int cnt73=0;
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==33) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalXtext.g:4406:2: otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    {
                    	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_56); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getTerminalAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	        
                    	    // InternalXtext.g:4413:1: ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    // InternalXtext.g:4414:1: (lv_elements_3_0= ruleTerminalGroup )
                    	    {
                    	    // InternalXtext.g:4414:1: (lv_elements_3_0= ruleTerminalGroup )
                    	    // InternalXtext.g:4415:3: lv_elements_3_0= ruleTerminalGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTerminalAlternativesAccess().getElementsTerminalGroupParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_36);
                    	    lv_elements_3_0=ruleTerminalGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTerminalAlternativesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"org.eclipse.xtext.Xtext.TerminalGroup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt73 >= 1 ) break loop73;
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                throw eee;
                        }
                        cnt73++;
                    } while (true);


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
    // $ANTLR end "ruleTerminalAlternatives"


    // $ANTLR start "entryRuleTerminalGroup"
    // InternalXtext.g:4447:1: entryRuleTerminalGroup returns [EObject current=null] : iv_ruleTerminalGroup= ruleTerminalGroup EOF ;
    public final EObject entryRuleTerminalGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalGroup = null;


        try {
            // InternalXtext.g:4448:2: (iv_ruleTerminalGroup= ruleTerminalGroup EOF )
            // InternalXtext.g:4449:2: iv_ruleTerminalGroup= ruleTerminalGroup EOF
            {
             newCompositeNode(grammarAccess.getTerminalGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerminalGroup=ruleTerminalGroup();

            state._fsp--;

             current =iv_ruleTerminalGroup; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalGroup"


    // $ANTLR start "ruleTerminalGroup"
    // InternalXtext.g:4456:1: ruleTerminalGroup returns [EObject current=null] : (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) ;
    public final EObject ruleTerminalGroup() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalToken_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:4462:7: ( (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) )
            // InternalXtext.g:4464:1: (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            {
            // InternalXtext.g:4464:1: (this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            // InternalXtext.g:4466:5: this_TerminalToken_0= ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getTerminalGroupAccess().getTerminalTokenParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_57);
            this_TerminalToken_0=ruleTerminalToken();

            state._fsp--;

             
                    current = this_TerminalToken_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:4477:1: ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_STRING && LA76_0<=RULE_ID)||LA76_0==15||LA76_0==17||(LA76_0>=42 && LA76_0<=44)||LA76_0==46||LA76_0==51) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalXtext.g:4478:1: () ( (lv_elements_2_0= ruleTerminalToken ) )+
                    {
                    // InternalXtext.g:4478:1: ()
                    // InternalXtext.g:4479:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getTerminalGroupAccess().getGroupElementsAction_1_0(),
                                current);
                        

                    }

                    // InternalXtext.g:4487:1: ( (lv_elements_2_0= ruleTerminalToken ) )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( ((LA75_0>=RULE_STRING && LA75_0<=RULE_ID)||LA75_0==15||LA75_0==17||(LA75_0>=42 && LA75_0<=44)||LA75_0==46||LA75_0==51) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalXtext.g:4488:1: (lv_elements_2_0= ruleTerminalToken )
                    	    {
                    	    // InternalXtext.g:4488:1: (lv_elements_2_0= ruleTerminalToken )
                    	    // InternalXtext.g:4489:3: lv_elements_2_0= ruleTerminalToken
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTerminalGroupAccess().getElementsTerminalTokenParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_57);
                    	    lv_elements_2_0=ruleTerminalToken();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTerminalGroupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_2_0, 
                    	            		"org.eclipse.xtext.Xtext.TerminalToken");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);


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
    // $ANTLR end "ruleTerminalGroup"


    // $ANTLR start "entryRuleTerminalToken"
    // InternalXtext.g:4519:1: entryRuleTerminalToken returns [EObject current=null] : iv_ruleTerminalToken= ruleTerminalToken EOF ;
    public final EObject entryRuleTerminalToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalToken = null;


        try {
            // InternalXtext.g:4520:2: (iv_ruleTerminalToken= ruleTerminalToken EOF )
            // InternalXtext.g:4521:2: iv_ruleTerminalToken= ruleTerminalToken EOF
            {
             newCompositeNode(grammarAccess.getTerminalTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerminalToken=ruleTerminalToken();

            state._fsp--;

             current =iv_ruleTerminalToken; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalToken"


    // $ANTLR start "ruleTerminalToken"
    // InternalXtext.g:4528:1: ruleTerminalToken returns [EObject current=null] : (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) ;
    public final EObject ruleTerminalToken() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_1_1=null;
        Token lv_cardinality_1_2=null;
        Token lv_cardinality_1_3=null;
        EObject this_TerminalTokenElement_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:4534:7: ( (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) )
            // InternalXtext.g:4536:1: (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            {
            // InternalXtext.g:4536:1: (this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            // InternalXtext.g:4538:5: this_TerminalTokenElement_0= ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getTerminalTokenAccess().getTerminalTokenElementParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_45);
            this_TerminalTokenElement_0=ruleTerminalTokenElement();

            state._fsp--;

             
                    current = this_TerminalTokenElement_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:4549:1: ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==22||LA78_0==36||LA78_0==38) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalXtext.g:4550:1: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    {
                    // InternalXtext.g:4550:1: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    // InternalXtext.g:4551:1: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    {
                    // InternalXtext.g:4551:1: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    int alt77=3;
                    switch ( input.LA(1) ) {
                    case 36:
                        {
                        alt77=1;
                        }
                        break;
                    case 22:
                        {
                        alt77=2;
                        }
                        break;
                    case 38:
                        {
                        alt77=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }

                    switch (alt77) {
                        case 1 :
                            // InternalXtext.g:4552:3: lv_cardinality_1_1= '?'
                            {
                            lv_cardinality_1_1=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                                    newLeafNode(lv_cardinality_1_1, grammarAccess.getTerminalTokenAccess().getCardinalityQuestionMarkKeyword_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTerminalTokenRule());
                            	        }
                                   		setWithLastConsumed(current, "cardinality", lv_cardinality_1_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // InternalXtext.g:4567:8: lv_cardinality_1_2= '*'
                            {
                            lv_cardinality_1_2=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                                    newLeafNode(lv_cardinality_1_2, grammarAccess.getTerminalTokenAccess().getCardinalityAsteriskKeyword_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTerminalTokenRule());
                            	        }
                                   		setWithLastConsumed(current, "cardinality", lv_cardinality_1_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // InternalXtext.g:4582:8: lv_cardinality_1_3= '+'
                            {
                            lv_cardinality_1_3=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                                    newLeafNode(lv_cardinality_1_3, grammarAccess.getTerminalTokenAccess().getCardinalityPlusSignKeyword_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTerminalTokenRule());
                            	        }
                                   		setWithLastConsumed(current, "cardinality", lv_cardinality_1_3, null);
                            	    

                            }
                            break;

                    }


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
    // $ANTLR end "ruleTerminalToken"


    // $ANTLR start "entryRuleTerminalTokenElement"
    // InternalXtext.g:4612:1: entryRuleTerminalTokenElement returns [EObject current=null] : iv_ruleTerminalTokenElement= ruleTerminalTokenElement EOF ;
    public final EObject entryRuleTerminalTokenElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalTokenElement = null;


        try {
            // InternalXtext.g:4613:2: (iv_ruleTerminalTokenElement= ruleTerminalTokenElement EOF )
            // InternalXtext.g:4614:2: iv_ruleTerminalTokenElement= ruleTerminalTokenElement EOF
            {
             newCompositeNode(grammarAccess.getTerminalTokenElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerminalTokenElement=ruleTerminalTokenElement();

            state._fsp--;

             current =iv_ruleTerminalTokenElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalTokenElement"


    // $ANTLR start "ruleTerminalTokenElement"
    // InternalXtext.g:4621:1: ruleTerminalTokenElement returns [EObject current=null] : (this_CharacterRange_0= ruleCharacterRange | this_TerminalRuleCall_1= ruleTerminalRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard | this_EOF_5= ruleEOF ) ;
    public final EObject ruleTerminalTokenElement() throws RecognitionException {
        EObject current = null;

        EObject this_CharacterRange_0 = null;

        EObject this_TerminalRuleCall_1 = null;

        EObject this_ParenthesizedTerminalElement_2 = null;

        EObject this_AbstractNegatedToken_3 = null;

        EObject this_Wildcard_4 = null;

        EObject this_EOF_5 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:4627:7: ( (this_CharacterRange_0= ruleCharacterRange | this_TerminalRuleCall_1= ruleTerminalRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard | this_EOF_5= ruleEOF ) )
            // InternalXtext.g:4629:1: (this_CharacterRange_0= ruleCharacterRange | this_TerminalRuleCall_1= ruleTerminalRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard | this_EOF_5= ruleEOF )
            {
            // InternalXtext.g:4629:1: (this_CharacterRange_0= ruleCharacterRange | this_TerminalRuleCall_1= ruleTerminalRuleCall | this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement | this_AbstractNegatedToken_3= ruleAbstractNegatedToken | this_Wildcard_4= ruleWildcard | this_EOF_5= ruleEOF )
            int alt79=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt79=1;
                }
                break;
            case RULE_ID:
            case 42:
            case 43:
                {
                alt79=2;
                }
                break;
            case 15:
                {
                alt79=3;
                }
                break;
            case 44:
            case 46:
                {
                alt79=4;
                }
                break;
            case 17:
                {
                alt79=5;
                }
                break;
            case 51:
                {
                alt79=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalXtext.g:4631:5: this_CharacterRange_0= ruleCharacterRange
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getCharacterRangeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CharacterRange_0=ruleCharacterRange();

                    state._fsp--;

                     
                            current = this_CharacterRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:4644:5: this_TerminalRuleCall_1= ruleTerminalRuleCall
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getTerminalRuleCallParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TerminalRuleCall_1=ruleTerminalRuleCall();

                    state._fsp--;

                     
                            current = this_TerminalRuleCall_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalXtext.g:4657:5: this_ParenthesizedTerminalElement_2= ruleParenthesizedTerminalElement
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getParenthesizedTerminalElementParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParenthesizedTerminalElement_2=ruleParenthesizedTerminalElement();

                    state._fsp--;

                     
                            current = this_ParenthesizedTerminalElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalXtext.g:4670:5: this_AbstractNegatedToken_3= ruleAbstractNegatedToken
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getAbstractNegatedTokenParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AbstractNegatedToken_3=ruleAbstractNegatedToken();

                    state._fsp--;

                     
                            current = this_AbstractNegatedToken_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalXtext.g:4683:5: this_Wildcard_4= ruleWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getWildcardParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Wildcard_4=ruleWildcard();

                    state._fsp--;

                     
                            current = this_Wildcard_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalXtext.g:4696:5: this_EOF_5= ruleEOF
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getEOFParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EOF_5=ruleEOF();

                    state._fsp--;

                     
                            current = this_EOF_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleTerminalTokenElement"


    // $ANTLR start "entryRuleParenthesizedTerminalElement"
    // InternalXtext.g:4716:1: entryRuleParenthesizedTerminalElement returns [EObject current=null] : iv_ruleParenthesizedTerminalElement= ruleParenthesizedTerminalElement EOF ;
    public final EObject entryRuleParenthesizedTerminalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedTerminalElement = null;


        try {
            // InternalXtext.g:4717:2: (iv_ruleParenthesizedTerminalElement= ruleParenthesizedTerminalElement EOF )
            // InternalXtext.g:4718:2: iv_ruleParenthesizedTerminalElement= ruleParenthesizedTerminalElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedTerminalElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParenthesizedTerminalElement=ruleParenthesizedTerminalElement();

            state._fsp--;

             current =iv_ruleParenthesizedTerminalElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesizedTerminalElement"


    // $ANTLR start "ruleParenthesizedTerminalElement"
    // InternalXtext.g:4725:1: ruleParenthesizedTerminalElement returns [EObject current=null] : (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedTerminalElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_TerminalAlternatives_1 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:4731:7: ( (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' ) )
            // InternalXtext.g:4733:1: (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' )
            {
            // InternalXtext.g:4733:1: (otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')' )
            // InternalXtext.g:4734:2: otherlv_0= '(' this_TerminalAlternatives_1= ruleTerminalAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_56); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesizedTerminalElementAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesizedTerminalElementAccess().getTerminalAlternativesParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_28);
            this_TerminalAlternatives_1=ruleTerminalAlternatives();

            state._fsp--;

             
                    current = this_TerminalAlternatives_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getParenthesizedTerminalElementAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleParenthesizedTerminalElement"


    // $ANTLR start "entryRuleAbstractNegatedToken"
    // InternalXtext.g:4769:1: entryRuleAbstractNegatedToken returns [EObject current=null] : iv_ruleAbstractNegatedToken= ruleAbstractNegatedToken EOF ;
    public final EObject entryRuleAbstractNegatedToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNegatedToken = null;


        try {
            // InternalXtext.g:4770:2: (iv_ruleAbstractNegatedToken= ruleAbstractNegatedToken EOF )
            // InternalXtext.g:4771:2: iv_ruleAbstractNegatedToken= ruleAbstractNegatedToken EOF
            {
             newCompositeNode(grammarAccess.getAbstractNegatedTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractNegatedToken=ruleAbstractNegatedToken();

            state._fsp--;

             current =iv_ruleAbstractNegatedToken; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractNegatedToken"


    // $ANTLR start "ruleAbstractNegatedToken"
    // InternalXtext.g:4778:1: ruleAbstractNegatedToken returns [EObject current=null] : (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken ) ;
    public final EObject ruleAbstractNegatedToken() throws RecognitionException {
        EObject current = null;

        EObject this_NegatedToken_0 = null;

        EObject this_UntilToken_1 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:4784:7: ( (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken ) )
            // InternalXtext.g:4786:1: (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken )
            {
            // InternalXtext.g:4786:1: (this_NegatedToken_0= ruleNegatedToken | this_UntilToken_1= ruleUntilToken )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==44) ) {
                alt80=1;
            }
            else if ( (LA80_0==46) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalXtext.g:4788:5: this_NegatedToken_0= ruleNegatedToken
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNegatedTokenAccess().getNegatedTokenParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NegatedToken_0=ruleNegatedToken();

                    state._fsp--;

                     
                            current = this_NegatedToken_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalXtext.g:4801:5: this_UntilToken_1= ruleUntilToken
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNegatedTokenAccess().getUntilTokenParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UntilToken_1=ruleUntilToken();

                    state._fsp--;

                     
                            current = this_UntilToken_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAbstractNegatedToken"


    // $ANTLR start "entryRuleNegatedToken"
    // InternalXtext.g:4821:1: entryRuleNegatedToken returns [EObject current=null] : iv_ruleNegatedToken= ruleNegatedToken EOF ;
    public final EObject entryRuleNegatedToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegatedToken = null;


        try {
            // InternalXtext.g:4822:2: (iv_ruleNegatedToken= ruleNegatedToken EOF )
            // InternalXtext.g:4823:2: iv_ruleNegatedToken= ruleNegatedToken EOF
            {
             newCompositeNode(grammarAccess.getNegatedTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNegatedToken=ruleNegatedToken();

            state._fsp--;

             current =iv_ruleNegatedToken; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegatedToken"


    // $ANTLR start "ruleNegatedToken"
    // InternalXtext.g:4830:1: ruleNegatedToken returns [EObject current=null] : (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final EObject ruleNegatedToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_terminal_1_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:4836:7: ( (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // InternalXtext.g:4838:1: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // InternalXtext.g:4838:1: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // InternalXtext.g:4839:2: otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_56); 

                	newLeafNode(otherlv_0, grammarAccess.getNegatedTokenAccess().getExclamationMarkKeyword_0());
                
            // InternalXtext.g:4846:1: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // InternalXtext.g:4847:1: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // InternalXtext.g:4847:1: (lv_terminal_1_0= ruleTerminalTokenElement )
            // InternalXtext.g:4848:3: lv_terminal_1_0= ruleTerminalTokenElement
            {
             
            	        newCompositeNode(grammarAccess.getNegatedTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_terminal_1_0=ruleTerminalTokenElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNegatedTokenRule());
            	        }
                   		set(
                   			current, 
                   			"terminal",
                    		lv_terminal_1_0, 
                    		"org.eclipse.xtext.Xtext.TerminalTokenElement");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNegatedToken"


    // $ANTLR start "entryRuleUntilToken"
    // InternalXtext.g:4876:1: entryRuleUntilToken returns [EObject current=null] : iv_ruleUntilToken= ruleUntilToken EOF ;
    public final EObject entryRuleUntilToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntilToken = null;


        try {
            // InternalXtext.g:4877:2: (iv_ruleUntilToken= ruleUntilToken EOF )
            // InternalXtext.g:4878:2: iv_ruleUntilToken= ruleUntilToken EOF
            {
             newCompositeNode(grammarAccess.getUntilTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUntilToken=ruleUntilToken();

            state._fsp--;

             current =iv_ruleUntilToken; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleUntilToken"


    // $ANTLR start "ruleUntilToken"
    // InternalXtext.g:4885:1: ruleUntilToken returns [EObject current=null] : (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final EObject ruleUntilToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_terminal_1_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:4891:7: ( (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // InternalXtext.g:4893:1: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // InternalXtext.g:4893:1: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // InternalXtext.g:4894:2: otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_56); 

                	newLeafNode(otherlv_0, grammarAccess.getUntilTokenAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // InternalXtext.g:4901:1: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // InternalXtext.g:4902:1: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // InternalXtext.g:4902:1: (lv_terminal_1_0= ruleTerminalTokenElement )
            // InternalXtext.g:4903:3: lv_terminal_1_0= ruleTerminalTokenElement
            {
             
            	        newCompositeNode(grammarAccess.getUntilTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_terminal_1_0=ruleTerminalTokenElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUntilTokenRule());
            	        }
                   		set(
                   			current, 
                   			"terminal",
                    		lv_terminal_1_0, 
                    		"org.eclipse.xtext.Xtext.TerminalTokenElement");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleUntilToken"


    // $ANTLR start "entryRuleWildcard"
    // InternalXtext.g:4931:1: entryRuleWildcard returns [EObject current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final EObject entryRuleWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcard = null;


        try {
            // InternalXtext.g:4932:2: (iv_ruleWildcard= ruleWildcard EOF )
            // InternalXtext.g:4933:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // InternalXtext.g:4940:1: ruleWildcard returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule();
           		
            
        try {
            // InternalXtext.g:4946:7: ( ( () otherlv_1= '.' ) )
            // InternalXtext.g:4948:1: ( () otherlv_1= '.' )
            {
            // InternalXtext.g:4948:1: ( () otherlv_1= '.' )
            // InternalXtext.g:4949:1: () otherlv_1= '.'
            {
            // InternalXtext.g:4949:1: ()
            // InternalXtext.g:4950:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWildcardAccess().getWildcardAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getWildcardAccess().getFullStopKeyword_1());
                

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
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleEOF"
    // InternalXtext.g:4974:1: entryRuleEOF returns [EObject current=null] : iv_ruleEOF= ruleEOF EOF ;
    public final EObject entryRuleEOF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOF = null;


        try {
            // InternalXtext.g:4975:2: (iv_ruleEOF= ruleEOF EOF )
            // InternalXtext.g:4976:2: iv_ruleEOF= ruleEOF EOF
            {
             newCompositeNode(grammarAccess.getEOFRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEOF=ruleEOF();

            state._fsp--;

             current =iv_ruleEOF; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEOF"


    // $ANTLR start "ruleEOF"
    // InternalXtext.g:4983:1: ruleEOF returns [EObject current=null] : ( () otherlv_1= 'EOF' ) ;
    public final EObject ruleEOF() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule();
           		
            
        try {
            // InternalXtext.g:4989:7: ( ( () otherlv_1= 'EOF' ) )
            // InternalXtext.g:4991:1: ( () otherlv_1= 'EOF' )
            {
            // InternalXtext.g:4991:1: ( () otherlv_1= 'EOF' )
            // InternalXtext.g:4992:1: () otherlv_1= 'EOF'
            {
            // InternalXtext.g:4992:1: ()
            // InternalXtext.g:4993:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEOFAccess().getEOFAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getEOFAccess().getEOFKeyword_1());
                

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
    // $ANTLR end "ruleEOF"


    // $ANTLR start "entryRuleCharacterRange"
    // InternalXtext.g:5017:1: entryRuleCharacterRange returns [EObject current=null] : iv_ruleCharacterRange= ruleCharacterRange EOF ;
    public final EObject entryRuleCharacterRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterRange = null;


        try {
            // InternalXtext.g:5018:2: (iv_ruleCharacterRange= ruleCharacterRange EOF )
            // InternalXtext.g:5019:2: iv_ruleCharacterRange= ruleCharacterRange EOF
            {
             newCompositeNode(grammarAccess.getCharacterRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCharacterRange=ruleCharacterRange();

            state._fsp--;

             current =iv_ruleCharacterRange; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacterRange"


    // $ANTLR start "ruleCharacterRange"
    // InternalXtext.g:5026:1: ruleCharacterRange returns [EObject current=null] : (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) ;
    public final EObject ruleCharacterRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Keyword_0 = null;

        EObject lv_right_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:5032:7: ( (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) )
            // InternalXtext.g:5034:1: (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            {
            // InternalXtext.g:5034:1: (this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            // InternalXtext.g:5036:5: this_Keyword_0= ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getCharacterRangeAccess().getKeywordParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_58);
            this_Keyword_0=ruleKeyword();

            state._fsp--;

             
                    current = this_Keyword_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:5047:1: ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==52) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalXtext.g:5048:1: () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) )
                    {
                    // InternalXtext.g:5048:1: ()
                    // InternalXtext.g:5049:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getCharacterRangeAccess().getCharacterRangeLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_11); 

                        	newLeafNode(otherlv_2, grammarAccess.getCharacterRangeAccess().getFullStopFullStopKeyword_1_1());
                        
                    // InternalXtext.g:5064:1: ( (lv_right_3_0= ruleKeyword ) )
                    // InternalXtext.g:5065:1: (lv_right_3_0= ruleKeyword )
                    {
                    // InternalXtext.g:5065:1: (lv_right_3_0= ruleKeyword )
                    // InternalXtext.g:5066:3: lv_right_3_0= ruleKeyword
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterRangeAccess().getRightKeywordParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=ruleKeyword();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterRangeRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"org.eclipse.xtext.Xtext.Keyword");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleCharacterRange"


    // $ANTLR start "entryRuleEnumRule"
    // InternalXtext.g:5096:1: entryRuleEnumRule returns [EObject current=null] : iv_ruleEnumRule= ruleEnumRule EOF ;
    public final EObject entryRuleEnumRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumRule = null;


        try {
            // InternalXtext.g:5097:2: (iv_ruleEnumRule= ruleEnumRule EOF )
            // InternalXtext.g:5098:2: iv_ruleEnumRule= ruleEnumRule EOF
            {
             newCompositeNode(grammarAccess.getEnumRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumRule=ruleEnumRule();

            state._fsp--;

             current =iv_ruleEnumRule; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumRule"


    // $ANTLR start "ruleEnumRule"
    // InternalXtext.g:5105:1: ruleEnumRule returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) ;
    public final EObject ruleEnumRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_alternatives_5_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:5111:7: ( (otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) )
            // InternalXtext.g:5113:1: (otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            {
            // InternalXtext.g:5113:1: (otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            // InternalXtext.g:5114:2: otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumRuleAccess().getEnumKeyword_0());
                
            // InternalXtext.g:5121:1: ( (lv_name_1_0= ruleValidID ) )
            // InternalXtext.g:5122:1: (lv_name_1_0= ruleValidID )
            {
            // InternalXtext.g:5122:1: (lv_name_1_0= ruleValidID )
            // InternalXtext.g:5123:3: lv_name_1_0= ruleValidID
            {
             
            	        newCompositeNode(grammarAccess.getEnumRuleAccess().getNameValidIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_55);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumRuleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.Xtext.ValidID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalXtext.g:5142:1: (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==23) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalXtext.g:5143:2: otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) )
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_16); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnumRuleAccess().getReturnsKeyword_2_0());
                        
                    // InternalXtext.g:5150:1: ( (lv_type_3_0= ruleTypeRef ) )
                    // InternalXtext.g:5151:1: (lv_type_3_0= ruleTypeRef )
                    {
                    // InternalXtext.g:5151:1: (lv_type_3_0= ruleTypeRef )
                    // InternalXtext.g:5152:3: lv_type_3_0= ruleTypeRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumRuleAccess().getTypeTypeRefParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_type_3_0=ruleTypeRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"org.eclipse.xtext.Xtext.TypeRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumRuleAccess().getColonKeyword_3());
                
            // InternalXtext.g:5180:1: ( (lv_alternatives_5_0= ruleEnumLiterals ) )
            // InternalXtext.g:5181:1: (lv_alternatives_5_0= ruleEnumLiterals )
            {
            // InternalXtext.g:5181:1: (lv_alternatives_5_0= ruleEnumLiterals )
            // InternalXtext.g:5182:3: lv_alternatives_5_0= ruleEnumLiterals
            {
             
            	        newCompositeNode(grammarAccess.getEnumRuleAccess().getAlternativesEnumLiteralsParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            lv_alternatives_5_0=ruleEnumLiterals();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumRuleRule());
            	        }
                   		set(
                   			current, 
                   			"alternatives",
                    		lv_alternatives_5_0, 
                    		"org.eclipse.xtext.Xtext.EnumLiterals");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumRuleAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleEnumRule"


    // $ANTLR start "entryRuleEnumLiterals"
    // InternalXtext.g:5217:1: entryRuleEnumLiterals returns [EObject current=null] : iv_ruleEnumLiterals= ruleEnumLiterals EOF ;
    public final EObject entryRuleEnumLiterals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiterals = null;


        try {
            // InternalXtext.g:5218:2: (iv_ruleEnumLiterals= ruleEnumLiterals EOF )
            // InternalXtext.g:5219:2: iv_ruleEnumLiterals= ruleEnumLiterals EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumLiterals=ruleEnumLiterals();

            state._fsp--;

             current =iv_ruleEnumLiterals; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumLiterals"


    // $ANTLR start "ruleEnumLiterals"
    // InternalXtext.g:5226:1: ruleEnumLiterals returns [EObject current=null] : (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) ;
    public final EObject ruleEnumLiterals() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EnumLiteralDeclaration_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:5232:7: ( (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) )
            // InternalXtext.g:5234:1: (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            {
            // InternalXtext.g:5234:1: (this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            // InternalXtext.g:5236:5: this_EnumLiteralDeclaration_0= ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getEnumLiteralsAccess().getEnumLiteralDeclarationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_36);
            this_EnumLiteralDeclaration_0=ruleEnumLiteralDeclaration();

            state._fsp--;

             
                    current = this_EnumLiteralDeclaration_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalXtext.g:5247:1: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==33) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalXtext.g:5248:1: () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    {
                    // InternalXtext.g:5248:1: ()
                    // InternalXtext.g:5249:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getEnumLiteralsAccess().getAlternativesElementsAction_1_0(),
                                current);
                        

                    }

                    // InternalXtext.g:5257:1: (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    int cnt83=0;
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==33) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalXtext.g:5258:2: otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    {
                    	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_16); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getEnumLiteralsAccess().getVerticalLineKeyword_1_1_0());
                    	        
                    	    // InternalXtext.g:5265:1: ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    // InternalXtext.g:5266:1: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    {
                    	    // InternalXtext.g:5266:1: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    // InternalXtext.g:5267:3: lv_elements_3_0= ruleEnumLiteralDeclaration
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumLiteralsAccess().getElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_36);
                    	    lv_elements_3_0=ruleEnumLiteralDeclaration();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEnumLiteralsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"org.eclipse.xtext.Xtext.EnumLiteralDeclaration");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt83 >= 1 ) break loop83;
                                EarlyExitException eee =
                                    new EarlyExitException(83, input);
                                throw eee;
                        }
                        cnt83++;
                    } while (true);


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
    // $ANTLR end "ruleEnumLiterals"


    // $ANTLR start "entryRuleEnumLiteralDeclaration"
    // InternalXtext.g:5299:1: entryRuleEnumLiteralDeclaration returns [EObject current=null] : iv_ruleEnumLiteralDeclaration= ruleEnumLiteralDeclaration EOF ;
    public final EObject entryRuleEnumLiteralDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteralDeclaration = null;


        try {
            // InternalXtext.g:5300:2: (iv_ruleEnumLiteralDeclaration= ruleEnumLiteralDeclaration EOF )
            // InternalXtext.g:5301:2: iv_ruleEnumLiteralDeclaration= ruleEnumLiteralDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumLiteralDeclaration=ruleEnumLiteralDeclaration();

            state._fsp--;

             current =iv_ruleEnumLiteralDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumLiteralDeclaration"


    // $ANTLR start "ruleEnumLiteralDeclaration"
    // InternalXtext.g:5308:1: ruleEnumLiteralDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) ;
    public final EObject ruleEnumLiteralDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_literal_2_0 = null;


         enterRule();
           		
            
        try {
            // InternalXtext.g:5314:7: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) )
            // InternalXtext.g:5316:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            {
            // InternalXtext.g:5316:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            // InternalXtext.g:5317:1: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            {
            // InternalXtext.g:5317:1: ( (otherlv_0= RULE_ID ) )
            // InternalXtext.g:5318:1: (otherlv_0= RULE_ID )
            {
            // InternalXtext.g:5318:1: (otherlv_0= RULE_ID )
            // InternalXtext.g:5319:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumLiteralDeclarationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_59); 

            		newLeafNode(otherlv_0, grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralCrossReference_0_0()); 
            	

            }


            }

            // InternalXtext.g:5333:1: (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==39) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalXtext.g:5334:2: otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) )
                    {
                    otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_11); 

                        	newLeafNode(otherlv_1, grammarAccess.getEnumLiteralDeclarationAccess().getEqualsSignKeyword_1_0());
                        
                    // InternalXtext.g:5341:1: ( (lv_literal_2_0= ruleKeyword ) )
                    // InternalXtext.g:5342:1: (lv_literal_2_0= ruleKeyword )
                    {
                    // InternalXtext.g:5342:1: (lv_literal_2_0= ruleKeyword )
                    // InternalXtext.g:5343:3: lv_literal_2_0= ruleKeyword
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralKeywordParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_literal_2_0=ruleKeyword();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumLiteralDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_2_0, 
                            		"org.eclipse.xtext.Xtext.Keyword");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleEnumLiteralDeclaration"

    // Delegated rules


    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA43_eotS =
        "\13\uffff";
    static final String DFA43_eofS =
        "\3\uffff\3\6\1\uffff\3\6\1\uffff";
    static final String DFA43_minS =
        "\6\4\1\uffff\3\4\1\uffff";
    static final String DFA43_maxS =
        "\1\56\2\53\3\57\1\uffff\3\57\1\uffff";
    static final String DFA43_acceptS =
        "\6\uffff\1\2\3\uffff\1\1";
    static final String DFA43_specialS =
        "\13\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\6\1\3\11\uffff\1\6\32\uffff\1\4\1\5\1\uffff\1\1\1\2",
            "\1\6\1\7\11\uffff\1\6\32\uffff\1\10\1\11",
            "\1\6\1\7\11\uffff\1\6\32\uffff\1\10\1\11",
            "\2\6\11\uffff\2\6\5\uffff\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\7\6\2\12\1\uffff\2\6\1\uffff\2\6\1\12",
            "\2\6\11\uffff\2\6\5\uffff\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\7\6\2\12\1\uffff\2\6\1\uffff\2\6\1\12",
            "\2\6\11\uffff\2\6\5\uffff\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\7\6\2\12\1\uffff\2\6\1\uffff\2\6\1\12",
            "",
            "\2\6\11\uffff\2\6\5\uffff\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\7\6\2\12\1\uffff\2\6\1\uffff\2\6\1\12",
            "\2\6\11\uffff\2\6\5\uffff\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\7\6\2\12\1\uffff\2\6\1\uffff\2\6\1\12",
            "\2\6\11\uffff\2\6\5\uffff\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\1\6\1\uffff\7\6\2\12\1\uffff\2\6\1\uffff\2\6\1\12",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "2072:1: (this_Assignment_0= ruleAssignment | this_AbstractTerminal_1= ruleAbstractTerminal )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000C0000000020L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00240C0000345020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00240C0000347020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000C0000010020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00240C0000345022L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000C0000200020L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000025C04000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000025004000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000025804000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00006C0048008030L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000C0000010030L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000C0000000030L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000020L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00001C0000008020L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00006C0008008030L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00006C0008008032L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002800000002L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001010000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000005000400002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000010020000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000018000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000818000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00010C0000008030L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002000200000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00085C0000028030L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00085C0000028032L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000008000000002L});
    }


}