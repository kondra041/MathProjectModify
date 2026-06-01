package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    public void testHashDouble() {
        double value = 123.456;
        int expectedHashCode = new Double(value).hashCode();
        int actualHashCode = MathUtils.hash(value);
        assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testHashDoubleArray() {
        double[] array = {1.0, 2.0, 3.0};
        int expectedHashCode = java.util.Arrays.hashCode(array);
        int actualHashCode = MathUtils.hash(array);
        assertEquals(expectedHashCode, actualHashCode);
    }
}