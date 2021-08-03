package exercise;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2*super.getPerimeter() + this.height * super.getPerimeter();
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder ="
                + this.getHeight()
                + ", Area = "
                + this.getArea()
                + ", Volume = "
                + this.getVolume()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.5, "white",10);
        System.out.println(cylinder);
    }
}
