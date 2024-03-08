package br.com.andreytondo.models.message;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter @Setter
public abstract class Message {

    private String content;
    private Map<String, String> headers = new HashMap<>();

    public abstract void encrypt();
    public abstract void addDefaultHeaders();

    public Message(String content) {
        this.content = content;
    }
}
