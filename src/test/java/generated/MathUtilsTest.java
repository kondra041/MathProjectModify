import org.apache.commons.math3.util.MathUtils;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void copySignTest() throws MathArithmeticException {
        assertEquals(MathUtils.copySign((short) 10, (short) 1), (short) 10);
        assertEquals(MathUtils.copySign((short) -10, (short) -1), (short) -10);

        try {
            MathUtils.copySign((short) Short.MIN_VALUE, (short) 1);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // Expected exception
        }
    }
}