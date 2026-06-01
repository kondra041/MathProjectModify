package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testCopySign() {
        short magnitude = 127;
        short sign = -1;
        short expectedResult = -127;

        short result = MathUtils.copySign(magnitude, sign);

        assertEquals(expectedResult, result);
    }
}