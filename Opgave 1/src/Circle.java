public class Circle implements Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double result = Math.PI * (radius * radius);
        System.out.println(result);
        return result;
    }
}
