public class Square implements Shape {
    int height;
    int length;

    public Square(int height, int length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        double result = height * length;
        System.out.println(result);
        return result;
    }
}
