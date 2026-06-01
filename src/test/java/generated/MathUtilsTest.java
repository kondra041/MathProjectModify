package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.apache.commons.math3.exception.MathArithmeticException;

public class MathUtilsTest {

    @Test
    public void testCopySignPositiveMagnitudeAndSign() {
        assertEquals(5, MathUtils.copySign(5, 10));
    }

    @Test
    public void testCopySignNegativeMagnitudeAndSign() {
        assertEquals(-5, MathUtils.copySign(-5, -10));
    }

    @Test
    public void testCopySignPositiveMagnitudeAndNegativeSign() {
        assertEquals(-5, MathUtils.copySign(5, -10));
    }

    @Test
    public void testCopySignNegativeMagnitudeAndPositiveSign() {
        assertEquals(5, MathUtils.copySign(-5, 10));
    }

    @Test
    public void testCopySignWithIntegerMinValueAndPositiveSignThrowsException() {
        Executable executable = () -> MathUtils.copySign(Integer.MIN_VALUE, 10);
        assertThrows(MathArithmeticException.class, executable);
    }

    @Test
    public void testCopySignWithIntegerMinValueAndNegativeSignFlipsSign() {
        assertEquals(Integer.MAX_VALUE, MathUtils.copySign(Integer.MIN_VALUE, -10));
    }
}