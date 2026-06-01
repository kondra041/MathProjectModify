package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testNormalizeAngle_NormalizeBetween0And2Pi() {
        double angle = 7.5; // 7.5 radians is more than 2*pi
        double normalizedAngle = MathUtils.normalizeAngle(angle, Math.PI);
        assertAll(
            () -> assertTrue(normalizedAngle >= 0 && normalizedAngle <= 2 * Math.PI),
            () -> assertEquals(1.7168146928204138, normalizedAngle, 0.000001)
        );
    }

    @Test
    public void testNormalizeAngle_NormalizeBetweenMinusPiAndPi() {
        double angle = -4.0; // -4 radians is less than -pi
        double normalizedAngle = MathUtils.normalizeAngle(angle, 0.0);
        assertAll(
            () -> assertTrue(normalizedAngle >= -Math.PI && normalizedAngle <= Math.PI),
            () -> assertEquals(-1.2831853071795862, normalizedAngle, 0.000001)
        );
    }

    @Test
    public void testNormalizeAngle_ComputeAngleBetweenTwoPositions() {
        double start = 1.0;
        double end = 5.0; // angle difference should be calculated
        double angleDifference = MathUtils.normalizeAngle(end, start) - start;
        assertAll(
            () -> assertTrue(angleDifference >= -Math.PI && angleDifference <= Math.PI),
            () -> assertEquals(0.7168146928204138, angleDifference, 0.000001)
        );
    }
}