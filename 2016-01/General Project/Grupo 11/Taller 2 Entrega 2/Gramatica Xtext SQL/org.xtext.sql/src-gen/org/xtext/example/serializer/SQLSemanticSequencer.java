/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.sQL.DataBase;
import org.xtext.example.sQL.SQLPackage;
import org.xtext.example.sQL.Table;
import org.xtext.example.sQL.column;
import org.xtext.example.sQL.foreignKey;
import org.xtext.example.sQL.primaryKey;
import org.xtext.example.services.SQLGrammarAccess;

@SuppressWarnings("all")
public class SQLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SQLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SQLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SQLPackage.DATA_BASE:
				sequence_DataBase(context, (DataBase) semanticObject); 
				return; 
			case SQLPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			case SQLPackage.COLUMN:
				sequence_column(context, (column) semanticObject); 
				return; 
			case SQLPackage.FOREIGN_KEY:
				sequence_foreignKey(context, (foreignKey) semanticObject); 
				return; 
			case SQLPackage.PRIMARY_KEY:
				sequence_primaryKey(context, (primaryKey) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DataBase returns DataBase
	 *
	 * Constraint:
	 *     Tables+=Table+
	 */
	protected void sequence_DataBase(ISerializationContext context, DataBase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     (name=ID columns+=column+ primaryKey=primaryKey foreignkeys+=foreignKey*)
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     column returns column
	 *
	 * Constraint:
	 *     (name=ID type=DataType)
	 */
	protected void sequence_column(ISerializationContext context, column semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SQLPackage.Literals.COLUMN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SQLPackage.Literals.COLUMN__NAME));
			if (transientValues.isValueTransient(semanticObject, SQLPackage.Literals.COLUMN__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SQLPackage.Literals.COLUMN__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getColumnAccess().getTypeDataTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     foreignKey returns foreignKey
	 *
	 * Constraint:
	 *     (name=ID reftable=[Table|ID] ref=[column|ID])
	 */
	protected void sequence_foreignKey(ISerializationContext context, foreignKey semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SQLPackage.Literals.FOREIGN_KEY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SQLPackage.Literals.FOREIGN_KEY__NAME));
			if (transientValues.isValueTransient(semanticObject, SQLPackage.Literals.FOREIGN_KEY__REFTABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SQLPackage.Literals.FOREIGN_KEY__REFTABLE));
			if (transientValues.isValueTransient(semanticObject, SQLPackage.Literals.FOREIGN_KEY__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SQLPackage.Literals.FOREIGN_KEY__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForeignKeyAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getForeignKeyAccess().getReftableTableIDTerminalRuleCall_6_0_1(), semanticObject.getReftable());
		feeder.accept(grammarAccess.getForeignKeyAccess().getRefColumnIDTerminalRuleCall_8_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     primaryKey returns primaryKey
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_primaryKey(ISerializationContext context, primaryKey semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SQLPackage.Literals.PRIMARY_KEY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SQLPackage.Literals.PRIMARY_KEY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryKeyAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
