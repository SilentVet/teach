package teach.stqa;

import org.testng.annotations.Test;
import teach.stqa.Point;

public class PointTest {

    @Test
    public void testCoordinates() {
        Point a = new Point(80, 8);
        assert a.destination() == 12;
    }
}
