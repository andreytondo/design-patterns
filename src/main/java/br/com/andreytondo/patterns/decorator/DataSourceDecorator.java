package br.com.andreytondo.patterns.decorator;

public abstract class DataSourceDecorator implements DataSource {

    private final DataSource wraped;

    public DataSourceDecorator(DataSource source) {
        this.wraped = source;
    }

    @Override
    public void writeData(String data) {
        wraped.writeData(data);
    }

    @Override
    public String readData() {
        return wraped.readData();
    }
}
