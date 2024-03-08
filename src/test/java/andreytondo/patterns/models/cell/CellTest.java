package andreytondo.patterns.models.cell;

import br.com.andreytondo.models.cell.Cell;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CellTest {

    @Test
    @DisplayName("Should return correct cell object")
    public void test01() throws Exception {
        Cell cell = new Cell();
        cell.setAge(10);
        cell.setColor("red");
        cell.setSize("big");

        Cell clone = cell.clone();
        Assertions.assertInstanceOf(Cell.class, cell);
        Assertions.assertEquals(0, clone.getAge());
        Assertions.assertEquals("red", clone.getColor());
        Assertions.assertEquals("big", clone.getSize());
    }
}
