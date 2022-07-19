package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringtoRomanTest {

    @BeforeEach
    public void setUP(){
        m1 = new Main();
    }

    @Test
    void inputRange(int num) {
        Main m1 = new Main();
        int high = 3999;
        int low = 1;
        assertThrows(IllegalArgumentException.class, num < low || num > high);
        assertTrue(num >= low && m1.num <= high,m1.num + " is not in [" + low + ", " + high + "]");
    }

    @ParameterizedTest
    public void romanUpperCase(int num){
        m1 = new Main();
        String res1 = m1.StringtoRoman(num);
        String res2 = res1.toUpperCase();
        assertEquals(res1,res2);
    }

    @ParameterizedTest
    public void romanUpperCase(int num){
        m1 = new Main();
        String res1 = m1.StringtoRoman(num);
        String res2 = res1.toLowerCase();
        assertEquals(res1,res2);
    }

}