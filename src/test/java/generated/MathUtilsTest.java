package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    public void testCopySignShort() {
        short magnitude = 10;
        short sign = -1;
        assertEquals(-10, MathUtils.copySign(magnitude, sign));
    }

    @Test
    public void testCopySignShortMinValuePositive() {
        short magnitude = Short.MIN_VALUE;
        short sign = 1;
        try {
            MathUtils.copySign(magnitude, sign);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {}
    }

    @Test
    public void testCopySignShortMinValueNegative() {
        short magnitude = Short.MIN_VALUE;
        short sign = -1;
        assertEquals(Short.MAX_VALUE, MathUtils.copySign(magnitude, sign));
    }
}