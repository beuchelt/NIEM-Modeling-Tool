/*
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   SEARCH Group, Incorporated - initial API and implementation
 *
 */
package org.search.niem.uml.papyrus.textedit.property.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class NIEMUmlPropertyStandaloneSetup extends NIEMUmlPropertyStandaloneSetupGenerated{

	public static void doSetup() {
		new NIEMUmlPropertyStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

