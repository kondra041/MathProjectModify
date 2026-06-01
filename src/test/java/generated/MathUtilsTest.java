package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void testCopySign() throws Exception {
        assertEquals(1, MathUtils.copySign(1, 1));
        assertEquals(-1, MathUtils.copySign(1, -1));
        assertEquals(Byte.MIN_VALUE, MathUtils.copySign(Byte.MIN_VALUE, 1));
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Byte.MIN_VALUE, -1));
    }
}