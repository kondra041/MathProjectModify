import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.math3.util.MathUtils;

public class MathUtilsTest {

    @Test
    void testCopySignSameSign() {
        assertEquals((short) 5, MathUtils.copySign((short) 5, (short) 1));
        assertEquals((short) -5, MathUtils.copySign((short) 5, (short) -1));
        assertEquals((short) -5, MathUtils.copySign((short) -5, (short) -1));
        assertEquals((short) 5, MathUtils.copySign((short) -5, (short) 1));
    }

    @Test
    void testCopySignEdgeCase() {
        assertThrows(MathArithmeticException.class, () -> MathUtils.copySign(Short.MIN_VALUE, (short) 1));
    }
}