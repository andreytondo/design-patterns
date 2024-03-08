package br.com.andreytondo.patterns.factory;

import br.com.andreytondo.models.message.JSONMessage;
import br.com.andreytondo.models.message.Message;

public class JSONMessageFactory extends MessageFactory {

    @Override
    public Message create() {
        return new JSONMessage("Hello World!");
    }
}
