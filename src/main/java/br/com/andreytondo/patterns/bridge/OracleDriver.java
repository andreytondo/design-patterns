package br.com.andreytondo.patterns.bridge;

public class OracleDriver implements Driver {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }
}
