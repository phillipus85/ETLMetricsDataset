/*
 * generated by Xtext 2.9.1
 */
grammar InternalGrammarSql;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package co.edu.uniandes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package co.edu.uniandes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.services.GrammarSqlGrammarAccess;

}

@parser::members {

 	private GrammarSqlGrammarAccess grammarAccess;

    public InternalGrammarSqlParser(TokenStream input, GrammarSqlGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected GrammarSqlGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getTablesTableParserRuleCall_0());
			}
			lv_tables_0_0=ruleTable
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"tables",
					lv_tables_0_0,
					"co.edu.uniandes.GrammarSql.Table");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	iv_ruleTable=ruleTable
	{ $current=$iv_ruleTable.current; }
	EOF;

// Rule Table
ruleTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CREATE'
		{
			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getCREATEKeyword_0());
		}
		otherlv_1='TABLE'
		{
			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTABLEKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		this_LPAR_3=RULE_LPAR
		{
			newLeafNode(this_LPAR_3, grammarAccess.getTableAccess().getLPARTerminalRuleCall_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTableAccess().getElementsColumnParserRuleCall_4_0_0());
					}
					lv_elements_4_1=ruleColumn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTableRule());
						}
						add(
							$current,
							"elements",
							lv_elements_4_1,
							"co.edu.uniandes.GrammarSql.Column");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getTableAccess().getElementsPrimaryKeyParserRuleCall_4_0_1());
					}
					lv_elements_4_2=rulePrimaryKey
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTableRule());
						}
						add(
							$current,
							"elements",
							lv_elements_4_2,
							"co.edu.uniandes.GrammarSql.PrimaryKey");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getTableAccess().getElementsForeignKeyParserRuleCall_4_0_2());
					}
					lv_elements_4_3=ruleForeignKey
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTableRule());
						}
						add(
							$current,
							"elements",
							lv_elements_4_3,
							"co.edu.uniandes.GrammarSql.ForeignKey");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getTableAccess().getCommaKeyword_5_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getTableAccess().getElementsColumnParserRuleCall_5_1_0_0());
						}
						lv_elements_6_1=ruleColumn
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTableRule());
							}
							add(
								$current,
								"elements",
								lv_elements_6_1,
								"co.edu.uniandes.GrammarSql.Column");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getTableAccess().getElementsPrimaryKeyParserRuleCall_5_1_0_1());
						}
						lv_elements_6_2=rulePrimaryKey
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTableRule());
							}
							add(
								$current,
								"elements",
								lv_elements_6_2,
								"co.edu.uniandes.GrammarSql.PrimaryKey");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getTableAccess().getElementsForeignKeyParserRuleCall_5_1_0_2());
						}
						lv_elements_6_3=ruleForeignKey
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTableRule());
							}
							add(
								$current,
								"elements",
								lv_elements_6_3,
								"co.edu.uniandes.GrammarSql.ForeignKey");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
		this_RPAR_7=RULE_RPAR
		{
			newLeafNode(this_RPAR_7, grammarAccess.getTableAccess().getRPARTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	iv_ruleColumn=ruleColumn
	{ $current=$iv_ruleColumn.current; }
	EOF;

// Rule Column
ruleColumn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColumnRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				(
					lv_type_1_1='int'
					{
						newLeafNode(lv_type_1_1, grammarAccess.getColumnAccess().getTypeIntKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getColumnRule());
						}
						setWithLastConsumed($current, "type", lv_type_1_1, null);
					}
					    |
					lv_type_1_2='varchar'
					{
						newLeafNode(lv_type_1_2, grammarAccess.getColumnAccess().getTypeVarcharKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getColumnRule());
						}
						setWithLastConsumed($current, "type", lv_type_1_2, null);
					}
					    |
					lv_type_1_3='Double'
					{
						newLeafNode(lv_type_1_3, grammarAccess.getColumnAccess().getTypeDoubleKeyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getColumnRule());
						}
						setWithLastConsumed($current, "type", lv_type_1_3, null);
					}
					    |
					lv_type_1_4='Float'
					{
						newLeafNode(lv_type_1_4, grammarAccess.getColumnAccess().getTypeFloatKeyword_1_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getColumnRule());
						}
						setWithLastConsumed($current, "type", lv_type_1_4, null);
					}
				)
			)
		)
		(
			{
				newCompositeNode(grammarAccess.getColumnAccess().getTamanoParserRuleCall_2());
			}
			ruleTamano
			{
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				lv_isNotNull_3_0=RULE_NOTNULL
				{
					newLeafNode(lv_isNotNull_3_0, grammarAccess.getColumnAccess().getIsNotNullNOTNULLTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColumnRule());
					}
					setWithLastConsumed(
						$current,
						"isNotNull",
						true,
						"co.edu.uniandes.GrammarSql.NOTNULL");
				}
			)
		)?
	)
;

// Entry rule entryRulePrimaryKey
entryRulePrimaryKey returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryKeyRule()); }
	iv_rulePrimaryKey=rulePrimaryKey
	{ $current=$iv_rulePrimaryKey.current; }
	EOF;

// Rule PrimaryKey
rulePrimaryKey returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='PRIMARY'
		{
			newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0());
		}
		otherlv_1='KEY'
		{
			newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1());
		}
		this_LPAR_2=RULE_LPAR
		{
			newLeafNode(this_LPAR_2, grammarAccess.getPrimaryKeyAccess().getLPARTerminalRuleCall_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimaryKeyRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_3_0());
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryKeyRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getPrimaryKeyAccess().getColColumnCrossReference_4_1_0());
					}
				)
			)
		)*
		this_RPAR_6=RULE_RPAR
		{
			newLeafNode(this_RPAR_6, grammarAccess.getPrimaryKeyAccess().getRPARTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleForeignKey
entryRuleForeignKey returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForeignKeyRule()); }
	iv_ruleForeignKey=ruleForeignKey
	{ $current=$iv_ruleForeignKey.current; }
	EOF;

// Rule ForeignKey
ruleForeignKey returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FOREIGN'
		{
			newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0());
		}
		otherlv_1='KEY'
		{
			newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getKEYKeyword_1());
		}
		this_LPAR_2=RULE_LPAR
		{
			newLeafNode(this_LPAR_2, grammarAccess.getForeignKeyAccess().getLPARTerminalRuleCall_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getForeignKeyRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_3_0());
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getForeignKeyRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getLocalColumnsColumnCrossReference_4_1_0());
					}
				)
			)
		)*
		this_RPAR_6=RULE_RPAR
		{
			newLeafNode(this_RPAR_6, grammarAccess.getForeignKeyAccess().getRPARTerminalRuleCall_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeignKeyAccess().getRefReferenceParserRuleCall_6_0());
				}
				lv_ref_7_0=ruleReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeignKeyRule());
					}
					set(
						$current,
						"ref",
						lv_ref_7_0,
						"co.edu.uniandes.GrammarSql.Reference");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleReference
entryRuleReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	iv_ruleReference=ruleReference
	{ $current=$iv_ruleReference.current; }
	EOF;

// Rule Reference
ruleReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='REFERENCES'
		{
			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getREFERENCESKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getFromTTableCrossReference_1_0());
				}
			)
		)
		this_LPAR_2=RULE_LPAR
		{
			newLeafNode(this_LPAR_2, grammarAccess.getReferenceAccess().getLPARTerminalRuleCall_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getFromCColumnCrossReference_3_0());
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getReferenceRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getFromCColumnCrossReference_4_1_0());
					}
				)
			)
		)*
		this_RPAR_6=RULE_RPAR
		{
			newLeafNode(this_RPAR_6, grammarAccess.getReferenceAccess().getRPARTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleTamano
entryRuleTamano returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTamanoRule()); }
	iv_ruleTamano=ruleTamano
	{ $current=$iv_ruleTamano.current.getText(); }
	EOF;

// Rule Tamano
ruleTamano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LPAR_0=RULE_LPAR
		{
			$current.merge(this_LPAR_0);
		}
		{
			newLeafNode(this_LPAR_0, grammarAccess.getTamanoAccess().getLPARTerminalRuleCall_0());
		}
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getTamanoAccess().getINTTerminalRuleCall_1());
			}
		)*
		this_RPAR_2=RULE_RPAR
		{
			$current.merge(this_RPAR_2);
		}
		{
			newLeafNode(this_RPAR_2, grammarAccess.getTamanoAccess().getRPARTerminalRuleCall_2());
		}
	)
;

RULE_CREATE : 'CREATE' 'TABLE';

RULE_LPAR : '(';

RULE_RPAR : ')';

RULE_NOTNULL : 'NOT NULL';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
