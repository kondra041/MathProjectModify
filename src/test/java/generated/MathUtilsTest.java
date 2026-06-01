package generated;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testHashDouble() {
        assertEquals(0, MathUtils.hash(123.456));
    }

    @Test
    void testHashDoubleArray() {
        double[] array = {1.0, 2.0, 3.0};
        assertEquals(Arrays.hashCode(array), MathUtils.hash(array));
    }

    @Test
    void testNormalizeAngle() {
        double expected = -FastMath.PI;
        double actual = MathUtils.normalizeAngle(-FastMath.PI, FastMath.PI);
        assertEquals(expected, actual);
    }

    @Test
    void testReduce() {
        double expected = 0.5;
        double actual = MathUtils.reduce(1.5, 2.0, 0.0);
        assertEquals(expected, actual);
    }

    @Test
    void testCopySignByte() {
        byte magnitude = -128;
        byte sign = -1;
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }

    @Test
    void testCheckFinite() {
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.POSITIVE_INFINITY));
    }

    @Test
    void testCheckFiniteArray() {
        double[] array = {1.0, Double.NaN, 3.0};
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(array));
    }

    @Test
    void testCheckNotNull() {
        assertThrows(NullArgumentException.class, () -> MathUtils.checkNotNull(null));
    }
}