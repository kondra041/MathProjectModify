package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MathUtilsTest {

    @Test
    public void testHash() {
        double[] values = new double[]{1.0, 2.0, 3.0};
        int expected = Arrays.hashCode(values);
        int actual = MathUtils.hash(values);
        assertEquals(expected, actual);
    }

}