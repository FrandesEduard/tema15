package org.fasttrack.tema15;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double temperature) {
        double celsius = (temperature - 32) * 5/9;
        return celsius;
    }

    public double celsiusTofahrenheit(double temperature) {
        double fahrenheit = temperature * 9/5 + 32;
        return fahrenheit;
    }
}
