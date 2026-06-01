import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.math3.util.MathUtils;

public class MathUtilsTest {

    @Test
    public void testNormalizeAngle() {
        assertEquals(MathUtils.normalizeAngle(MathUtils.TWO_PI, MathUtils.TWO_PI), 0.0);
        assertEquals(MathUtils.normalizeAngle(MathUtils.TWO_PI, 0.0), 0.0);
        assertEquals(MathUtils.normalizeAngle(0.0, MathUtils.TWO_PI), MathUtils.TWO_PI);
        assertEquals(MathUtils.normalizeAngle(0.0, 0.0), 0.0);
    }
}