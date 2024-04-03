package br.com.andreytondo.patterns.creational.pool;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private final BlockingDeque<T> available;

    public ObjectPool(Supplier<T> creator, int initialSize) {
        this.available = new LinkedBlockingDeque<>();
        for (int i = 0; i < initialSize; i++) {
            available.offer(creator.get());
        }
    }

    public T get() {
        try {
            return available.take();
        } catch (InterruptedException e) {
            throw new RuntimeException("Error while getting object from pool", e);
        }
    }

    public void release(T obj) {
        obj.reset();
        try {
            available.put(obj);
        }
        catch (InterruptedException e) {
            throw new RuntimeException("Error while releasing object back to pool", e);
        }
    }
}
