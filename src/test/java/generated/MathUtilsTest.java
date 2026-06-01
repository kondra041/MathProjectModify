package generated;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @org.junit.jupiter.api.Test
    public void testCopySignByte() {
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign((byte) 123, (byte) -5));
        assertEquals(-123, MathUtils.copySign((byte) 123, (byte) 5));
    }

    @org.junit.jupiter.api.Test
    public void testCopySignShort() {
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign((short) -12345, (short) 6));
        assertEquals((short) 12345, MathUtils.copySign((short) -12345, (short) -7));
    }

    @org.junit.jupiter.api.Test
    public void testCopySignInt() {
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Integer.MIN_VALUE, 5));
        assertEquals(1234567890, MathUtils.copySign(1234567890, -1));
    }

    @org.junit.jupiter.api.Test
    public void testCopySignLong() {
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Long.MIN_VALUE, 5L));
        assertEquals(-1234567890L, MathUtils.copySign(1234567890L, -1L));
    }

    @org.junit.jupiter.api.Test
    public void testCheckFinite() {
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NaN));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.POSITIVE_INFINITY));
        assertDoesNotThrow(() -> MathUtils.checkFinite(3.14));
    }

    @org.junit.jupiter.api.Test
    public void testCheckNotNull() {
        assertThrows(NullArgumentException.class, () -> MathUtils.checkNotNull(null));
        assertDoesNotThrow(() -> MathUtils.checkNotNull("test"));
    }
}