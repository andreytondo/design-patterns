package br.com.andreytondo.patterns.creational.singleton;

public class LazySingleton {

    private LazySingleton() {}

    private static volatile LazySingleton INSTANCE;

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
