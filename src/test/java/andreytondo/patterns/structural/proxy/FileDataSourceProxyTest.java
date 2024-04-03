package andreytondo.patterns.structural.proxy;

import br.com.andreytondo.patterns.structural.decorator.sources.FileDataSource;
import br.com.andreytondo.patterns.structural.proxy.FileDataSourceProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class FileDataSourceProxyTest {

    private FileDataSourceProxy proxy;

    private FileDataSource dataSourceMock;

    @BeforeEach
    public void setUp() {
        dataSourceMock = Mockito.mock(FileDataSource.class);
        proxy = new FileDataSourceProxy(dataSourceMock);
        Mockito.when(dataSourceMock.readData()).thenCallRealMethod();
    }

    @Test
    public void testReadDataFromCache() {
        String data = "Test data";
        proxy.writeData(data);
        proxy.readData(); // not cached yet
        proxy.readData(); // should be cached by now
        Mockito.verify(dataSourceMock, Mockito.times(1)).readData();
    }

}
