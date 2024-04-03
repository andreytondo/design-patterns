package andreytondo.patterns.composite;

import br.com.andreytondo.patterns.composite.Department;
import br.com.andreytondo.patterns.composite.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DepartmentTest {

    @Test
    public void test() {
        Department department = new Department("Development Department");
        Employee employee1 = new Employee("Andrey", "Developer", 1000.0);
        Employee employee2 = new Employee("John", "Developer", 1000.0);
        Employee employee3 = new Employee("Jane", "Developer", 1000.0);

        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);

        Assertions.assertAll(
            () -> Assertions.assertEquals("Development Department", department.getName()),
            () -> Assertions.assertEquals(3000, department.getTotalCost()),
            () -> Assertions.assertEquals("Department: Development Department has 3 employees\n" +
                "Andrey is a Developer\n" +
                "John is a Developer\n" +
                "Jane is a Developer\n", department.getDetails())
        );
    }
}
