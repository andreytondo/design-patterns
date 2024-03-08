package br.com.andreytondo.patterns.singleton;

public class EagerSingleton {

    private EagerSingleton() {}

    public static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

}
