package generated;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.LocalizedFormats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTest {

    @Test
    void testCopySignPositiveMagnitudeAndSign() {
        short magnitude = 5;
        short sign = 10;
        assertShortEquals(5, MathUtils.copySign(magnitude, sign));
    }

    @Test
    void testCopySignNegativeMagnitudeAndSign() {
        short magnitude = -5;
        short sign = -10;
        assertShortEquals(-5, MathUtils.copySign(magnitude, sign));
    }

    @Test
    void testCopySignZeroMagnitude() {
        short magnitude = 0;
        short sign = -10;
        assertShortEquals(0, MathUtils.copySign(magnitude, sign));
    }

    @Test
    void testCopySignPositiveOverflow() {
        short magnitude = Short.MIN_VALUE;
        short sign = 1;
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }

    @Test
    void testCopySignNegativeMagnitudeWithPositiveSign() {
        short magnitude = -5;
        short sign = 10;
        assertShortEquals(5, MathUtils.copySign(magnitude, sign));
    }

    private static void assertShortEquals(short expected, short actual) {
        assertEquals(expected, actual);
    }
}