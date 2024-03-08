package br.com.andreytondo.models.resource;

import br.com.andreytondo.patterns.abstractfactory.ResourceFactory;

import java.util.Objects;


public class Client {

    private Instance instance;
    private Storage storage;

    private final ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, Integer kib) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(kib);
        instance.attachStorage(storage);

        this.instance = instance;
        this.storage = storage;
        return instance;
    }

    public void restart() {
        if (Objects.nonNull(instance)) {
            instance.start();
            instance.stop();
            System.out.println(instance + " restarted");
        }
    }
}
