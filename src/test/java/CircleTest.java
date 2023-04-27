import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void testCalculateArea() {
        double radius = 5.0;
        double expectedArea = Math.PI * radius * radius;
        double actualArea = Circle.calculateArea(radius);
        assertEquals(expectedArea, actualArea, 0.0001);
    }

}
