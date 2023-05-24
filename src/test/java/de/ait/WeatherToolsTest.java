package de.ait;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WeatherToolsTest {
    @ParameterizedTest
    @CsvSource({
            "0.1, false, Calm wind with speed of 0.1 m/s",
            "0.2, true, Gusty calm wind with speed of 0.2 m/s",
            "1, true, Gusty light air wind with speed of 1.0 m/s",
            "5, false, Light Air wind with speed of 5.0 m/s",
            "6, true, Gusty light breeze with speed of 6.0 m/s",
            "11, false, Light breeze wind with speed of 11.0 m/s",
            "12, true, Gusty gentle breeze with speed of 12.0 m/s",
            "19, false, Gentle breeze with speed of 19.0 m/s",
            "20, true, Gusty moderate breeze with speed of 20.0 m/s",
            "28, false, Moderate breeze with speed of 28.0 m/s",
            "29, true, Gusty fresh breeze with speed of 29.0 m/s",
            "38, false, Fresh breeze with speed of 38.0 m/s"

    })
    public void getWindDescription(double speed, boolean isGusty, String description) {
       String result = WeatherTools.getWindDescription(speed, isGusty);
       assertEquals(description, result);


    }

}