package br.com.andreytondo.models.resource.aws;

import br.com.andreytondo.models.resource.Instance;
import br.com.andreytondo.models.resource.Storage;
import lombok.Getter;

@Getter
public class Ec2Instance implements Instance {

    private final Capacity capacity;
    private Storage storage;

    public Ec2Instance(Capacity capacity) {
        this.capacity = capacity;
        System.out.println("Ec2 Instance created with " + capacity + " capacity");
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        this.storage = storage;
        System.out.println("Attached " + storage + " to Ec2Instance");
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped");
    }

    @Override
    public String toString() {
        return "Ec2Instance";
    }
}
