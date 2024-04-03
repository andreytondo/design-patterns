package andreytondo.patterns.structural.adapter;

import br.com.andreytondo.models.user.User;
import br.com.andreytondo.models.yellowfin.YellowfinUser;
import br.com.andreytondo.patterns.structural.adapter.YellowfinUserAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class YellowfinUserAdapterTest {

    @Test
    @DisplayName("Should generate email correctly")
    public void shouldGenerateEmailCorrectly() {
        YellowfinUserAdapter adapter = new YellowfinUserAdapter();
        String email = adapter.generateEmailAddress("John Doe", "1");
        Assertions.assertEquals("john.1@company.com", email);
    }

    @Test
    @DisplayName("Should create a Yellowfin user")
    public void shouldCreateYellowfinUser() {
        YellowfinUserAdapter adapter = new YellowfinUserAdapter();
        User user = User.builder()
                .id(1L)
                .name("John Doe")
                .password("123456")
                .build();

        YellowfinUser yfUser = adapter.adapt(user).get();
        Assertions.assertAll(
                () -> Assertions.assertEquals("1", yfUser.getUserId()),
                () -> Assertions.assertEquals("John Doe", yfUser.getFirstName()),
                () -> Assertions.assertEquals("123456", yfUser.getPassword()),
                () -> Assertions.assertEquals(adapter.generateEmailAddress(yfUser.getFirstName(), yfUser.getUserId()), yfUser.getEmailAddress()),
                () -> Assertions.assertEquals("USER", yfUser.getRoleCode()),
                () -> Assertions.assertEquals("API_GEN", yfUser.getLastName())
        );
    }
}
