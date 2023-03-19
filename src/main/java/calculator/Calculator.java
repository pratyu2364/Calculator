package calculator;
import java.util.Scanner;
import java.util.InputMismatchException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
   public static double num1;
   public static double num2;
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        do {
            int choice;
            System.out.println("Enter your choice");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Factorial");
            System.out.println("5. Power");
            System.out.println("6. Square root");
            System.out.println("7. Log base e");
            System.out.println("8. Quit");
            System.out.print("Choice: ");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter number 1: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter number 2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.add(num1, num2) + "\n");
                    break;
                case 2:
                    System.out.println("Enter number 1: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter number 2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.sub(num1, num2) + "\n");
                    break;
                case 3:
                    System.out.println("Enter number 1: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter number 2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.mul(num1, num2) + "\n");
                    break;
                case 4:
                    System.out.println("Enter number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.factorial(num1)+ "\n");
                    break;
                case 5:
                    System.out.println("Enter number base: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.power(num1,num2)+ "\n");
                    break;
                case 6:
                    System.out.println("Enter number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.squareRoot(num1)+ "\n");
                    break;
                case 7:
                    System.out.println("Enter number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.naturalLog(num1)+ "\n");
                    break;
                case 8:
                    System.out.println("Exiting Program...");
                    return;
            }

        } while (true);

    }
    public double add (double num1, double num2) {
        logger.info("[ADD] - " + num1 +" "+num2);
        double result = num1 + num2;
        logger.info("[RESULT - ADD] - " + result);
        return result;
    }
    public double sub (double num1, double num2) {
        logger.info("[SUB] - " + num1 +" "+num2);
        double result = num1 - num2;
        logger.info("[RESULT - SUB] - " + result);
        return result;
    }
    public double mul(double num1, double num2){
        logger.info("[MUL] - " + num1 +" "+num2);
        double result = num1 * num2;
        logger.info("[RESULT - MUL] - " + result);
        return result;
    }
    public double squareRoot(double num1){
        logger.info("[SQ ROOT] - " + num1);
        double result = Math.sqrt(num1);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }
    public double power(double num1, double num2) {
        logger.info("[POWER - " + num1 + " RAISED TO] " + num2);
        double result = Math.pow(num1,num2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }
    public double naturalLog(double num1) {
        logger.info("[NATURAL LOG] - " + num1);
        double result = 0;
        try {

            if (num1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(num1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
    public double factorial(double num1) {
        logger.info("[FACTORIAL] - " + num1);
        double result = 1;
        for(int i = 1; i <= num1; ++i) { result *= i;   }
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }


}