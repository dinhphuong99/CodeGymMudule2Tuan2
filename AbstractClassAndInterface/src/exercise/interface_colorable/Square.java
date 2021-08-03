package exercise.interface_colorable;

public class Square implements Colorable{
    private boolean colorable = false;
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(boolean colorable, double side) {
        this.colorable = colorable;
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public boolean isColorable() {
        return colorable;
    }

    public void setColorable(boolean colorable) {
        this.colorable = colorable;
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
    public void howToColor() {
        if (this.colorable) System.out.println("Color all four side!");
    }

    public static void main(String[] args) {
        Square s1 = new Square(true, 5);
        System.out.println(s1);
        s1.howToColor();

        s1 = new Square(10);
        System.out.println(s1);
        s1.howToColor();

        s1 = new Square();
        System.out.println(s1);
        s1.howToColor();
    }
}
