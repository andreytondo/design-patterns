package andreytondo.patterns.creational.simplefactory;

import br.com.andreytondo.enums.AccessType;
import br.com.andreytondo.models.user.ConsoleUser;
import br.com.andreytondo.models.user.MobileUser;
import br.com.andreytondo.models.user.User;
import br.com.andreytondo.models.user.WebsiteUser;
import br.com.andreytondo.patterns.creational.simplefactory.UserFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserFactoryTest {

    @Test
    @DisplayName("Should return correct user object")
    public void test01() {
        User user = UserFactory.createUser(AccessType.MOBILE);
        Assertions.assertInstanceOf(MobileUser.class, user);
    }

    @Test
    @DisplayName("Should return correct user object")
    public void test02() {
        User user = UserFactory.createUser(AccessType.WEBSITE);
        Assertions.assertInstanceOf(WebsiteUser.class, user);
    }

    @Test
    @DisplayName("Should return correct user object")
    public void test03() {
        User user = UserFactory.createUser(AccessType.CONSOLE);
        Assertions.assertInstanceOf(ConsoleUser.class, user);
    }

    @Test
    @DisplayName("Should throw exception on null value")
    public void test04() {
        Assertions.assertThrows(NullPointerException.class, () -> UserFactory.createUser(null));
    }

    @Test
    @DisplayName("Should return null on different values")
    public void test05() {
        User user = UserFactory.createUser(AccessType.OTHER);
        Assertions.assertNull(user);
    }
}
