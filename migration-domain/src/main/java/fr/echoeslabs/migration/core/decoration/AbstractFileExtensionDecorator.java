package fr.echoeslabs.migration.core.decoration;

import fr.echoeslabs.migration.api.decoration.IDecoratedSource;
import fr.echoeslabs.migration.api.decoration.IDecorator;
import fr.echoeslabs.migration.api.sources.ISource;

/**
 * The Class AbstractFileExtensionDecorator defines a basic decorator matching a
 * file extension.
 *
 * @author sleroy
 */
public abstract class AbstractFileExtensionDecorator implements IDecorator {

	/** The file extension. */
	private final String fileExtension;

	/**
	 * Instantiates a new abstract file extension decorator.
	 *
	 * @param _fileExtension
	 *            the _file extension
	 */
	protected AbstractFileExtensionDecorator(final String _fileExtension) {
		super();
		this.fileExtension = _fileExtension;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * fr.echoeslabs.migration.api.decoration.IDecorator#decorate(fr.echoeslabs.
	 * migration.api.decoration.IDecoratedSource)
	 */
	@Override
	public abstract void decorate(IDecoratedSource decoratedSource);

	/*
	 * (non-Javadoc)
	 * @see fr.echoeslabs.migration.api.decoration.IDecorator#isDecorable(fr.
	 * echoeslabs.migration.api.sources.ISource)
	 */
	@Override
	public boolean isDecorable(final ISource source) {

		return this.fileExtension.equalsIgnoreCase(source.getFileExtension());
	}

}
