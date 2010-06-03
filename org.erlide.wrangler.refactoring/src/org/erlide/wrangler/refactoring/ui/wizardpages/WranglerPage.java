/*******************************************************************************
 * Copyright (c) 2010 György Orosz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     György Orosz - initial API and implementation
 ******************************************************************************/
package org.erlide.wrangler.refactoring.ui.wizardpages;

import org.eclipse.ltk.ui.refactoring.UserInputWizardPage;

/**
 * Costum Input wizard pages used by Wrangler integration
 * 
 * @author Gyorgy Orosz
 * @version %I%, %G%
 */
public abstract class WranglerPage extends UserInputWizardPage {

	/**
	 * Default constructor
	 * 
	 * @param name
	 *            the page's name
	 */
	public WranglerPage(final String name) {
		super(name);
	}

}
