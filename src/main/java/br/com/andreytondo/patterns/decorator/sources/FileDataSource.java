package br.com.andreytondo.patterns.decorator.sources;

import br.com.andreytondo.patterns.decorator.DataSource;
import lombok.Getter;

@Getter
public class FileDataSource implements DataSource {

    private final String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing data to file " + name);
    }

    @Override
    public String readData() {
        return name + " data";
    }
}
