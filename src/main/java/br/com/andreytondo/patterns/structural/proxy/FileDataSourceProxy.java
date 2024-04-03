package br.com.andreytondo.patterns.structural.proxy;

import br.com.andreytondo.patterns.structural.decorator.DataSource;
import br.com.andreytondo.patterns.structural.decorator.sources.FileDataSource;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class FileDataSourceProxy implements DataSource {

    private final FileDataSource fileDataSource;
    private final Map<String, String> cache = new HashMap<>();

    public FileDataSourceProxy(FileDataSource dataSource) {
        this.fileDataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        fileDataSource.writeData(data);
    }

    @Override
    public String readData() {
        if (cache.containsKey(fileDataSource.getName())) {
            return cache.get(fileDataSource.getName());
        }

        String data = fileDataSource.readData();
        cache.put(fileDataSource.getName(), data);
        return data;
    }
}
