package generated;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.LocalizedFormats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    public void testCopySignWithPositiveMagnitudeAndPositiveSign() {
        byte result = generated.MathUtils.copySign((byte) 5, (byte) 3);
        assertEquals(5, result);
    }

    @Test
    public void testCopySignWithNegativeMagnitudeAndNegativeSign() {
        byte result = generated.MathUtils.copySign((byte) -5, (byte) -3);
        assertEquals(-5, result);
    }

    @Test
    public void testCopySignWithPositiveMagnitudeAndNegativeSign() {
        byte result = generated.MathUtils.copySign((byte) 5, (byte) -3);
        assertEquals(-5, result);
    }

    @Test
    public void testCopySignWithNegativeMagnitudeAndPositiveSign() {
        byte result = generated.MathUtils.copySign((byte) -5, (byte) 3);
        assertEquals(5, result);
    }

    @Test
    public void testCopySignOverflowExceptionForMinValue() {
        assertThrows(MathArithmeticException.class, () -> {
            generated.MathUtils.copySign(Byte.MIN_VALUE, (byte) 1);
        });
    }
}