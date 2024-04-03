package andreytondo.patterns.bridge;

import br.com.andreytondo.patterns.bridge.Driver;
import br.com.andreytondo.patterns.bridge.DriverManager;
import br.com.andreytondo.patterns.bridge.MySQLDriver;
import br.com.andreytondo.patterns.bridge.OracleDriver;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DriverManagerTest {

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
    @DisplayName("Should get connection from Oracle")
    public void test01() {
        DriverManager driverManager = new DriverManager(new OracleDriver());
        driverManager.stablishConnection();
        Assertions.assertTrue(outContent.toString().contains("Oracle"));
    }

    @Test
    @DisplayName("Should get connection from MySQL")
    public void test02() {
        DriverManager driverManager = new DriverManager(new MySQLDriver());
        driverManager.stablishConnection();
        Assertions.assertTrue(outContent.toString().contains("MySQL"));
    }

    @Test
    @DisplayName("Should call connect method")
    public void testStablishConnection() {
        Driver mockDriver = Mockito.mock(Driver.class);
        DriverManager driverManager = new DriverManager(mockDriver);
        driverManager.stablishConnection();
        Mockito.verify(mockDriver).connect();
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
