package generated;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.LocalizedFormats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testCopySign_PositiveMagnitudeAndSign() throws MathArithmeticException {
        long magnitude = 12345L;
        long sign = 67890L;
        assertEquals(magnitude, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySign_NegativeMagnitudeAndSign() throws MathArithmeticException {
        long magnitude = -12345L;
        long sign = -67890L;
        assertEquals(magnitude, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySign_MismatchedSigns() throws MathArithmeticException {
        long magnitude = 12345L;
        long sign = -67890L;
        assertEquals(-magnitude, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySign_Overflow() {
        long magnitude = Long.MIN_VALUE;
        long sign = 1L;
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testNormalizeAngle() {
        double a = FastMath.PI / 2;
        double center = FastMath.PI;
        assertEquals(FastMath.PI / 2, MathUtils.normalizeAngle(a, center), 1e-15);
    }
}