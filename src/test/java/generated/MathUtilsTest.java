package generated;

import org.apache.commons.math3.util.MathUtils;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsCopySignTest {

    @org.junit.jupiter.api.Test
    void copySignBothPositive() {
        int result = MathUtils.copySign(5, 3);
        assertEquals(5, result);
    }

    @org.junit.jupiter.api.Test
    void copySignBothNegative() {
        int result = MathUtils.copySign(-5, -3);
        assertEquals(-5, result);
    }

    @org.junit.jupiter.api.Test
    void copySignMagnitudePositiveSignNegative() {
        int result = MathUtils.copySign(5, -3);
        assertEquals(-5, result);
    }

    @org.junit.jupiter.api.Test
    void copySignMagnitudeNegativeSignPositive() {
        int result = MathUtils.copySign(-5, 3);
        assertEquals(5, result);
    }

    @org.junit.jupiter.api.Test
    void copySignEdgeCaseMinValueWithPositiveSign() {
        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(Integer.MIN_VALUE, 1);
        });
    }
}