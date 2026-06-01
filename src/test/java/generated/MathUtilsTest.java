package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void testHash() {
        assertEquals(Double.hashCode(1.0), MathUtils.hash(1.0));
        assertEquals(Double.hashCode(-3.14), MathUtils.hash(-3.14));
        assertEquals(Double.hashCode(Math.PI), MathUtils.hash(Math.PI));
    }
}