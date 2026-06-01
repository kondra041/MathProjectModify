package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.math3.util.MathUtils;

public class MathUtilsTest {

    @org.junit.jupiter.api.Test
    public void testHash() {
        double[] doubleArray = {1.2345, 6.7890};
        assertEquals(MathUtils.hash(doubleArray), Arrays.hashCode(doubleArray));
    }
}