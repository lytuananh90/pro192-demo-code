public class Student implements Comparable<Student> {

    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // default constructor
    public Student() {
    }

    @Override
    public int compareTo(Student other) {
        // compare by gpa and then by id
        if (this.gpa != other.gpa) { 
            // if gpa is different, compare by gpa
            // Double.compare is a static method that compares two double values and returns:
            // a negative integer if the first argument is less than the second,
            // zero if the first argument is equal to the second, and
            // a positive integer if the first argument is greater than the second.
            return Double.compare(this.gpa, other.gpa);
        }
        // if gpa is the same, compare by id
        // id is a String, 
        // and we can use the compareTo method of the String class to compare two strings lexicographically.
        return this.id.compareTo(other.id);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("id='%s', name='%s', gpa=%.2f", id, name, gpa);
    }

    
    
}
