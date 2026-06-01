package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testNormalizeAngle() {
        double a = 6.283185307;
        double center = Math.PI;
        double expected = 0.0;
        double result = MathUtils.normalizeAngle(a, center);
        assertEquals(expected, result);
    }
}