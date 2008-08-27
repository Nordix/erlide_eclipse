/*******************************************************************************
 * Copyright (c) 2004 Vlad Dumitrescu and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Vlad Dumitrescu
 *******************************************************************************/
package org.erlide.ui;

/**
 * Simple ui constants.
 * 
 * 
 * @author Vlad Dumitrescu
 */
public interface IErlideUIConstants {

	/**
	 * The icon path
	 */
	String ICON_PATH = "/icons/";

	/**
	 * The console image
	 */
	String IMG_CONSOLE = "console.gif";

	/**
	 * The new project wizard
	 */
	String IMG_NEW_PROJECT_WIZARD = "erlang058.gif";

	/**
	 * The project tree label
	 */
	String IMG_PROJECT_LABEL = "projects.gif";

	/**
	 * The closed project tree label
	 */
	String IMG_PROJECT_CLOSED_LABEL = "closedproject.gif";

	/**
	 * The package folder (source folders)
	 */
	String IMG_PACKAGE_FOLDER_LABEL = "packagefolder.gif";

	/**
	 * The package tree label
	 */
	String IMG_PACKAGE_LABEL = "package.gif";

	/**
	 * The file tree label
	 */
	String IMG_FILE_LABEL = "file.gif";

	/**
	 * the folder tree label
	 */
	String IMG_FOLDER_LABLE = "folder.gif";

	/**
	 * disabled refresh
	 */
	String IMG_DISABLED_REFRESH = "drefresh_nav.gif";

	/**
	 * Refresh id
	 */
	String IMG_REFRESH = "refresh_nav.gif";

	/**
	 * disabled import
	 */
	String IMG_DISABLED_IMPORT = "dimport_wiz.gif";

	/**
	 * the import wizard
	 */
	String IMG_IMPORT = "import_wiz.gif";

	/**
	 * The disabled export
	 */
	String IMG_DISABLED_EXPORT = "dexport_wiz.gif";

	/**
	 * The export wizard
	 */
	String IMG_EXPORT = "export_wiz.gif";

	/**
	 * collapse all
	 */
	String IMG_COLLAPSEALL = "collapseall.gif";

	/**
	 * the action group
	 */
	String CONSOLE_ACTION_ERLANG_GROUP = "erlang_group";

	String EVALUATION_GROUP = "erlang_evaluation_group";

	String IMG_ERLANG_LOGO = "erlang058.gif";

	// The Erlang Navigator View ID
	public static final String NAVIGATOR_VIEW_ID = "org.erlide.ui.views.navigator.view"; //$NON-NLS-1$

	// Search Menu
	public static final String FIND_REFERENCES_IN_WORKSPACE = "org.eclipse.jdt.ui.actions.ReferencesInWorkspace"; //$NON-NLS-1$

	public static final String FIND_REFERENCES_IN_PROJECT = "org.eclipse.jdt.ui.actions.ReferencesInProject"; //$NON-NLS-1$

	// public static final String FIND_REFERENCES_IN_WORKING_SET=
	// "org.eclipse.jdt.ui.actions.ReferencesInWorkingSet"; //$NON-NLS-1$

}