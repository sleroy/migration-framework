package com.byoskill.migration.domain.decoration;

public interface ResourceDecorator {

    /**
     * Checks if is decorable.
     *
     * @param source
     *            the source
     * @return true, if is decorable
     */
    boolean isDecorable(ISource source);

}
