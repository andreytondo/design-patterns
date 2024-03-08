package br.com.andreytondo.models.resource.googlecoud;

import br.com.andreytondo.models.resource.Storage;

public record GoogleCloudStorage(Integer kib) implements Storage {

    public GoogleCloudStorage(Integer kib) {
        this.kib = kib;
        System.out.println("Google Cloud Storage created with " + kib + " kib");
    }

    @Override
    public String toString() {
        return "GoogleCloudStorage";
    }
}
