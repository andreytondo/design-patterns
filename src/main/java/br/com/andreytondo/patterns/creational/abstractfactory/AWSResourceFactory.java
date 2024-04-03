package br.com.andreytondo.patterns.creational.abstractfactory;

import br.com.andreytondo.models.resource.Instance;
import br.com.andreytondo.models.resource.Storage;
import br.com.andreytondo.models.resource.aws.Ec2Instance;
import br.com.andreytondo.models.resource.aws.S3Storage;

public class AWSResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(Integer kib) {
        return new S3Storage(kib);
    }
}
