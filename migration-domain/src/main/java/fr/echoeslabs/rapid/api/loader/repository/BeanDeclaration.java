package fr.echoeslabs.rapid.api.loader.repository;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

/**
 * The Interface BeanDeclaration defines a component.
 */
public interface BeanDeclaration {

	/**
	 * Gets the bean name.
	 *
	 * @return the bean name
	 */
	String getBeanName();

	/**
	 * Register the bean.
	 *
	 * @param _beanFactory
	 *            the _bean factory
	 */
	void register(final BeanDefinitionRegistry _beanDefinitionRegistry, ConfigurableListableBeanFactory _beanFactory);

}
