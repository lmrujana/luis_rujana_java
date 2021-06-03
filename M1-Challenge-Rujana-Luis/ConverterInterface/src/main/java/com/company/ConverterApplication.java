package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        //Instantiation of ConverterIf and ConverterSwitch
        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();

        System.out.println("======ConverterIf======");
        //Implementation of ConverterIf.convertMonth()
        System.out.println(converterIf.convertMonth(7));
        System.out.println(converterIf.convertMonth(10));
        System.out.println(converterIf.convertMonth(2));
        System.out.println(converterIf.convertMonth(-10));

        //Implementation of ConverterIf.convertDay()
        System.out.println(converterIf.convertDay(2));
        System.out.println(converterIf.convertDay(5));
        System.out.println(converterIf.convertDay(7));
        System.out.println(converterIf.convertDay(100));

        System.out.println("======ConverterSwitch======");
        //Implementation of ConverterSwitch.convertMonth()
        System.out.println(converterSwitch.convertMonth(7));
        System.out.println(converterSwitch.convertMonth(10));
        System.out.println(converterSwitch.convertMonth(2));
        System.out.println(converterSwitch.convertMonth(-10));

        //Implementation of ConverterSwitch.convertDay()
        System.out.println(converterSwitch.convertDay(2));
        System.out.println(converterSwitch.convertDay(5));
        System.out.println(converterSwitch.convertDay(7));
        System.out.println(converterSwitch.convertDay(100));
    }
}
