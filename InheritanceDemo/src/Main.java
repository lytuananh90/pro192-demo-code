public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("---- Inheritance Demo ----");

        // Create a Person object
        Person person = new Person("P001", "Alice");
        System.out.println("Person: " + person.toString());

        // Create a Student object
        Student student = new Student("P002", "Bob", "SE001", 3.5);
        System.out.println("Student: " + student.toString());


    }
}
