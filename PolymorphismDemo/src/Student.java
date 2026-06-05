public class Student extends Person {

    private String studentId;
    private double gpa;

    public Student(String id, String name, String studentId, double gpa) {
        // please check the order of parameters in the constructor,
        // the order of parameters in the constructor should be the same as the order of parameters in the super() call
        super(id, name); // call the parent class's constructor to initialize id and name
        this.studentId = studentId;
        this.gpa = gpa;
    }
    
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void registerAccount() {
        // we can override the registerAccount method 
        // to provide a different implementation for Student class
        System.out.println("Registering student for " + getName() + " with student id " + studentId);
    }

    @Override
    public void registerAccount(String location) {
        // we can also override the overloaded method registerAccount with different parameters
        System.out.println("Registering student id " + studentId + " at " + location);
    }

    @Override
    public String toString() {
        // id, name are inherited from Person
        //id, name are private in Person, so we cannot access them directly, we need to use getter methods
      //  return "id: " + getId() + ", name: " + getName() + ", studentId: " + studentId + ", gpa: " + gpa;

      // super is used to access the parent class's methods and properties, 
      // in this case we can use super.toString() to get the id and name from Person class
        return super.toString() + ", studentId: " + studentId + ", gpa: " + gpa;
    }
    
}
