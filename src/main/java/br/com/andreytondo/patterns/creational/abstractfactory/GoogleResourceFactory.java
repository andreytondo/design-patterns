package br.com.andreytondo.patterns.creational.abstractfactory;

import br.com.andreytondo.models.resource.Instance;
import br.com.andreytondo.models.resource.Storage;
import br.com.andreytondo.models.resource.googlecoud.GoogleCloudStorage;
import br.com.andreytondo.models.resource.googlecoud.GoogleComputeEngineInstance;

public record GoogleResourceFactory() implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(Integer kib) {
        return new GoogleCloudStorage(kib);
    }
}
