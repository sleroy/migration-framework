package fr.echoeslabs.rapid.api.migration.repository;

import fr.echoeslabs.migration.utils.exception.RapidException;

public class RuleAlreadyExistingException extends RapidException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public RuleAlreadyExistingException(final String key, final String name) {
		super("Trying to re-define an existing rule with key " + key + " name='" + name + "'");
	}

}
