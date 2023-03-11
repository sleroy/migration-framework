package fr.echoeslabs.migration.core.decoration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;

import fr.echoeslabs.migration.api.decoration.IDecoratedSource;
import fr.echoeslabs.migration.api.decoration.IDecorator;
import fr.echoeslabs.migration.api.decoration.ISimpleDecorator;
import fr.echoeslabs.migration.api.sources.ISource;

/**
 * The Class SimpleDecoratorProxy makes the writing of {@link IDecorator} easier.
 *
 * @author sleroy
 */
public abstract class SimpleDecoratorProxy implements IDecorator, BeanFactoryAware {

	private final ISimpleDecorator		simpleDecorator;
	private AutowireCapableBeanFactory	beanFactory;

	/**
	 * Instantiates a new simple decorator proxy.
	 *
	 * @param _decorator
	 *            the _decorator
	 */
	public SimpleDecoratorProxy() {
		super();
		this.simpleDecorator = this.newSimpleDecorator();

	}

	@Override
	public void decorate(final IDecoratedSource decoratedSource) {

		decoratedSource.decorate(new Decoration(this.simpleDecorator.getLabel(), this.simpleDecorator.getDescription()));

	}

	@Override
	public boolean isDecorable(final ISource source) {

		return this.simpleDecorator.isDecorable(source);
	}

	/**
	 * New simple decorator.
	 *
	 * @return the i simple decorator
	 */
	public abstract ISimpleDecorator newSimpleDecorator();

	/*
	 * (non-Javadoc)
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setBeanFactory(final BeanFactory beanFactory) throws BeansException {
		this.beanFactory = (AutowireCapableBeanFactory) beanFactory;
	}

	@Override
	public String toString() {
		return "SimpleDecoratorProxy [newSimpleDecorator()=" + this.simpleDecorator + ", getClass()=" + this.getClass() + ", hashCode()=" + this.hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
