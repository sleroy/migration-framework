/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.echoeslabs.rapid.api.loader.repository;

import fr.echoeslabs.migration.utils.exception.RapidException;

/**
 * This class defines an exception when a repository definition could not be loaded.
 *
 * @author sleroy
 */
public class RepositoryLoadingException extends RapidException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new repository loading exception.
	 *
	 * @param ex
	 *            the ex
	 */
	public RepositoryLoadingException(final Throwable ex) {
		super("Could not load a repository", ex);
	}

}
