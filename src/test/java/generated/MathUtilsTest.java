package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MathUtilsTest {

    @Test
    public void testCopySignPositiveMagnitudeAndPositiveSign() {
        long result = MathUtils.copySign(10L, 20L);
        assertEquals(10L, result);
    }

    @Test
    public void testCopySignNegativeMagnitudeAndNegativeSign() {
        long result = MathUtils.copySign(-10L, -20L);
        assertEquals(-10L, result);
    }

    @Test
    public void testCopySignPositiveMagnitudeAndNegativeSign() {
        long result = MathUtils.copySign(10L, -20L);
        assertEquals(-10L, result);
    }

    @Test
    public void testCopySignNegativeMagnitudeAndPositiveSign() {
        long result = MathUtils.copySign(-10L, 20L);
        assertEquals(10L, result);
    }

    @Test
    public void testCopySignMagnitudeIsLongMinValueAndSignIsPositive() {
        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(Long.MIN_VALUE, 20L);
        });
    }

    @Test
    public void testCopySignMagnitudeIsZeroAndSignIsPositive() {
        long result = MathUtils.copySign(0L, 20L);
        assertEquals(0L, result);
    }

    @Test
    public void testCopySignMagnitudeIsZeroAndSignIsNegative() {
        long result = MathUtils.copySign(0L, -20L);
        assertEquals(-0L, result); // This should be negative zero
    }
}