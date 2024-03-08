package andreytondo.patterns.singleton;

import br.com.andreytondo.patterns.singleton.EagerSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EagerSingletonTest {

    @Test
    @DisplayName("Should return the same instance")
    public void test01() {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        Assertions.assertSame(instance1, instance2);
    }
}
