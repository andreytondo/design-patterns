package br.com.andreytondo.patterns.bridge;

public class DriverManager {

    Driver driver;

    public DriverManager(Driver driver) {
        this.driver = driver;
    }

    public void stablishConnection() {
        driver.connect();
    }
}
