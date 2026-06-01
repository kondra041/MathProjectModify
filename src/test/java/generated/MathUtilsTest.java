package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @Test
    public void testHash() {
        double value = 5.0;
        int expected = new Double(value).hashCode();
        int actual = MathUtils.hash(value);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashArray() {
        double[] value = {1.0, 2.0};
        int expected = Arrays.hashCode(value);
        int actual = MathUtils.hash(value);
        assertEquals(expected, actual);
    }

    @Test
    public void testNormalizeAngle() {
        double a = 3.14;
        double center = Math.PI;
        double expected = a - TWO_PI * FastMath.floor((a + Math.PI - center) / TWO_PI);
        double actual = MathUtils.normalizeAngle(a, center);
        assertEquals(expected, actual);
    }

    @Test
    public void testReduce() {
        double a = 10.0;
        double period = 5.0;
        double offset = 2.0;
        double expected = a - period * FastMath.floor((a - offset) / period) - offset;
        double actual = MathUtils.reduce(a, period, offset);
        assertEquals(expected, actual);
    }

    @Test
    public void testCopySignByte() {
        byte magnitude = 10;
        byte sign = 1;
        byte expected = (byte) magnitude;
        byte actual = MathUtils.copySign(magnitude, sign);
        assertEquals(expected, actual);
    }

    @Test
    public void testCopySignShort() {
        short magnitude = 10000;
        short sign = -1;
        short expected = (short) -magnitude;
        short actual = MathUtils.copySign(magnitude, sign);
        assertEquals(expected, actual);
    }

    @Test
    public void testCopySignInt() {
        int magnitude = Integer.MAX_VALUE;
        int sign = 1;
        int expected = -magnitude;
        int actual = MathUtils.copySign(magnitude, sign);
        assertEquals(expected, actual);
    }

    @Test
    public void testCopySignLong() {
        long magnitude = Long.MAX_VALUE;
        long sign = -1;
        long expected = -magnitude;
        long actual = MathUtils.copySign(magnitude, sign);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckFiniteDouble() throws NotFiniteNumberException {
        double x = 5.0;
        MathUtils.checkFinite(x);
    }

    @Test
    public void testCheckFiniteArray() throws NotFiniteNumberException {
        double[] val = {1.0, 2.0};
        MathUtils.checkFinite(val);
    }

    @Test
    public void testCheckNotNull() {
        Object o = new Object();
        MathUtils.checkNotNull(o);
    }
}