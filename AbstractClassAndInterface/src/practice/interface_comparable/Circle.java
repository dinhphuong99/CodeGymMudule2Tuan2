package practice.interface_comparable;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private boolean filled = true;

    public Circle(){
        this.color = "red";
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.color = "red";
        this.radius = radius;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString(){
        String status = (this.filled)? "fill": "not fill";
        return "radius = " + this.radius + ", color = " + this.color
                + ", " + status + ", Area is:" + this.getArea();
    }
}
