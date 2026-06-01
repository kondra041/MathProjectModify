package generated;

import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTest {

    @Test
    void testCopySign() {
        // Normal cases
        assertEquals(5, MathUtils.copySign(5, 1));
        assertEquals(-5, MathUtils.copySign(5, -1));
        
        // Edge case where magnitude is Integer.MIN_VALUE and sign >= 0
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Integer.MIN_VALUE, 1));
        
        // Other edge cases
        assertEquals(-Integer.MIN_VALUE, MathUtils.copySign(Integer.MIN_VALUE, -1));
    }
}