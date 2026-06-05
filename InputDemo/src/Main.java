import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // deme scanner input data
        Scanner myScanner = new Scanner(System.in);// scanner object created, to read input from the user
        
        System.out.println("Enter your name: ");
        
        String name = myScanner.nextLine();
        System.out.println("Hello " + name + "!");

        // input age
        System.out.println("Enter your age: ");
        int age = myScanner.nextInt();
        System.out.println("You are " + age + " years old.");
        
    }
}
