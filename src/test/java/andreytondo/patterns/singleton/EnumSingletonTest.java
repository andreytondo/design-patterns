package andreytondo.patterns.singleton;

import br.com.andreytondo.patterns.singleton.EnumSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EnumSingletonTest {

    @Test
    @DisplayName("Should return the same instance")
    public void test01() {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        Assertions.assertSame(instance1, instance2);
    }
}
