package _5jobninthyear;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by amey on 13/10/16.
 */
public class AverageTemperatureCalculatorServiceTest {
    @Test
    public void calculateAverage() throws Exception {
        //given
        List<City> cities = Arrays.asList(
                new City(30.2),
                new City(40.2),
                new City(35.4),
                new City(36.5),
                new City(37.0));
        //when
        AverageTemperatureCalculatorService service = new AverageTemperatureCalculatorService();
        String message = String.format("Average temperature is %s", service.calculateAverage(cities));
        //then
        assertThat(message, is("Average temperature is 35.86"));
    }

}