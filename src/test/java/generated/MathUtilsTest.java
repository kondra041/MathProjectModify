package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.FastMath;
import org.junit.jupiter.api.Test;

class MathUtils {

    /**
     * Returns the first argument with the sign of the second argument.
     *
     * @param magnitude Magnitude of the returned value.
     * @param sign Sign of the returned value.
     * @return a value with magnitude equal to {@code magnitude} and with the
     * same sign as the {@code sign} argument.
     * @throws MathArithmeticException if {@code magnitude == Integer.MIN_VALUE}
     * and {@code sign >= 0}.
     */
    public static int copySign(int magnitude, int sign) throws MathArithmeticException {
        if ((magnitude >= 0 && sign >= 0) || (magnitude < 0 && sign < 0)) {
            // Sign is OK.
            return magnitude;
        } else if (sign >= 0 && magnitude == Integer.MIN_VALUE) {
            throw new MathArithmeticException(LocalizedFormats.OVERFLOW);
        } else {
            // Flip sign.
            return -magnitude;
        }
    }

    @Test
    void testCopySign() {
        assertEquals(1, copySign(1, 1));
        assertEquals(-1, copySign(1, -1));
        assertEquals(Integer.MIN_VALUE, copySign(Integer.MIN_VALUE, 1));

        final MathArithmeticException ex = assertThrows(MathArithmeticException.class, () ->
            copySign(Integer.MIN_VALUE, -1)
        );
        assertEquals("overflow", ex.getMessage());
    }
}