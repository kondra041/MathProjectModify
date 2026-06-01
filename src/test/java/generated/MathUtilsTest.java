package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MathUtilsTest {
    @Test
    public void testCopySign() {
        short magnitude = 123;
        short sign = -456;
        assertEquals(MathUtils.copySign(magnitude, sign), (short) -magnitude);
    }
}