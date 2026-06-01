package generated;

import org.apache.commons.math3.util.MathUtils;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @org.junit.jupiter.api.Test
    public void testCopySign() throws Exception {
        assertEquals(MathUtils.copySign(Integer.MIN_VALUE, -1), Integer.MAX_VALUE);
        assertEquals(MathUtils.copySign(Integer.MIN_VALUE, 1), Integer.MIN_VALUE);
        assertEquals(MathUtils.copySign(Integer.MAX_VALUE, -1), Integer.MIN_VALUE);
        assertEquals(MathUtils.copySign(Integer.MAX_VALUE, 1), Integer.MAX_VALUE);
    }
}