package exercise;
import practice.geometry_classes.Shape;

public class Triangle extends Shape{
    private float side1 = 1.0f;
    private float side2 = 1.0f;
    private float side3 = 1.0f;

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    public Triangle(){
        this.side1 = 1.0f;
        this.side2 = 1.0f;
        this.side3 = 1.0f;
    }

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float getArea(){
        float p = (this.side1 + this.side2 + this.side3)/2;
        return (float) Math.sqrt(p*(p - this.side1)*(p - this.side2)*(p - this.side3));
    }

    public float getPerimeter(){
        return (this.side1 + this.side2 + this.side3);
    }

    @Override
    public String toString(){
        return "A Tritangle with side1="
                + this.getSide1()
                + ", side2 ="
                + this.getSide2()
                + " and side3 ="
                + this.getSide3()
                + ", Area is: "
                + this.getArea()
                + ", Perimeter is: "
                + this.getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2.5f,2.5f,1);
        System.out.println(triangle);
    }
}
