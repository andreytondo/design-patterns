package br.com.andreytondo.patterns.decorator.sources;

import br.com.andreytondo.patterns.decorator.DataSource;
import lombok.Getter;

@Getter
public class DatabaseDataSource implements DataSource {

    private final String databaseName;

    public DatabaseDataSource(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing data to database " + databaseName);
    }

    @Override
    public String readData() {
        return databaseName + " data";
    }
}
