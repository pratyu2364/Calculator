package calculator;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculator {
   public static double num1;
   public static double num2;
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        do {
            int choice;
            System.out.println("Enter your choice");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
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

                default:
                    System.out.println("Exiting Program...");
                    return;
            }

        } while (true);

    }
    public double add (double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
    public double sub (double num1, double num2) {
        double result = num1 - num2;
        return result;
    }
}