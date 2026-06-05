public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Demo Abstract Class ---");

        // create a Circle object
        Circle circle = new Circle("red", "yellow", 5.0);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // using shape reference to refer to a Circle object
        Shape myShape = new Circle("blue", "green", 3.0);
        System.out.println(myShape.toString());
        System.out.println("Area: " + myShape.getArea());
        System.out.println("Perimeter: " + myShape.getPerimeter());

        // we could not create an object of Shape class because it is abstract
        // Shape shape = new Shape(); // this will cause a compile-time error

    }
}
