package br.com.andreytondo.models.http;

import lombok.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class HttpRequest {

    private String path;
    private String method;
    private String body;
}
