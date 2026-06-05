import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("---- Interface Demo -  Calculator ----");
        System.out.println("---- My Calculator ----");

        MyCalculator myCalculator = new MyCalculator();
        // enter numbers and perform calculations using MyCalculator
        Scanner myScanner = new Scanner(System.in);
        // enter operation
        System.out.print("Enter operation (+, -, *, /, ^, sqrt): ");
        String operation = myScanner.next();
        switch (operation) {
            case "+":
            // Perform addition
            {
                System.out.print("Enter first number: ");
                double num1 = myScanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = myScanner.nextDouble();
                double result = myCalculator.add(num1, num2);
                System.out.printf("Result: %.2f\n", result);
            }
                break;
            case "-":
            // Perform subtraction
            {
                System.out.print("Enter first number: ");
                double num1 = myScanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = myScanner.nextDouble();
                double result = myCalculator.subtract(num1, num2);
                System.out.printf("Result: %.2f\n", result);
            }
                break;
            case "*":
            // Perform multiplication
            {
                System.out.print("Enter first number: ");
                double num1 = myScanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = myScanner.nextDouble();
                double result = myCalculator.multiply(num1, num2);
                System.out.printf("Result: %.2f\n", result);
            }
                break;
            case "/":
            // Perform division
            {
                System.out.print("Enter first number: ");
                double num1 = myScanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = myScanner.nextDouble();
                double result = myCalculator.divide(num1, num2);
                System.out.printf("Result: %.2f\n", result);
            }
                break;
            case "^":
            // Perform power
            {
                System.out.print("Enter base: ");
                double base = myScanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exponent = myScanner.nextDouble();
                double result = myCalculator.power(base, exponent);
                System.out.printf("Result: %.2f\n", result);
            }
                break;
            case "sqrt":
            // Perform square root
            {
                System.out.print("Enter number: ");
                double num = myScanner.nextDouble();
                double result = myCalculator.squareRoot(num);
                System.out.printf("Result: %.2f\n", result);
            }
                break;
            default:
                System.out.println("Invalid operation!");
        }
        myScanner.close();
    }

}
