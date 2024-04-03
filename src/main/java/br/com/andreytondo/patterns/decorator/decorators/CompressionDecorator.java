package br.com.andreytondo.patterns.decorator.decorators;

import br.com.andreytondo.patterns.decorator.DataSourceDecorator;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSourceDecorator dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String data) {
        return data + " - Compressed";
    }

    private String decompress(String data) {
        return data + " - Decompressed";
    }
}
