package br.com.andreytondo.patterns.behavioral.chainofresponsability.handlers;

import br.com.andreytondo.models.http.HttpRequest;
import br.com.andreytondo.patterns.behavioral.chainofresponsability.HttpRequestHandler;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthorizerHandler implements HttpRequestHandler {

    private HttpRequestHandler nextHandler;

    @Override
    public void handleRequest(HttpRequest request) {
        System.out.println("Authorizing request...");
        if (request.getPath().startsWith("/api")) {
            System.out.println("Request authorized successfully");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("Authorization failed: Insufficient privileges");
        }
    }
}
