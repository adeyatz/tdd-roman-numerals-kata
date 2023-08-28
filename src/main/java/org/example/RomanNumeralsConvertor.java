package org.example;

import java.util.Map;
import java.util.TreeMap;

public class RomanNumeralsConvertor {

    private final static TreeMap <Integer, String> romanNumeral = new TreeMap<Integer, String>();

    static {
        romanNumeral.put(1, "I");
        romanNumeral.put(4, "IV");
        romanNumeral.put(5, "V");
    }

    public RomanNumeralsConvertor () {

    }

    public String convertArabicToRoman (int arabicNumber) {
        System.out.println("Num to convert:" + arabicNumber);

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
