import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Demo ArrayList ---");
        // create 5 students
        Student studentOne = new Student("SE001", "Nguyen Van A", 3.5);
        Student studentTwo = new Student("SE002", "Tran Van B", 3.0);
        Student studentThree = new Student("SE003", "Le Thi C", 3.8);
        Student studentFour = new Student("SE004", "Pham Van D", 3.2);
        Student studentFive = new Student("SE005", "Hoang Thi E", 3.6);

        // create an ArrayList to store students
        // Solution 1: using ArrayList type
        ArrayList<Student> studentsList = new ArrayList<Student>(); //
        /*
         * <Student> is the type of elements in the ArrayList,
         * and it ensures that only Student objects can be added to the list.
         */

        // Solution 2: using List interface
        List<Student> listOfStudents = new ArrayList<Student>();
        /**
         * We can declare the variable as List<Student> instead of ArrayList<Student> 
         * because List is an interface that ArrayList implements. 
         * This allows for more flexibility in the future 
         * if we decide to change the implementation of the list 
         * (e.g., to LinkedList) without changing the variable type.
         */

        /**
         * add students to the list using the add() method, 
         * which is defined in the List interface and implemented by ArrayList.
         */

        listOfStudents.add(studentThree);
        listOfStudents.add(studentOne);
        listOfStudents.add(studentTwo);
        listOfStudents.add(studentFour);
        listOfStudents.add(studentFive);

        /**
         *  get the size of the list using the size() method,
         *  which returns the number of elements in the list.
         */
        int sizeOfList = listOfStudents.size();
        System.out.println("Size of the list: " + sizeOfList);

        /**
         *  access elements in the list using the get() method, 
         *  which takes an index as a parameter and returns the element at that index.
         *  The index is zero-based, meaning the first element is at index 0.
         */
        Student firstStudent = listOfStudents.get(0);
        System.out.println("First student: " + firstStudent.getGpa());

        /**
         * using  a loop to iterate through the list and print each student's information.
         */
        for(int i = 0; i < listOfStudents.size(); i++) { // listOfStudents.size() returns the number of students in the list, and we loop from 0 to size-1
            Student student = listOfStudents.get(i); // get the student at index i
            System.out.println(student.toString());// print the student's information using the toString() method
        }

        /**
         * Demo vector,
         * Vector is a synchronized version of ArrayList, 
         * which means it is thread-safe and can be used in multi-threaded environments.
         */
        System.out.println("--- Demo Vector ---");
        Vector<Student> studentVector = new Vector<Student>();
        List<Student> vectorOfStudents = new Vector<>(); // using List interface with Vector implementation

        vectorOfStudents.add(studentOne);
        vectorOfStudents.add(studentTwo);
        vectorOfStudents.add(studentThree);

        for(int i = 0; i < vectorOfStudents.size(); i++) {
            Student student = vectorOfStudents.get(i);
            System.out.println(student.toString());
        }


    }
}
