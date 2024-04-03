package br.com.andreytondo.patterns.creational.singleton;

public class EagerSingleton {

    private EagerSingleton() {}

    public static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

}
