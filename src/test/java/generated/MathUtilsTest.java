package generated;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.numbers.core.LocalizedFormats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @Test
    public void testCopySign_PositiveMagnitudeAndPositiveSign() {
        long magnitude = 5L;
        long sign = 3L;
        assertEquals(5L, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySign_NegativeMagnitudeAndNegativeSign() {
        long magnitude = -5L;
        long sign = -3L;
        assertEquals(-5L, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySign_PositiveMagnitudeAndNegativeSign() {
        long magnitude = 5L;
        long sign = -3L;
        assertEquals(-5L, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySign_NegativeMagnitudeAndPositiveSign() {
        long magnitude = -5L;
        long sign = 3L;
        assertEquals(5L, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySign_LongMinValueAndNonNegativeSign_ShouldThrowException() {
        long magnitude = Long.MIN_VALUE;
        long sign = 0L;

        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(magnitude, sign);
        });
    }

    @Test
    public void testCopySign_LongMinValueAndNegativeSign() {
        long magnitude = Long.MIN_VALUE;
        long sign = -1L;
        assertEquals(Long.MAX_VALUE, MathUtils.copySign(magnitude, sign));
    }
}