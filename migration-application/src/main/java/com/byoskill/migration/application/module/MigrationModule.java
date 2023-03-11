package com.byoskill.migration.application.module;

import com.byoskill.migration.domain.decoration.ResourceDecorator;

import java.util.List;

public interface MigrationModule {

    /**
     * Returns the list of decorators contained in the module.
     * @return the list of decorators
     */
    List<ResourceDecorator> getDecorators();
}
