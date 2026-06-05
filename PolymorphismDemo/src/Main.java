public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Demo Polymorphism ---");
        // create a person object
        Person person = new Person("PS001", "Alice");
        System.out.println(person.toString());
        person.registerAccount();
        person.registerAccount("Tp Thu Duc");

        // create a student object
        Student student = new Student("PS002", "Bob", "S001", 3.5);
        System.out.println(student.toString());
        student.registerAccount(); // this will call the overridden method in Student class
    }
}

