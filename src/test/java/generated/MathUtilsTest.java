import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.math3.util.MathUtils;

public class MathUtilsTest {

    @Test
    public void copySign_MagnitudePositive_SignPositive_ReturnsMagnitude() {
        assertEquals(5, MathUtils.copySign((byte) 5, (byte) 3));
    }

    @Test
    public void copySign_MagnitudeNegative_SignPositive_ReturnsPositive() {
        assertEquals(5, MathUtils.copySign((byte) -5, (byte) 3));
    }

    @Test
    public void copySign_MagnitudePositive_SignNegative_ReturnsNegative() {
        assertEquals(-5, MathUtils.copySign((byte) 5, (byte) -3));
    }

    @Test
    public void copySign_MagnitudeNegative_SignNegative_ReturnsMagnitude() {
        assertEquals(-5, MathUtils.copySign((byte) -5, (byte) -3));
    }

    @Test
    public void copySign_MinValueWithPositiveSign_ThrowsException() {
        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(Byte.MIN_VALUE, (byte) 1);
        });
    }

    @Test
    public void copySign_MinValueWithNegativeSign_ReturnsMaxNegative() {
        assertEquals((byte) 127, MathUtils.copySign(Byte.MIN_VALUE, (byte) -1));
    }
}