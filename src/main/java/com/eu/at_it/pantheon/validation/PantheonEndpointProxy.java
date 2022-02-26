package com.eu.at_it.pantheon.validation;

import com.eu.at_it.pantheon.server.endpoints.PantheonEndpoint;

import java.lang.reflect.Proxy;
import java.util.Map;

public class PantheonEndpointProxy {
    public PantheonEndpoint getProxyFor(PantheonEndpoint endpoint, Map<String, EndpointValidator> endpointMethodsAndValidators) {
        return (PantheonEndpoint) Proxy.newProxyInstance(endpoint.getClass().getClassLoader(),
                new Class[]{PantheonEndpoint.class}, new EndpointRequestValidator(endpoint, endpointMethodsAndValidators));
    }
}
