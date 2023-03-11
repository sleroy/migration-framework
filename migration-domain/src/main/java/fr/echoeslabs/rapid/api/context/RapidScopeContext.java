package fr.echoeslabs.rapid.api.context;

import java.io.Closeable;

/**
 * The Interface RapidScopeContext.
 */
public interface RapidScopeContext extends Closeable {

	/**
	 * Autowire the informations of the object.
	 *
	 * @param <T>
	 *            the generic type
	 * @param _beanObject
	 *            the _bean object
	 * @return the t
	 */
	<T> T autowire(T _beanObject);

	/**
	 * Gets the bean.
	 *
	 * @param <T>
	 *            the generic type
	 * @param _beanDefinition
	 *            the class1
	 * @return the bean
	 */
	<T> T getBean(Class<T> _beanDefinition);

	/**
	 * Gets the bean names.
	 *
	 * @return the bean names
	 */
	String[] getBeanNames();

}
