package main;

import java.util.Map;
import java.util.TreeMap;

public class Converter {

    public static final int constant = 32;
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    public static double convertFahrenheitToCelsius(double fahrenheit) {;
        try {
            return (fahrenheit - constant) * 5/9;
        } catch(Exception ex) {
            throw ex;
        }
    }

    public static double convertCelsiusToFahrenheit(double celsius) {;
        try {
            return (celsius * 9/5) + constant;
        } catch (Exception ex) {
            throw ex;
        }
    }

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

    public static String intToRomanNumerals(int number) {
        if(number < 1) {
            return null;
        }
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C,", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();


        for(int i=0; i < values.length; i++) {
            while(number >= values[i]) {
                number -= values[i];
                roman.append(romanLiterals[i]);
            }
        }

        return roman.toString();
    }



}
