package _5jobninthyear;

import java.util.List;

/**
 * Created by amey on 13/10/16.
 */
class AverageTemperatureCalculatorService {
    public Double calculateAverage(List<City> cities) {
        return cities
                .stream()
                .mapToDouble(City::getTemperature)
                .average()
                .getAsDouble();
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
