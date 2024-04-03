package br.com.andreytondo.patterns.behavioral.chainofresponsability.handlers;

import br.com.andreytondo.models.http.HttpRequest;
import br.com.andreytondo.patterns.behavioral.chainofresponsability.HttpRequestHandler;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthenticatorHandler implements HttpRequestHandler {

    private HttpRequestHandler nextHandler;

    @Override
    public void handleRequest(HttpRequest request) {
        System.out.println("Authenticating request...");
        if (request.getPath().startsWith("/api/auth")) {
            System.out.println("Request authenticated successfully");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            throw new RuntimeException("Request not authenticated");
        }
    }
}
