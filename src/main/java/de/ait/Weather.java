package de.ait;

public class Weather {
    public static String describeTemperature(int temperature){
        String str = "";
        if(temperature <= 0) return ("холодно");
        if (temperature > 0 && temperature <= 10) return ("свежо");
        if (temperature > 10 && temperature <=20) return ("тепло");
        if (temperature > 20) return ("жарко");
        return str;
    }
}
