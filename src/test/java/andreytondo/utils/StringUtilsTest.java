package andreytondo.utils;

import br.com.andreytondo.utils.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    @DisplayName("Should split name correctly")
    public void shouldSplitNameCorrectly() {
        String name = "John Doe";
        String[] result = StringUtils.splitName(name);
        Assertions.assertEquals("John", result[0]);
        Assertions.assertEquals("Doe", result[1]);
    }

    @Test
    @DisplayName("Should return only first name if last is missing")
    public void shouldReturnOnlyFirstNameIfLastIsMissing () {
        String name = "John";
        String[] result = StringUtils.splitName(name);
        Assertions.assertEquals("John", result[0]);
    }

    @Test
    @DisplayName("Should throw exception if name is null")
    public void shouldThrowExceptionIfNameIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> StringUtils.splitName(null));
    }

    @Test
    @DisplayName("Should throw exception if name is blank")
    public void shouldThrowExceptionIfNameIsBlank() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringUtils.splitName(" "));
    }

    @Test
    @DisplayName("Should get only first and last name")
    public void shouldGetOnlyFirstAndLastName() {
        String name = "John Doe Junior";
        String[] result = StringUtils.splitName(name);
        Assertions.assertEquals("John", result[0]);
        Assertions.assertEquals("Doe", result[1]);
    }
}
