package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testCopySignPositiveMagnitudeAndSign() {
        assertEquals(10, MathUtils.copySign((short) 10, (short) 5));
    }

    @Test
    public void testCopySignNegativeMagnitudeAndSign() {
        assertEquals(-10, MathUtils.copySign((short) -10, (short) -5));
    }

    @Test
    public void testCopySignPositiveMagnitudeAndNegativeSign() {
        assertEquals(-10, MathUtils.copySign((short) 10, (short) -5));
    }

    @Test
    public void testCopySignNegativeMagnitudeAndPositiveSign() {
        assertEquals(10, MathUtils.copySign((short) -10, (short) 5));
    }

    @Test
    public void testCopySignMinValueWithPositiveSignThrowsException() {
        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(Short.MIN_VALUE, (short) 5);
        });
    }

    @Test
    public void testCopySignMinValueWithNegativeSign() {
        assertEquals((short) Short.MAX_VALUE, MathUtils.copySign(Short.MIN_VALUE, (short) -1));
    }
}