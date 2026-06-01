package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.math3.util.MathArithmeticException;
import org.apache.commons.math3.util.LocalizedFormats;
import org.apache.commons.math3.util.MathUtils;

public class MathUtilsTest {

    @org.junit.jupiter.api.Test
    public void testCopySignShort() {
        // Positive magnitude and positive sign
        assertEquals((short) 5, MathUtils.copySign((short) 5, (short) 1));
        
        // Negative magnitude and negative sign
        assertEquals((short) -5, MathUtils.copySign((short) 5, (short) -1));

        // Positive magnitude and negative sign
        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign(Short.MIN_VALUE, (short) -1);
        });

        // Negative magnitude and positive sign
        assertThrows(MathArithmeticException.class, () -> {
            MathUtils.copySign((short) -32768, (short) 1);
        });
    }
}