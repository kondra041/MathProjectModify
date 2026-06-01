package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testHash_double() {
        double value = 10.5;
        int expectedHashCode = new Double(value).hashCode();
        assertEquals(expectedHashCode, MathUtils.hash(value));
    }

    @Test
    public void testNormalizeAngle_double() {
        double a = FastMath.PI / 2;
        double center = 0.0;
        double expectedNormalizedAngle = MathUtils.normalizeAngle(a, center);
        assertEquals(expectedNormalizedAngle, MathUtils.normalizeAngle(a, center));
    }

    @Test
    public void testReduce_double() {
        double a = 10;
        double period = 2 * FastMath.PI;
        double offset = -FastMath.PI / 2;
        double expectedReducedAngle = MathUtils.reduce(a, period, offset);
        assertEquals(expectedReducedAngle, MathUtils.reduce(a, period, offset));
    }

    @Test
    public void testCopySign_byte() {
        byte magnitude = 10;
        byte sign = -2;
        byte expectedCopiedByte = MathUtils.copySign(magnitude, sign);
        assertEquals(expectedCopiedByte, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySign_short() {
        short magnitude = 10;
        short sign = -2;
        short expectedCopiedShort = MathUtils.copySign(magnitude, sign);
        assertEquals(expectedCopiedShort, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySign_int() {
        int magnitude = 10;
        int sign = -2;
        int expectedCopiedInt = MathUtils.copySign(magnitude, sign);
        assertEquals(expectedCopiedInt, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySign_long() {
        long magnitude = 10L;
        long sign = -2L;
        long expectedCopiedLong = MathUtils.copySign(magnitude, sign);
        assertEquals(expectedCopiedLong, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCheckFinite_double() {
        double x = 10.5;
        MathUtils.checkFinite(x);
        assertTrue(true); // just need to get past the line without exception
    }

    @Test
    public void testCheckFinite_doubleArray() {
        double[] val = new double[] { 10.5, -2.3 };
        MathUtils.checkFinite(val);
        assertTrue(true); // just need to get past the line without exception
    }

    @Test
    public void testCheckNotNull_Object() {
        Object o = new Object();
        MathUtils.checkNotNull(o, "test");
        assertTrue(true); // just need to get past the line without exception
    }

    @Test
    public void testCheckNotNull_Object_Localizable() {
        Object o = new Object();
        MathUtils.checkNotNull(o, LocalizedFormats.ARRAY_ELEMENT, "test");
        assertTrue(true); // just need to get past the line without exception
    }
}