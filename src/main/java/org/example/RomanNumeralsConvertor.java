package org.example;

public class RomanNumeralsConvertor {

    public RomanNumeralsConvertor () {

    }

    public String convertArabicToRoman (int arabicNumber) {
        System.out.println("Num to convert:" + arabicNumber);

        int number = arabicNumber;
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            result.append("I");
            number--;
        }

        return result.toString();
    }

}
