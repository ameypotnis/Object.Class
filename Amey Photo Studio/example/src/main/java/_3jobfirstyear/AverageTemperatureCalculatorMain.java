package _3jobfirstyear;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amey on 13/10/16.
 */
public class AverageTemperatureCalculatorMain {
    public static void main(String args[]) {
        List<City> cities = new ArrayList();
        cities.add(new City(30.2));
        cities.add(new City(40.2));
        cities.add(new City(35.4));
        cities.add(new City(36.5));
        cities.add(new City(37.0));
        AverageTemperatureCalculatorService service = new AverageTemperatureCalculatorService();

        String message = String.format("Average temperature is %s", service.calculateAverage(cities));
        System.out.println(message);
    }
}

class AverageTemperatureCalculatorService {
    public Double calculateAverage(List<City> cities) {
        Double sum = 0.0;
        for (City city : cities) {
            sum += city.getTemperature();
        }
        return sum / cities.size();
    }
}

class City {
    private Double temperature;

    public City(Double temperature) {
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }
}
