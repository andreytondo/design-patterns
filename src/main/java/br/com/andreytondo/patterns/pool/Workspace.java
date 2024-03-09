package br.com.andreytondo.patterns.pool;

import br.com.andreytondo.models.workspace.Equipment;

public class Workspace {

    private final ObjectPool<Equipment> warehouse;

    public Workspace() {
        this.warehouse = new ObjectPool<>(Equipment::new, 10);
    }

    public Equipment getEquipment() {
        return this.warehouse.get();
    }

    public void releaseEquipment(Equipment equipment) {
        this.warehouse.release(equipment);
    }
}
