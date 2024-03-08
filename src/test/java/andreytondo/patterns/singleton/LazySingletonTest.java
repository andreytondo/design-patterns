package andreytondo.patterns.singleton;

import br.com.andreytondo.patterns.singleton.LazySingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LazySingletonTest {

    @Test
    @DisplayName("Should return the same instance")
    public void test01() {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        Assertions.assertSame(instance1, instance2);
    }
}
