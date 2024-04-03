package br.com.andreytondo.patterns.structural.decorator;

public interface DataSource {

    void writeData(String data);

    String readData();
}
