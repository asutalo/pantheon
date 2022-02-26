package com.eu.at_it.pantheon.validation;

import com.eu.at_it.pantheon.server.endpoints.PantheonEndpoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;
import java.util.Map;

class PantheonEndpointProxyTest {
    @Test
    void getProxyFor_shouldReturnProxyObject() {
        PantheonEndpoint proxy = new PantheonEndpointProxy().getProxyFor(new TestImpl(), Map.of());

        Assertions.assertTrue(proxy instanceof Proxy);
    }

    private static class TestImpl implements PantheonEndpoint {
    }
}