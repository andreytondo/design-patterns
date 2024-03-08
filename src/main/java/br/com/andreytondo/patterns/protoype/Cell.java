package br.com.andreytondo.patterns.protoype;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cell implements Cloneable {

    private Integer age;
    private String color;
    private String size;

    @Override
    public Cell clone() throws CloneNotSupportedException {
        Cell cell = (Cell) super.clone();
        cell.setAge(0);
        return cell;
    }
}
