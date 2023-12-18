import static java.lang.Math.random;

public class Die {
    int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return (int) random(1,7);
    }

    private Object random(int i, int i1) {
        return null;
    }
}
