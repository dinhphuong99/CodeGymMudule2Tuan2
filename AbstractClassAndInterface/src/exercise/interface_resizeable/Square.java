package exercise.interface_resizeable;

public class Square extends Shape{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter(){
        return this.side*4;
    }

    public double getArea(){
        return this.side*this.side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + this.getSide()
                + ", perimeter is: "
                + this.getPerimeter()
                + ", area is: "
                + this.getArea();
    }

    @Override
    public void resize(double percent) {
        double num = percent/100 + 1;
        this.setSide(this.getSide()*num);
    }
}