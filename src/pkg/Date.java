/*
    CS 213 Project 1
    Authors: Prasidh Sriram & Manveer Singh
 */
package pkg;

import java.util.Calendar;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(String date) { //taking mm/dd/yyyy and create a Date object
        /*
            Input Format: m/d/yyyy || mm/d/yyyy || m/dd/yyyy || mm/dd/yyyy


         */

        String [] tokens = date.split("/");
        if(tokens.length != 3){ throw new NumberFormatException(); }
        this.month = Integer.valueOf(tokens[0]);
        this.day = Integer.valueOf(tokens[1]);
        this.year = Integer.valueOf(tokens[2]);
    }
    public Date() { //return today’s date
        Calendar calendar = Calendar.getInstance();

        year = calendar.get(calendar.YEAR);
        month = calendar.get(calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public String toString(){
        String date = "";

        String mm = String.valueOf(month);
        date = mm + "/";
        String dd = String.valueOf(day);
        date = date + dd + "/";
        String yyyy = String.valueOf(year);
        date = date + yyyy;

        return date;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay(){
        return day;
    }

    public int compare(Date date){ //Helper method to determine date order
        /*
            Return values:
                returns -1 if this date precedes the input date
                returns 1 if this date is after the input date
                returns 0 if both dates are equal

         */
        if(date.getYear() > this.year){
            return -1;
        }else if(date.getYear() < this.year){
            return 1;
        }

        if(date.getMonth() > this.month){
            return -1;
        }else if(date.getMonth() < this.month){
            return 1;
        }

        if(date.getDay() > this.day){
            return -1;
        }else if(date.getDay() < this.day){
            return 1;
        }

        return 0;
    }

    public boolean isValid() {
        if(year < 1900 || year > 2021){
            return false;
        }
        boolean isLeapYear = isLeapYear(year);
        Date today = new Date();
        if(this.compare(today) > 0){
            return false;
        }

        if(month < 1 || month > 12){
            return false;
        }
        if(month == 2){
            if(isLeapYear){
                if(day < 1 || day > 29){
                    return false;
                }
            }else{
                if(day < 1 || day > 28){
                    return false;
                }
            }
        }
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if(day < 1 || day > 31){
                return false;
            }
        }else{
            if(day < 1 || day > 30){
                return false;
            }
        }

        return true;
    }

    private boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }
            }else{
                return true;
            }
        }
        return false;
    }
}