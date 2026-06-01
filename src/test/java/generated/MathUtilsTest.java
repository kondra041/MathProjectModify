package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class MathUtilsTest {

    @Test
    public void testHashWithNullArray() {
        int hash = MathUtils.hash(null);
        assertEquals(0, hash);
    }

    @Test
    public void testHashWithEmptyArray() {
        int hash = MathUtils.hash(new double[0]);
        assertEquals(Arrays.hashCode(new double[0]), hash);
    }

    @Test
    public void testHashWithSingleElementArray() {
        int hash = MathUtils.hash(new double[]{3.14});
        assertEquals(Arrays.hashCode(new double[]{3.14}), hash);
    }

    @Test
    public void testHashWithMultipleElementsArray() {
        int hash = MathUtils.hash(new double[]{1.0, 2.0, 3.0});
        assertEquals(Arrays.hashCode(new double[]{1.0, 2.0, 3.0}), hash);
    }
}