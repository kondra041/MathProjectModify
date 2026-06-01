package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testNormalizeAngle() {
        double a = 10;
        double center = 5;
        double expectedResult = 2 * FastMath.PI;
        assertEquals(expectedResult, MathUtils.normalizeAngle(a, center));
    }

}