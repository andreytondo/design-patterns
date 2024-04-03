package andreytondo.patterns.structural.decorator.sources;

import br.com.andreytondo.patterns.structural.decorator.sources.FileDataSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileDataSourceTest {

    @Test
    public void testWriteData() {
        FileDataSource dataSource = new FileDataSource("TestDatabase");
        assertDoesNotThrow(() -> dataSource.writeData("Test data"));
    }

    @Test
    public void testReadData() {
        FileDataSource dataSource = new FileDataSource("TestDatabase");
        assertEquals("TestDatabase data", dataSource.readData());
    }

    @Test
    public void testWriteDataWithNullData() {
        FileDataSource dataSource = new FileDataSource("TestDatabase");
        assertDoesNotThrow(() -> dataSource.writeData(null));
    }

    @Test
    public void testReadDataNotNull() {
        FileDataSource dataSource = new FileDataSource("TestDatabase");

        // Test reading data not null
        assertNotNull(dataSource.readData());
    }

    @Test
    public void testDatabaseNameNotNull() {
        FileDataSource dataSource = new FileDataSource("TestDatabase");
        assertNotNull(dataSource.getName());
    }
}
