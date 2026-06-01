package generated;

import <org.apache.commons.math3.util.MathUtils>;
import <org.apache.commons.math3.exception.MathArithmeticException>;
import <org.apache.commons.math3.exception.NotFiniteNumberException>;
import <org.apache.commons.math3.exception.NullArgumentException>;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MathUtilsTest {

    @Test
    public void testNormalizeAngle() {
        double a = 10.0;
        double center = MathUtils.PI;

        double expectedResult = (a - 2 * MathUtils.TWO_PI * FastMath.floor((a + MathUtils.PI - center) / MathUtils.TWO_PI));

        MathUtils mathUtilsMock = mock(MathUtils.class);
        when(mathUtilsMock.TWO_PI).thenReturn(2.0);

        double actualResult = MathUtils.normalizeAngle(a, center);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNormalizeAngle2() {
        double a = 10.0;
        double center = -MathUtils.PI;

        double expectedResult = (a - 2 * MathUtils.TWO_PI * FastMath.floor((a + MathUtils.PI - center) / MathUtils.TWO_PI));

        MathUtils mathUtilsMock = mock(MathUtils.class);
        when(mathUtilsMock.TWO_PI).thenReturn(2.0);

        double actualResult = MathUtils.normalizeAngle(a, center);

        assertEquals(expectedResult, actualResult);
    }
}