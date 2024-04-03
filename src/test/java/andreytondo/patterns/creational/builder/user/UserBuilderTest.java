package andreytondo.patterns.creational.builder.user;

import br.com.andreytondo.models.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserBuilderTest  {

    @Test
    @DisplayName("Should return a User with all properties informed")
    public void test01() {
        LocalDate date = LocalDate.now();
        User user = User.builder()
                    .id(1L)
                    .name("Teste")
                    .createdAt(date)
                    .password("123")
                    .address(null)
                .build();

        Assertions.assertEquals(user.getId(), 1L);
        Assertions.assertEquals(user.getName(), "Teste");
        Assertions.assertEquals(user.getCreatedAt(), date);
        Assertions.assertEquals(user.getPassword(), "123");
        Assertions.assertNull(user.getAddress());
    }


}
