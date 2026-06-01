import org.apache.commons.math3.util.LocalizedFormats;
import org.apache.commons.math3.util.MathArithmeticException;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.NotFiniteNumberException;
import org.apache.commons.math3.util.NullArgumentException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testCopySign() throws MathArithmeticException {
        assertEquals(MathUtils.copySign(10, 1), 10);
        assertEquals(MathUtils.copySign(-10, -1), -10);
        assertEquals(MathUtils.copySign(10, -1), -10);
        assertEquals(MathUtils.copySign(-10, 1), 10);

        assertDoesNotThrow(() -> MathUtils.copySign(Long.MAX_VALUE, 1));
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Long.MIN_VALUE, 1));
    }
}