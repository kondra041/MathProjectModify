package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MathUtilsTest {

    @Test
    public void testCopySign_long() {
        long magnitude = 10L;
        long sign = -2L;

        assertEquals(magnitude, MathUtils.copySign(magnitude, sign));
    }
}