package com.company;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public double divide(double a, double b){
        return a / b;
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        System.out.println("1 + 1 = " + myCalc.add(1,1));
        System.out.println("23 - 52 = " + myCalc.subtract(23, 52));
        System.out.println("34 * 2 = " + myCalc.multiply(34, 2));
        System.out.println("12 / 3 = " + myCalc.divide(12, 3));
        System.out.println("12 / 7 = " + myCalc.divide(12.00, 7.00));
        System.out.println("3.4 + 2.3 = " + myCalc.add(3.4, 2.3));
        System.out.println("6.7 * 4.4 = " + myCalc.multiply(6.7, 4.4));
        System.out.println("5.5 - 0.5 = " + myCalc.subtract(5.5, 0.5));
        System.out.println("10.8 / 2.2 = " + myCalc.divide(10.8, 2.2));
    }
}
