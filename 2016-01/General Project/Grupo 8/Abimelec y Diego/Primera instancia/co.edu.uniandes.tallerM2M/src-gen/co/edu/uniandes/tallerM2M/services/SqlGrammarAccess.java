/*
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.tallerM2M.services;

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
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SqlGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DatabaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.Database");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDatabaseAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTablasAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTablasTablaParserRuleCall_1_0 = (RuleCall)cTablasAssignment_1.eContents().get(0);
		
		////Reglas para la Gramatica
		//Database:
		//	{Database} tablas+=Tabla+;
		@Override public ParserRule getRule() { return rule; }
		
		//{Database} tablas+=Tabla+
		public Group getGroup() { return cGroup; }
		
		//{Database}
		public Action getDatabaseAction_0() { return cDatabaseAction_0; }
		
		//tablas+=Tabla+
		public Assignment getTablasAssignment_1() { return cTablasAssignment_1; }
		
		//Tabla
		public RuleCall getTablasTablaParserRuleCall_1_0() { return cTablasTablaParserRuleCall_1_0; }
	}
	public class TablaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.Tabla");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTCREATETerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cSpaceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cTTABLETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cSpaceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final RuleCall cPARENTESISATerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Assignment cColumnasAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cColumnasColumnaParserRuleCall_6_0 = (RuleCall)cColumnasAssignment_6.eContents().get(0);
		private final Assignment cPrimarysAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cPrimarysPrimaryParserRuleCall_7_0 = (RuleCall)cPrimarysAssignment_7.eContents().get(0);
		private final Assignment cForeignsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cForeignsForeingKeyParserRuleCall_8_0 = (RuleCall)cForeignsAssignment_8.eContents().get(0);
		private final RuleCall cPARENTESISBTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		
		//Tabla:
		//	TCREATE ' ' TTABLE ' ' name=ID
		//	PARENTESISA
		//	columnas+=Columna+
		//	primarys+=Primary+
		//	foreigns+=ForeingKey*
		//	PARENTESISB;
		@Override public ParserRule getRule() { return rule; }
		
		//TCREATE ' ' TTABLE ' ' name=ID PARENTESISA columnas+=Columna+ primarys+=Primary+ foreigns+=ForeingKey* PARENTESISB
		public Group getGroup() { return cGroup; }
		
		//TCREATE
		public RuleCall getTCREATETerminalRuleCall_0() { return cTCREATETerminalRuleCall_0; }
		
		//' '
		public Keyword getSpaceKeyword_1() { return cSpaceKeyword_1; }
		
		//TTABLE
		public RuleCall getTTABLETerminalRuleCall_2() { return cTTABLETerminalRuleCall_2; }
		
		//' '
		public Keyword getSpaceKeyword_3() { return cSpaceKeyword_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//PARENTESISA
		public RuleCall getPARENTESISATerminalRuleCall_5() { return cPARENTESISATerminalRuleCall_5; }
		
		//columnas+=Columna+
		public Assignment getColumnasAssignment_6() { return cColumnasAssignment_6; }
		
		//Columna
		public RuleCall getColumnasColumnaParserRuleCall_6_0() { return cColumnasColumnaParserRuleCall_6_0; }
		
		//primarys+=Primary+
		public Assignment getPrimarysAssignment_7() { return cPrimarysAssignment_7; }
		
		//Primary
		public RuleCall getPrimarysPrimaryParserRuleCall_7_0() { return cPrimarysPrimaryParserRuleCall_7_0; }
		
		//foreigns+=ForeingKey*
		public Assignment getForeignsAssignment_8() { return cForeignsAssignment_8; }
		
		//ForeingKey
		public RuleCall getForeignsForeingKeyParserRuleCall_8_0() { return cForeignsForeingKeyParserRuleCall_8_0; }
		
		//PARENTESISB
		public RuleCall getPARENTESISBTerminalRuleCall_9() { return cPARENTESISBTerminalRuleCall_9; }
	}
	public class ColumnaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.Columna");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cSpaceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTipoAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cTipoAlternatives_2_0 = (Alternatives)cTipoAssignment_2.eContents().get(0);
		private final RuleCall cTipoVVARCHARTerminalRuleCall_2_0_0 = (RuleCall)cTipoAlternatives_2_0.eContents().get(0);
		private final RuleCall cTipoVINTTerminalRuleCall_2_0_1 = (RuleCall)cTipoAlternatives_2_0.eContents().get(1);
		private final RuleCall cTipoVVARCHAR255TerminalRuleCall_2_0_2 = (RuleCall)cTipoAlternatives_2_0.eContents().get(2);
		private final Assignment cNotNullAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cNotNullNOTNULLKeyword_3_0 = (Keyword)cNotNullAssignment_3.eContents().get(0);
		private final RuleCall cCOMATerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//Columna:
		//	name=ID ' ' tipo=(VVARCHAR | VINT | VVARCHAR255) notNull=' NOT NULL'? COMA*;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ' ' tipo=(VVARCHAR | VINT | VVARCHAR255) notNull=' NOT NULL'? COMA*
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//' '
		public Keyword getSpaceKeyword_1() { return cSpaceKeyword_1; }
		
		//tipo=(VVARCHAR | VINT | VVARCHAR255)
		public Assignment getTipoAssignment_2() { return cTipoAssignment_2; }
		
		//(VVARCHAR | VINT | VVARCHAR255)
		public Alternatives getTipoAlternatives_2_0() { return cTipoAlternatives_2_0; }
		
		//VVARCHAR
		public RuleCall getTipoVVARCHARTerminalRuleCall_2_0_0() { return cTipoVVARCHARTerminalRuleCall_2_0_0; }
		
		//VINT
		public RuleCall getTipoVINTTerminalRuleCall_2_0_1() { return cTipoVINTTerminalRuleCall_2_0_1; }
		
		//VVARCHAR255
		public RuleCall getTipoVVARCHAR255TerminalRuleCall_2_0_2() { return cTipoVVARCHAR255TerminalRuleCall_2_0_2; }
		
		//notNull=' NOT NULL'?
		public Assignment getNotNullAssignment_3() { return cNotNullAssignment_3; }
		
		//' NOT NULL'
		public Keyword getNotNullNOTNULLKeyword_3_0() { return cNotNullNOTNULLKeyword_3_0; }
		
		//COMA*
		public RuleCall getCOMATerminalRuleCall_4() { return cCOMATerminalRuleCall_4; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.Primary");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTPRIMARYTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cSpaceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cTKEYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cSpaceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cPARENTESISATerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cColumnAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cColumnColumnaCrossReference_5_0 = (CrossReference)cColumnAssignment_5.eContents().get(0);
		private final RuleCall cColumnColumnaIDTerminalRuleCall_5_0_1 = (RuleCall)cColumnColumnaCrossReference_5_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final RuleCall cCOMATerminalRuleCall_6_0 = (RuleCall)cGroup_6.eContents().get(0);
		private final Keyword cSpaceKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cColumnAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cColumnColumnaCrossReference_6_2_0 = (CrossReference)cColumnAssignment_6_2.eContents().get(0);
		private final RuleCall cColumnColumnaIDTerminalRuleCall_6_2_0_1 = (RuleCall)cColumnColumnaCrossReference_6_2_0.eContents().get(1);
		private final RuleCall cPARENTESISBTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cCOMATerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//Primary:
		//	TPRIMARY ' ' TKEY ' ' PARENTESISA column+=[Columna] (COMA ' ' column+=[Columna])* PARENTESISB COMA*;
		@Override public ParserRule getRule() { return rule; }
		
		//TPRIMARY ' ' TKEY ' ' PARENTESISA column+=[Columna] (COMA ' ' column+=[Columna])* PARENTESISB COMA*
		public Group getGroup() { return cGroup; }
		
		//TPRIMARY
		public RuleCall getTPRIMARYTerminalRuleCall_0() { return cTPRIMARYTerminalRuleCall_0; }
		
		//' '
		public Keyword getSpaceKeyword_1() { return cSpaceKeyword_1; }
		
		//TKEY
		public RuleCall getTKEYTerminalRuleCall_2() { return cTKEYTerminalRuleCall_2; }
		
		//' '
		public Keyword getSpaceKeyword_3() { return cSpaceKeyword_3; }
		
		//PARENTESISA
		public RuleCall getPARENTESISATerminalRuleCall_4() { return cPARENTESISATerminalRuleCall_4; }
		
		//column+=[Columna]
		public Assignment getColumnAssignment_5() { return cColumnAssignment_5; }
		
		//[Columna]
		public CrossReference getColumnColumnaCrossReference_5_0() { return cColumnColumnaCrossReference_5_0; }
		
		//ID
		public RuleCall getColumnColumnaIDTerminalRuleCall_5_0_1() { return cColumnColumnaIDTerminalRuleCall_5_0_1; }
		
		//(COMA ' ' column+=[Columna])*
		public Group getGroup_6() { return cGroup_6; }
		
		//COMA
		public RuleCall getCOMATerminalRuleCall_6_0() { return cCOMATerminalRuleCall_6_0; }
		
		//' '
		public Keyword getSpaceKeyword_6_1() { return cSpaceKeyword_6_1; }
		
		//column+=[Columna]
		public Assignment getColumnAssignment_6_2() { return cColumnAssignment_6_2; }
		
		//[Columna]
		public CrossReference getColumnColumnaCrossReference_6_2_0() { return cColumnColumnaCrossReference_6_2_0; }
		
		//ID
		public RuleCall getColumnColumnaIDTerminalRuleCall_6_2_0_1() { return cColumnColumnaIDTerminalRuleCall_6_2_0_1; }
		
		//PARENTESISB
		public RuleCall getPARENTESISBTerminalRuleCall_7() { return cPARENTESISBTerminalRuleCall_7; }
		
		//COMA*
		public RuleCall getCOMATerminalRuleCall_8() { return cCOMATerminalRuleCall_8; }
	}
	public class ForeingKeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.ForeingKey");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTFOREIGNTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cSpaceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cTKEYTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cSpaceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cPARENTESISATerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cNameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNameIDTerminalRuleCall_5_0 = (RuleCall)cNameAssignment_5.eContents().get(0);
		private final RuleCall cPARENTESISBTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Keyword cSpaceKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final RuleCall cTREFERENCESTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final Keyword cSpaceKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cReferenceTableAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final CrossReference cReferenceTableTablaCrossReference_10_0 = (CrossReference)cReferenceTableAssignment_10.eContents().get(0);
		private final RuleCall cReferenceTableTablaIDTerminalRuleCall_10_0_1 = (RuleCall)cReferenceTableTablaCrossReference_10_0.eContents().get(1);
		private final RuleCall cPARENTESISATerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final Assignment cReferenceColumnAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final CrossReference cReferenceColumnColumnaCrossReference_12_0 = (CrossReference)cReferenceColumnAssignment_12.eContents().get(0);
		private final RuleCall cReferenceColumnColumnaIDTerminalRuleCall_12_0_1 = (RuleCall)cReferenceColumnColumnaCrossReference_12_0.eContents().get(1);
		private final RuleCall cPARENTESISBTerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		private final RuleCall cCOMATerminalRuleCall_14 = (RuleCall)cGroup.eContents().get(14);
		
		//ForeingKey ForeignKey:
		//	TFOREIGN ' ' TKEY ' ' PARENTESISA name=ID PARENTESISB ' '
		//	TREFERENCES ' ' referenceTable=[Tabla] PARENTESISA referenceColumn=[Columna] PARENTESISB COMA*
		@Override public ParserRule getRule() { return rule; }
		
		//TFOREIGN ' ' TKEY ' ' PARENTESISA name=ID PARENTESISB ' ' TREFERENCES ' ' referenceTable=[Tabla] PARENTESISA
		//referenceColumn=[Columna] PARENTESISB COMA*
		public Group getGroup() { return cGroup; }
		
		//TFOREIGN
		public RuleCall getTFOREIGNTerminalRuleCall_0() { return cTFOREIGNTerminalRuleCall_0; }
		
		//' '
		public Keyword getSpaceKeyword_1() { return cSpaceKeyword_1; }
		
		//TKEY
		public RuleCall getTKEYTerminalRuleCall_2() { return cTKEYTerminalRuleCall_2; }
		
		//' '
		public Keyword getSpaceKeyword_3() { return cSpaceKeyword_3; }
		
		//PARENTESISA
		public RuleCall getPARENTESISATerminalRuleCall_4() { return cPARENTESISATerminalRuleCall_4; }
		
		//name=ID
		public Assignment getNameAssignment_5() { return cNameAssignment_5; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_5_0() { return cNameIDTerminalRuleCall_5_0; }
		
		//PARENTESISB
		public RuleCall getPARENTESISBTerminalRuleCall_6() { return cPARENTESISBTerminalRuleCall_6; }
		
		//' '
		public Keyword getSpaceKeyword_7() { return cSpaceKeyword_7; }
		
		//TREFERENCES
		public RuleCall getTREFERENCESTerminalRuleCall_8() { return cTREFERENCESTerminalRuleCall_8; }
		
		//' '
		public Keyword getSpaceKeyword_9() { return cSpaceKeyword_9; }
		
		//referenceTable=[Tabla]
		public Assignment getReferenceTableAssignment_10() { return cReferenceTableAssignment_10; }
		
		//[Tabla]
		public CrossReference getReferenceTableTablaCrossReference_10_0() { return cReferenceTableTablaCrossReference_10_0; }
		
		//ID
		public RuleCall getReferenceTableTablaIDTerminalRuleCall_10_0_1() { return cReferenceTableTablaIDTerminalRuleCall_10_0_1; }
		
		//PARENTESISA
		public RuleCall getPARENTESISATerminalRuleCall_11() { return cPARENTESISATerminalRuleCall_11; }
		
		//referenceColumn=[Columna]
		public Assignment getReferenceColumnAssignment_12() { return cReferenceColumnAssignment_12; }
		
		//[Columna]
		public CrossReference getReferenceColumnColumnaCrossReference_12_0() { return cReferenceColumnColumnaCrossReference_12_0; }
		
		//ID
		public RuleCall getReferenceColumnColumnaIDTerminalRuleCall_12_0_1() { return cReferenceColumnColumnaIDTerminalRuleCall_12_0_1; }
		
		//PARENTESISB
		public RuleCall getPARENTESISBTerminalRuleCall_13() { return cPARENTESISBTerminalRuleCall_13; }
		
		//COMA*
		public RuleCall getCOMATerminalRuleCall_14() { return cCOMATerminalRuleCall_14; }
	}
	
	
	private final DatabaseElements pDatabase;
	private final TablaElements pTabla;
	private final ColumnaElements pColumna;
	private final PrimaryElements pPrimary;
	private final ForeingKeyElements pForeingKey;
	private final TerminalRule tTCREATE;
	private final TerminalRule tTTABLE;
	private final TerminalRule tTPRIMARY;
	private final TerminalRule tTKEY;
	private final TerminalRule tTFOREIGN;
	private final TerminalRule tTCOLUMNAS;
	private final TerminalRule tTREFERENCES;
	private final TerminalRule tTNOT;
	private final TerminalRule tTNULL;
	private final TerminalRule tPARENTESISA;
	private final TerminalRule tPARENTESISB;
	private final TerminalRule tCOMA;
	private final TerminalRule tVINT;
	private final TerminalRule tVVARCHAR;
	private final TerminalRule tVVARCHAR255;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SqlGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDatabase = new DatabaseElements();
		this.pTabla = new TablaElements();
		this.pColumna = new ColumnaElements();
		this.pPrimary = new PrimaryElements();
		this.pForeingKey = new ForeingKeyElements();
		this.tTCREATE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.TCREATE");
		this.tTTABLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.TTABLE");
		this.tTPRIMARY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.TPRIMARY");
		this.tTKEY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.TKEY");
		this.tTFOREIGN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.TFOREIGN");
		this.tTCOLUMNAS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.TCOLUMNAS");
		this.tTREFERENCES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.TREFERENCES");
		this.tTNOT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.TNOT");
		this.tTNULL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.TNULL");
		this.tPARENTESISA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.PARENTESISA");
		this.tPARENTESISB = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.PARENTESISB");
		this.tCOMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.COMA");
		this.tVINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.VINT");
		this.tVVARCHAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.VVARCHAR");
		this.tVVARCHAR255 = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "co.edu.uniandes.tallerM2M.Sql.VVARCHAR255");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("co.edu.uniandes.tallerM2M.Sql".equals(grammar.getName())) {
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

	
	////Reglas para la Gramatica
	//Database:
	//	{Database} tablas+=Tabla+;
	public DatabaseElements getDatabaseAccess() {
		return pDatabase;
	}
	
	public ParserRule getDatabaseRule() {
		return getDatabaseAccess().getRule();
	}
	
	//Tabla:
	//	TCREATE ' ' TTABLE ' ' name=ID
	//	PARENTESISA
	//	columnas+=Columna+
	//	primarys+=Primary+
	//	foreigns+=ForeingKey*
	//	PARENTESISB;
	public TablaElements getTablaAccess() {
		return pTabla;
	}
	
	public ParserRule getTablaRule() {
		return getTablaAccess().getRule();
	}
	
	//Columna:
	//	name=ID ' ' tipo=(VVARCHAR | VINT | VVARCHAR255) notNull=' NOT NULL'? COMA*;
	public ColumnaElements getColumnaAccess() {
		return pColumna;
	}
	
	public ParserRule getColumnaRule() {
		return getColumnaAccess().getRule();
	}
	
	//Primary:
	//	TPRIMARY ' ' TKEY ' ' PARENTESISA column+=[Columna] (COMA ' ' column+=[Columna])* PARENTESISB COMA*;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//ForeingKey ForeignKey:
	//	TFOREIGN ' ' TKEY ' ' PARENTESISA name=ID PARENTESISB ' '
	//	TREFERENCES ' ' referenceTable=[Tabla] PARENTESISA referenceColumn=[Columna] PARENTESISB COMA*
	public ForeingKeyElements getForeingKeyAccess() {
		return pForeingKey;
	}
	
	public ParserRule getForeingKeyRule() {
		return getForeingKeyAccess().getRule();
	}
	
	//terminal TCREATE:
	//	"CREATE";
	public TerminalRule getTCREATERule() {
		return tTCREATE;
	}
	
	//terminal TTABLE:
	//	"TABLE";
	public TerminalRule getTTABLERule() {
		return tTTABLE;
	}
	
	//terminal TPRIMARY:
	//	"PRIMARY";
	public TerminalRule getTPRIMARYRule() {
		return tTPRIMARY;
	}
	
	//terminal TKEY:
	//	"KEY";
	public TerminalRule getTKEYRule() {
		return tTKEY;
	}
	
	//terminal TFOREIGN:
	//	"FOREIGN";
	public TerminalRule getTFOREIGNRule() {
		return tTFOREIGN;
	}
	
	//terminal TCOLUMNAS:
	//	"COLUMNAS";
	public TerminalRule getTCOLUMNASRule() {
		return tTCOLUMNAS;
	}
	
	//terminal TREFERENCES:
	//	"REFERENCES";
	public TerminalRule getTREFERENCESRule() {
		return tTREFERENCES;
	}
	
	//terminal TNOT:
	//	"NOT";
	public TerminalRule getTNOTRule() {
		return tTNOT;
	}
	
	//terminal TNULL:
	//	"NULL";
	public TerminalRule getTNULLRule() {
		return tTNULL;
	}
	
	//terminal PARENTESISA:
	//	"(";
	public TerminalRule getPARENTESISARule() {
		return tPARENTESISA;
	}
	
	//terminal PARENTESISB:
	//	")";
	public TerminalRule getPARENTESISBRule() {
		return tPARENTESISB;
	}
	
	//terminal COMA:
	//	",";
	public TerminalRule getCOMARule() {
		return tCOMA;
	}
	
	//terminal VINT:
	//	"int";
	public TerminalRule getVINTRule() {
		return tVINT;
	}
	
	//terminal VVARCHAR:
	//	"varchar";
	public TerminalRule getVVARCHARRule() {
		return tVVARCHAR;
	}
	
	//terminal VVARCHAR255:
	//	"varchar(255)";
	public TerminalRule getVVARCHAR255Rule() {
		return tVVARCHAR255;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
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
