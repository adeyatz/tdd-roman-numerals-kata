package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;


class RomanNumeralsConvertorTest
{
    @ParameterizedTest
    @CsvFileSource (resources = "/romanNumerals.csv")
    public void checkTestWithCSVFile (int arabicNumber, String expectedRomanResult) {

        System.out.printf("Input: %d, Expected: %s\n", arabicNumber, expectedRomanResult);

        RomanNumeralsConvertor convertor = new RomanNumeralsConvertor();

        assertEquals (expectedRomanResult, convertor.convertArabicToRoman(arabicNumber));
    }

}