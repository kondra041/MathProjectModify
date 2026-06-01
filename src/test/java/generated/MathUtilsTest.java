package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

public class MathUtilsTest {

    @Test
    public void testHash() {
        double value = 10.0;
        int expected = new Double(value).hashCode();
        assertEquals(expected, MathUtils.hash(value));
    }

    @Test
    public void testHashArray() {
        double[] array = {1.0, 2.0, 3.0};
        int expected = org.apache.commons.math3.util.Arrays.hashCode(array);
        assertEquals(expected, MathUtils.hash(array));
    }

    @Test
    public void testNormalizeAngle() {
        double a = 10.0;
        double center = MathUtils.TWO_PI;
        double expected = a - (a + Math.PI - center) / MathUtils.TWO_PI * MathUtils.TWO_PI;
        assertEquals(expected, MathUtils.normalizeAngle(a, center));
    }

    @Test
    public void testReduce() {
        double a = 10.0;
        double period = 2.0;
        double offset = 1.0;
        double expected = a - (a - offset) / period * period - offset;
        assertEquals(expected, MathUtils.reduce(a, period, offset));
    }

    @Test
    public void testCopySignByte() {
        byte magnitude = 10;
        byte sign = 1;
        int expected = magnitude;
        assertEquals(expected, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignShort() {
        short magnitude = 10;
        short sign = 1;
        int expected = magnitude;
        assertEquals(expected, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignInt() {
        int magnitude = 10;
        int sign = 1;
        int expected = -magnitude;
        assertEquals(expected, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignLong() {
        long magnitude = 10L;
        long sign = 1L;
        long expected = -magnitude;
        assertEquals(expected, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCheckFinite() {
        double value = Double.POSITIVE_INFINITY;
        assertThrows(MathUtils.NotFiniteNumberException.class, () -> MathUtils.checkFinite(value));
    }

    @Test
    public void testCheckFiniteArray() {
        double[] array = {Double.POSITIVE_INFINITY};
        assertThrows(MathUtils.NotFiniteNumberException.class, () -> MathUtils.checkFinite(array));
    }

    @Test
    public void testCheckNotNull() {
        Object value = null;
        assertThrows(MathUtils.NullArgumentException.class, () -> MathUtils.checkNotNull(value));
    }
}