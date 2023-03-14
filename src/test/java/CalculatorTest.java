import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void additionTruePositive() {
        assertEquals("Adding two numbers for True Positive", 6.0, calculator.add(1.50, 4.50), DELTA);
        assertEquals("Adding two numbers for True Positive", 12.45672, calculator.add(9, 3.45672), DELTA);
    }

    @Test
    public void additionFalsePositive() {
        assertNotEquals("Adding two numbers for False Positive", 69, calculator.add(2.3221, 4), DELTA);
        assertNotEquals("Adding two numbers for False Positive", 1245.672, calculator.add(9, 3), DELTA);
    }
}