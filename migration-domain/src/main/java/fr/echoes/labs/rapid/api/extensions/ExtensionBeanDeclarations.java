package fr.echoes.labs.rapid.api.extensions;

import java.util.List;

import fr.echoes.labs.pluginfwk.api.extension.Extension;
import fr.echoeslabs.rapid.api.loader.repository.BeanDeclaration;

/**
 * The Interface ExtensionBeanDeclarations defines an extension to declare new beans to be used by the rules.
 */
public interface ExtensionBeanDeclarations extends Extension {

	/**
	 * Gets the bean declarations.
	 *
	 * @return the beans
	 */
	public List<? extends BeanDeclaration> getBeanDeclarations();

}
