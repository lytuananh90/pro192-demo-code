import java.util.ArrayList;
import java.util.Comparator;

public class MyArrayList extends ArrayList<Student> {
    /**
     * <Student> is the type parameter for the ArrayList,
     * which means that this MyArrayList will only hold Student objects.
     * 
     * By extending ArrayList<Student>,
     * MyArrayList inherits all the methods of ArrayList, such as add(), get(),
     * size(), etc.,
     * and can also define its own methods specific to handling Student objects.
     */

    // isEmpty method to check if the list is empty
    public boolean isEmpty() {
        return this.size() == 0; // return true if size is 0, false otherwise
    }

    // add student to the list
    public void addStudent(Student newStudent) {
        this.add(newStudent);
    }

    // display all students in the list
    public void display() {
        int size = this.size(); // get the size of the list
        for (int i = 0; i < size; i++) {
            Student student = this.get(i); // get the student at index i
            System.out.println(student.toString()); // print the student
        }
    }

    // get student by id
    public Student getStudentById(String id) {
        int size = this.size(); // get the size of the list
        for (int i = 0; i < size; i++) {
            Student student = this.get(i); // get the student at index i
            /**
             * equal() and equalsIgnoreCase() are methods used to compare strings in Java.
             * equal() is a method that compares two strings for equality, and it is case-sensitive.
             * It returns true if the strings are exactly the same, including case, and false otherwise
             * equalsIgnoreCase() is a method that compares two strings for equality, ignoring case differences.
             * It returns true if the strings are the same, ignoring case, and false otherwise.
             * 
             */
            if (student.getId().equalsIgnoreCase(id)) { // check if the id matches
                return student; // return the student if found
            }
        }
        return null; // return null if not found
    }

    // getAverageGPA method to calculate the average GPA of all students in the list
    public double getAverageGPA() {
        int size = this.size(); // get the size of the list
        if (isEmpty()) { // check if the list is empty
            return 0.0; // return 0.0 if the list is empty
        }
        double totalGPA = 0.0; // initialize total GPA to 0.0
        for (int i = 0; i < size; i++) {
            Student student = this.get(i); // get the student at index i
            totalGPA += student.getGpa(); // add the student's GPA to the total
        }
        return totalGPA / size; // return the average GPA
    }
    // get average GPA of max and min GPA
    public double getAverageGPAOfMaxMin() {
        int size = this.size(); // get the size of the list
        if (isEmpty()) { // check if the list is empty
            return 0.0; // return 0.0 if the list is empty

        }

        double maxGPA = Double.MIN_VALUE; // initialize max GPA to the smallest possible value
        double minGPA = Double.MAX_VALUE; // initialize min GPA to the largest possible value
        for (int i = 0; i < size; i++) {
            Student student = this.get(i); // get the student at index i
            double gpa = student.getGpa(); // get the student's GPA
            if (gpa > maxGPA) { // check if the GPA is greater than the current max GPA
                maxGPA = gpa; // update max GPA
            }
            if (gpa < minGPA) { // check if the GPA is less than the current min GPA
                minGPA = gpa; // update min GPA
            }
        }
        return (maxGPA + minGPA) / 2; // return the average
    }

    // sort by gpa in accending order
    public void sortByGPA() {
        /**
         * Comparator.comparing(Student::getGpa) is a method reference that creates a Comparator
         * for comparing Student objects based on their GPA.
         */
        this.sort(Comparator.comparing(Student::getGpa));
    }

    // sort by gpa in accending order then by name in accending order
    public void sortByGPAThenName() {
        this.sort(Comparator.comparing(Student::getGpa).thenComparing(Student::getName));
    }

    // sort by gpa in descending order
    public void sortByGPADescending() {
        this.sort(Comparator.comparing(Student::getGpa).reversed());
    }
}
