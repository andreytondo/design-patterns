package andreytondo.models.resource.aws;

import br.com.andreytondo.models.resource.Instance;
import br.com.andreytondo.models.resource.aws.Ec2Instance;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ec2InstanceTest {

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
    @DisplayName("Test start method")
    public void testStart() {
        Ec2Instance instance = new Ec2Instance(Instance.Capacity.MEDIUM);
        instance.start();
        assert outContent.toString().contains("Ec2Instance started");
    }

    @Test
    @DisplayName("Test stop method")
    public void testStop() {
        Ec2Instance instance = new Ec2Instance(Instance.Capacity.MEDIUM);
        instance.stop();
        assert outContent.toString().contains("Ec2Instance stopped");
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
