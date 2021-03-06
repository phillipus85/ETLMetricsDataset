/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.scoping


import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference
import org.xtext.example.sQL.Table;
import org.eclipse.xtext.scoping.Scopes;
import org.xtext.example.sQL.foreignKey;
/**
 * This class contains custom scoping description.
 * 
 */
class SQLScopeProvider extends AbstractDeclarativeScopeProvider {

override public IScope getScope(EObject context, EReference reference)
	{
		if (context instanceof foreignKey && reference.name == "ref")
		{
			for (var i = 0; i < context.eContainer.eContainer.eContents.size(); i++)
			{
				if ((context.eContainer.eContainer.eContents.get(i) as Table).name == (context as foreignKey).reftable.name)
				{
					return Scopes::scopeFor((context.eContainer.eContainer.eContents.get(i) as Table).columns);
				}
			}
			
			return null;
		}		 
		else
		{	
			return super.getScope(context, reference)
		}
	}
}
