package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void testCopySign() {
        assertEquals(1L, MathUtils.copySign(1L, 1L));
        assertEquals(-1L, MathUtils.copySign(1L, -1L));
        assertEquals(1L, MathUtils.copySign(-1L, 1L));
        assertEquals(-1L, MathUtils.copySign(-1L, -1L));

        assertEquals(Long.MIN_VALUE, MathUtils.copySign(Long.MIN_VALUE, 1L));
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Long.MIN_VALUE, -1L));
    }
}