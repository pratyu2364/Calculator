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
    @Test
    public void subtractionTruePositive() {
        assertEquals("Subtracting two numbers for True Positive", -3.0, calculator.sub(1.50, 4.50), DELTA);
        assertEquals("Subtracting two numbers for True Positive", 6.0, calculator.sub(9.0, 3.0), DELTA);
    }

    @Test
    public void subtractionFalsePositive() {
        assertNotEquals("Subtracting two numbers for False Positive", 69, calculator.sub(2.3221, 4), DELTA);
        assertNotEquals("Subtracting two numbers for False Positive", 1245.672, calculator.sub(9, 3), DELTA);
    }
    @Test
    public void multiplicationTruePositive() {
        assertEquals("Multiplying two numbers for True Positive", 21.0, calculator.mul(3.0, 7.0), DELTA);
        assertEquals("Multiplying two numbers for True Positive", 4.0, calculator.mul(2.0, 2.0), DELTA);
    }

    @Test
    public void multiplicationFalsePositive() {
        assertNotEquals("Multiplying two numbers for False Positive", 69, calculator.mul(2.3221, 4), DELTA);
        assertNotEquals("Multiplying two numbers for False Positive", 1245.672, calculator.mul(9, 3), DELTA);
    }
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 720, calculator.factorial(6), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 2, calculator.factorial(2), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.factorial(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.factorial(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 1, calculator.factorial(0), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 113, calculator.factorial(7), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 100, calculator.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 422, calculator.factorial(4), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 19, calculator.factorial(1), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 12, calculator.factorial(0), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, calculator.power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 1, calculator.power(1, 3), DELTA);
        assertEquals("Finding power for True Positive", 81, calculator.power(3, 4), DELTA);
        assertEquals("Finding power for True Positive", 64, calculator.power(4, 3), DELTA);
        assertEquals("Finding power for True Positive", 25, calculator.power(5, 2), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calculator.power(2, 1), DELTA);
        assertNotEquals("Finding power for False Positive", -7, calculator.power(3, 4), DELTA);
        assertNotEquals("Finding power for False Positive", 990, calculator.power(4, 3), DELTA);
        assertNotEquals("Finding power for False Positive", -12, calculator.power(5, 2), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);

    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 60, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 4.7, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding square root for True Positive", 4, calculator.squareRoot(16), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.squareRoot(1), DELTA);
        assertEquals("Finding square root for True Positive", 9, calculator.squareRoot(81), DELTA);
        assertEquals("Finding square root for True Positive", 6, calculator.squareRoot(36), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.squareRoot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 3, calculator.squareRoot(4), DELTA);
        assertNotEquals("Finding square root for False Positive", 4, calculator.squareRoot(81), DELTA);
        assertNotEquals("Finding square root for False Positive", 2, calculator.squareRoot(36), DELTA);

    }
}