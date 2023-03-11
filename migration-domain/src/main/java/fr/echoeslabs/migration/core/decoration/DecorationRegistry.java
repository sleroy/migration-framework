package fr.echoeslabs.migration.core.decoration;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.echoeslabs.migration.api.decoration.IDecoration;

// TODO: Auto-generated Javadoc
/**
 * The Class DecorationRegistry.
 *
 * @author sleroy
 */
public class DecorationRegistry {

	/** The Constant LOGGER. */
	private static final Logger				LOGGER		= LoggerFactory.getLogger(DecorationRegistry.class);

	/** The decorations. */
	private final Map<String, IDecoration>	decorations	= new HashMap<>();

	/**
	 * Adds the decoration.
	 *
	 * @param decoration
	 *            the decoration
	 */
	public void add(final IDecoration decoration) {

		Validate.notNull(decoration);
		if (this.decorations.containsKey(decoration.getLabel())) {
			LOGGER.warn("Replacing decoration {}", decoration.getLabel());
		}
		this.decorations.put(decoration.getLabel(), decoration);

	}

	/**
	 * Gets the decorations.
	 *
	 * @return the decorations
	 */
	public Collection<IDecoration> getDecorations() {

		return this.decorations.values();
	}

	/**
	 * Checks for decoration.
	 *
	 * @param label
	 *            the label
	 * @return true, if successful
	 */
	public boolean hasDecoration(final String label) {

		Validate.notEmpty(label);
		return this.decorations.containsKey(label);
	}

	/**
	 * Checks if is decorated.
	 *
	 * @return true, if is decorated
	 */
	public boolean isDecorated() {

		return !this.decorations.isEmpty();
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {

		return this.decorations.isEmpty();
	}

}
