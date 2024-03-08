package br.com.andreytondo.models.resource.googlecoud;

import br.com.andreytondo.models.resource.Instance;
import br.com.andreytondo.models.resource.Storage;
import lombok.Getter;


@Getter
public class GoogleComputeEngineInstance implements Instance {

    private final Capacity capacity;
    private Storage storage;

    public GoogleComputeEngineInstance(Capacity capacity) {
        this.capacity = capacity;
        System.out.println("Google Compute Engine Instance created with " + capacity + " capacity");
    }

    @Override
    public void start() {
        System.out.println("Google Compute Engine Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        this.storage = storage;
        System.out.println("Attached " + storage + " to Google Compute Engine Instance");
    }

    @Override
    public void stop() {
        System.out.println("Google Compute Engine Instance stopped");
    }
}
