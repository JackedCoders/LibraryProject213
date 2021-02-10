package pkg;

import java.util.Calendar;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(String date) { //taking mm/dd/yyyy and create a Date object

        if(!isValid(date)){
            System.out.println("ERROR: Invalid date");
        }

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

    public String toString(){
        String date = "";

        String mm = String.valueOf(month);
        if(month<10){
            mm = "0" + mm;
        }
        String dd = String.valueOf(day);
        //if()
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

    public boolean isValid(String dateString) {

        if(dateString.length() != 10){
            return false;
        }
        String [] tokens = dateString.split("/");

        char ch = dateString.charAt(0);
        for(int i = 0; i < dateString.length(); i++){
            if( i == 2 || i == 5){
                if(dateString.charAt(i) != '/') return false;
            }
            else{
                if(!Character.isDigit(ch)) return false;
            }
        }

        int month = Integer.parseInt(tokens[0]);
        int day = Integer.parseInt(tokens[1]);
        int year = Integer.parseInt(tokens[2]);
        return true;
    }
}