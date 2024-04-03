package andreytondo.patterns.creational.factory;

import br.com.andreytondo.models.message.Message;
import br.com.andreytondo.patterns.creational.factory.XMLMessageFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class XMLMessageFactoryTest {

    @Test
    @DisplayName("Test create method")
    public void testCreate() {
        XMLMessageFactory factory = new XMLMessageFactory();
        Message msg = factory.create();
        Assertions.assertNotNull(msg);
    }

    @Test
    @DisplayName("Test getMessage method")
    public void testGetMessage() {
        XMLMessageFactory factory = new XMLMessageFactory();
        String content = "Hello, World!";
        Assertions.assertNotEquals(content, factory.getMessage().getContent());
    }
}
