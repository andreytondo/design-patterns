package br.com.andreytondo.patterns.abstractfactory;

import br.com.andreytondo.models.resource.Instance;
import br.com.andreytondo.models.resource.Storage;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(Integer kib);

}
