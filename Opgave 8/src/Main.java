import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();

        Lion lion = new Lion(true);
        zoo.add(lion);

        Parrot parrot = new Parrot(false);
        zoo.add(parrot);

        lion.makeSound();
        parrot.makeSound();

        /*public ArrayList getMammals() {
            for (Animal animals : zoo) {
                if (animals.isMammal == true) {
                    System.out.println(zoo);
                    return zoo;
                }
            }
        }*/
    }
}
