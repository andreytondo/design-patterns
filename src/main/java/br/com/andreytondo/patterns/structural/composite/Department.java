package br.com.andreytondo.patterns.structural.composite;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Department implements OrganizationComponent {

    private final String name;
    private final List<OrganizationComponent> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(OrganizationComponent employee) {
        employees.add(employee);
    }

    @Override
    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department: ").append(name).append(" has ").append(employees.size()).append(" employees\n");
        for (OrganizationComponent employee : employees) {
            sb.append(employee.getDetails()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Double getTotalCost() {
        double totalSalary = 0;
        for (OrganizationComponent employee : employees) {
            totalSalary += employee.getTotalCost();
        }
        return totalSalary;
    }
}