package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testHash() {
        assertEquals(1234, MathUtils.hash(1234.0));
        assertEquals(-1234, MathUtils.hash(-1234.0));
        assertNotEquals(1235, MathUtils.hash(1234.0));
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, FastMath.PI), 1e-9);
        assertEquals(FastMath.PI, MathUtils.normalizeAngle(FastMath.PI, FastMath.PI), 1e-9);
        assertEquals(-FastMath.PI, MathUtils.normalizeAngle(-FastMath.PI, FastMath.PI), 1e-9);
    }

    @Test
    public void testReduce() {
        assertEquals(0.5, MathUtils.reduce(2.5, 3.0, -1.0), 1e-9);
        assertEquals(-0.5, MathUtils.reduce(2.5, 3.0, 1.0), 1e-9);
    }

    @Test
    public void testCopySignByte() {
        assertEquals((byte) 1, MathUtils.copySign((byte) 1, (byte) 1));
        assertEquals((byte) -1, MathUtils.copySign((byte) 1, (byte) -1));
        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign((byte) -128, (byte) 0);
        });
    }

    @Test
    public void testCopySignShort() {
        assertEquals((short) 1, MathUtils.copySign((short) 1, (short) 1));
        assertEquals((short) -1, MathUtils.copySign((short) 1, (short) -1));
        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign((short) -32768, (short) 0);
        });
    }

    @Test
    public void testCopySignInt() {
        assertEquals(-1, MathUtils.copySign(1, -1));
        assertEquals(1, MathUtils.copySign(-1, 1));
        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(Integer.MIN_VALUE, 0);
        });
    }

    @Test
    public void testCopySignLong() {
        assertEquals(-1L, MathUtils.copySign(1L, -1L));
        assertEquals(1L, MathUtils.copySign(-1L, 1L));
        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(Long.MIN_VALUE, 0L);
        });
    }

    @Test
    public void testCheckFinite() {
        assertDoesNotThrow(() -> MathUtils.checkFinite(1.0));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NaN));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testCheckFiniteArray() {
        double[] array = {1.0, 2.0};
        assertDoesNotThrow(() -> MathUtils.checkFinite(array));
        array[0] = Double.NaN;
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(array));
    }

    @Test
    public void testCheckNotNull() {
        assertDoesNotThrow(() -> MathUtils.checkNotNull("test"));
        assertThrows(NullArgumentException.class, () -> MathUtils.checkNotNull(null));
    }
}