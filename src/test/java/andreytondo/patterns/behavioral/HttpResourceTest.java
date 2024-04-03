package andreytondo.patterns.behavioral;

import br.com.andreytondo.patterns.behavioral.chainofresponsability.HttpResource;
import br.com.andreytondo.patterns.behavioral.chainofresponsability.handlers.LoggerHandler;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class HttpResourceTest {

    @Test
    public void testGetWithCustomChain() {
        HttpResource httpResource = Mockito.spy(new HttpResource());
        doCallRealMethod().when(httpResource).get(anyString(), isNotNull());
        LoggerHandler logger= new LoggerHandler();
        httpResource.get("/api/auth/test", logger);
        verify(httpResource, never()).createDefaultChain();
    }

    @Test
    public void testGetWithDefaultChain() {
        HttpResource httpResource = Mockito.spy(new HttpResource());
        doCallRealMethod().when(httpResource).get(anyString(), isNull());
        httpResource.get("/api/auth/test");
        verify(httpResource, times(1)).createDefaultChain();
    }
}
