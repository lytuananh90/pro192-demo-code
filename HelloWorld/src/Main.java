import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a and b: ");
        if (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            if (scanner.hasNextDouble()) {
                double b = scanner.nextDouble();
                if (a == 0) {
                    if (b == 0) {
                        System.out.println("Infinite solutions");
                    } else {
                        System.out.println("No solution");
                    }
                } else {
                    double x = -b / a;
                    System.out.println("x = " + x);
                }
            } else {
                System.out.println("Missing value for b");
            }
        } else {
            System.out.println("Missing value for a");
        }
        scanner.close();
    }
}
