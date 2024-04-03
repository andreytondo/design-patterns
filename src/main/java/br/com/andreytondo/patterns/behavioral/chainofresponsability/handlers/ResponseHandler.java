package br.com.andreytondo.patterns.behavioral.chainofresponsability.handlers;

import br.com.andreytondo.models.http.HttpRequest;
import br.com.andreytondo.patterns.behavioral.chainofresponsability.HttpRequestHandler;

public class ResponseHandler implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpRequest request) {
        System.out.println("Sending response...");
    }
}
