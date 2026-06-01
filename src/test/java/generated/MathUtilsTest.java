package generated;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.exception.NotFiniteNumberException;

public class MathUtilsTest {

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(Math.PI, 0.0));
        assertEquals(Math.PI, MathUtils.normalizeAngle(-Math.PI, 0.0));
        assertEquals(Math.PI - 1e-10, MathUtils.normalizeAngle(Math.PI + 1e-10, 0.0), 1e-12);
    }

    @Test
    public void testNormalizeAngleWithCenter() {
        assertEquals(Math.PI / 2, MathUtils.normalizeAngle(Math.PI / 4, Math.PI));
        assertEquals(-Math.PI / 2, MathUtils.normalizeAngle(-Math.PI / 4, Math.PI));
        assertEquals(Math.PI - 1e-10, MathUtils.normalizeAngle(Math.PI + 1e-10, Math.PI), 1e-12);
    }

    @Test
    public void testNormalizeAngleWithNegativeCenter() {
        assertEquals(3 * Math.PI / 4, MathUtils.normalizeAngle(Math.PI / 4, -Math.PI));
        assertEquals(-3 * Math.PI / 4, MathUtils.normalizeAngle(-Math.PI / 4, -Math.PI));
        assertEquals(3 * Math.PI - 1e-10, MathUtils.normalizeAngle(3 * Math.PI + 1e-10, -Math.PI), 1e-12);
    }

    @Test
    public void testNormalizeAngleWithNaN() {
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.normalizeAngle(Double.NaN, 0.0));
    }
}