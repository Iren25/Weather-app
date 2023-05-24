package de.ait;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WeatherTest {
    @ParameterizedTest
    @CsvSource({
            "5, 'свежо'",
            "0, 'холодно'",
            "10, 'свежо'",
            "20, 'тепло'",
            "30, 'жарко'",
            "-30, 'холодно'"
    })
    public void describeTemperature_test1(int temperature, String describtion){
        assertEquals(
                describtion,
                Weather.describeTemperature(temperature)
        );
    }

    @Test
    void describeTemperature() {
    }
}