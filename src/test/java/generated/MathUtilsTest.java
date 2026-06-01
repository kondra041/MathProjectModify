package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MathUtilsTest {

    @Test
    public void testCopySignBytePositive() {
        byte magnitude = 10;
        byte sign = 1;
        assertEquals(magnitude, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignByteNegative() {
        byte magnitude = 10;
        byte sign = -1;
        assertEquals(-magnitude, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignByteZeroPositive() {
        byte magnitude = 0;
        byte sign = 1;
        assertEquals(magnitude, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignByteZeroNegative() {
        byte magnitude = 0;
        byte sign = -1;
        assertEquals(-magnitude, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignByteOverflow() {
        byte magnitude = Byte.MIN_VALUE;
        byte sign = 1;
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }
}