package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void testHash() {
        // Test with null input
        assertEquals(0, MathUtils.hash(null));

        double[] array = {1.5, 2.5};
        int expectedHashCode = Arrays.hashCode(array);
        assertEquals(expectedHashCode, MathUtils.hash(array));
    }
}