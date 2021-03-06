/*
 * generated by Xtext 2.9.1
 */
grammar InternalSQL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.SQLGrammarAccess;

}

@parser::members {

 	private SQLGrammarAccess grammarAccess;

    public InternalSQLParser(TokenStream input, SQLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DataBase";
   	}

   	@Override
   	protected SQLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDataBase
entryRuleDataBase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataBaseRule()); }
	iv_ruleDataBase=ruleDataBase
	{ $current=$iv_ruleDataBase.current; }
	EOF;

// Rule DataBase
ruleDataBase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDataBaseAccess().getTablesTableParserRuleCall_0());
			}
			lv_Tables_0_0=ruleTable
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDataBaseRule());
				}
				add(
					$current,
					"Tables",
					lv_Tables_0_0,
					"org.xtext.example.SQL.Table");
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
		this_CREATE_0=RULE_CREATE
		{
			newLeafNode(this_CREATE_0, grammarAccess.getTableAccess().getCREATETerminalRuleCall_0());
		}
		this_TABLA_1=RULE_TABLA
		{
			newLeafNode(this_TABLA_1, grammarAccess.getTableAccess().getTABLATerminalRuleCall_1());
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
						"org.xtext.example.SQL.ID");
				}
			)
		)
		this_LPAREN_3=RULE_LPAREN
		{
			newLeafNode(this_LPAREN_3, grammarAccess.getTableAccess().getLPARENTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_0());
				}
				lv_columns_4_0=rulecolumn
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTableRule());
					}
					add(
						$current,
						"columns",
						lv_columns_4_0,
						"org.xtext.example.SQL.column");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getTableAccess().getPrimaryKeyPrimaryKeyParserRuleCall_5_0());
				}
				lv_primaryKey_5_0=ruleprimaryKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTableRule());
					}
					set(
						$current,
						"primaryKey",
						lv_primaryKey_5_0,
						"org.xtext.example.SQL.primaryKey");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTableAccess().getForeignkeysForeignKeyParserRuleCall_6_0());
				}
				lv_foreignkeys_6_0=ruleforeignKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTableRule());
					}
					add(
						$current,
						"foreignkeys",
						lv_foreignkeys_6_0,
						"org.xtext.example.SQL.foreignKey");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_RPAREN_7=RULE_RPAREN
		{
			newLeafNode(this_RPAREN_7, grammarAccess.getTableAccess().getRPARENTerminalRuleCall_7());
		}
	)
;

// Entry rule entryRulecolumn
entryRulecolumn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	iv_rulecolumn=rulecolumn
	{ $current=$iv_rulecolumn.current; }
	EOF;

// Rule column
rulecolumn returns [EObject current=null]
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
						"org.xtext.example.SQL.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getColumnAccess().getTypeDataTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=ruleDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColumnRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"org.xtext.example.SQL.DataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_NOT_2=RULE_NOT
			{
				newLeafNode(this_NOT_2, grammarAccess.getColumnAccess().getNOTTerminalRuleCall_2());
			}
		)?
		(
			this_NULL_3=RULE_NULL
			{
				newLeafNode(this_NULL_3, grammarAccess.getColumnAccess().getNULLTerminalRuleCall_3());
			}
		)?
		(
			this_COMA_4=RULE_COMA
			{
				newLeafNode(this_COMA_4, grammarAccess.getColumnAccess().getCOMATerminalRuleCall_4());
			}
		)?
	)
;

// Entry rule entryRuleprimaryKey
entryRuleprimaryKey returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryKeyRule()); }
	iv_ruleprimaryKey=ruleprimaryKey
	{ $current=$iv_ruleprimaryKey.current; }
	EOF;

// Rule primaryKey
ruleprimaryKey returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_PRIMARY_0=RULE_PRIMARY
		{
			newLeafNode(this_PRIMARY_0, grammarAccess.getPrimaryKeyAccess().getPRIMARYTerminalRuleCall_0());
		}
		this_KEY_1=RULE_KEY
		{
			newLeafNode(this_KEY_1, grammarAccess.getPrimaryKeyAccess().getKEYTerminalRuleCall_1());
		}
		this_LPAREN_2=RULE_LPAREN
		{
			newLeafNode(this_LPAREN_2, grammarAccess.getPrimaryKeyAccess().getLPARENTerminalRuleCall_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getPrimaryKeyAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimaryKeyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.xtext.example.SQL.ID");
				}
			)
		)
		(
			this_COMA_4=RULE_COMA
			{
				newLeafNode(this_COMA_4, grammarAccess.getPrimaryKeyAccess().getCOMATerminalRuleCall_4_0());
			}
			this_ID_5=RULE_ID
			{
				newLeafNode(this_ID_5, grammarAccess.getPrimaryKeyAccess().getIDTerminalRuleCall_4_1());
			}
		)*
		this_RPAREN_6=RULE_RPAREN
		{
			newLeafNode(this_RPAREN_6, grammarAccess.getPrimaryKeyAccess().getRPARENTerminalRuleCall_5());
		}
		(
			this_COMA_7=RULE_COMA
			{
				newLeafNode(this_COMA_7, grammarAccess.getPrimaryKeyAccess().getCOMATerminalRuleCall_6());
			}
		)?
	)
;

// Entry rule entryRuleforeignKey
entryRuleforeignKey returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForeignKeyRule()); }
	iv_ruleforeignKey=ruleforeignKey
	{ $current=$iv_ruleforeignKey.current; }
	EOF;

// Rule foreignKey
ruleforeignKey returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_FOREIGN_0=RULE_FOREIGN
		{
			newLeafNode(this_FOREIGN_0, grammarAccess.getForeignKeyAccess().getFOREIGNTerminalRuleCall_0());
		}
		this_KEY_1=RULE_KEY
		{
			newLeafNode(this_KEY_1, grammarAccess.getForeignKeyAccess().getKEYTerminalRuleCall_1());
		}
		this_LPAREN_2=RULE_LPAREN
		{
			newLeafNode(this_LPAREN_2, grammarAccess.getForeignKeyAccess().getLPARENTerminalRuleCall_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getForeignKeyAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getForeignKeyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.xtext.example.SQL.ID");
				}
			)
		)
		this_RPAREN_4=RULE_RPAREN
		{
			newLeafNode(this_RPAREN_4, grammarAccess.getForeignKeyAccess().getRPARENTerminalRuleCall_4());
		}
		this_REFERENCES_5=RULE_REFERENCES
		{
			newLeafNode(this_REFERENCES_5, grammarAccess.getForeignKeyAccess().getREFERENCESTerminalRuleCall_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getForeignKeyRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getForeignKeyAccess().getReftableTableCrossReference_6_0());
				}
			)
		)
		this_LPAREN_7=RULE_LPAREN
		{
			newLeafNode(this_LPAREN_7, grammarAccess.getForeignKeyAccess().getLPARENTerminalRuleCall_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getForeignKeyRule());
					}
				}
				otherlv_8=RULE_ID
				{
					newLeafNode(otherlv_8, grammarAccess.getForeignKeyAccess().getRefColumnCrossReference_8_0());
				}
			)
		)
		this_RPAREN_9=RULE_RPAREN
		{
			newLeafNode(this_RPAREN_9, grammarAccess.getForeignKeyAccess().getRPARENTerminalRuleCall_9());
		}
		(
			this_COMA_10=RULE_COMA
			{
				newLeafNode(this_COMA_10, grammarAccess.getForeignKeyAccess().getCOMATerminalRuleCall_10());
			}
		)?
	)
;

// Rule DataType
ruleDataType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='varchar(255)'
			{
				$current = grammarAccess.getDataTypeAccess().getVARCHAR255EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getVARCHAR255EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='varchar'
			{
				$current = grammarAccess.getDataTypeAccess().getVARCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getVARCHAREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='int'
			{
				$current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='character'
			{
				$current = grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='boolean'
			{
				$current = grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='date'
			{
				$current = grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='time'
			{
				$current = grammarAccess.getDataTypeAccess().getTIMEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getTIMEEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='float'
			{
				$current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='decimal'
			{
				$current = grammarAccess.getDataTypeAccess().getDECIMALEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getDECIMALEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='numeric'
			{
				$current = grammarAccess.getDataTypeAccess().getNUMERICEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getDataTypeAccess().getNUMERICEnumLiteralDeclaration_9());
			}
		)
	)
;

RULE_CREATE : 'CREATE';

RULE_TABLA : 'TABLE';

RULE_LPAREN : '(';

RULE_RPAREN : ')';

RULE_COMA : ',';

RULE_PRIMARY : 'PRIMARY';

RULE_FOREIGN : 'FOREIGN';

RULE_REFERENCES : 'REFERENCES';

RULE_KEY : 'KEY';

RULE_NOT : 'NOT';

RULE_NULL : 'NULL';

RULE_ID : ('a'..'z'|'A'..'Z')+ ('0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
