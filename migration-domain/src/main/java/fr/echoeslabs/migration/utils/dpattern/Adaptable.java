package fr.echoeslabs.migration.utils.dpattern;

import com.google.common.base.Function;

/**
 * The Interface Adaptable defines component that may provides many services for
 * a same object.
 */
public interface Adaptable {

	/**
	 * Gets the adapter.
	 *
	 * @param <A>
	 *            the generic type
	 * @param arg0
	 *            the arg0
	 * @return the adapter
	 * @throws AdapterNotFoundException
	 *             the adapter not found exception
	 */
	public <A> A getAdapter(Class<A> arg0) throws AdapterNotFoundException;

	/**
	 * Register adapter.
	 *
	 * @param <A>
	 *            the generic type
	 * @param arg0
	 *            the type of service provided by the adapter.
	 * @param _adapter
	 *            the _adapter function to convert the adaptee object into the
	 *            required service.
	 */
	public void registerAdapter(Class<?> arg0, Function<?, ?> _adapter);
}
