package fr.echoeslabs.migration.api.decoration;

import fr.echoeslabs.migration.api.sources.ISource;

/**
 * The listener interface for receiving ISourceDecoration events. The class that
 * is interested in processing a ISourceDecoration event implements this
 * interface, and the object created with that class is registered with a
 * component using the component's <code>addISourceDecorationListener
 * <code> method. When the ISourceDecoration event occurs, that object's
 * appropriate method is invoked.
 *
 * @see ISourceDecorationEvent
 */
public interface ISourceDecorationListener {

	/**
	 * Notify decoration.
	 *
	 * @param fragment
	 *            the fragment
	 * @param decoration
	 *            the decoration
	 */
	void notifyDecoration(ISource fragment, IDecoration decoration);
}
