package Assignment_4.Exercise4.Question2;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int year, int month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear(){
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
