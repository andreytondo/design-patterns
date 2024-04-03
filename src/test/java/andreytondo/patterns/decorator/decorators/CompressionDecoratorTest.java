package andreytondo.patterns.decorator.decorators;

import br.com.andreytondo.patterns.decorator.DataSourceDecorator;
import br.com.andreytondo.patterns.decorator.decorators.CompressionDecorator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CompressionDecoratorTest {

    @Test
    public void testWriteData() {
        DataSourceDecorator mockDataSourceDecorator = Mockito.mock(DataSourceDecorator.class);
        CompressionDecorator compressionDecorator = new CompressionDecorator(mockDataSourceDecorator);
        Assertions.assertDoesNotThrow(() -> compressionDecorator.writeData("Mocked data"));
    }

    @Test
    public void testReadData() {
        DataSourceDecorator mockDataSourceDecorator = Mockito.mock(DataSourceDecorator.class);
        CompressionDecorator compressionDecorator = new CompressionDecorator(mockDataSourceDecorator);
        Mockito.when(mockDataSourceDecorator.readData()).thenReturn("Mocked data - Compressed");
        Assertions.assertEquals("Mocked data - Compressed - Decompressed", compressionDecorator.readData());
    }

    @Test
    public void testWriteDataWithNullData() {
        DataSourceDecorator mockDataSourceDecorator = Mockito.mock(DataSourceDecorator.class);
        CompressionDecorator compressionDecorator = new CompressionDecorator(mockDataSourceDecorator);
        Assertions.assertDoesNotThrow(() -> compressionDecorator.writeData(null));
    }

    @Test
    public void testReadDataNotNull() {
        DataSourceDecorator mockDataSourceDecorator = Mockito.mock(DataSourceDecorator.class);
        CompressionDecorator compressionDecorator = new CompressionDecorator(mockDataSourceDecorator);
        Mockito.when(mockDataSourceDecorator.readData()).thenReturn("Mocked data - Compressed");
        Assertions.assertNotNull(compressionDecorator.readData());
    }
}
