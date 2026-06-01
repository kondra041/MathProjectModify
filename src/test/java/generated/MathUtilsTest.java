package generated;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MathUtilsTest {
    private MathUtils mathUtils;
    
    @BeforeEach
    public void setUp() {
        mathUtils = new MathUtils();
    }
    
    @Test
    public void testCopySignByte() {
        byte magnitude = 10;
        byte sign = -5;
        
        assertEquals(mathUtils.copySign(magnitude, sign), -magnitude);
    }
    
    @Test
    public void testCopySignShort() {
        short magnitude = 10;
        short sign = -5;
        
        assertEquals(mathUtils.copySign(magnitude, sign), -magnitude);
    }
    
    @Test
    public void testCopySignInt() {
        int magnitude = 10;
        int sign = -5;
        
        assertEquals(mathUtils.copySign(magnitude, sign), -magnitude);
    }
    
    @Test
    public void testCopySignLong() {
        long magnitude = 10;
        long sign = -5;
        
        assertEquals(mathUtils.copySign(magnitude, sign), -magnitude);
    }
}