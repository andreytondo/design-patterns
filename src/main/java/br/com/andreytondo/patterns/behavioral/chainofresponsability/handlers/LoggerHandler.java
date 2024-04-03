package br.com.andreytondo.patterns.behavioral.chainofresponsability.handlers;

import br.com.andreytondo.models.http.HttpRequest;
import br.com.andreytondo.patterns.behavioral.chainofresponsability.HttpRequestHandler;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class LoggerHandler implements HttpRequestHandler {

    private HttpRequestHandler nextHandler;

    @Override
    public void handleRequest(HttpRequest request) {
        System.out.println("Logging request: " + request.getMethod() + " " + request.getPath());
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
