package main;

import java.util.Map;
import java.util.TreeMap;

public class Converter {

    public static final int constant = 32;

    public static double convertCelsiusOrFahrenheit(double unit, String type) {
        try {
            if(type.equalsIgnoreCase("celsius")) {
                return (unit - constant) * 5/9;
            }

            if(type.equalsIgnoreCase("fahrenheit")) {
                return (unit * 9/5) + constant;
            }
        } catch (Exception ex) {
            throw ex;
        }
        return 0;
    }
}
