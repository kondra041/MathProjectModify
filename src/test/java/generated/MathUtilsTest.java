import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.math3.util.MathUtils;

class MathUtilsTest {

    @org.junit.jupiter.api.Test
    void hash_double() {
        // Test with zero
        assertEquals(0, MathUtils.hash(0.0));
        
        // Test with positive number
        assertEquals(Double.hashCode(1.0), MathUtils.hash(1.0));
        
        // Test with negative number
        assertEquals(Double.hashCode(-1.0), MathUtils.hash(-1.0));
        
        // Test with NaN
        assertNotEquals(MathUtils.hash(Double.NaN), MathUtils.hash(0.0));
        
        // Test with positive infinity
        assertEquals(Double.hashCode(Double.POSITIVE_INFINITY), MathUtils.hash(Double.POSITIVE_INFINITY));
        
        // Test with negative infinity
        assertEquals(Double.hashCode(Double.NEGATIVE_INFINITY), MathUtils.hash(Double.NEGATIVE_INFINITY));
    }
}