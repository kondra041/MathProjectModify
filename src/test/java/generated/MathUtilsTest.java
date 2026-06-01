package generated;

import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NullArgumentException;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.Short;

public class MathUtilsTest {

    @Test
    public void testCopySignWithPositiveMagnitudeAndNegativeSign() {
        short magnitude = 10;
        short sign = -1;
        short result = MathUtils.copySign(magnitude, sign);
        assertEquals(-10, result);
    }

    @Test
    public void testCopySignWithNegativeMagnitudeAndPositiveSign() {
        short magnitude = -10;
        short sign = 1;
        short result = MathUtils.copySign(magnitude, sign);
        assertEquals(10, result);
    }

    @Test
    public void testCopySignWithZeroMagnitude() {
        short magnitude = 0;
        short sign = 1;
        short result = MathUtils.copySign(magnitude, sign);
        assertEquals(0, result);
    }

    @Test(expected = NotFiniteNumberException.class)
    public void testCopySignWithNegativeOverflow() throws NotFiniteNumberException {
        short magnitude = Short.MIN_VALUE;
        short sign = 1;
        MathUtils.copySign(magnitude, sign);
    }
}