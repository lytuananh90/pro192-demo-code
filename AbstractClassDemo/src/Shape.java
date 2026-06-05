public abstract class Shape {
    private String borderColor;
    private String fillColor;

    // parameterized constructor
    public Shape(String borderColor, String fillColor) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    // default constructor
    public Shape() {
        this.borderColor = "black";
        this.fillColor = "white";
    }

    public abstract double getArea(); // abstract method to calculate area

    public abstract double getPerimeter(); // abstract method to calculate perimeter

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public String toString() {
        return "borderColor: " + borderColor + ", fillColor: " + fillColor;
    }


}
