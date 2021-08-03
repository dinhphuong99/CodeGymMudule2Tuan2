package exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "green";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + this.getRadius()
                + ", area is = "
                + this.getArea()
                + ", perimeter is = "
                + this.getPerimeter();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2," blue");
        circle.toString();
    }
}
