/*
 * generated by Xtext
 */
grammar PsiInternalBug311337TestLanguage;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.linking.lazy.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.linking.lazy.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.linking.lazy.idea.lang.Bug311337TestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.linking.lazy.services.Bug311337TestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

	protected Bug311337TestLanguageGrammarAccess grammarAccess;

	protected Bug311337TestLanguageElementTypeProvider elementTypeProvider;

	public PsiInternalBug311337TestLanguageParser(PsiBuilder builder, TokenStream input, Bug311337TestLanguageElementTypeProvider elementTypeProvider, Bug311337TestLanguageGrammarAccess grammarAccess) {
		this(input);
		setPsiBuilder(builder);
    	this.grammarAccess = grammarAccess;
		this.elementTypeProvider = elementTypeProvider;
	}

	@Override
	protected String getFirstRuleName() {
		return "Model";
	}

}

//Entry rule entryRuleModel
entryRuleModel:
	{ markComposite(elementTypeProvider.getModelElementType()); }
	ruleModel
	{ doneComposite(); }
	EOF;

// Rule Model
ruleModel:
	(
		(
			{
				markComposite(elementTypeProvider.getModel_DefDefinitionParserRuleCall_0ElementType());
			}
			lv_def_0_0=ruleDefinition
			{
				doneComposite();
			}
		)
	)+
;

//Entry rule entryRuleDefinition
entryRuleDefinition:
	{ markComposite(elementTypeProvider.getDefinitionElementType()); }
	ruleDefinition
	{ doneComposite(); }
	EOF;

// Rule Definition
ruleDefinition:
	(
		{
			markLeaf();
		}
		otherlv_0='(def)'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getDefinition_DefKeyword_0ElementType());
		}
		(
			(
				{
					markLeaf();
				}
				lv_name_1_0=RULE_ID
				{
					doneLeaf(lv_name_1_0, elementTypeProvider.getDefinition_NameIDTerminalRuleCall_1_0ElementType());
				}
			)
		)
		{
			markLeaf();
		}
		otherlv_2=':'
		{
			doneLeaf(otherlv_2, elementTypeProvider.getDefinition_ColonKeyword_2ElementType());
		}
		(
			(
				{
					markComposite(elementTypeProvider.getDefinition_ChildChildParserRuleCall_3_0ElementType());
				}
				lv_child_3_0=ruleChild
				{
					doneComposite();
				}
			)
		)
		(
			(
				{
					markComposite(elementTypeProvider.getDefinition_RefReferenceParserRuleCall_4_0ElementType());
				}
				lv_ref_4_0=ruleReference
				{
					doneComposite();
				}
			)
		)?
	)
;

//Entry rule entryRuleChild
entryRuleChild:
	{ markComposite(elementTypeProvider.getChildElementType()); }
	ruleChild
	{ doneComposite(); }
	EOF;

// Rule Child
ruleChild:
	(
		{
			markLeaf();
		}
		otherlv_0='(child)'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getChild_ChildKeyword_0ElementType());
		}
		(
			(
				{
					markLeaf();
				}
				lv_name_1_0=RULE_ID
				{
					doneLeaf(lv_name_1_0, elementTypeProvider.getChild_NameIDTerminalRuleCall_1_0ElementType());
				}
			)
		)
		{
			markLeaf();
		}
		otherlv_2=':'
		{
			doneLeaf(otherlv_2, elementTypeProvider.getChild_ColonKeyword_2ElementType());
		}
		(
			(
				{
					markLeaf();
				}
				otherlv_3=RULE_ID
				{
					doneLeaf(otherlv_3, elementTypeProvider.getChild_LinkDefinitionCrossReference_3_0ElementType());
				}
			)
		)?
	)
;

//Entry rule entryRuleReference
entryRuleReference:
	{ markComposite(elementTypeProvider.getReferenceElementType()); }
	ruleReference
	{ doneComposite(); }
	EOF;

// Rule Reference
ruleReference:
	(
		{
			markLeaf();
		}
		otherlv_0='(ref)'
		{
			doneLeaf(otherlv_0, elementTypeProvider.getReference_RefKeyword_0ElementType());
		}
		(
			(
				{
					markLeaf();
				}
				otherlv_1=RULE_ID
				{
					doneLeaf(otherlv_1, elementTypeProvider.getReference_RefChildChildCrossReference_1_0ElementType());
				}
			)
		)
		(
			{
				markLeaf();
			}
			otherlv_2=':'
			{
				doneLeaf(otherlv_2, elementTypeProvider.getReference_ColonKeyword_2_0ElementType());
			}
			(
				{
					precedeComposite(elementTypeProvider.getReference_NestedRefLeftAction_2_1ElementType());
					doneComposite();
				}
			)
			(
				(
					{
						markLeaf();
					}
					otherlv_4=RULE_ID
					{
						doneLeaf(otherlv_4, elementTypeProvider.getReference_RefChildChildCrossReference_2_2_0ElementType());
					}
				)
			)
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;