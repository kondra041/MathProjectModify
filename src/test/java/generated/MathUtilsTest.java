package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @Test
    public void testHash() {
        double[] array = {1.0, 2.0, 3.0};
        int hashValue = MathUtils.hash(array);
        assertEquals(0, hashValue);
    }

    @Test
    public void testHashNull() {
        assertThrows(NumericException.class, () -> MathUtils.hash(null));
    }

    @Test
    public void testNormalizeAngle() {
        double angle = 10.0;
        double center = 2 * Math.PI;
        double normalizedAngle = MathUtils.normalizeAngle(angle, center);
        assertEquals(0, normalizedAngle);
    }
}