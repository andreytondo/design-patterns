package andreytondo.patterns.abstractfactory;

import br.com.andreytondo.models.resource.Instance;
import br.com.andreytondo.models.resource.googlecoud.GoogleCloudStorage;
import br.com.andreytondo.models.resource.googlecoud.GoogleComputeEngineInstance;
import br.com.andreytondo.patterns.abstractfactory.GoogleResourceFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GoogleResourceFactoryTest {

    @Test
    @DisplayName("Test createInstance")
    void testCreateInstance() {
        GoogleResourceFactory googleResourceFactory = new GoogleResourceFactory();
        Instance instance = googleResourceFactory.createInstance(Instance.Capacity.MEDIUM);
        Assertions.assertEquals(Instance.Capacity.MEDIUM, instance.getCapacity());
        Assertions.assertInstanceOf(GoogleComputeEngineInstance.class, instance);
    }

    @Test
    @DisplayName("Test createStorage")
    void testCreateStorage() {
        GoogleResourceFactory googleResourceFactory = new GoogleResourceFactory();
        Integer kib = 1024;
        Assertions.assertEquals(kib, googleResourceFactory.createStorage(kib).kib());
        Assertions.assertInstanceOf(GoogleCloudStorage.class, googleResourceFactory.createStorage(kib));
    }
}
