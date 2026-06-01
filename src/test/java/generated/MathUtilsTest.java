package generated;

import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MathUtilsTest {

    @Test
    public void testCopySignByte() {
        assertEquals((byte) 5, MathUtils.copySign((byte) 5, (byte) 1));
        assertEquals((byte) -5, MathUtils.copySign((byte) 5, (byte) -1));
        assertEquals((byte) -128, MathUtils.copySign(Byte.MIN_VALUE, (byte) -1));
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Byte.MIN_VALUE, (byte) 1));
    }

    @Test
    public void testCopySignShort() {
        assertEquals((short) 5, MathUtils.copySign((short) 5, (short) 1));
        assertEquals((short) -5, MathUtils.copySign((short) 5, (short) -1));
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Short.MIN_VALUE, (short) 1));
    }

    @Test
    public void testCopySignIn() {
        assertEquals(5, MathUtils.copySign(5, 1));
        assertEquals(-5, MathUtils.copySign(5, -1));
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testCopySignLong() {
        assertEquals(5L, MathUtils.copySign(5L, 1L));
        assertEquals(-5L, MathUtils.copySign(5L, -1L));
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Long.MIN_VALUE, 1L));
    }

    @Test
    public void testCheckFiniteDouble() {
        MathUtils.checkFinite(5.0);
        assertThrows(org.apache.commons.math3.exception.NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NaN));
        assertThrows(org.apache.commons.math3.exception.NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testCheckFiniteDoubleArray() {
        MathUtils.checkFinite(new double[]{1.0, 2.0, 3.0});
        assertThrows(org.apache.commons.math3.exception.NotFiniteNumberException.class, () -> MathUtils.checkFinite(new double[]{1.0, Double.NaN, 3.0}));
    }

    @Test
    public void testCheckNotNull() {
        MathUtils.checkNotNull("test");
        assertThrows(org.apache.commons.math3.exception.NullArgumentException.class, () -> MathUtils.checkNotNull(null));
    }
}