package generated;

import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.Localizable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testCopySignBytePositive() {
        byte magnitude = 5;
        byte sign = 10;
        byte result = MathUtils.copySign(magnitude, sign);
        assertEquals(5, result);
    }

    @Test
    public void testCopySignByteNegative() {
        byte magnitude = -5;
        byte sign = -10;
        byte result = MathUtils.copySign(magnitude, sign);
        assertEquals(-5, result);
    }

    @Test
    public void testCopySignBytePositiveMagnitudeMinValue() {
        byte magnitude = Byte.MIN_VALUE;
        byte sign = 10;
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }
}