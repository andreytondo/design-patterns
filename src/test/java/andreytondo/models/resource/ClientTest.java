package andreytondo.models.resource;

import br.com.andreytondo.models.resource.Client;
import br.com.andreytondo.models.resource.Instance;
import br.com.andreytondo.patterns.abstractfactory.AWSResourceFactory;
import br.com.andreytondo.patterns.abstractfactory.GoogleResourceFactory;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ClientTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    @DisplayName("Test create with AWS factory")
    void testCreateWithAWSFactory() {
        Client client = new Client(new AWSResourceFactory());
        Instance instance = client.createServer(Instance.Capacity.MEDIUM, 1024);

        Assertions.assertEquals(Instance.Capacity.MEDIUM, instance.getCapacity());
        Assertions.assertEquals(1024, instance.getStorage().kib());
    }

    @Test
    @DisplayName("Test create with GCR factory")
    void testCreateWithGCPFactory() {
        Client client = new Client(new GoogleResourceFactory());
        Instance instance = client.createServer(Instance.Capacity.MEDIUM, 1024);

        Assertions.assertEquals(Instance.Capacity.MEDIUM, instance.getCapacity());
        Assertions.assertEquals(1024, instance.getStorage().kib());
    }

    @Test
    @DisplayName("Test restart")
    void testRestart() {
        Client client = new Client(new AWSResourceFactory());
        Instance instance = client.createServer(Instance.Capacity.MEDIUM, 1024);
        client.restart();
        Assertions.assertTrue(outContent.toString().contains(instance + " restarted"));
    }

    @Test
    @DisplayName("Test restart with null instance")
    void testRestartWithNullInstance() {
        Client client = new Client(new AWSResourceFactory());
        client.restart();
        Assertions.assertFalse(outContent.toString().contains("restarted"));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
