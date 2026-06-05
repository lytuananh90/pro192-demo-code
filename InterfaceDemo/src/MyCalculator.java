public class MyCalculator implements CalculatorInterface, ScienceCaculatorInterface {

    @Override
    public double add(double a, double b) {

        return a + b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return NaN to indicate an invalid result
        }
        return a / b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double power(double base, double exponent) {

        return Math.pow(base, exponent);
    }

    @Override
    public double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Square root of a negative number is not allowed.");
            return Double.NaN; // Return NaN to indicate an invalid result
        }
        return Math.sqrt(a);
    }
}
