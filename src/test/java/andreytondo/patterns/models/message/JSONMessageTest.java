package andreytondo.patterns.models.message;

import br.com.andreytondo.models.message.JSONMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JSONMessageTest {

    @Test
    @DisplayName("Test encrypt method")
    public void testEncrypt() {
        JSONMessage msg = new JSONMessage("Hello, World!");
        msg.encrypt();
        Assertions.assertNotEquals("Hello, World!", msg.getContent());
    }

    @Test
    @DisplayName("Test addDefaultHeaders method")
    public void testAddDefaultHeaders() {
        JSONMessage msg = new JSONMessage("Hello, World!");
        msg.addDefaultHeaders();
        Assertions.assertEquals("application/json", msg.getHeaders().get("Content-Type"));
    }
}
