import java.util.TreeSet;

public class CustomTreeSet extends TreeSet<Student> {

    // add student to the tree set
    public boolean addStudent(Student student) {
        return this.add(student);
    }

    // print all students in the tree set
    public void printStudents() {
        for (Student student : this) {
            System.out.println(student.toString());
        }
    }

    // get student by id
    public Student getStudentById(String id) {
        for (Student student : this) {
            /**
             * id is a string
             * we can use equalsIgnoreCase or equals to compare 
             * the id of the student with the given id
             */
            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null; // return null if student not found
    }

    // get max, assuming the students are sorted by gpa in ascending order, the last student in the tree set will have the highest gpa
    public Student getMaxGpaStudent() {
        if (this.isEmpty()) {
            return null; // return null if tree set is empty
        }
        return this.last(); // return the last student in the tree set
    }

    // get min, assuming the students are sorted by gpa in ascending order, the first student in the tree set will have the lowest gpa
    public Student getMinGpaStudent() {
        if (this.isEmpty()) {
            return null; // return null if tree set is empty
        }
        return this.first(); // return the first student in the tree set
    }

    // get average gpa of all students in the tree set
    public double getAverageGpa() {
        if (this.isEmpty()) {
            return 0.0; // return 0 if tree set is empty
        }
        double totalGpa = 0.0;
        for (Student student : this) {
            totalGpa += student.getGpa(); // sum up the gpa of all students
        }
        // this.size() will return the number of students in the tree set
        return totalGpa / this.size(); // return the average gpa
    }

    // convert all names to uppercase
    public void convertNamesToUpperCase() {
        for (Student student : this) {
            String upperCaseName = student.getName().toUpperCase(); // convert the name to uppercase
            student.setName(upperCaseName); // convert the name of each student to uppercase
        }
    }


}
