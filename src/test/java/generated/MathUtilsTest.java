package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.math3.util.MathArithmeticException;
import org.apache.commons.math3.util.LocalizedFormats;
import org.apache.commons.math3.util.MathUtils;

public class MathUtilsTest {

    @org.junit.jupiter.api.Test
    public void testCopySignByte() {
        // Positive numbers with positive sign
        assertEquals((byte) 5, MathUtils.copySign((byte) 5, (byte) 1));
        // Negative numbers with negative sign
        assertEquals((byte) -5, MathUtils.copySign((byte) -5, (byte) -1));
        // Positive number with negative sign
        assertEquals((byte) -5, MathUtils.copySign((byte) 5, (byte) -1));
        // Negative number with positive sign
        assertEquals((byte) 5, MathUtils.copySign((byte) -5, (byte) 1));

        // Edge case: Byte.MIN_VALUE and positive sign
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Byte.MIN_VALUE, (byte) 1));
    }
}