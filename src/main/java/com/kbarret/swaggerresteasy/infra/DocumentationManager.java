package com.kbarret.swaggerresteasy.infra;

import com.kbarret.swaggerresteasy.controller.impl.EchoControllerImpl;
import com.wordnik.swagger.jaxrs.JaxrsApiReader;

import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DocumentationManager extends Application {

    static {
        JaxrsApiReader.setFormatString("");
    }

    private static final Set<Object> singletons = new HashSet<Object>(Arrays.asList(
            new EchoControllerImpl()));


    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>();
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
