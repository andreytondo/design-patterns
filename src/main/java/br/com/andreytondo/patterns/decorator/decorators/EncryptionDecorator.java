package br.com.andreytondo.patterns.decorator.decorators;

import br.com.andreytondo.patterns.decorator.DataSource;
import br.com.andreytondo.patterns.decorator.DataSourceDecorator;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        return data + " - Encoded";
    }

    private String decode(String data) {
        return data + " - Decoded";
    }
}
