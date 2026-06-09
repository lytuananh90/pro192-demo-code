import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Demo Set -----");

        // create 5 students
        Student studentOne = new Student("SE001", "Nguyen Van A", 3.5);
        Student studentTwo = new Student("SE002", "Tran Van B", 3.0);
        Student studentThree = new Student("SE003", "Le Thi C", 3.8);
        Student studentFour = new Student("SE004", "Pham Van D", 3.2);
        Student studentFive = new Student("SE005", "Hoang Thi E", 3.6);
        Student studentSix = new Student("SE006", "Nguyen Van F", 3.5); // duplicate student gpa

        // create a HashSet to store students
        /**
         * HashSet is a collection class in Java that implements the Set interface
         * and uses a hash table for storage.
         * It does not allow duplicate elements and does not maintain any order of the elements.
         * 
         */
        HashSet<Student> hashSetOfStudents = new HashSet<>(); // solution 1: using HashSet
        Set<Student> studentSet = new HashSet<>();// solution 2: using Set interface with HashSet implementation
        // add students to the set
        studentSet.add(studentOne);
        studentSet.add(studentTwo);
        studentSet.add(studentThree);
        studentSet.add(studentFour);
        studentSet.add(studentFive);
        studentSet.add(studentSix);

        // print the students in the set by for each loop
        System.out.println("Students in the set:");
        for (Student student : studentSet) {
            /**
             * studentSet is a Set of Student objects,
             * and we are iterating through each Student object in the set using a for-each loop.
             * 
             * student is a variable that represents the current Student object in the iteration.`
             */
            System.out.println(student.toString());
        }

        System.out.println("---- Demo TreeSet -----");

        /**
         * TreeSet is a sorted set implementation in Java that stores elements 
         * in a sorted order based on their natural ordering or a specified comparator.
         * 
         */
        // create a TreeSet to store students
        TreeSet<Student> treeSetOfStudents = new TreeSet<>(); // solution 1: using TreeSet
        Set<Student> studentTreeSet = new TreeSet<>(); // solution 2: using Set interface with TreeSet implementation

        // demo comptareTo method of Student class
        int compareResult = studentOne.compareTo(studentTwo);
        System.out.println("Comparing result: " + compareResult);
        if (compareResult < 0) {
            System.out.println(studentOne.getName() + " has a lower GPA than " + studentTwo.getName());
        } else if (compareResult > 0) {
            System.out.println(studentOne.getName() + " has a higher GPA than " + studentTwo.getName());
        } else {
            System.out.println(studentOne.getName() + " has the same GPA as " + studentTwo.getName());
        }

        // compare studentOne and studentThree
        int compareResult2 = studentOne.compareTo(studentThree);
        System.out.println("Comparing result: " + compareResult2);
        if (compareResult2 < 0) {
            System.out.println(studentOne.getName() + " has a lower GPA than " + studentThree.getName());
        } else if (compareResult2 > 0) {
            System.out.println(studentOne.getName() + " has a higher GPA than " + studentThree.getName());
        } else {
            System.out.println(studentOne.getName() + " has the same GPA as " + studentThree.getName());
        }

        // compare studentOne and studentSix
        int compareResult3 = studentOne.compareTo(studentSix);
        System.out.println("Comparing result: " + compareResult3);
        // since studentOne and studentSix have the same gpa, the compareTo method will compare by id
        if (compareResult3 < 0) {
            System.out.println(studentOne.getName() + " < " + studentSix.getName());
        } else if (compareResult3 > 0) {
            System.out.println(studentOne.getName() + " > " + studentSix.getName());
        } else {
            System.out.println(studentOne.getName() + " = " + studentSix.getName());
        }

        // add students to the tree set
        studentTreeSet.add(studentOne);
        studentTreeSet.add(studentTwo);
        studentTreeSet.add(studentThree);
        studentTreeSet.add(studentFour);
        studentTreeSet.add(studentFive);
        studentTreeSet.add(studentSix);

        // print the students in the tree set by for each loop
        System.out.println("Students in the tree set:");
        for (Student student : studentTreeSet) {
            System.out.println(student.toString());
        }
        

    }

    
}
