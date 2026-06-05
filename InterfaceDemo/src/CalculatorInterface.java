public interface CalculatorInterface {

    /*
     * In an interface,
     * all methods are implicitly public and abstract,
     * so we don't need to specify those modifiers.
     */
    double add(double a, double b); // add 2 numbers

    double subtract(double a, double b); // subtract 2 numbers

    double multiply(double a, double b); // multiply 2 numbers

    double divide(double a, double b); // divide 2 numbers
}
