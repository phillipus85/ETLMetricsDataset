/*
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.tallerM2M.ide.contentassist.antlr;

import co.edu.uniandes.tallerM2M.ide.contentassist.antlr.internal.InternalSqlParser;
import co.edu.uniandes.tallerM2M.services.SqlGrammarAccess;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class SqlParser extends AbstractContentAssistParser {

	@Inject
	private SqlGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSqlParser createParser() {
		InternalSqlParser result = new InternalSqlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getColumnaAccess().getTipoAlternatives_2_0(), "rule__Columna__TipoAlternatives_2_0");
					put(grammarAccess.getDatabaseAccess().getGroup(), "rule__Database__Group__0");
					put(grammarAccess.getTablaAccess().getGroup(), "rule__Tabla__Group__0");
					put(grammarAccess.getColumnaAccess().getGroup(), "rule__Columna__Group__0");
					put(grammarAccess.getPrimaryAccess().getGroup(), "rule__Primary__Group__0");
					put(grammarAccess.getPrimaryAccess().getGroup_6(), "rule__Primary__Group_6__0");
					put(grammarAccess.getForeingKeyAccess().getGroup(), "rule__ForeingKey__Group__0");
					put(grammarAccess.getDatabaseAccess().getTablasAssignment_1(), "rule__Database__TablasAssignment_1");
					put(grammarAccess.getTablaAccess().getNameAssignment_4(), "rule__Tabla__NameAssignment_4");
					put(grammarAccess.getTablaAccess().getColumnasAssignment_6(), "rule__Tabla__ColumnasAssignment_6");
					put(grammarAccess.getTablaAccess().getPrimarysAssignment_7(), "rule__Tabla__PrimarysAssignment_7");
					put(grammarAccess.getTablaAccess().getForeignsAssignment_8(), "rule__Tabla__ForeignsAssignment_8");
					put(grammarAccess.getColumnaAccess().getNameAssignment_0(), "rule__Columna__NameAssignment_0");
					put(grammarAccess.getColumnaAccess().getTipoAssignment_2(), "rule__Columna__TipoAssignment_2");
					put(grammarAccess.getColumnaAccess().getNotNullAssignment_3(), "rule__Columna__NotNullAssignment_3");
					put(grammarAccess.getPrimaryAccess().getColumnAssignment_5(), "rule__Primary__ColumnAssignment_5");
					put(grammarAccess.getPrimaryAccess().getColumnAssignment_6_2(), "rule__Primary__ColumnAssignment_6_2");
					put(grammarAccess.getForeingKeyAccess().getNameAssignment_5(), "rule__ForeingKey__NameAssignment_5");
					put(grammarAccess.getForeingKeyAccess().getReferenceTableAssignment_10(), "rule__ForeingKey__ReferenceTableAssignment_10");
					put(grammarAccess.getForeingKeyAccess().getReferenceColumnAssignment_12(), "rule__ForeingKey__ReferenceColumnAssignment_12");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSqlParser typedParser = (InternalSqlParser) parser;
			typedParser.entryRuleDatabase();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SqlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SqlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
