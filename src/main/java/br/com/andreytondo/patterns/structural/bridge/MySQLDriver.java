package br.com.andreytondo.patterns.structural.bridge;

public class MySQLDriver implements Driver {

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}
