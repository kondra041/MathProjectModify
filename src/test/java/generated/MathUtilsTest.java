package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testHash() {
        double value = 42.0;
        int hashValue = MathUtils.hash(value);
        assertEquals(value, hashValue, "Hash function should return the same value as input");
    }

    @Test
    public void testHashArray() {
        double[] array = {1.5, 2.3, 3.7};
        int hashValue = MathUtils.hash(array);
        assertNotNull(hashValue, "Hash function should not return null for an array");
    }

    @Test
    public void testNormalizeAngle() {
        double angle = -5.0;
        double center = 0.0;
        double normalizedAngle = MathUtils.normalizeAngle(angle, center);
        assertEquals(-1.0 + 2 * Math.PI, normalizedAngle, "Normalized angle should be within the range");
    }

    @Test
    public void testCopySignByte() {
        byte magnitude = -1;
        byte sign = 1;
        try {
            byte result = MathUtils.copySign(magnitude, sign);
            assertEquals(-1, result, "Copy sign function should return the correct value");
        } catch (MathArithmeticException e) {
            fail("Should not throw MathArithmeticException for valid inputs");
        }
    }

    @Test
    public void testCheckFinite() {
        double finiteNumber = 42.0;
        double[] array = {1.5, Double.POSITIVE_INFINITY};
        try {
            MathUtils.checkFinite(array);
            fail("Should throw NotFiniteNumberException for infinite numbers");
        } catch (NotFiniteNumberException e) {
            assertEquals(Double.POSITIVE_INFINITY, array[1], "Check finite function should catch infinite values");
        }
    }

    @Test
    public void testCheckNotNull() {
        Object obj = new Object();
        try {
            MathUtils.checkNotNull(obj);
        } catch (NullArgumentException e) {
            fail("Should not throw NullArgumentException for non-null objects");
        }
    }
}