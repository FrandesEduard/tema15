package org.fasttrack.curs15.tema15;

import org.fasttrack.tema15.TemperatureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    private static TemperatureConverter temperatureConverter;
    @BeforeAll
    public static void setup(){
        temperatureConverter = new TemperatureConverter();
    }
    @Test
    public void testfahrenheitToCelsius() {
        double temperature = 40;
        double celsius = temperatureConverter.fahrenheitToCelsius(temperature);
        Assertions.assertEquals(4.444444444444445,celsius);
    }
    @Test
    public void testCelsiusToFahrenheit() {
        double temperature = 40;
        double fahrenheit = temperatureConverter.celsiusTofahrenheit(temperature);
        Assertions.assertEquals(104,fahrenheit);
    }
    @Test
    public void testfahrenheitToCelsius2() {
        double temperature = -23;
        double celsius = temperatureConverter.fahrenheitToCelsius(temperature);
        Assertions.assertEquals(-30.555555555555557,celsius);
    }
}
