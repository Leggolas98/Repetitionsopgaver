import java.util.ArrayList;

public class Calculator {
    double result = 0;

    public double getResult() {
        return result;
    }

    public double add(double x) {
        result = result + x;
        System.out.println(result);
        return result;
    }

    public double subtract(double x) {
        result = result - x;
        System.out.println(result);
        return result;
    }

    public double clear() {
        result = 0;
        System.out.println(result);
        return result;
    }

    /*public void add(double[] numbers) {
        result = result + numbers;
    }*/

}
