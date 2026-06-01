import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testHash() {
        double[] value = new double[]{1, 2, 3};
        int expected = Arrays.hashCode(value);
        int actual = MathUtils.hash(value);

        assertEquals(expected, actual);
    }
}