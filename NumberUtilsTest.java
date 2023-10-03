import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsTest {

		// тесты для evenOddNumber
		
    @Test
    public void testPositiveEvenNumber() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.evenOddNumber(10);
        assertTrue(result);
    }

    @Test
    public void testPositiveOddNumber() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.evenOddNumber(13);
        assertFalse(result);
    }

    @Test
    public void testZero() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.evenOddNumber(0);
        assertTrue(result);
    }

    @Test
    public void testNegativeEvenNumber() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.evenOddNumber(-8);
        assertTrue(result);
    }

    @Test
    public void testNegativeOddNumber() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.evenOddNumber(-5);
        assertFalse(result);
    }
    
		// тесты для numberInInterval
    
    @Test
    public void testNumberEqualToLowerBoundary() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.numberInInterval(25);
        assertFalse(result);
    }

    @Test
    public void testNumberEqualToUpperBoundary() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.numberInInterval(100);
        assertFalse(result);
    }

    @Test
    public void testNegativeNumberInInterval() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.numberInInterval(-50);
        assertFalse(result);
    }

    @Test
    public void testNegativeNumberBelowRange() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.numberInInterval(-100);
        assertFalse(result);
    }

    @Test
    public void testNegativeNumberAboveRange() {
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.numberInInterval(-10);
        assertFalse(result);
    }
}