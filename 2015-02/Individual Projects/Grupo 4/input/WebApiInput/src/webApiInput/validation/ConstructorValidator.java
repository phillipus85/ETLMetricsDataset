/**
 *
 * $Id$
 */
package webApiInput.validation;

import org.eclipse.emf.common.util.EList;

import webApiInput.Parametro;

/**
 * A sample validator interface for {@link webApiInput.Constructor}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConstructorValidator {
	boolean validate();

	boolean validateParametros(EList<Parametro> value);
}
