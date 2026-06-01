package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testHashDouble() {
        double value = 123.456;
        int expectedHashCode = Double.valueOf(value).hashCode();
        assertEquals(expectedHashCode, MathUtils.hash(value));
    }

    @Test
    public void testHashNullDouble() {
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.hash((double[]) null);
        });
    }
}