package andreytondo.patterns.structural.decorator.decorators;

import br.com.andreytondo.patterns.structural.decorator.DataSourceDecorator;
import br.com.andreytondo.patterns.structural.decorator.decorators.EncryptionDecorator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EncryptionDecoratorTest {

    @Test
    public void testWriteData() {
        DataSourceDecorator mockDataSourceDecorator = Mockito.mock(DataSourceDecorator.class);
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(mockDataSourceDecorator);
        Assertions.assertDoesNotThrow(() -> encryptionDecorator.writeData("Mocked data"));
    }

    @Test
    public void testReadData() {
        DataSourceDecorator mockDataSourceDecorator = Mockito.mock(DataSourceDecorator.class);
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(mockDataSourceDecorator);
        Mockito.when(mockDataSourceDecorator.readData()).thenReturn("Mocked data - Encoded");
        Assertions.assertEquals("Mocked data - Encoded - Decoded", encryptionDecorator.readData());
    }

    @Test
    public void testWriteDataWithNullData() {
        DataSourceDecorator mockDataSourceDecorator = Mockito.mock(DataSourceDecorator.class);
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(mockDataSourceDecorator);
        Assertions.assertDoesNotThrow(() -> encryptionDecorator.writeData(null));
    }

    @Test
    public void testReadDataNotNull() {
        DataSourceDecorator mockDataSourceDecorator = Mockito.mock(DataSourceDecorator.class);
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(mockDataSourceDecorator);
        Mockito.when(mockDataSourceDecorator.readData()).thenReturn("Mocked data - Encoded");
        Assertions.assertNotNull(encryptionDecorator.readData());
    }
}
