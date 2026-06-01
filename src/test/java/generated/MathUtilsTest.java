package generated;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyObject;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.anyDouble;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MathUtilsTest {

    @Test
    public void testNormalizeAngle() {
        double value = 7.234;
        double center = 0.567;
        double expected = -1.123;
        assertEquals(expected, MathUtils.normalizeAngle(value, center), 1e-9);
    }

    @Test
    public void testReduce() {
        double a = 5.6;
        double period = 4.0;
        double offset = 2.3;
        double expected = -1.7;
        assertEquals(expected, MathUtils.reduce(a, period, offset), 1e-9);
    }

    @Test
    public void testCopySignByte() {
        byte magnitude = 10;
        byte sign = -5;
        byte expected = -10;
        assertEquals(expected, MathUtils.copySign(magnitude, sign));

        magnitude = Byte.MIN_VALUE;
        sign = 2;
        MathArithmeticException exception = assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(magnitude, sign);
        });
        assertEquals("overflow", exception.getMessage());
    }

    @Test
    public void testCopySignShort() {
        short magnitude = 10;
        short sign = -5;
        short expected = -10;
        assertEquals(expected, MathUtils.copySign(magnitude, sign));

        magnitude = Short.MIN_VALUE;
        sign = 2;
        MathArithmeticException exception = assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(magnitude, sign);
        });
        assertEquals("overflow", exception.getMessage());
    }

    @Test
    public void testCopySignInt() {
        int magnitude = 10;
        int sign = -5;
        int expected = -10;
        assertEquals(expected, MathUtils.copySign(magnitude, sign));

        magnitude = Integer.MIN_VALUE;
        sign = 2;
        MathArithmeticException exception = assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(magnitude, sign);
        });
        assertEquals("overflow", exception.getMessage());
    }

    @Test
    public void testCopySignLong() {
        long magnitude = 10;
        long sign = -5;
        long expected = -10;
        assertEquals(expected, MathUtils.copySign(magnitude, sign));

        magnitude = Long.MIN_VALUE;
        sign = 2;
        MathArithmeticException exception = assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(magnitude, sign);
        });
        assertEquals("overflow", exception.getMessage());
    }

    @Test
    public void testCheckFinite() {
        double value = 3.14;
        MathUtils.checkFinite(value);

        double invalidValue = Double.POSITIVE_INFINITY;
        NotFiniteNumberException exception = assertThrows(NotFiniteNumberException.class, () -> {
            MathUtils.checkFinite(invalidValue);
        });
        assertEquals("Infinity", exception.getMessage());
    }

    @Test
    public void testCheckFiniteArray() {
        double[] values = {1.2, 3.4};
        MathUtils.checkFinite(values);

        double[] invalidValues = {Double.NaN, Double.POSITIVE_INFINITY};
        NotFiniteNumberException exception = assertThrows(NotFiniteNumberException.class, () -> {
            MathUtils.checkFinite(invalidValues);
        });
        assertEquals("Infinity", exception.getMessage());
    }

    @Test
    public void testCheckNotNull() {
        Object obj = new Object();
        MathUtils.checkNotNull(obj);

        Object nullObj = null;
        NullArgumentException exception = assertThrows(NullArgumentException.class, () -> {
            MathUtils.checkNotNull(nullObj);
        });
        assertEquals("", exception.getMessage());
    }
}