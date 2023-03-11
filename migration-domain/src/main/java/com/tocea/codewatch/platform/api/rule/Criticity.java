/**
 * Tocea Softwares.
 * <p>
 *
 * @author $Author: sleroy $
 * @since 5 nov. 2011
 * @copyright Copyright (C) 2010-2012 Tocea
 */

package com.tocea.codewatch.platform.api.rule;

/**
 * This type describes the criticity of rule.
 * <p>
 *
 * @author $Author: sleroy $
 * @since 5 nov. 2011
 * @copyright Copyright (C) 2010-2012 TOCEA
 */

public enum Criticity {
	/**
	 * Ignore the problems detected.
	 */
	IGNORE,
	/**
	 * Information
	 */
	INFO,
	/**
	 * Minor error
	 */
	MINOR,
	/**
	 * Major error.
	 */
	MAJOR,
	/**
	 * Critical Error
	 */
	CRITICAL,
	/**
	 * Blocker error.
	 */
	BLOCKER;

}
