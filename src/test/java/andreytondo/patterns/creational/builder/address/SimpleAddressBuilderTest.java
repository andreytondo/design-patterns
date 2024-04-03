package andreytondo.patterns.creational.builder.address;

import br.com.andreytondo.models.address.SimpleAddress;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleAddressBuilderTest {

    @Test
    @DisplayName("Should return a SimpleAddress with all properties informed")
    public void test01() {
        SimpleAddress address = SimpleAddress.builder()
                    .houseNumber("123")
                    .street("Teste")
                    .city("Teste")
                    .zipcode("123")
                    .state("Teste")
                    .description("Teste")
                .build();

        Assertions.assertAll(
                () -> Assertions.assertEquals("123", address.getHouseNumber()),
                () -> Assertions.assertEquals("Teste", address.getStreet()),
                () -> Assertions.assertEquals("Teste", address.getCity()),
                () -> Assertions.assertEquals("123", address.getZipcode()),
                () -> Assertions.assertEquals("Teste", address.getState()),
                () -> Assertions.assertEquals("Teste", address.getDescription())
        );
    }
}
