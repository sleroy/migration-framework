package fr.echoeslabs.migration.api.decoration.fragments;

import fr.echoeslabs.migration.api.decoration.IDecoration;
import fr.echoeslabs.migration.api.sources.fragments.ISourceFragment;

/**
 * The listener interface for receiving ISourceFragmentDecoration events. The
 * class that is interested in processing a ISourceFragmentDecoration event
 * implements this interface, and the object created with that class is
 * registered with a component using the component's
 * <code>addISourceFragmentDecorationListener<code> method. When the
 * ISourceFragmentDecoration event occurs, that object's appropriate method is
 * invoked.
 *
 * @see ISourceFragmentDecorationEvent
 */
public interface ISourceFragmentDecorationListener {

	void notifyDecoration(ISourceFragment fragment, IDecoration decoration);
}
