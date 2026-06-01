package generated;

import org.apache.commons.math3.util.MathUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsCopySignTest {

    @org.junit.jupiter.api.Test
    public void testCopySignPositive() {
        long magnitude = 5L, sign = 10L;
        assertEquals(5L, MathUtils.copySign(magnitude, sign));
    }

    @org.junit.jupiter.api.Test
    public void testCopySignNegative() {
        long magnitude = -5L, sign = -10L;
        assertEquals(-5L, MathUtils.copySign(magnitude, sign));
    }

    @org.junit.jupiter.api.Test
    public void testCopySignException() {
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Long.MIN_VALUE, 1L));
    }
}