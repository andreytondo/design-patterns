package br.com.andreytondo.models.message;

import java.nio.charset.StandardCharsets;
import java.util.Base64;


public class XMLMessage extends Message {

    @Override
    public void encrypt() {
        String message = getContent();
        byte[] encrypted = Base64.getEncoder().encode(message.getBytes());
        setContent(new String(encrypted, StandardCharsets.UTF_8));
    }

    @Override
    public void addDefaultHeaders() {
        this.getHeaders().put("Content-Type", "application/xml");
    }

    public XMLMessage(String content) {
        super(content);
    }
}
