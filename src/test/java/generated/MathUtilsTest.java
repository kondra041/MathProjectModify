package generated;

import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @Test
    public void testCopySign() {
        assertEquals(MathUtils.copySign(10, 1), 10);
        assertEquals(MathUtils.copySign(-10, -1), -10);
        assertEquals(MathUtils.copySign(Integer.MAX_VALUE, 1), Integer.MAX_VALUE);
        assertEquals(MathUtils.copySign(Integer.MIN_VALUE, 1), -Integer.MIN_VALUE);

        MathArithmeticException e = assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Integer.MIN_VALUE, 0));
        assertNotNull(e.getMessage());
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(MathUtils.normalizeAngle(10.0, MathUtils.TWO_PI), 1.0);
        assertEquals(MathUtils.normalizeAngle(-10.0, MathUtils.TWO_PI), -1.0);
        assertEquals(MathUtils.normalizeAngle(5.0, MathUtils.PI), 5.0);
    }

    @Test
    public void testHash() {
        double[] array = { 1.0, 2.0 };
        int hashValue = MathUtils.hash(array);
        assertEquals(hashValue, Arrays.hashCode(array));
    }

    @Test
    public void testReduce() {
        assertEquals(MathUtils.reduce(10.0, 5.0, 3.0), 7.0);
        assertEquals(MathUtils.reduce(-10.0, 5.0, 3.0), 2.0);
        assertThrows(MathArithmeticException.class, () -> MathUtils.reduce(Double.NaN, 5.0, 3.0));
    }

    @Test
    public void testCopySignByte() {
        assertEquals(MathUtils.copySign((byte) 10, (byte) 1), (byte) 10);
        assertEquals(MathUtils.copySign((byte) -10, (byte) -1), (byte) -10);

        MathArithmeticException e = assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Byte.MIN_VALUE, (byte) 0));
        assertNotNull(e.getMessage());
    }

    @Test
    public void testCopySignShort() {
        assertEquals(MathUtils.copySign((short) 10, (short) 1), (short) 10);
        assertEquals(MathUtils.copySign((short) -10, (short) -1), (short) -10);

        MathArithmeticException e = assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Short.MIN_VALUE, (short) 0));
        assertNotNull(e.getMessage());
    }

    @Test
    public void testCopySignInt() {
        assertEquals(MathUtils.copySign(10, 1), 10);
        assertEquals(MathUtils.copySign(-10, -1), -10);

        MathArithmeticException e = assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Integer.MIN_VALUE, 0));
        assertNotNull(e.getMessage());
    }

    @Test
    public void testCopySignLong() {
        assertEquals(MathUtils.copySign(10L, 1L), 10L);
        assertEquals(MathUtils.copySign(-10L, -1L), -10L);

        MathArithmeticException e = assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Long.MIN_VALUE, 0));
        assertNotNull(e.getMessage());
    }

    @Test
    public void testCheckFinite() {
        NotFiniteNumberException e = assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.POSITIVE_INFINITY));
        assertEquals("Not a finite number: Infinity", e.getMessage());

        e = assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NEGATIVE_INFINITY));
        assertEquals("Not a finite number: -Infinity", e.getMessage());
    }

    @Test
    public void testCheckNotNull() {
        try {
            MathUtils.checkNotNull(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // Expected
        }
    }
}