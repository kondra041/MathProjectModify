package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MathUtilsTest {

    @Test
    public void testCopySignPositiveMagnitudeNegativeSign() {
        int magnitude = 10;
        int sign = -1;
        assertEquals(-10, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignNegativeMagnitudePositiveSign() {
        int magnitude = -10;
        int sign = 1;
        assertEquals(10, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignZeroMagnitudePositiveSign() {
        int magnitude = 0;
        int sign = 1;
        assertEquals(0, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignZeroMagnitudeNegativeSign() {
        int magnitude = 0;
        int sign = -1;
        assertEquals(0, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignOverflow() {
        int magnitude = Integer.MIN_VALUE;
        int sign = 1;
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }
}