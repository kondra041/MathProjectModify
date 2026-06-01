package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testCopySignPositiveMagnitudeAndPositiveSign() {
        int result = MathUtils.copySign(5, 10);
        assertEquals(5, result);
    }

    @Test
    public void testCopySignNegativeMagnitudeAndNegativeSign() {
        int result = MathUtils.copySign(-7, -3);
        assertEquals(-7, result);
    }

    @Test
    public void testCopySignPositiveMagnitudeAndNegativeSign() {
        int result = MathUtils.copySign(8, -4);
        assertEquals(-8, result);
    }

    @Test
    public void testCopySignNegativeMagnitudeAndPositiveSign() {
        int result = MathUtils.copySign(-6, 2);
        assertEquals(6, result);
    }

    @Test
    public void testCopySignOverflowExceptionForMinValueWithNonNegativeSign() {
        assertThrows(MathArithmeticException.class, () -> 
            MathUtils.copySign(Integer.MIN_VALUE, 1)
        );
    }
}