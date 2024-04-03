package br.com.andreytondo.patterns.structural.composite;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Organization implements OrganizationComponent {

    private final String name;
    private final List<Department> departments = new ArrayList<>();

    public Organization(String name) {
        this.name = name;
    }

    @Override
    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Organization: ").append(name).append(" has ").append(departments.size()).append(" departments\n");
        for (Department department : departments) {
            sb.append(department.getDetails()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Double getTotalCost() {
        double totalSalary = 0;
        for (Department department : departments) {
            totalSalary += department.getTotalCost();
        }
        return totalSalary;
    }
}
