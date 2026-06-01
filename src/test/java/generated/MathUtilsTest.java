package generated;

import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.FastMath;
import org.junit.jupiter.api.Test;
import java.lang.NullArgumentException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @Test
    public void testNormalizeAngle() {
        double a = 3 * FastMath.PI / 2.0;
        double center = FastMath.PI;
        double expected = -FastMath.PI / 2.0;
        
        assertEquals(expected, MathUtils.normalizeAngle(a, center));
    }

    @Test
    public void testCheckFinite() {
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NaN));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.POSITIVE_INFINITY));
        
        // Should not throw an exception
        MathUtils.checkFinite(FastMath.PI);
    }
    
    @Test
    public void testHashDouble() {
        double value = 3.14;
        int expectedHashCode = new Double(value).hashCode();
        assertEquals(expectedHashCode, MathUtils.hash(value));
    }

    @Test
    public void testCopySignByte() {
        byte magnitude = -5;
        byte sign = 7;
        
        try {
            assertEquals((byte) 5, MathUtils.copySign(magnitude, sign));
        } catch (MathArithmeticException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

}