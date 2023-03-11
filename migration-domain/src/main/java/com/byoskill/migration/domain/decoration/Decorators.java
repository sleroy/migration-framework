package com.byoskill.migration.domain.decoration;

import com.byoskill.migration.domain.resource.Resource;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface Decorators {

    /**
     * Add a decorator to the container
     * @param resourceDecorator the resource decorator
     */
    Decorators addDecorator(@NotNull final ResourceDecorator resourceDecorator);

    /**
     * Attempt to decorate a resource
     * @param resource the resource
     * @return the decorated resource if any.
     */
    Optional<DecoratedResource> decorate(@NotNull final Resource resource);

    /**
     * Adds the decorators to the engine.
     * @param decorators the decorators.
     * @return
     */
    Decorators addDecorators(List<ResourceDecorator> decorators);
}
