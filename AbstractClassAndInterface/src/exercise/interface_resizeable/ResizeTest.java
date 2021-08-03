package exercise.interface_resizeable;

public class ResizeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.5f);
        shapes[1] = new Square(3.5f);
        shapes[2] = new Rectangle(1.5f, 2.0f);

        System.out.println("Before reisize");
        for (Shape i:shapes) {
            System.out.println(i);
        }

        for (Shape i:shapes) {
            i.resize(50);
        }

        System.out.println("After resize");
        for (Shape i: shapes) {
            System.out.println(i);
        }
    }
}
