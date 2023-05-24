package de.ait;

public class WeatherTools {
    public static String getWindDescription(double speed, boolean isGusty) {
        String str = "" + speed + "";
        if (!isGusty && speed < 1.0) {
            return "Calm wind with speed of " + speed + " m/s";

        } else if (isGusty && speed < 1.0) {
                return "Gusty calm wind with speed of " + speed + " m/s";

        } else if (isGusty && speed >= 1.0 && speed <= 5.0) {
            return "Gusty light air wind with speed of " + speed + " m/s";

        } else if (!isGusty && speed >= 1.0 && speed <= 5.0) {
            return "Light Air wind with speed of " + speed + " m/s";

        } else if (isGusty && speed >= 6 && speed <= 11) {
            return "Gusty light breeze with speed of " + speed + " m/s";

        } else if (!isGusty && speed >= 6 && speed <= 11) {
            return "Light breeze wind with speed of " + speed + " m/s";

        } else if (isGusty && speed >= 12 && speed <= 19) {
            return "Gusty gentle breeze with speed of " + speed + " m/s";

        } else if (!isGusty && speed >= 12 && speed <= 19) {
            return "Gentle breeze with speed of " + speed + " m/s";

        } else if (isGusty && speed >= 20 && speed <= 28) {
            return "Gusty moderate breeze with speed of " + speed + " m/s";

        } else if (!isGusty && speed >= 20 && speed <= 28) {
            return "Moderate breeze with speed of " + speed + " m/s";

        } else if (isGusty && speed >= 29 && speed <= 38) {
            return "Gusty fresh breeze with speed of " + speed + " m/s";

        } else if (!isGusty && speed >= 29 && speed <= 38) {
            return "Fresh breeze with speed of " + speed + " m/s";
        }
        return str;
    }
}
