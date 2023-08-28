package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;


class RomanNumeralsConvertorTest
{
    @Test
    public void checkInputValueZero () {
        RomanNumeralsConvertor convertor = new RomanNumeralsConvertor();

        assertEquals ("", convertor.convertArabicToRoman(0));
    }

    @Test
    public void checkInputValueNegative () {
        RomanNumeralsConvertor convertor = new RomanNumeralsConvertor();

        assertEquals ("", convertor.convertArabicToRoman(-1));
    }

    @Test
    public void checkInputValueGreaterThan3000 () {
        RomanNumeralsConvertor convertor = new RomanNumeralsConvertor();

        assertEquals ("", convertor.convertArabicToRoman(3001));
    }


    @ParameterizedTest
    @CsvFileSource (resources = "/romanNumerals.csv")
    public void checkTestWithCSVFile (int arabicNumber, String expectedRomanResult) {

        System.out.printf("Input: %d, Expected: %s\n", arabicNumber, expectedRomanResult);

        RomanNumeralsConvertor convertor = new RomanNumeralsConvertor();

        assertEquals (expectedRomanResult, convertor.convertArabicToRoman(arabicNumber));
    }

}