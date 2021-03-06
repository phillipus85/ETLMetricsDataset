/*
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GenSqlGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DataBaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.DataBase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDataBaseAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTablesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTablesTableParserRuleCall_1_0 = (RuleCall)cTablesAssignment_1.eContents().get(0);
		
		//DataBase:
		//	{DataBase} tables+=Table+;
		@Override public ParserRule getRule() { return rule; }
		
		//{DataBase} tables+=Table+
		public Group getGroup() { return cGroup; }
		
		//{DataBase}
		public Action getDataBaseAction_0() { return cDataBaseAction_0; }
		
		//tables+=Table+
		public Assignment getTablesAssignment_1() { return cTablesAssignment_1; }
		
		//Table
		public RuleCall getTablesTableParserRuleCall_1_0() { return cTablesTableParserRuleCall_1_0; }
	}
	public class TableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.Table");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCREATETerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cCTABLETerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final RuleCall cLPARENTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cColumnsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cColumnsColumnParserRuleCall_4_0 = (RuleCall)cColumnsAssignment_4.eContents().get(0);
		private final Assignment cPrimarykeyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPrimarykeyPrimaryKeyParserRuleCall_5_0 = (RuleCall)cPrimarykeyAssignment_5.eContents().get(0);
		private final Assignment cForeignkeysAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cForeignkeysForeignKeyParserRuleCall_6_0 = (RuleCall)cForeignkeysAssignment_6.eContents().get(0);
		private final RuleCall cRPARENTTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final Alternatives cAlternatives_8 = (Alternatives)cGroup.eContents().get(8);
		private final RuleCall cSEMICOLONTerminalRuleCall_8_0 = (RuleCall)cAlternatives_8.eContents().get(0);
		private final RuleCall cFINTerminalRuleCall_8_1 = (RuleCall)cAlternatives_8.eContents().get(1);
		
		//Table:
		//	CREATE CTABLE name=ID
		//	LPARENT
		//	columns+=Column+
		//	primarykey=PrimaryKey
		//	foreignkeys+=ForeignKey*
		//	RPARENT (SEMICOLON | FIN)?;
		@Override public ParserRule getRule() { return rule; }
		
		//CREATE CTABLE name=ID LPARENT columns+=Column+ primarykey=PrimaryKey foreignkeys+=ForeignKey* RPARENT (SEMICOLON | FIN)?
		public Group getGroup() { return cGroup; }
		
		//CREATE
		public RuleCall getCREATETerminalRuleCall_0() { return cCREATETerminalRuleCall_0; }
		
		//CTABLE
		public RuleCall getCTABLETerminalRuleCall_1() { return cCTABLETerminalRuleCall_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//LPARENT
		public RuleCall getLPARENTTerminalRuleCall_3() { return cLPARENTTerminalRuleCall_3; }
		
		//columns+=Column+
		public Assignment getColumnsAssignment_4() { return cColumnsAssignment_4; }
		
		//Column
		public RuleCall getColumnsColumnParserRuleCall_4_0() { return cColumnsColumnParserRuleCall_4_0; }
		
		//primarykey=PrimaryKey
		public Assignment getPrimarykeyAssignment_5() { return cPrimarykeyAssignment_5; }
		
		//PrimaryKey
		public RuleCall getPrimarykeyPrimaryKeyParserRuleCall_5_0() { return cPrimarykeyPrimaryKeyParserRuleCall_5_0; }
		
		//foreignkeys+=ForeignKey*
		public Assignment getForeignkeysAssignment_6() { return cForeignkeysAssignment_6; }
		
		//ForeignKey
		public RuleCall getForeignkeysForeignKeyParserRuleCall_6_0() { return cForeignkeysForeignKeyParserRuleCall_6_0; }
		
		//RPARENT
		public RuleCall getRPARENTTerminalRuleCall_7() { return cRPARENTTerminalRuleCall_7; }
		
		//(SEMICOLON | FIN)?
		public Alternatives getAlternatives_8() { return cAlternatives_8; }
		
		//SEMICOLON
		public RuleCall getSEMICOLONTerminalRuleCall_8_0() { return cSEMICOLONTerminalRuleCall_8_0; }
		
		//FIN
		public RuleCall getFINTerminalRuleCall_8_1() { return cFINTerminalRuleCall_8_1; }
	}
	public class ColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.Column");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cSQLTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSQLTypeTIPOTerminalRuleCall_1_0 = (RuleCall)cSQLTypeAssignment_1.eContents().get(0);
		private final Assignment cLongitudAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLongitudLONGITUDTerminalRuleCall_2_0 = (RuleCall)cLongitudAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final RuleCall cNOTTerminalRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final RuleCall cNULLTerminalRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		private final RuleCall cCOMMATerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//Column:
		//	name=ID SQLType=TIPO? Longitud=LONGITUD? (NOT NULL)? COMMA?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID SQLType=TIPO? Longitud=LONGITUD? (NOT NULL)? COMMA?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//SQLType=TIPO?
		public Assignment getSQLTypeAssignment_1() { return cSQLTypeAssignment_1; }
		
		//TIPO
		public RuleCall getSQLTypeTIPOTerminalRuleCall_1_0() { return cSQLTypeTIPOTerminalRuleCall_1_0; }
		
		//Longitud=LONGITUD?
		public Assignment getLongitudAssignment_2() { return cLongitudAssignment_2; }
		
		//LONGITUD
		public RuleCall getLongitudLONGITUDTerminalRuleCall_2_0() { return cLongitudLONGITUDTerminalRuleCall_2_0; }
		
		//(NOT NULL)?
		public Group getGroup_3() { return cGroup_3; }
		
		//NOT
		public RuleCall getNOTTerminalRuleCall_3_0() { return cNOTTerminalRuleCall_3_0; }
		
		//NULL
		public RuleCall getNULLTerminalRuleCall_3_1() { return cNULLTerminalRuleCall_3_1; }
		
		//COMMA?
		public RuleCall getCOMMATerminalRuleCall_4() { return cCOMMATerminalRuleCall_4; }
	}
	public class PrimaryKeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.PrimaryKey");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPRIMARYTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cKEYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cLPARENTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cColumnsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cColumnsColumnCrossReference_3_0 = (CrossReference)cColumnsAssignment_3.eContents().get(0);
		private final RuleCall cColumnsColumnIDTerminalRuleCall_3_0_1 = (RuleCall)cColumnsColumnCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final RuleCall cCOMMATerminalRuleCall_4_0 = (RuleCall)cGroup_4.eContents().get(0);
		private final Assignment cColumnsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cColumnsColumnCrossReference_4_1_0 = (CrossReference)cColumnsAssignment_4_1.eContents().get(0);
		private final RuleCall cColumnsColumnIDTerminalRuleCall_4_1_0_1 = (RuleCall)cColumnsColumnCrossReference_4_1_0.eContents().get(1);
		private final RuleCall cRPARENTTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cCOMMATerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//PrimaryKey:
		//	PRIMARY KEY LPARENT columns+=[Column] (COMMA+ columns+=[Column])* RPARENT COMMA?;
		@Override public ParserRule getRule() { return rule; }
		
		//PRIMARY KEY LPARENT columns+=[Column] (COMMA+ columns+=[Column])* RPARENT COMMA?
		public Group getGroup() { return cGroup; }
		
		//PRIMARY
		public RuleCall getPRIMARYTerminalRuleCall_0() { return cPRIMARYTerminalRuleCall_0; }
		
		//KEY
		public RuleCall getKEYTerminalRuleCall_1() { return cKEYTerminalRuleCall_1; }
		
		//LPARENT
		public RuleCall getLPARENTTerminalRuleCall_2() { return cLPARENTTerminalRuleCall_2; }
		
		//columns+=[Column]
		public Assignment getColumnsAssignment_3() { return cColumnsAssignment_3; }
		
		//[Column]
		public CrossReference getColumnsColumnCrossReference_3_0() { return cColumnsColumnCrossReference_3_0; }
		
		//ID
		public RuleCall getColumnsColumnIDTerminalRuleCall_3_0_1() { return cColumnsColumnIDTerminalRuleCall_3_0_1; }
		
		//(COMMA+ columns+=[Column])*
		public Group getGroup_4() { return cGroup_4; }
		
		//COMMA+
		public RuleCall getCOMMATerminalRuleCall_4_0() { return cCOMMATerminalRuleCall_4_0; }
		
		//columns+=[Column]
		public Assignment getColumnsAssignment_4_1() { return cColumnsAssignment_4_1; }
		
		//[Column]
		public CrossReference getColumnsColumnCrossReference_4_1_0() { return cColumnsColumnCrossReference_4_1_0; }
		
		//ID
		public RuleCall getColumnsColumnIDTerminalRuleCall_4_1_0_1() { return cColumnsColumnIDTerminalRuleCall_4_1_0_1; }
		
		//RPARENT
		public RuleCall getRPARENTTerminalRuleCall_5() { return cRPARENTTerminalRuleCall_5; }
		
		//COMMA?
		public RuleCall getCOMMATerminalRuleCall_6() { return cCOMMATerminalRuleCall_6; }
	}
	public class ForeignKeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.ForeignKey");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFOREIGNTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cKEYTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cLPARENTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cColumnsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cColumnsColumnCrossReference_3_0 = (CrossReference)cColumnsAssignment_3.eContents().get(0);
		private final RuleCall cColumnsColumnIDTerminalRuleCall_3_0_1 = (RuleCall)cColumnsColumnCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final RuleCall cCOMMATerminalRuleCall_4_0 = (RuleCall)cGroup_4.eContents().get(0);
		private final Assignment cColumnsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cColumnsColumnCrossReference_4_1_0 = (CrossReference)cColumnsAssignment_4_1.eContents().get(0);
		private final RuleCall cColumnsColumnIDTerminalRuleCall_4_1_0_1 = (RuleCall)cColumnsColumnCrossReference_4_1_0.eContents().get(1);
		private final RuleCall cRPARENTTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cREFERENCESTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Assignment cTableRefAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cTableRefTableCrossReference_7_0 = (CrossReference)cTableRefAssignment_7.eContents().get(0);
		private final RuleCall cTableRefTableIDTerminalRuleCall_7_0_1 = (RuleCall)cTableRefTableCrossReference_7_0.eContents().get(1);
		private final RuleCall cLPARENTTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final Assignment cColumnsRefAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final CrossReference cColumnsRefColumnCrossReference_9_0 = (CrossReference)cColumnsRefAssignment_9.eContents().get(0);
		private final RuleCall cColumnsRefColumnIDTerminalRuleCall_9_0_1 = (RuleCall)cColumnsRefColumnCrossReference_9_0.eContents().get(1);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final RuleCall cCOMMATerminalRuleCall_10_0 = (RuleCall)cGroup_10.eContents().get(0);
		private final Assignment cColumnsRefAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final CrossReference cColumnsRefColumnCrossReference_10_1_0 = (CrossReference)cColumnsRefAssignment_10_1.eContents().get(0);
		private final RuleCall cColumnsRefColumnIDTerminalRuleCall_10_1_0_1 = (RuleCall)cColumnsRefColumnCrossReference_10_1_0.eContents().get(1);
		private final RuleCall cRPARENTTerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final RuleCall cCOMMATerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		
		//ForeignKey:
		//	FOREIGN KEY LPARENT columns+=[Column] (COMMA+ columns+=[Column])* RPARENT REFERENCES tableRef=[Table] LPARENT
		//	columnsRef+=[Column] (COMMA+ columnsRef+=[Column])* RPARENT COMMA?;
		@Override public ParserRule getRule() { return rule; }
		
		//FOREIGN KEY LPARENT columns+=[Column] (COMMA+ columns+=[Column])* RPARENT REFERENCES tableRef=[Table] LPARENT
		//columnsRef+=[Column] (COMMA+ columnsRef+=[Column])* RPARENT COMMA?
		public Group getGroup() { return cGroup; }
		
		//FOREIGN
		public RuleCall getFOREIGNTerminalRuleCall_0() { return cFOREIGNTerminalRuleCall_0; }
		
		//KEY
		public RuleCall getKEYTerminalRuleCall_1() { return cKEYTerminalRuleCall_1; }
		
		//LPARENT
		public RuleCall getLPARENTTerminalRuleCall_2() { return cLPARENTTerminalRuleCall_2; }
		
		//columns+=[Column]
		public Assignment getColumnsAssignment_3() { return cColumnsAssignment_3; }
		
		//[Column]
		public CrossReference getColumnsColumnCrossReference_3_0() { return cColumnsColumnCrossReference_3_0; }
		
		//ID
		public RuleCall getColumnsColumnIDTerminalRuleCall_3_0_1() { return cColumnsColumnIDTerminalRuleCall_3_0_1; }
		
		//(COMMA+ columns+=[Column])*
		public Group getGroup_4() { return cGroup_4; }
		
		//COMMA+
		public RuleCall getCOMMATerminalRuleCall_4_0() { return cCOMMATerminalRuleCall_4_0; }
		
		//columns+=[Column]
		public Assignment getColumnsAssignment_4_1() { return cColumnsAssignment_4_1; }
		
		//[Column]
		public CrossReference getColumnsColumnCrossReference_4_1_0() { return cColumnsColumnCrossReference_4_1_0; }
		
		//ID
		public RuleCall getColumnsColumnIDTerminalRuleCall_4_1_0_1() { return cColumnsColumnIDTerminalRuleCall_4_1_0_1; }
		
		//RPARENT
		public RuleCall getRPARENTTerminalRuleCall_5() { return cRPARENTTerminalRuleCall_5; }
		
		//REFERENCES
		public RuleCall getREFERENCESTerminalRuleCall_6() { return cREFERENCESTerminalRuleCall_6; }
		
		//tableRef=[Table]
		public Assignment getTableRefAssignment_7() { return cTableRefAssignment_7; }
		
		//[Table]
		public CrossReference getTableRefTableCrossReference_7_0() { return cTableRefTableCrossReference_7_0; }
		
		//ID
		public RuleCall getTableRefTableIDTerminalRuleCall_7_0_1() { return cTableRefTableIDTerminalRuleCall_7_0_1; }
		
		//LPARENT
		public RuleCall getLPARENTTerminalRuleCall_8() { return cLPARENTTerminalRuleCall_8; }
		
		//columnsRef+=[Column]
		public Assignment getColumnsRefAssignment_9() { return cColumnsRefAssignment_9; }
		
		//[Column]
		public CrossReference getColumnsRefColumnCrossReference_9_0() { return cColumnsRefColumnCrossReference_9_0; }
		
		//ID
		public RuleCall getColumnsRefColumnIDTerminalRuleCall_9_0_1() { return cColumnsRefColumnIDTerminalRuleCall_9_0_1; }
		
		//(COMMA+ columnsRef+=[Column])*
		public Group getGroup_10() { return cGroup_10; }
		
		//COMMA+
		public RuleCall getCOMMATerminalRuleCall_10_0() { return cCOMMATerminalRuleCall_10_0; }
		
		//columnsRef+=[Column]
		public Assignment getColumnsRefAssignment_10_1() { return cColumnsRefAssignment_10_1; }
		
		//[Column]
		public CrossReference getColumnsRefColumnCrossReference_10_1_0() { return cColumnsRefColumnCrossReference_10_1_0; }
		
		//ID
		public RuleCall getColumnsRefColumnIDTerminalRuleCall_10_1_0_1() { return cColumnsRefColumnIDTerminalRuleCall_10_1_0_1; }
		
		//RPARENT
		public RuleCall getRPARENTTerminalRuleCall_11() { return cRPARENTTerminalRuleCall_11; }
		
		//COMMA?
		public RuleCall getCOMMATerminalRuleCall_12() { return cCOMMATerminalRuleCall_12; }
	}
	
	
	private final DataBaseElements pDataBase;
	private final TableElements pTable;
	private final ColumnElements pColumn;
	private final PrimaryKeyElements pPrimaryKey;
	private final ForeignKeyElements pForeignKey;
	private final TerminalRule tLONGITUD;
	private final TerminalRule tCREATE;
	private final TerminalRule tCTABLE;
	private final TerminalRule tLPARENT;
	private final TerminalRule tRPARENT;
	private final TerminalRule tSEMICOLON;
	private final TerminalRule tCOMMA;
	private final TerminalRule tFOREIGN;
	private final TerminalRule tPRIMARY;
	private final TerminalRule tKEY;
	private final TerminalRule tNULL;
	private final TerminalRule tNOT;
	private final TerminalRule tREFERENCES;
	private final TerminalRule tTIPO;
	private final TerminalRule tID;
	private final TerminalRule tNUMBER;
	private final TerminalRule tFIN;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GenSqlGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDataBase = new DataBaseElements();
		this.pTable = new TableElements();
		this.pColumn = new ColumnElements();
		this.pPrimaryKey = new PrimaryKeyElements();
		this.pForeignKey = new ForeignKeyElements();
		this.tLONGITUD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.LONGITUD");
		this.tCREATE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.CREATE");
		this.tCTABLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.CTABLE");
		this.tLPARENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.LPARENT");
		this.tRPARENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.RPARENT");
		this.tSEMICOLON = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.SEMICOLON");
		this.tCOMMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.COMMA");
		this.tFOREIGN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.FOREIGN");
		this.tPRIMARY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.PRIMARY");
		this.tKEY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.KEY");
		this.tNULL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.NULL");
		this.tNOT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.NOT");
		this.tREFERENCES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.REFERENCES");
		this.tTIPO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.TIPO");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.ID");
		this.tNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.NUMBER");
		this.tFIN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.GenSql.FIN");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("co.edu.uniandes.GenSql".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DataBase:
	//	{DataBase} tables+=Table+;
	public DataBaseElements getDataBaseAccess() {
		return pDataBase;
	}
	
	public ParserRule getDataBaseRule() {
		return getDataBaseAccess().getRule();
	}
	
	//Table:
	//	CREATE CTABLE name=ID
	//	LPARENT
	//	columns+=Column+
	//	primarykey=PrimaryKey
	//	foreignkeys+=ForeignKey*
	//	RPARENT (SEMICOLON | FIN)?;
	public TableElements getTableAccess() {
		return pTable;
	}
	
	public ParserRule getTableRule() {
		return getTableAccess().getRule();
	}
	
	//Column:
	//	name=ID SQLType=TIPO? Longitud=LONGITUD? (NOT NULL)? COMMA?;
	public ColumnElements getColumnAccess() {
		return pColumn;
	}
	
	public ParserRule getColumnRule() {
		return getColumnAccess().getRule();
	}
	
	//PrimaryKey:
	//	PRIMARY KEY LPARENT columns+=[Column] (COMMA+ columns+=[Column])* RPARENT COMMA?;
	public PrimaryKeyElements getPrimaryKeyAccess() {
		return pPrimaryKey;
	}
	
	public ParserRule getPrimaryKeyRule() {
		return getPrimaryKeyAccess().getRule();
	}
	
	//ForeignKey:
	//	FOREIGN KEY LPARENT columns+=[Column] (COMMA+ columns+=[Column])* RPARENT REFERENCES tableRef=[Table] LPARENT
	//	columnsRef+=[Column] (COMMA+ columnsRef+=[Column])* RPARENT COMMA?;
	public ForeignKeyElements getForeignKeyAccess() {
		return pForeignKey;
	}
	
	public ParserRule getForeignKeyRule() {
		return getForeignKeyAccess().getRule();
	}
	
	//terminal LONGITUD:
	//	LPARENT NUMBER RPARENT;
	public TerminalRule getLONGITUDRule() {
		return tLONGITUD;
	}
	
	//terminal CREATE:
	//	"CREATE";
	public TerminalRule getCREATERule() {
		return tCREATE;
	}
	
	//terminal CTABLE:
	//	"TABLE";
	public TerminalRule getCTABLERule() {
		return tCTABLE;
	}
	
	//terminal LPARENT:
	//	"(";
	public TerminalRule getLPARENTRule() {
		return tLPARENT;
	}
	
	//terminal RPARENT:
	//	")";
	public TerminalRule getRPARENTRule() {
		return tRPARENT;
	}
	
	//terminal SEMICOLON:
	//	";";
	public TerminalRule getSEMICOLONRule() {
		return tSEMICOLON;
	}
	
	//terminal COMMA:
	//	",";
	public TerminalRule getCOMMARule() {
		return tCOMMA;
	}
	
	//terminal FOREIGN:
	//	"FOREIGN";
	public TerminalRule getFOREIGNRule() {
		return tFOREIGN;
	}
	
	//terminal PRIMARY:
	//	"PRIMARY";
	public TerminalRule getPRIMARYRule() {
		return tPRIMARY;
	}
	
	//terminal KEY:
	//	"KEY";
	public TerminalRule getKEYRule() {
		return tKEY;
	}
	
	//terminal NULL:
	//	"NULL";
	public TerminalRule getNULLRule() {
		return tNULL;
	}
	
	//terminal NOT:
	//	"NOT";
	public TerminalRule getNOTRule() {
		return tNOT;
	}
	
	//terminal REFERENCES:
	//	"REFERENCES";
	public TerminalRule getREFERENCESRule() {
		return tREFERENCES;
	}
	
	//terminal TIPO:
	//	"varchar" | "int" | "String" | "boolean" | "date" | "number";
	public TerminalRule getTIPORule() {
		return tTIPO;
	}
	
	//terminal ID:
	//	("a".."z" | "A".."Z") ("0".."9" | "A".."Z" | "a".."z")*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal NUMBER:
	//	"0".."9"*;
	public TerminalRule getNUMBERRule() {
		return tNUMBER;
	}
	
	//terminal FIN:
	//	EOF;
	public TerminalRule getFINRule() {
		return tFIN;
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
