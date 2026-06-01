package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testHashDoubleArray() {
        double[] array = {1.0, 2.0, 3.0};
        int hash = MathUtils.hash(array);
        assertEquals(Arrays.hashCode(array), hash);

        // Test with null array
        hash = MathUtils.hash(null);
        assertEquals(0, hash);
    }

}