package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.LocalizedFormats;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testCopySignPositiveMagnitudeAndSign() {
        long magnitude = 10L;
        long sign = 5L;
        assertEquals(10L, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignNegativeMagnitudeAndSign() {
        long magnitude = -10L;
        long sign = -5L;
        assertEquals(-10L, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignPositiveMagnitudeAndNegativeSign() {
        long magnitude = 10L;
        long sign = -5L;
        assertEquals(-10L, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignNegativeMagnitudeAndPositiveSign() {
        long magnitude = -10L;
        long sign = 5L;
        assertEquals(10L, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignLongMinValueWithPositiveSignThrowsException() {
        long magnitude = Long.MIN_VALUE;
        long sign = 5L;
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }
}