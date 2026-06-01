package generated;

import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testHashWithNullValue() {
        int hash = MathUtils.hash(null);
        assertEquals(0, hash); // Null should be hashed as 0
    }

    @Test
    public void testHashWithSingleElementArray() {
        double[] value = {1.23};
        int expectedHash = Arrays.hashCode(value);
        int actualHash = MathUtils.hash(value);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    public void testHashWithMultiElementArray() {
        double[] value = {1.23, 4.56, 7.89};
        int expectedHash = Arrays.hashCode(value);
        int actualHash = MathUtils.hash(value);
        assertEquals(expectedHash, actualHash);
    }
}