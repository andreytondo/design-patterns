package andreytondo.models.workspace;

import br.com.andreytondo.models.workspace.Equipment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EquipmentTest {

    @Test
    @DisplayName("Should reset equipment")
    public void testReset() {
        Equipment equip = new Equipment();
        equip.setName("Computer");
        equip.reset();
        Assertions.assertNull(equip.getName());
    }
}
