package org.example;

import java.util.Map;
import java.util.TreeMap;

public class RomanNumeralsConvertor {

    private final static TreeMap <Integer, String> romanNumeral = new TreeMap<Integer, String>();

    static {
        romanNumeral.put(1, "I");
        romanNumeral.put(4, "IV");
    }

    public RomanNumeralsConvertor () {

    }

    public String convertArabicToRoman (int arabicNumber) {
        System.out.println("Num to convert:" + arabicNumber);

        int number = arabicNumber;
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            Map.Entry<Integer,String> numeral = romanNumeral.floorEntry(number);
            result.append(numeral.getValue());
            number-=numeral.getKey();
        }

        return result.toString();
    }
}
