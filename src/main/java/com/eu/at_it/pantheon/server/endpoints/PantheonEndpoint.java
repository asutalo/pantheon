package com.eu.at_it.pantheon.server.endpoints;

import com.sun.net.httpserver.Headers;

import java.util.Map;

public interface PantheonEndpoint {
    Response head(Map<String, Object> uriParams, Map<String, Object> requestBody, Headers requestHeaders);

    Response get(Map<String, Object> uriParams, Map<String, Object> requestBody, Headers requestHeaders);

    Response put(Map<String, Object> uriParams, Map<String, Object> requestBody, Headers requestHeaders);

    Response post(Map<String, Object> uriParams, Map<String, Object> requestBody, Headers requestHeaders);

    Response patch(Map<String, Object> uriParams, Map<String, Object> requestBody, Headers requestHeaders);

    Response delete(Map<String, Object> uriParams, Map<String, Object> requestBody, Headers requestHeaders);
}
