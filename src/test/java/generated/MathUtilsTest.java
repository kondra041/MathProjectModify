package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MathUtilsTest {

    @Test
    public void testCopySignLong() {
        long magnitude = 10L;
        long sign = 1L;

        long result = MathUtils.copySign(magnitude, sign);
        assertEquals(magnitude, result);

        magnitude = -10L;
        sign = -1L;

        result = MathUtils.copySign(magnitude, sign);
        assertEquals(magnitude, result);

        magnitude = Long.MIN_VALUE;
        sign = 1L;

        try {
            result = MathUtils.copySign(magnitude, sign);
            fail("Expected exception not thrown");
        } catch (MathArithmeticException e) {}

        magnitude = Long.MAX_VALUE;
        sign = -1L;

        result = MathUtils.copySign(magnitude, sign);
        assertEquals(-magnitude, result);
    }

    @Test
    public void testCopySignLongOverflow() {
        long magnitude = Long.MIN_VALUE;
        long sign = 0L;

        try {
            MathUtils.copySign(magnitude, sign);
            fail("Expected exception not thrown");
        } catch (MathArithmeticException e) {}
    }
}