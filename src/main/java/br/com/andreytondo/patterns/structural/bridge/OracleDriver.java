package br.com.andreytondo.patterns.structural.bridge;

public class OracleDriver implements Driver {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }
}
