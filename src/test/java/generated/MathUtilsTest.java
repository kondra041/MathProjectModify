package generated;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testHash() {
        assertEquals(1234, MathUtils.hash(1234));
        assertEquals(-1234, MathUtils.hash(-1234));
        assertEquals(1079615583, MathUtils.hash(1.0));
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(Math.PI / 2, MathUtils.normalizeAngle(3 * Math.PI / 2, Math.PI / 2));
        assertEquals(-Math.PI / 2, MathUtils.normalizeAngle(-3 * Math.PI / 2, -Math.PI / 2));
    }

    @Test
    public void testReduce() {
        assertEquals(0.5, MathUtils.reduce(1.5, 1, 0.5));
        assertEquals(-1.5, MathUtils.reduce(-1.5, -1, -0.5));
    }

    @Test
    public void testCopySignByte() {
        assertEquals((byte) 3, MathUtils.copySign((byte) 3, (byte) 4));
        assertEquals((byte) -3, MathUtils.copySign((byte) 3, (byte) -4));
    }

    @Test
    public void testCopySignShort() {
        assertEquals((short) 5, MathUtils.copySign((short) 5, (short) 6));
        assertEquals((short) -5, MathUtils.copySign((short) 5, (short) -6));
    }

    @Test
    public void testCopySignInt() {
        assertEquals(7, MathUtils.copySign(7, 8));
        assertEquals(-7, MathUtils.copySign(7, -8));
    }

    @Test
    public void testCopySignLong() {
        assertEquals(10L, MathUtils.copySign(10L, 11L));
        assertEquals(-10L, MathUtils.copySign(10L, -11L));
    }

    @Test
    public void testCheckFinite() {
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.POSITIVE_INFINITY));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NEGATIVE_INFINITY));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NaN));
    }

    @Test
    public void testCheckFiniteArray() {
        double[] array = {1, Double.POSITIVE_INFINITY, 2, Double.NEGATIVE_INFINITY, 3};
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(array));
    }

    @Test
    public void testCheckNotNull() {
        Object o = new Object();
        assertDoesNotThrow(() -> MathUtils.checkNotNull(o));
        assertThrows(NullArgumentException.class, () -> MathUtils.checkNotNull((Object) null));
        assertThrows(NullArgumentException.class, () -> MathUtils.checkNotNull((Object) null, "pattern", "args"));
    }
}