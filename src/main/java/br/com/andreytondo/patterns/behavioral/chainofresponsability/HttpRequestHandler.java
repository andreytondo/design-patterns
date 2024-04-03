package br.com.andreytondo.patterns.behavioral.chainofresponsability;

import br.com.andreytondo.models.http.HttpRequest;

public interface HttpRequestHandler {

    void handleRequest(HttpRequest request);
}
