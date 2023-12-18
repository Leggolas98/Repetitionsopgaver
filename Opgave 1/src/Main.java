import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Square square1 = new Square(5,5);
        Circle circle1 = new Circle(5);

        shapes.addShape(square1);
        shapes.addShape(circle1);

        square1.calculateArea();
        circle1.calculateArea();

        shapes.totalArea();
    }
}
