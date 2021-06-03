package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    public void shouldAddTwoNumbers(){
        assertEquals(5, calc.add(3, 2));
        assertEquals(100, calc.add(70, 30));
        assertEquals(12.63, calc.add(10.20, 2.43), 0.0001);
        assertEquals(-8, calc.add(8,-16));
    }

    @Test
    public void shouldSubtractTwoNumbers(){
        assertEquals(12, calc.subtract(30, 18));
        assertEquals(4, calc.subtract(-4, -8));
        assertEquals(14.5, calc.subtract(30, 15.5), 0.0001);
        assertEquals(12345, calc.subtract(12346, 1));
    }

    @Test
    public void shouldMultiplyTwoNumbers(){
        assertEquals(72, calc.multiply(8, 9));
        assertEquals(100, calc.multiply(10, 10));
        assertEquals(12.67, calc.multiply(0.1267, 100), 0.0001);
        assertEquals(-45, calc.multiply(-5, 9));
        assertEquals(27, calc.multiply(-3, -9));
    }

    @Test
    public void shouldDivideTwoNumbers(){
        assertEquals(4, calc.divide(8, 2));
        assertEquals(-6, calc.divide(-36, 6));
        assertEquals(-20, calc.divide(200, -10));
        assertEquals(100, calc.divide(1, 0.01), 0.0001);
    }

}