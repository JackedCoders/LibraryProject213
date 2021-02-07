package pkg;

import java.util.Calendar;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(String date) { //taking mm/dd/yyyy and create a Date object


        this.month = Integer.valueOf(date.substring(0,2));
        this.day = Integer.valueOf(date.substring(3,5));
        this.year = Integer.valueOf(date.substring(6));
    }
    public Date() { //return today’s date
        Calendar calendar = Calendar.getInstance();

        year = calendar.get(calendar.YEAR);
        month = calendar.get(calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);
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

    public boolean isValid(String dateString) {

        if(dateString.length() != 10){
            return false;
        }
        char ch = dateString
        for(int i = 0; i < dateString.length(); i++){
            if( i == 2 || i == 5){
                if(dateString.charAt(i) != '/') return false;
            }
            else{
                if(!Character.isDigit(ch)) return false;
            }
        }
        return true;
    }
}