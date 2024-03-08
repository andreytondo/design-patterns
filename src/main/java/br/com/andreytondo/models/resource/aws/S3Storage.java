package br.com.andreytondo.models.resource.aws;

import br.com.andreytondo.models.resource.Storage;

public record S3Storage(Integer kib) implements Storage {

    public S3Storage(Integer kib) {
        this.kib = kib;
        System.out.println("Allocated " + kib + " kib in S3");
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
