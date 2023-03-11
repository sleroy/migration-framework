package fr.echoes.labs.rapid.api.extensions;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * The Interface ExtensionBean marks a Spring Bean that must implements an interface derivating from {@link fr.echoes.labs.pluginfwk.api.extension.Extension}
 * and that will be loaded automatically.
 */
@Retention(RUNTIME)
@Target(TYPE)
@Component
public @interface ExtensionBean {

}
