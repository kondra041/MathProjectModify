package generated;

import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.FastMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testNormalizeAngle() {
        // Test normalizing an angle between 0 and 2π
        assertEquals(MathUtils.normalizeAngle(3 * FastMath.PI, FastMath.PI), FastMath.PI, 1e-15);

        // Test normalizing an angle between -π and +π
        assertEquals(MathUtils.normalizeAngle(-FastMath.PI / 2, 0.0), -FastMath.PI / 2, 1e-15);

        // Test computing the angle between two defining angular positions
        double start = FastMath.PI / 4;
        double end = 3 * FastMath.PI / 4;
        assertEquals(MathUtils.normalizeAngle(end, start) - start, FastMath.PI / 2, 1e-15);
    }
}