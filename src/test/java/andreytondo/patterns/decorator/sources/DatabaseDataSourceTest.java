package andreytondo.patterns.decorator.sources;

import br.com.andreytondo.patterns.decorator.sources.DatabaseDataSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseDataSourceTest {

    @Test
    public void testWriteData() {
        DatabaseDataSource dataSource = new DatabaseDataSource("TestDatabase");
        assertDoesNotThrow(() -> dataSource.writeData("Test data"));
    }

    @Test
    public void testReadData() {
        DatabaseDataSource dataSource = new DatabaseDataSource("TestDatabase");
        assertEquals("TestDatabase data", dataSource.readData());
    }

    @Test
    public void testWriteDataWithNullData() {
        DatabaseDataSource dataSource = new DatabaseDataSource("TestDatabase");
        assertDoesNotThrow(() -> dataSource.writeData(null));
    }

    @Test
    public void testReadDataNotNull() {
        DatabaseDataSource dataSource = new DatabaseDataSource("TestDatabase");

        // Test reading data not null
        assertNotNull(dataSource.readData());
    }

    @Test
    public void testDatabaseNameNotNull() {
        DatabaseDataSource dataSource = new DatabaseDataSource("TestDatabase");
        assertNotNull(dataSource.getDatabaseName());
    }
}
