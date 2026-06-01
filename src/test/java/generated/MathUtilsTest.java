package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testHashDouble() {
        assertEquals(31, MathUtils.hash(0.0));
        assertEquals(48, MathUtils.hash(123.456));
        assertEquals(-79, MathUtils.hash(Double.NaN));
        assertEquals(967, MathUtils.hash(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testHashDoubleArray() {
        double[] array = {0.0, 1.1, 2.2};
        assertEquals(31 * 3 + 48 + 53, MathUtils.hash(array));
        
        array = new double[]{Double.NaN, Double.POSITIVE_INFINITY, -Double.NEGATIVE_INFINITY};
        assertEquals(31 * 3 + -79 + 967 + -2039, MathUtils.hash(array));
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, FastMath.PI));
        assertEquals(FastMath.PI, MathUtils.normalizeAngle(FastMath.PI, 0.0));
        assertEquals(FastMath.PI / 2, MathUtils.normalizeAngle(FastMath.PI * 3 / 2, FastMath.PI));
    }

    @Test
    public void testReduce() {
        assertEquals(0.0, MathUtils.reduce(1.5 * FastMath.PI, FastMath.PI, 0.0));
        assertEquals(-FastMath.PI / 4, MathUtils.reduce(FastMath.PI / 4, FastMath.PI, FastMath.PI / 2));
    }

    @Test
    public void testCopySign() {
        assertEquals(1, MathUtils.copySign(1, -1));
        assertEquals(1, MathUtils.copySign(-1, 1));
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Byte.MIN_VALUE, (byte) 1));
    }

    @Test
    public void testCheckFinite() {
        assertDoesNotThrow(() -> MathUtils.checkFinite(0.0));
        assertDoesNotThrow(() -> MathUtils.checkFinite(new double[]{0.0, 1.23, -4.56}));
        
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NaN));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(new double[]{Double.POSITIVE_INFINITY}));
    }

    @Test
    public void testCheckNotNull() {
        assertDoesNotThrow(() -> MathUtils.checkNotNull("test"));
        
        assertThrows(NullArgumentException.class, () -> MathUtils.checkNotNull(null));
        assertThrows(NullArgumentException.class, () -> MathUtils.checkNotNull(null, "message", "arg"));
    }
}