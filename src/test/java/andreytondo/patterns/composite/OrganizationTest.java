package andreytondo.patterns.composite;

import br.com.andreytondo.patterns.composite.Department;
import br.com.andreytondo.patterns.composite.Employee;
import br.com.andreytondo.patterns.composite.Organization;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrganizationTest {

    @Test
    public void test() {
        Organization organization = new Organization("Company");

        Department developmentDepartment = new Department("Development Department");
        Employee employee1 = new Employee("Andrey", "Developer", 1000.0);
        Employee employee2 = new Employee("John", "Developer", 1000.0);
        Employee employee3 = new Employee("Jane", "Developer", 1000.0);
        developmentDepartment.addEmployee(employee1);
        developmentDepartment.addEmployee(employee2);
        developmentDepartment.addEmployee(employee3);

        Department marketingDepartment = new Department("Marketing Department");
        Employee employee4 = new Employee("Alice", "Marketing Specialist", 1500.0);
        Employee employee5 = new Employee("Bob", "Marketing Specialist", 1500.0);
        marketingDepartment.addEmployee(employee4);
        marketingDepartment.addEmployee(employee5);

        organization.getDepartments().add(developmentDepartment);
        organization.getDepartments().add(marketingDepartment);

        Assertions.assertAll(
            () -> Assertions.assertEquals("Company", organization.getName()),
            () -> Assertions.assertEquals(6000, organization.getTotalCost()),
            () -> Assertions.assertEquals("Organization: Company has 2 departments\n" +
                "Department: Development Department has 3 employees\n" +
                "Andrey is a Developer\n" +
                "John is a Developer\n" +
                "Jane is a Developer\n" +
                "\n" +
                "Department: Marketing Department has 2 employees\n" +
                "Alice is a Marketing Specialist\n" +
                "Bob is a Marketing Specialist\n\n", organization.getDetails())
        );
    }
}
