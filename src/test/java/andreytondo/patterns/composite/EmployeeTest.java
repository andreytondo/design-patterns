package andreytondo.patterns.composite;

import br.com.andreytondo.patterns.composite.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void test() {
        Employee employee1 = new Employee("Andrey", "Developer", 1000.0);

        Assertions.assertAll(
            () -> Assertions.assertEquals("Andrey", employee1.getName()),
            () -> Assertions.assertEquals("Developer", employee1.getJobTitle()),
            () -> Assertions.assertEquals(1000.0, employee1.getSalary()),
            () -> Assertions.assertEquals("Andrey is a Developer", employee1.getDetails()),
            () -> Assertions.assertEquals(1000.0, employee1.getTotalCost())
        );
    }
}
