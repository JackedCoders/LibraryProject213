package pkg;

public class Date {
    private int year;
    private int month;
    private int day;
    public Date(String date) { //taking mm/dd/yyyy and create a Date object
        this.month = Integer.valueOf(date.substring(0,2));
        this.day = Integer.valueOf(date.substring(3,5));
        this.year = Integer.valueOf(date.substring(6));
    }
    public Date() { } //return today’s date

    //public isValid() { }
}