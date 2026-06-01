package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MathUtilsTest {

    @Test
    public void testNormalizeAngle() {
        // Test for normalization of angle between 0 and 2*PI
        assertEquals(Math.PI, MathUtils.normalizeAngle(Math.PI, 0.0), 1e-15);
        assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, 0.0), 1e-15);
        assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, 0.0), 1e-15);

        // Test for normalization of angle between -PI and PI
        assertEquals(Math.PI, MathUtils.normalizeAngle(-Math.PI, 0.0), 1e-15);
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 1e-15);
        assertEquals(-Math.PI, MathUtils.normalizeAngle(-2 * Math.PI, 0.0), 1e-15);

        // Test for normalization of angle around a center value
        assertEquals(Math.PI / 2, MathUtils.normalizeAngle(Math.PI / 2, Math.PI), 1e-15);
        assertEquals(-Math.PI / 2, MathUtils.normalizeAngle(-Math.PI / 2, -Math.PI), 1e-15);
    }
}