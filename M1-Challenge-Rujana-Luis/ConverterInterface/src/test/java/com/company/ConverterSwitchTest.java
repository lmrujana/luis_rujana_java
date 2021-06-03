package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    ConverterSwitch converterSwitch;

    @Before
    public void setUp(){
        converterSwitch = new ConverterSwitch();
    }

    @Test
    public void shouldReturnMontName(){
        assertEquals("April", converterSwitch.convertMonth(4));
        assertEquals("August", converterSwitch.convertMonth(8));
        assertEquals("December", converterSwitch.convertMonth(12));
    }

    @Test
    public void shouldReturnDayOfTheWeek(){
        assertEquals("Tuesday", converterSwitch.convertDay(3));
        assertEquals("Friday", converterSwitch.convertDay(6));
        assertEquals("Saturday", converterSwitch.convertDay(7));
    }
}