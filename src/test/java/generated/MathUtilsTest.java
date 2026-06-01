package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MathUtilsTest {
    @Test
    public void testCopySign() {
        int magnitude = 10;
        int sign = -1;
        assertEquals(10, MathUtils.copySign(magnitude, sign));
    }
}