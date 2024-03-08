package br.com.andreytondo.models.resource;

public interface Instance {

    enum Capacity{small, medium, large}

    void start();

    void attachStorage(Storage storage);

    void stop();

    Capacity getCapacity();

    Storage getStorage();

}
