public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Demo Custom TreeSet ---");
           // create 5 students
        Student studentOne = new Student("SE001", "Nguyen Van A", 3.5);
        Student studentTwo = new Student("SE002", "Tran Van B", 3.0);
        Student studentThree = new Student("SE003", "Le Thi C", 3.8);
        Student studentFour = new Student("SE004", "Pham Van D", 3.2);
        Student studentFive = new Student("SE005", "Hoang Thi E", 3.6);
        Student studentSix = new Student("SE006", "Nguyen Van F", 3.1); 

        // create a custom tree set and add students to it
        CustomTreeSet studentSet = new CustomTreeSet();

        studentSet.addStudent(studentOne);
        studentSet.addStudent(studentTwo);
        studentSet.addStudent(studentThree);
        studentSet.addStudent(studentFour);
        studentSet.addStudent(studentFive);
        studentSet.addStudent(studentSix); // this student will not be added to the tree set

        // print all students in the tree set
        System.out.println("Students in the tree set:");
        studentSet.printStudents();

        // get student by id
        String searchId = "SE003";
        Student foundStudent = studentSet.getStudentById(searchId);
        if (foundStudent != null) {
            System.out.println("Student found with id " + searchId + ": " + foundStudent.toString());
        } else {
            System.out.println("Student not found with id " + searchId);
        }

        // get student with max gpa
        Student maxGpaStudent = studentSet.getMaxGpaStudent();  
        if (maxGpaStudent != null) {
            System.out.println("Student with max GPA: " + maxGpaStudent.toString());
        } else {
            System.out.println("No students in the tree set to get max GPA.");
        }

        // get student with min gpa
        Student minGpaStudent = studentSet.getMinGpaStudent();
        if (minGpaStudent != null) {
            System.out.println("Student with min GPA: " + minGpaStudent.toString());
        } else {
            System.out.println("No students in the tree set to get min GPA.");
        }

        // get average gpa of all students in the tree set
        double averageGpa = studentSet.getAverageGpa();
        System.out.println("Average GPA of all students in the tree set: " + averageGpa);
    
        // convert names to uppercase
        System.out.println("Students with names in uppercase:");
        studentSet.convertNamesToUpperCase();
        studentSet.printStudents();
    }
}
