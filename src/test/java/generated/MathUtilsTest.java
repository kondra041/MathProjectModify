package generated;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.util.Localizable;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.FastMath;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MathUtilsTest {
    @org.junit.jupiter.api.Test
    public void testCopySign() throws Exception {
        assertEquals(3, MathUtils.copySign((short) 3, (short) 5));
        assertEquals(-3, MathUtils.copySign((short) 3, (short) -5));

        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Short.MIN_VALUE, (short) 1));
    }

    @org.junit.jupiter.api.Test
    public void testHash() {
        assertEquals((new Double(5.0)).hashCode(), MathUtils.hash(5.0));
        assertEquals(Arrays.hashCode(new double[]{1, 2, 3}), MathUtils.hash(new double[]{1, 2, 3}));
    }

    @org.junit.jupiter.api.Test
    public void testNormalizeAngle() {
        assertTrue(Math.abs(MathUtils.normalizeAngle(4 * FastMath.PI + 0.5, FastMath.PI) - 0.5) < 1e-10);
        assertTrue(Math.abs(MathUtils.normalizeAngle(-3 * FastMath.PI + 0.5, FastMath.PI) + FastMath.PI - 0.5) < 1e-10);
    }

    @org.junit.jupiter.api.Test
    public void testReduce() {
        assertTrue(Math.abs(MathUtils.reduce(4 * FastMath.PI + 0.5, 2 * FastMath.PI, 0) - 0.5) < 1e-10);
        assertTrue(Math.abs(MathUtils.reduce(-3 * FastMath.PI + 0.5, 2 * FastMath.PI, 0) + FastMath.PI - 0.5) < 1e-10);
    }

    @org.junit.jupiter.api.Test
    public void testCheckFinite() {
        assertDoesNotThrow(() -> MathUtils.checkFinite(5.0));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.POSITIVE_INFINITY));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NEGATIVE_INFINITY));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NaN));
    }

    @org.junit.jupiter.api.Test
    public void testCheckNotNull() {
        assertDoesNotThrow(() -> MathUtils.checkNotNull("not null"));
        assertThrows(NullArgumentException.class, () -> MathUtils.checkNotNull(null));
    }
}