package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testCopySignLong() {
        assertEquals(1L, MathUtils.copySign(1L, 1L));
        assertEquals(-1L, MathUtils.copySign(1L, -1L));
        assertEquals(-1L, MathUtils.copySign(-1L, 1L));
        assertEquals(1L, MathUtils.copySign(-1L, -1L));

        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Long.MIN_VALUE, 1L));
    }
}