/**
 * generated by Xtext 2.9.1
 */
package org.uniandes.xtext;

import org.uniandes.xtext.SQLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SQLStandaloneSetup extends SQLStandaloneSetupGenerated {
  public static void doSetup() {
    SQLStandaloneSetup _sQLStandaloneSetup = new SQLStandaloneSetup();
    _sQLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
