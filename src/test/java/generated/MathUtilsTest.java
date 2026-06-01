package generated;

import org.apache.commons.math3.util.MathUtils;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @org.junit.jupiter.api.Test
    public void testHashDouble() {
        assertEquals(new Double(MathUtils.PI).hashCode(), MathUtils.hash(MathUtils.PI));
    }

    @org.junit.jupiter.api.Test
    public void testNormalizeAngle() {
        assertEquals(MathUtils.TWO_PI, MathUtils.normalizeAngle(MathUtils.TWO_PI, MathUtils.PI));
    }

    @org.junit.jupiter.api.Test
    public void testCopySign() throws Exception {
        assertEquals(MathUtils.TWO_PI, MathUtils.copySign(MathUtils.TWO_PI, MathUtils.PI));
    }

    @org.junit.jupiter.api.Test
    public void testCheckFinite() throws Exception {
        MathUtils.checkFinite(MathUtils.PI);
    }

    @org.junit.jupiter.api.Test
    public void testNotNull() throws Exception {
        MathUtils.checkArgument(true, "test");
    }
}