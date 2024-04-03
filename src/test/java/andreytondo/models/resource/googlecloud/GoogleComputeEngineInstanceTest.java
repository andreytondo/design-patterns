package andreytondo.models.resource.googlecloud;

import br.com.andreytondo.models.resource.Instance;
import br.com.andreytondo.models.resource.googlecoud.GoogleComputeEngineInstance;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GoogleComputeEngineInstanceTest {

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
        GoogleComputeEngineInstance instance = new GoogleComputeEngineInstance(Instance.Capacity.MEDIUM);
        instance.start();
        assert outContent.toString().contains("Google Compute Engine Instance started");
    }

    @Test
    @DisplayName("Test stop method")
    public void testStop() {
        GoogleComputeEngineInstance instance = new GoogleComputeEngineInstance(Instance.Capacity.MEDIUM);
        instance.stop();
        assert outContent.toString().contains("Google Compute Engine Instance stopped");
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

}
