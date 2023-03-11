package com.byoskill.tools.flexangular;

import com.byoskill.migration.domain.decoration.ResourceDecorator;
import com.byoskill.tools.flexangular.decorators.*;
import com.google.inject.AbstractModule;

public class FlexAngularModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ResourceDecorator.class).to(HtmlDecorator.class);
        bind(ResourceDecorator.class).to(MXmlDecorator.class);
        bind(ResourceDecorator.class).to(TypeScriptDecorator.class);
        bind(ResourceDecorator.class).to(PropertiesDecorator.class);
        bind(ResourceDecorator.class).to(ActionScriptDecorator.class);

    }
}
