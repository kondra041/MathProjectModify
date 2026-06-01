import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.math3.util.MathUtils;

import java.util.Arrays;

class TestMathUtils {

    @org.junit.jupiter.api.Test
    void testNormalizeAngle() {
        double a = MathUtils.normalizeAngle(0, 0);
        assertEquals(0.0, a);

        double result = MathUtils.normalizeAngle(4 * Math.PI, Math.PI);
        assertEquals(0.0, result);

        result = MathUtils.normalizeAngle(-Math.PI, 0.0);
        assertEquals(Math.PI, result);

        result = MathUtils.normalizeAngle(2.5 * Math.PI, Math.PI);
        assertEquals(0.5 * Math.PI, result);

        assertAll(
            () -> assertEquals(Math.PI, MathUtils.normalizeAngle(-Math.PI, Math.PI)),
            () -> assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, 0.0))
        );
    }

    @org.junit.jupiter.api.Test
    void testCopySignByte() {
        assertEquals((byte) -5, MathUtils.copySign(5, (byte)-1));
        assertEquals((byte) 5, MathUtils.copySign(-5, (byte)1));

        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Byte.MIN_VALUE, (byte)1));
    }

    @org.junit.jupiter.api.Test
    void testCopySignShort() {
        assertEquals((short)-5, MathUtils.copySign(5, (short)-1));
        assertEquals((short)5, MathUtils.copySign(-5, (short)1));

        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Short.MIN_VALUE, (short)1));
    }

    @org.junit.jupiter.api.Test
    void testCopySignInt() {
        assertEquals(-5, MathUtils.copySign(5, -1));
        assertEquals(5, MathUtils.copySign(-5, 1));

        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Integer.MIN_VALUE, 1));
    }

    @org.junit.jupiter.api.Test
    void testCopySignLong() {
        assertEquals(-5L, MathUtils.copySign(5L, -1L));
        assertEquals(5L, MathUtils.copySign(-5L, 1L));

        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Long.MIN_VALUE, 1L));
    }

    @org.junit.jupiter.api.Test
    void testHashDouble() {
        assertEquals(new Double(0.0).hashCode(), MathUtils.hash(0.0));
        assertNotEquals(MathUtils.hash(Double.NaN), MathUtils.hash(0.0));
    }

    @org.junit.jupiter.api.Test
    void testHashDoubleArray() {
        assertEquals(Arrays.hashCode(new double[]{1, 2}), MathUtils.hash(new double[]{1, 2}));
    }

    @org.junit.jupiter.api.Test
    void testCheckFiniteSingleValue() {
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NaN));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.POSITIVE_INFINITY));
    }

    @org.junit.jupiter.api.Test
    void testCheckFiniteArray() {
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(new double[]{Double.NaN}));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(new double[]{Double.POSITIVE_INFINITY}));
    }

    @org.junit.jupiter.api.Test
    void testCheckNotNull() {
        assertThrows(NullArgumentException.class, () -> MathUtils.checkNotNull(null, (Localized)null));
        assertThrows(NullArgumentException.class, () -> MathUtils.checkNotNull(null));
    }
}