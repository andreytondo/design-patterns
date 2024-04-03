package andreytondo.patterns.creational.pool;

import br.com.andreytondo.models.workspace.Equipment;
import br.com.andreytondo.patterns.creational.pool.Workspace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WorkspaceTest {

    @Test
    @DisplayName("Should get object from pool")
    public void testReset() {
        Workspace ws = new Workspace();

        Equipment equip1 = ws.getEquipment();
        equip1.setName("Computer");

        Equipment equip2 = ws.getEquipment();
        equip2.setName("Printer");

        Assertions.assertEquals("Computer", equip1.getName());
        Assertions.assertEquals("Printer", equip2.getName());
    }

    @Test
    @DisplayName("Should release object to pool")
    public void testRelease() {
        Workspace ws = new Workspace();

        Equipment equip1 = ws.getEquipment();
        equip1.setName("Computer");

        ws.releaseEquipment(equip1);
        Assertions.assertNull(equip1.getName());
    }
}
