package br.com.andreytondo.models.resource;

public interface Instance {

    enum Capacity{SMALL, MEDIUM, LARGE}

    void start();

    void attachStorage(Storage storage);

    void stop();

    Capacity getCapacity();

    Storage getStorage();

}
