package generated;

import org.apache.commons.math3.util.MathUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @org.junit.jupiter.api.Test
    public void testCopySign() throws Exception {
        assertEquals(MathUtils.copySign((byte) 1, (byte) 1), (byte) 1);
        assertEquals(MathUtils.copySign((byte) -1, (byte) -1), (byte) -1);
        assertEquals(MathUtils.copySign((byte) 1, (byte) -1), (byte) -1);
        assertEquals(MathUtils.copySign((byte) -1, (byte) 1), (byte) 1);

        try {
            MathUtils.copySign(Byte.MIN_VALUE, (byte) 1);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // Expected exception
        }
    }
}