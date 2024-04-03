package br.com.andreytondo.patterns.structural.bridge;

public class DriverManager {

    Driver driver;

    public DriverManager(Driver driver) {
        this.driver = driver;
    }

    public void stablishConnection() {
        driver.connect();
    }
}
