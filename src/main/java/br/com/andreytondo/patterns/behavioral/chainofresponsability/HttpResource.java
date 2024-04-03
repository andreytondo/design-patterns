package br.com.andreytondo.patterns.behavioral.chainofresponsability;

import br.com.andreytondo.models.http.HttpRequest;
import br.com.andreytondo.patterns.behavioral.chainofresponsability.handlers.AuthenticatorHandler;
import br.com.andreytondo.patterns.behavioral.chainofresponsability.handlers.AuthorizerHandler;
import br.com.andreytondo.patterns.behavioral.chainofresponsability.handlers.LoggerHandler;
import br.com.andreytondo.patterns.behavioral.chainofresponsability.handlers.ResponseHandler;

import java.util.Optional;

public class HttpResource {

    public void get(String url) {
        get(url, null);
    }

    public void get(String url, HttpRequestHandler customChain) {
        HttpRequest request = new HttpRequest(url, "GET", "");
        HttpRequestHandler chain = Optional.ofNullable(customChain).orElseGet(this::createDefaultChain);
        chain.handleRequest(request);
    }

    public HttpRequestHandler createDefaultChain() {
        LoggerHandler logger = new LoggerHandler();
        AuthenticatorHandler authenticator = new AuthenticatorHandler();
        AuthorizerHandler authorizer = new AuthorizerHandler();
        ResponseHandler requestProcessor = new ResponseHandler();

        logger.setNextHandler(authenticator);
        authenticator.setNextHandler(authorizer);
        authorizer.setNextHandler(requestProcessor);

        return logger;
    }
}
