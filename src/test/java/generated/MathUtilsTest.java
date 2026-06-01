package generated;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTests {

    @Test
    void testNullArgumentException() {
        MathUtils.checkNotNull(null, "test");
    }

    @Test
    void testNotFiniteNumberException() {
        assertThrows(NotFiniteNumberException.class, () -> MathUtils.checkFinite(Double.NaN));
    }
}