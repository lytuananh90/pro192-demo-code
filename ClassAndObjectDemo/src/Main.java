public class Main {
    public static void main(String[] args) throws Exception {
        // create an instance of the Student class
        Sudent studentOne = new Sudent("SE001", "Nguyen Van A", 3.8);
        
        // call methods of the Student class

        System.out.println("info: " + studentOne.toString()); // This will call the toString() method of the Student class 
        studentOne.registerSubject("PRO192");
        studentOne.takeExam("PRF192");

        // create another instance of the Student class using the second constructor
        Sudent studentTwo = new Sudent("SE002");
        System.out.println("info: " + studentTwo.toString()); // This will call the toString() method of the Student class
        // update the name and gpa of studentTwo
        studentTwo.setName("Le Thi B");
        studentTwo.setGpa(3.5);
        System.out.println("Updated studentTwo info: " + studentTwo.toString()); 

        // create another instance of the Student class using the default constructor
        Sudent studentThree = new Sudent();
        System.out.println("info: " + studentThree.toString()); // This will call the toString() method of
        //update the id, name and gpa of studentThree
        studentThree.setId("SE003");
        studentThree.setName("Tran Van C");
        studentThree.setGpa(3.2);
        System.out.println("Updated studentThree info: " + studentThree.toString());
       

        
    }
}
