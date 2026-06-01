package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTest {

    @Test
    void testHashWithPositiveValue() {
        double value = 123.456;
        int expectedHashCode = new Double(value).hashCode();
        assertEquals(expectedHashCode, MathUtils.hash(value));
    }

    @Test
    void testHashWithNegativeValue() {
        double value = -123.456;
        int expectedHashCode = new Double(value).hashCode();
        assertEquals(expectedHashCode, MathUtils.hash(value));
    }

    @Test
    void testHashWithZeroValue() {
        double value = 0.0;
        int expectedHashCode = new Double(value).hashCode();
        assertEquals(expectedHashCode, MathUtils.hash(value));
    }

    @Test
    void testHashWithPiValue() {
        double value = Math.PI;
        int expectedHashCode = new Double(value).hashCode();
        assertEquals(expectedHashCode, MathUtils.hash(value));
    }
}