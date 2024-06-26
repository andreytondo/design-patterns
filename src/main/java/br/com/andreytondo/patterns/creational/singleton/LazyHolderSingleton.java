package br.com.andreytondo.patterns.creational.singleton;

public class LazyHolderSingleton {

    private LazyHolderSingleton() {}

    private static class SingletonHolder {
        private static final LazyHolderSingleton INSTANCE = new LazyHolderSingleton();
    }

    public static LazyHolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
