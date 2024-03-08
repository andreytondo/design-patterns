package br.com.andreytondo.patterns.factory;

import br.com.andreytondo.models.message.Message;

public abstract class MessageFactory {

    public Message getMessage() {
        Message msg = create();
        msg.encrypt();
        msg.addDefaultHeaders();
        return msg;
    }

    public abstract Message create();
}
