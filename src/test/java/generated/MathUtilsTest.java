package generated;

import org.apache.commons.math3.util.MathUtils;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MathUtilsTest {

    @org.junit.jupiter.api.Test
    public void testHashDouble() {
        double value = 123.456;
        int expectedHashCode = new Double(value).hashCode();
        assertEquals(expectedHashCode, MathUtils.hash(value));
    }

}