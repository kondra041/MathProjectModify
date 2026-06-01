package generated;

import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;

public class MathUtilsTest {
    @org.junit.jupiter.api.Test
    public void testHashDouble() {
        double value = 42.0;
        int expectedHashCode = new Double(value).hashCode();
        assertEquals(expectedHashCode, MathUtils.hash(value));
    }

    @org.junit.jupiter.api.Test
    public void testHashDoubleArray() {
        double[] value = {1.0, 2.0, 3.0};
        int expectedHashCode = Arrays.hashCode(value);
        assertEquals(expectedHashCode, MathUtils.hash(value));
    }

    @org.junit.jupiter.api.Test
    public void testNormalizeAngle() {
        double a = FastMath.PI / 2;
        double center = FastMath.PI;
        double expectedValue = a - MathUtils.TWO_PI * FastMath.floor((a + FastMath.PI - center) / MathUtils.TWO_PI);
        assertEquals(expectedValue, MathUtils.normalizeAngle(a, center), Precision.EPSILON);
    }

    @org.junit.jupiter.api.Test
    public void testReduce() {
        double a = 3 * FastMath.PI;
        double period = 2 * FastMath.PI;
        double offset = FastMath.PI;
        double expectedValue = a - period * FastMath.floor((a - offset) / period) - offset;
        assertEquals(expectedValue, MathUtils.reduce(a, period, offset), Precision.EPSILON);
    }

    @org.junit.jupiter.api.Test
    public void testCopySignByte() {
        byte magnitude = Byte.MAX_VALUE;
        byte sign = (byte) -1;
        assertEquals(-magnitude, MathUtils.copySign(magnitude, sign));

        magnitude = Byte.MIN_VALUE;
        sign = 1;
        assertThrows(ArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }

    @org.junit.jupiter.api.Test
    public void testCopySignShort() {
        short magnitude = Short.MAX_VALUE;
        short sign = (short) -1;
        assertEquals(-magnitude, MathUtils.copySign(magnitude, sign));

        magnitude = Short.MIN_VALUE;
        sign = 1;
        assertThrows(ArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }

    @org.junit.jupiter.api.Test
    public void testCopySignInt() {
        int magnitude = Integer.MAX_VALUE;
        int sign = -1;
        assertEquals(-magnitude, MathUtils.copySign(magnitude, sign));

        magnitude = Integer.MIN_VALUE;
        sign = 1;
        assertThrows(ArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }

    @org.junit.jupiter.api.Test
    public void testCopySignLong() {
        long magnitude = Long.MAX_VALUE;
        long sign = -1L;
        assertEquals(-magnitude, MathUtils.copySign(magnitude, sign));

        magnitude = Long.MIN_VALUE;
        sign = 1L;
        assertThrows(ArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }

    @org.junit.jupiter.api.Test
    public void testCheckFinite() {
        double x = Double.POSITIVE_INFINITY;
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(x));

        x = Double.NaN;
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(x));
    }

    @org.junit.jupiter.api.Test
    public void testCheckFiniteArray() {
        double[] val = {1.0, Double.POSITIVE_INFINITY, 3.0};
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(val));
    }

    @org.junit.jupiter.api.Test
    public void testCheckNotNull() {
        Object o = null;
        assertThrows(NullArgumentException.class, () -> MathUtils.checkNotNull(o));
    }
}