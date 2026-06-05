public class Circle extends Shape {

    private double radius;

    public Circle(String borderColor, String fillColor, double radius) {
        super(borderColor, fillColor);
        this.radius = radius;
    }

    public Circle() {
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return super.toString() + ", radius: " + radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
