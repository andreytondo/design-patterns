package br.com.andreytondo.models.message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class JSONMessage extends Message {

    @Override
    public void encrypt() {
        String message = getContent();
        List<String> chars = new ArrayList<>(Stream.of(message.toCharArray()).map(Object::toString).toList());
        Collections.shuffle(chars);
        setContent(String.join("", chars));
    }

    @Override
    public void addDefaultHeaders() {
        this.getHeaders().put("Content-Type", "application/json");
    }

    public JSONMessage(String content) {
        super(content);
    }
}
