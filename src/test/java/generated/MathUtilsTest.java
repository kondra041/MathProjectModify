package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MathUtilsTest {

    @Test
    public void testCopySignShortPositive() {
        short magnitude = 50;
        short sign = 10;
        assertEquals(50, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignShortNegative() {
        short magnitude = -50;
        short sign = -10;
        assertEquals(-50, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignShortZeroMagnitudePositive() {
        short magnitude = 0;
        short sign = 10;
        assertEquals(0, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignShortZeroMagnitudeNegative() {
        short magnitude = 0;
        short sign = -10;
        assertEquals(0, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignShortOverflow() {
        short magnitude = Short.MIN_VALUE;
        short sign = 10;
        assertThrows(org.apache.commons.math3.exception.MathArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }
}