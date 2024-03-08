package andreytondo.patterns.singleton;

import br.com.andreytondo.patterns.singleton.LazyHolderSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LazyHolderSingletonTest {

    @Test
    @DisplayName("Should return the same instance")
    public void test01() {
        LazyHolderSingleton instance1 = LazyHolderSingleton.getInstance();
        LazyHolderSingleton instance2 = LazyHolderSingleton.getInstance();
        Assertions.assertSame(instance1, instance2);
    }

}
