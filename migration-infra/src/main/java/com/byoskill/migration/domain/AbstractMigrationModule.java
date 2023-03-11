package com.byoskill.migration.domain;

import com.byoskill.migration.domain.decoration.ResourceDecorator;
import com.byoskill.migration.application.module.MigrationModule;
import com.google.inject.Inject;
import com.google.inject.Injector;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class AbstractMigrationModule implements MigrationModule {
    private Injector childInjector;

    public AbstractMigrationModule(Injector childInjector) {

        this.childInjector = childInjector;
    }

    @Override
    public List<ResourceDecorator> getDecorators() {
        final DecoratorList decoratorList = new DecoratorList();
        childInjector.injectMembers(decoratorList);
        log.info("Found {} decorators", decoratorList.decorators);
        return Arrays.asList(decoratorList.decorators);
    }

    public static class DecoratorList {
        @Inject
        public ResourceDecorator[] decorators;
    }
}
