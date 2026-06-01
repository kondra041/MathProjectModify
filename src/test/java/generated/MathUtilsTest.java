package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MathUtilsTest {

    @Test
    public void testHashWithNullArray() {
        int expected = 0; // Arrays.hashCode of null array is 0
        assertEquals(expected, MathUtils.hash((double[]) null));
    }

    @Test
    public void testHashWithEmptyArray() {
        double[] emptyArray = new double[0];
        int expected = Arrays.hashCode(emptyArray); // Expected hash code for an empty array
        assertEquals(expected, MathUtils.hash(emptyArray));
    }

    @Test
    public void testHashWithNonNullArray() {
        double[] array = {1.2, 3.4, -5.6};
        int expected = Arrays.hashCode(array); // Expected hash code for the given array
        assertEquals(expected, MathUtils.hash(array));
    }
}