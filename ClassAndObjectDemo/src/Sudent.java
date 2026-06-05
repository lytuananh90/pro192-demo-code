public class Sudent {
    // Attributes (fields) of the Student class
    private String id; 
    private String name;
    private double gpa;

    // Constructors of the Student class
    public Sudent(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public Sudent(String id) {
        this.id = id;
    }

    public Sudent() {
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

    // registerSubject, takeExam, printInfo are methods of the Student class
    void registerSubject(String subject) {
        System.out.println("Registered subject: " + subject);
    }

    void takeExam(String subject) {
        System.out.println("Taken  exam in subject: " + subject);
    }

    @Override
    public String toString() {
        // String.format() is used to format the string output with the specified format 
        // and the values of the attributes
        // %s is used for string, %.2f is used for double with 2 decimal places
        // This will return a string representation of 
        // the Student object in the format: id='id', name='name', gpa=gpa
        // For example, if id = "SE001", name = "Nguyen Van A", gpa = 3.8, 
        // the output will be: id='SE001', name='Nguyen Van A', gpa=3.80
        return String.format("id='%s', name='%s', gpa=%.2f", id, name, gpa);
    }

}
