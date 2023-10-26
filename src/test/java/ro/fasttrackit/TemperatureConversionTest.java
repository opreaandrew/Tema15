package ro.fasttrackit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static ro.fasttrackit.TemperatureConversion.*;

class TemperatureConversionTest {

    @Test
    @DisplayName("WHEN converting Celsius to Fahrenheit, THEN the correct result is returned")
    void celsiusToFahrenheitTest() {
        //GIVEN
//        TemperatureConversion temp = new TemperatureConversion();

        //WHEN
        double fahrenheit = celsiusToFahrenheit(10.0);

        //THEN
        assertThat(fahrenheit).isPositive()
                .isEqualTo(50.0);
    }

    @Test
    @DisplayName("WHEN converting Fahrenheit to Celsius, THEN the correct result is returned")
    void fahrenheitToCelsiusTest() {
        //GIVEN
//        TemperatureConversion temp = new TemperatureConversion();

        //WHEN
        double fahrenheit = fahrenheitToCelsius(50.0);

        //THEN
        assertThat(fahrenheit).isPositive()
                .isEqualTo(10.0);
    }

}