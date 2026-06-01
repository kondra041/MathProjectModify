package generated;

import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.Localizable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MathUtilsTest {

    @Test
    public void testHashDouble() {
        double value = 123.456;
        int hash = MathUtils.hash(value);
        assertEquals(new Double(value).hashCode(), hash);
    }

    @Test
    public void testHashDoubleArray() {
        double[] array = {1.0, 2.0, 3.0};
        int hash = MathUtils.hash(array);
        assertEquals(Arrays.hashCode(array), hash);
    }

    @Test
    public void testNormalizeAngleBetween0And2Pi() {
        double angle = FastMath.PI / 4;
        double center = FastMath.PI;
        double normalized = MathUtils.normalizeAngle(angle, center);
        assertTrue(normalized >= 0 && normalized <= 2 * FastMath.PI);
    }

    @Test
    public void testNormalizeAngleBetweenNegativeAndPositivePi() {
        double angle = -3 * FastMath.PI / 4;
        double center = 0.0;
        double normalized = MathUtils.normalizeAngle(angle, center);
        assertTrue(normalized >= -FastMath.PI && normalized <= FastMath.PI);
    }

    @Test
    public void testNormalizeAngleBetweenTwoPositions() {
        double start = FastMath.PI / 2;
        double end = 3 * FastMath.PI / 4;
        double angleDifference = MathUtils.normalizeAngle(end, start) - start;
        assertTrue(angleDifference >= -FastMath.PI && angleDifference <= FastMath.PI);
    }

    @Test
    public void testCheckFiniteDouble() {
        double value = 123.456;
        assertDoesNotThrow(() -> MathUtils.checkFinite(value));
    }

    @Test
    public void testCheckFiniteDoubleArray() {
        double[] array = {1.0, 2.0, 3.0};
        assertDoesNotThrow(() -> MathUtils.checkFinite(array));
    }

    @Test
    public void testCheckNotNullObject() {
        Object obj = new Object();
        assertDoesNotThrow(() -> MathUtils.checkNotNull(obj));
    }

    @Test
    public void testCopySignByte() throws Exception {
        byte magnitude = 5;
        byte sign = -1;
        assertEquals(-5, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignShort() throws Exception {
        short magnitude = 5;
        short sign = -1;
        assertEquals((short) -5, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignInT() throws Exception {
        int magnitude = 5;
        int sign = -1;
        assertEquals(-5, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignLong() throws Exception {
        long magnitude = 5;
        long sign = -1;
        assertEquals((long) -5, MathUtils.copySign(magnitude, sign));
    }
}