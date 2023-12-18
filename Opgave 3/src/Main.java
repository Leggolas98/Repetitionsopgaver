import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

Cities cities = new Cities();

City lyngby = new City("Lyngby", 57500);
cities.add(lyngby);

City ribe = new City("Ribe", 8257);
cities.add(ribe);

City storvorde = new City("Storvorde", 3425);
cities.add(storvorde);

City tarm = new City("Tarm", 4010);
cities.add(tarm);

City horreby = new City("Horreby", 305);
cities.add(horreby);

cities.getTotalPopulation();
cities.getAveragePopulation();
    }
}
