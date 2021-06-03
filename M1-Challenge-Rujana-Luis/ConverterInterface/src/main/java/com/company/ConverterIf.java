package com.company;

import com.company.interfaces.Converter;

public class ConverterIf implements Converter {
    public String convertMonth (int monthNumber){
        if(monthNumber < 1 || monthNumber > 12){
            String errorMessage = "Invalid input. Enter a number between 1 and 12";
            return errorMessage;
        } else {
            if(monthNumber == 1){
                return "January";
            } else if(monthNumber == 2){
                return "February";
            } else if(monthNumber == 3){
                return "March";
            } else if(monthNumber == 4){
                return "April";
            } else if(monthNumber == 5){
                return "May";
            } else if(monthNumber == 6){
                return "June";
            } else if(monthNumber == 7){
                return "July";
            } else if(monthNumber == 8){
                return "August";
            } else if(monthNumber == 9){
                return "September";
            } else if(monthNumber == 10){
                return "October";
            } else if(monthNumber == 11){
                return "November";
            } else {
                return "December";
            }
        }
    }

    public String convertDay (int dayNumber){
        if(dayNumber < 1 || dayNumber > 7){
            return "Invalid input. Enter a number between 1 and 7";
        } else {
            if(dayNumber == 1){
                return "Sunday";
            } else if(dayNumber == 2){
                return "Monday";
            } else if(dayNumber == 3){
                return "Tuesday";
            } else if(dayNumber == 4){
                return "Wednesday";
            } else if(dayNumber == 5){
                return "Thursday";
            } else if(dayNumber == 6){
                return "Friday";
            } else {
                return "Saturday";
            }
        }
    }
}
