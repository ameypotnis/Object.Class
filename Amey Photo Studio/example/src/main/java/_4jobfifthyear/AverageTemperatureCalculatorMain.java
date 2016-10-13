package _4jobfifthyear;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by amey on 13/10/16.
 */
class AverageTemperatureCalculatorService {
    public Double calculateAverage(List<City> cities) {
        Double sum = 0.0;
        ListIterator<City> iterator = cities.listIterator();
        while (iterator.hasNext()) {
            sum += iterator.next().getTemperature();
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
