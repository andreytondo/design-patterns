package andreytondo.patterns.abstractfactory;

import br.com.andreytondo.models.resource.Instance;
import br.com.andreytondo.models.resource.aws.Ec2Instance;
import br.com.andreytondo.models.resource.aws.S3Storage;
import br.com.andreytondo.patterns.abstractfactory.AWSResourceFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AWSResourceFactoryTest {

    @Test
    @DisplayName("Test createInstance")
    void testCreateInstance() {
        AWSResourceFactory awsResourceFactory = new AWSResourceFactory();
        Instance instance = awsResourceFactory.createInstance(Instance.Capacity.medium);
        Assertions.assertEquals(Instance.Capacity.medium, instance.getCapacity());
        Assertions.assertInstanceOf(Ec2Instance.class, instance);
    }

    @Test
    @DisplayName("Test createStorage")
    void testCreateStorage() {
        AWSResourceFactory awsResourceFactory = new AWSResourceFactory();
        Integer kib = 1024;
        Assertions.assertEquals(kib, awsResourceFactory.createStorage(kib).kib());
        Assertions.assertInstanceOf(S3Storage.class, awsResourceFactory.createStorage(kib));
    }



}
