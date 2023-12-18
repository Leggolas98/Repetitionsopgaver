import java.util.ArrayList;

public class Shapes {

    ArrayList<Shape> shapes = new ArrayList<>();

    public Shapes() {

}

    public double totalArea() {
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.calculateArea();
        }
        return result;
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }
}
