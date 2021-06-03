package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    ConverterIf converterIf;

    @Before
    public void setUp(){
        converterIf = new ConverterIf();
    }

    @Test
    public void shouldReturnMonthName(){
        assertEquals("May", converterIf.convertMonth(5));
        assertEquals("June", converterIf.convertMonth(6));
        assertEquals("October", converterIf.convertMonth(10));
    }

    @Test
    public void shouldReturnDayOfTheWeekName(){
        assertEquals("Monday", converterIf.convertDay(2));
        assertEquals("Wednesday", converterIf.convertDay(4));
        assertEquals("Sunday", converterIf.convertDay(1));
    }

}