package andreytondo.patterns.builder.address;

import br.com.andreytondo.models.address.CompleteAddress;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CompleteAddressBuilderTest {

    @Test
    @DisplayName("Should return a CompleteAddress with all properties informed")
    public void test01() {
        CompleteAddress address = CompleteAddress.builder()
                    .houseNumber("123")
                    .street("Teste")
                    .city("Teste")
                    .zipcode("123")
                    .state("Teste")
                    .complement("Teste")
                    .neighborhood("Teste")
                    .reference("Teste")
                    .country("Teste")
                    .cellPhone("123")
                    .email("teste@mail.com")
                    .latitude("123")
                    .longitude("123")
                    .phone("123")
                .build();

        Assertions.assertAll(
                () -> Assertions.assertEquals("123", address.getHouseNumber()),
                () -> Assertions.assertEquals("Teste", address.getStreet()),
                () -> Assertions.assertEquals("Teste", address.getCity()),
                () -> Assertions.assertEquals("123", address.getZipcode()),
                () -> Assertions.assertEquals("Teste", address.getState()),
                () -> Assertions.assertEquals("Teste", address.getComplement()),
                () -> Assertions.assertEquals("Teste", address.getNeighborhood()),
                () -> Assertions.assertEquals("Teste", address.getReference()),
                () -> Assertions.assertEquals("Teste", address.getCountry()),
                () -> Assertions.assertEquals("123", address.getCellPhone()),
                () -> Assertions.assertEquals("teste@mail.com", address.getEmail()),
                () -> Assertions.assertEquals("123", address.getLatitude()),
                () -> Assertions.assertEquals("123", address.getLongitude()),
                () -> Assertions.assertEquals("123", address.getPhone())
        );
    }
}
