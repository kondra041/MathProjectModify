package generated;

import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testCopySign() throws Exception {
        assertEquals(10, MathUtils.copySign(10, 20));
        assertEquals(-10, MathUtils.copySign(10, -20));
        assertEquals(10, MathUtils.copySign(-10, 20));
        assertEquals(-10, MathUtils.copySign(-10, -20));

        assertThrows(Exception.class, () -> MathUtils.copySign(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testCheckFinite() {
        assertDoesNotThrow(() -> MathUtils.checkFinite(10.0));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.POSITIVE_INFINITY));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NEGATIVE_INFINITY));
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NaN));
    }
}