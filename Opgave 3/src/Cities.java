import java.util.ArrayList;

public class Cities {

    ArrayList<City> cities = new ArrayList<>();

    public void add(City city) {
        cities.add(city);

    }

    public int getTotalPopulation() {
        int totalPopulation = 0;

        for (City city : cities) {
            totalPopulation += city.getPopulation();
        }

        System.out.println("The total population is: " + totalPopulation);
        return totalPopulation;
    }

    public int getAveragePopulation() {
        int totalPopulation = 0;

        for (City city : cities) {
totalPopulation += city.getPopulation();
        }

        int averagePopulation = totalPopulation / cities.size();
        System.out.println("The average population is: " + averagePopulation);
        return averagePopulation;
    }

}
