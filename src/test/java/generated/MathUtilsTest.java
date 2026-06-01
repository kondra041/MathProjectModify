import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.math3.util.MathUtils;

import java.util.Arrays;

public class MathUtilsTest {

    @org.junit.jupiter.api.Test
    void testHashDouble() {
        assertNotEquals(MathUtils.hash(1.0), MathUtils.hash(-1.0));
        assertEquals(MathUtils.hashCode(new Double(0.0)), MathUtils.hash(0.0));
        assertEquals(MathUtils.hash(Double.NaN), Arrays.hashCode(new double[]{Double.NaN}));
    }

    @org.junit.jupiter.api.Test
    void testHashDoubleArray() {
        assertThrows(NullPointerException.class, () -> MathUtils.hash(null));
        assertEquals(0, MathUtils.hash(new double[0]));
        double[] arr = {1.0, 2.0};
        assertNotEquals(MathUtils.hashCode(arr), MathUtils.hashCode(Arrays.copyOf(arr, arr.length)));
    }

    @org.junit.jupiter.api.Test
    void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, Math.PI));
        assertEquals(-Math.PI, MathUtils.normalizeAngle(-Math.PI, 0.0));
        assertEquals(Math.PI / 2, MathUtils.normalizeAngle(Math.PI + Math.PI / 2, Math.PI));
    }

    @org.junit.jupiter.api.Test
    void testReduce() {
        assertEquals(0.5, MathUtils.reduce(0.5, 1.0, 0.0));
        assertEquals(-0.5, MathUtils.reduce(-0.5, 1.0, 0.0));
        assertEquals(0.0, MathUtils.reduce(1.0, 1.0, 0.0));
    }

    @org.junit.jupiter.api.Test
    void testCopySignByte() {
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign((byte) -128, (byte) 1));
        assertEquals((byte) 127, MathUtils.copySign(127, (byte) -1));
        assertEquals((byte) -128, MathUtils.copySign(-128, (byte) -1));
    }

    @org.junit.jupiter.api.Test
    void testCopySignShort() {
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Short.MIN_VALUE, (short) 1));
        assertEquals((short) 32767, MathUtils.copySign(32767, (short) -1));
        assertEquals((short) -32768, MathUtils.copySign(-32768, (short) -1));
    }

    @org.junit.jupiter.api.Test
    void testCopySignInt() {
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Integer.MIN_VALUE, 1));
        assertEquals(2147483647, MathUtils.copySign(2147483647, -1));
        assertEquals(-2147483648, MathUtils.copySign(-2147483648, -1));
    }

    @org.junit.jupiter.api.Test
    void testCopySignLong() {
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Long.MIN_VALUE, 1L));
        assertEquals(Long.MAX_VALUE, MathUtils.copySign(Long.MAX_VALUE, -1L));
        assertEquals(-Long.MIN_VALUE, MathUtils.copySign(Long.MIN_VALUE, -1L));
    }

    @org.junit.jupiter.api.Test
    void testCheckFinite() {
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.POSITIVE_INFINITY));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NaN));
        assertDoesNotThrow(() -> MathUtils.checkFinite(1.0));
    }

    @org.junit.jupiter.api.Test
    void testCheckFiniteArray() {
        double[] arr = {Double.NaN};
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(arr));
        assertDoesNotThrow(() -> MathUtils.checkFinite(new double[0]));
    }

    @org.junit.jupiter.api.Test
    void testCheckNotNull() {
        assertThrows(NullArgumentException.class, () -> MathUtils.checkNotNull(null));
        assertDoesNotThrow(() -> MathUtils.checkNotNull("test"));
    }
}