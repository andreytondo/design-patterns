package andreytondo.patterns.structural.flyweight;

import br.com.andreytondo.patterns.structural.flyweight.Circle;
import br.com.andreytondo.patterns.structural.flyweight.CircleFactory;
import org.junit.jupiter.api.Test;

import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

public class CircleFactoryTest {

    @Test
    public void testGetCircle() {
        Color color = Color.RED;
        Color color2 = Color.BLUE;

        Circle circle1 = CircleFactory.getCircle(color);
        Circle circle2 = CircleFactory.getCircle(color);
        Circle circle3 = CircleFactory.getCircle(color2);

        assertNotSame(circle2, circle3);
        assertSame(circle1, circle2);

    }
}
