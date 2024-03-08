package andreytondo.patterns.models.message;

import br.com.andreytondo.models.message.XMLMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class XMLMessageTest {

    @Test
    @DisplayName("Test encrypt method")
    public void testEncrypt() {
        XMLMessage msg = new XMLMessage("Hello, World!");
        msg.encrypt();
        Assertions.assertNotEquals("Hello, World!", msg.getContent());
    }

    @Test
    @DisplayName("Test addDefaultHeaders method")
    public void testAddDefaultHeaders() {
        XMLMessage msg = new XMLMessage("Hello, World!");
        msg.addDefaultHeaders();
        Assertions.assertEquals("application/xml", msg.getHeaders().get("Content-Type"));
    }
}
