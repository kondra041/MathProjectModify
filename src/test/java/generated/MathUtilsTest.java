package generated;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.exception.MathArithmeticException;

public class MathUtilsTest {

    @Test
    void copySign_Positives_ReturnsSame() {
        assertEquals(5L, MathUtils.copySign(5L, 3L));
    }

    @Test
    void copySign_Negatives_ReturnsSame() {
        assertEquals(-5L, MathUtils.copySign(-5L, -3L));
    }

    @Test
    void copySign_PosMagnitude_NegSign_ReturnsNegative() {
        assertEquals(-5L, MathUtils.copySign(5L, -3L));
    }

    @Test
    void copySign_NegMagnitude_PosSign_ReturnsPositive() {
        assertEquals(5L, MathUtils.copySign(-5L, 3L));
    }

    @Test
    void copySign_LongMinValue_PosSign_ThrowsException() {
        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(Long.MIN_VALUE, 1L);
        });
    }
}