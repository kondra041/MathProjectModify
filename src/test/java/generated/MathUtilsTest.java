package generated;

import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.Localizable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testCopySignPositiveMagnitude() throws NotFiniteNumberException {
        int magnitude = 10;
        int sign = -1;
        assertEquals(-10, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignNegativeMagnitude() throws NotFiniteNumberException {
        int magnitude = -10;
        int sign = -1;
        assertEquals(10, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignSameSign() throws NotFiniteNumberException {
        int magnitude = 10;
        int sign = 1;
        assertEquals(10, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignIntegerMinValue() {
        int magnitude = Integer.MIN_VALUE;
        int sign = 1;
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }
}