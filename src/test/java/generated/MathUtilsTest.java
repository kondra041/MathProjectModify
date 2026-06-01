package generated;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testCopySignByte() {
        assertEquals(1, MathUtils.copySign((byte) 1, (byte) -1));
        assertEquals(-1, MathUtils.copySign((byte) 1, (byte) 1));
        assertEquals(127, MathUtils.copySign((byte) 127, (byte) -1));
    }

    @Test
    public void testCopySignShort() {
        assertEquals(1, MathUtils.copySign((short) 1, (short) -1));
        assertEquals(-1, MathUtils.copySign((short) 1, (short) 1));
        assertEquals(32767, MathUtils.copySign((short) 32767, (short) -1));
    }

    @Test
    public void testCopySignInt() {
        assertEquals(1, MathUtils.copySign(1, -1));
        assertEquals(-1, MathUtils.copySign(1, 1));
        assertEquals(2147483647, MathUtils.copySign(2147483647, -1));
    }

    @Test
    public void testCopySignLong() {
        assertEquals(1L, MathUtils.copySign(1L, -1L));
        assertEquals(-1L, MathUtils.copySign(1L, 1L));
        assertEquals(2147483647L, MathUtils.copySign(2147483647L, -1L));
    }

    @Test
    public void testCheckFiniteDouble() {
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.POSITIVE_INFINITY));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NaN));
    }

    @Test
    public void testCheckFiniteArray() {
        double[] array = {1.0, Double.POSITIVE_INFINITY, 3.0};
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(array));
    }
}