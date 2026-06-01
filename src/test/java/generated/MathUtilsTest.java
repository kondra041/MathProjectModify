import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTests {

    @Test
    void testHash() {
        int expected = new Double(2.0).hashCode();
        int actual = MathUtils.hash(2.0);
        assertEquals(expected, actual);
    }

    @Test
    void testNormalizeAngle() {
        double a = 10;
        double center = 5;
        double expected = 10 - (2 * FastMath.PI) * FastMath.floor((10 + FastMath.PI - 5) / (2 * FastMath.PI));
        double actual = MathUtils.normalizeAngle(a, center);
        assertEquals(expected, actual);
    }

    @Test
    void testReduce() {
        double a = 10;
        double period = 5;
        double offset = 2;
        double expected = 10 - (5) * FastMath.floor((10 - 2) / (5)) - 2;
        double actual = MathUtils.reduce(a, period, offset);
        assertEquals(expected, actual);
    }

    @Test
    void testCopySignByte() {
        byte magnitude = 3;
        byte sign = 7;
        byte expected = 3;
        byte actual = MathUtils.copySign(magnitude, sign);
        assertEquals(expected, actual);
    }

    @Test
    void testCopySignShort() {
        short magnitude = Short.MIN_VALUE;
        short sign = 7;
        try {
            short actual = MathUtils.copySign(magnitude, sign);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    void testCheckFinite() {
        double x = 10;
        MathUtils.checkFinite(x);
    }

    @Test
    void testCheckFiniteArray() {
        double[] val = new double[]{1, 2, 3};
        MathUtils.checkFinite(val);
    }

    @Test
    void testCheckNull() {
        Object o = null;
        Localizable pattern = LocalizedFormats.ARRAY_ELEMENT;
        Object[] args = new Object[]{"test", "test"};
        try {
            MathUtils.checkNotNull(o, pattern, args);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    void testCheckNonNull() {
        Object o = new Object();
        MathUtils.checkNotNull(o);
    }
}