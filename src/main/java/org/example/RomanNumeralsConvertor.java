package org.example;

import java.util.Map;
import java.util.TreeMap;

public class RomanNumeralsConvertor {

    private final static TreeMap <Integer, String> romanNumeral = new TreeMap<Integer, String>();

    static {
        romanNumeral.put(1, "I");
        romanNumeral.put(4, "IV");
        romanNumeral.put(5, "V");
        romanNumeral.put(9, "IX");
        romanNumeral.put(10, "X");
        romanNumeral.put(40, "XL");
        romanNumeral.put(50, "L");
        romanNumeral.put(90, "XC");
        romanNumeral.put(100, "C");
        romanNumeral.put(400, "CD");
        romanNumeral.put(500, "D");
        romanNumeral.put(900, "CM");
        romanNumeral.put(1000, "M");
    }


    public static String convertArabicToRoman (int arabicNumber) {

        if ((arabicNumber > 3000) || (arabicNumber < 1))
            return "";

        StringBuilder result = new StringBuilder();

        while (arabicNumber > 0) {
            Map.Entry<Integer,String> numeral = romanNumeral.floorEntry(arabicNumber);
            result.append(numeral.getValue());
            arabicNumber-=numeral.getKey();
        }

        return result.toString();
    }
}
