package br.com.andreytondo.models.workspace;

import br.com.andreytondo.patterns.creational.pool.Poolable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Equipment implements Poolable {

    private String name;

    @Override
    public void reset() {
        this.name = null;
    }
}
