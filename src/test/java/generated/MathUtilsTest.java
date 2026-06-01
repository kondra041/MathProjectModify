package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testHashWithNonNullArray() {
        double[] value = {1.0, 2.0, 3.0};
        int expectedHashCode = Arrays.hashCode(value);
        assertEquals(expectedHashCode, MathUtils.hash(value));
    }

    @Test
    public void testHashWithNullArray() {
        assertThrows(NullPointerException.class, () -> {
            MathUtils.hash(null);
        });
    }
}