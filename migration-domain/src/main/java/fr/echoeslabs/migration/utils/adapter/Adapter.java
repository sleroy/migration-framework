package fr.echoeslabs.migration.utils.adapter;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Function;

import fr.echoeslabs.migration.utils.dpattern.AdapterNotFoundException;

/**
 * The Class Adapter describes a registry holding all the adapter compatible
 * with some interfaces.
 *
 * @author sleroy
 * @param <T>
 *            the generic type
 */
public class Adapter<T> {

	private static final Logger					LOGGER		= LoggerFactory.getLogger(Adapter.class);

	/** The adapters. */
	private final Map<Class<?>, Function<T, ?>>	adapters	= new HashMap<>();

	/**
	 * Adds the adapter.
	 *
	 * @param supportedInterface
	 *            the supported interface
	 * @param _adapter
	 *            the _adapter
	 */
	public void addAdapter(final Class<?> supportedInterface, final Function<T, ?> _adapter) {

		this.adapters.put(supportedInterface, _adapter);
	}

	/**
	 * Gets the adapter.
	 *
	 * @param _supportedInterface
	 *            the _supported interface
	 * @return the adapter
	 */
	public Function<T, ?> getAdapter(final Class<?> _supportedInterface) {

		return this.adapters.get(_supportedInterface);
	}

	/**
	 * Gets the service.
	 *
	 * @param _service
	 *            the _service
	 * @param input
	 * @return the service
	 * @throws AdapterNotFoundException
	 */
	public <R> R getService(final Class<R> _service, final T input) throws AdapterNotFoundException {

		Validate.notNull(_service);
		Validate.notNull(input);
		final Function<T, ?> adapter = this.getAdapter(_service);
		if (adapter == null) {
			throw new AdapterNotFoundException("Adapter not found for class " + _service);
		}
		@SuppressWarnings("unchecked")
		final R apply = (R) adapter.apply(input);
		LOGGER.debug("Found adapter {} for input {}.", apply, input);
		return apply;
	}

}
