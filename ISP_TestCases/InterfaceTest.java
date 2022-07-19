package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterfaceTest {
    public Main m1;
    @BeforeEach
    public void setUP(){
       m1 = new Main();
    }
    
    @Test
    public void isZero(int num){
            assertEquals(0,num, "Cannot be Zero");
    }
    
    @Test
    void isNegative(){
        Main m1 = new Main();
        assertThrows(IllegalArgumentException.class, m1.num < 0);
    }
}