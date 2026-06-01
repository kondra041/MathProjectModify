package generated;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.util.LocalizedFormats;
import org.apache.commons.math3.util.MathUtils;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    @org.junit.jupiter.api.Test
    public void testCopySign() throws MathArithmeticException {
        assertEquals(10, MathUtils.copySign((byte) 10, (byte) 20));
        assertEquals(-10, MathUtils.copySign((byte) 10, (byte) -20));
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign((byte) Byte.MIN_VALUE, (byte) 1));
    }
}