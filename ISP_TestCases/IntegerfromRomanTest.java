package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerfromRomanTest {

    @Test
    void convertMultipleDigits() {
        Main m1 = new Main();
        int res = m1.IntegerfromRoman("XXVI");
        assertEquals(26,res);
    }

    @Test
    void convertSingleDigit() {
        Main m1 = new Main();
        int result = m1.IntegerfromRoman("C");
        assertEquals(100, result);
    }

    public void test
}