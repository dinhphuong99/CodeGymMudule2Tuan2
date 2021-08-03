package exercise.interface_resizeable;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent){
        double num = percent/100 + 1;
        this.setRadius(this.getRadius()*num);
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
                +", perimeter is: "
                + this.getPerimeter()
                + ", area is: "
                + this.getArea();
    }

}
