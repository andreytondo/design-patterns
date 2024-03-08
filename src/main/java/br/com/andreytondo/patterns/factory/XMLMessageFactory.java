package br.com.andreytondo.patterns.factory;

import br.com.andreytondo.models.message.Message;
import br.com.andreytondo.models.message.XMLMessage;

public class XMLMessageFactory extends MessageFactory {

    @Override
    public Message create() {
        return new XMLMessage("Hello World!");
    }
}
