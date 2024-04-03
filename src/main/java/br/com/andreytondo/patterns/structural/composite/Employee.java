package br.com.andreytondo.patterns.structural.composite;

import lombok.Getter;

@Getter
public class Employee implements OrganizationComponent {

    private final String name;
    private final String jobTitle;
    private final double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String getDetails() {
        return name + " is a " + jobTitle;
    }

    @Override
    public Double getTotalCost() {
        return salary;
    }

}
