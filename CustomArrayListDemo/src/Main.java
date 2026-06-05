public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("-- Custom ArrayList Demo--");

        // create 5 students
        Student studentOne = new Student("SE001", "Nguyen Van A", 3.5);
        Student studentTwo = new Student("SE002", "Tran Thi B", 3.8);
        Student studentThree = new Student("SE003", "Le Van C", 3.2);
        Student studentFour = new Student("SE004", "Pham Thi D", 3.9);
        Student studentFive = new Student("SE005", "Hoang Van E", 3.6);
        Student studentSix = new Student("SE006", "Le Thi F", 3.8);

        // create a MyArrayList and add students to it
        MyArrayList studentList = new MyArrayList();
        //add students to the list
        studentList.addStudent(studentOne);
        studentList.addStudent(studentTwo);
        studentList.addStudent(studentThree);
        studentList.addStudent(studentFour);
        studentList.addStudent(studentFive);
        studentList.addStudent(studentSix);

        // display all students in the list
        studentList.display();

        // get student by id
        String searchId = "SE003";  
        Student foundStudent = studentList.getStudentById(searchId);
        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent.toString());
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }

        String notFoundId = "SE999";
        Student notFoundStudent = studentList.getStudentById(notFoundId);
        if (notFoundStudent != null) {
            System.out.println("Student found: " + notFoundStudent.toString());
        } else {
            System.out.println("Student with ID " + notFoundId + " not found.");
        }
        
        // calculate and display the average GPA of all students in the list
        double averageGPA = studentList.getAverageGPA();
        System.out.printf("Average GPA of all students: %.2f\n", averageGPA);

        // calculate and display the average GPA of max and min GPA
        double averageGPAOfMaxMin = studentList.getAverageGPAOfMaxMin();
        System.out.printf("Average GPA of max and min GPA: %.2f\n", averageGPAOfMaxMin);

        // sort students by GPA in ascending order and display the sorted list
        studentList.sortByGPA();
        System.out.println("Students sorted by GPA in ascending order:");
        studentList.display();

        // sort students by GPA in descending order and display the sorted list
        studentList.sortByGPADescending();
        System.out.println("Students sorted by GPA in descending order:");
        studentList.display();

        // sort gpa and then name in ascending order and display the sorted list
        studentList.sortByGPAThenName();
        System.out.println("Students sorted by GPA and then name in ascending order:");
        studentList.display();
    }
}
