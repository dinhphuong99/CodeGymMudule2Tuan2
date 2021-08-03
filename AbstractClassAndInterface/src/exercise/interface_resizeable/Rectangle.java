package exercise.interface_resizeable;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "
                + this.getWidth()
                + " and length = "
                + this.getLength()
                + ", perimeter is: "
                + this.getPerimeter()
                + ", area is: "
                + this.getArea();
    }

    @Override
    public void resize(double percent) {
        double num = percent/100 + 1;
        this.setLength(this.getLength()*num);
        this.setWidth(this.getWidth()*num);
    }
}
