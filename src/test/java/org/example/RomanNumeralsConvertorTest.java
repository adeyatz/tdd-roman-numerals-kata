package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;


class RomanNumeralsConvertorTest
{
    @Test
    public void checkInputValueZero () {
        assertEquals("", RomanNumeralsConvertor.convertArabicToRoman(0));
    }

    @Test
    public void checkInputValueNegative () {
        assertEquals ("", RomanNumeralsConvertor.convertArabicToRoman(-1));
    }

    @Test
    public void checkInputValueGreaterThan3000 () {
        assertEquals ("", RomanNumeralsConvertor.convertArabicToRoman(3001));
    }


    @ParameterizedTest
    @CsvFileSource (resources = "/romanNumerals.csv")
    public void checkInputvsExpectedFromCSVFile (int arabicNumber, String expectedRomanResult) {

        System.out.printf("Input: %d, Expected: %s\n", arabicNumber, expectedRomanResult);

        assertEquals (expectedRomanResult, RomanNumeralsConvertor.convertArabicToRoman(arabicNumber));
    }

}