package andreytondo.patterns.creational.factory;

import br.com.andreytondo.models.message.JSONMessage;
import br.com.andreytondo.models.message.Message;
import br.com.andreytondo.patterns.creational.factory.JSONMessageFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JSONMessageFactoryTest {

    @Test
    @DisplayName("Test create method")
    public void testCreate() {
        JSONMessageFactory factory = new JSONMessageFactory();
        Message msg = factory.create();
        Assertions.assertInstanceOf(JSONMessage.class, msg);
    }

    @Test
    @DisplayName("Test getMessage method")
    public void testGetMessage() {
        JSONMessageFactory factory = new JSONMessageFactory();
        String content = "Hello, World!";
        Assertions.assertNotEquals(content, factory.getMessage().getContent());
    }
}
