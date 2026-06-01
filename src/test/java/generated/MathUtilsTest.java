package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.math3.util.MathArithmeticException;
import org.apache.commons.math3.util.LocalizedFormats;
import org.apache.commons.math3.util.MathUtils;

public class MathUtilsTest {

    @org.junit.jupiter.api.Test
    public void testCopySign() {
        // Test normal cases
        assertEquals(1, MathUtils.copySign(-1, 1));
        assertEquals(-1, MathUtils.copySign(1, -1));

        // Test boundary case where magnitude is Integer.MIN_VALUE and sign >= 0
        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(Integer.MIN_VALUE, 1);
        });

        // Test other cases
        assertEquals(2147483647, MathUtils.copySign(-2147483647, -1));
    }
}