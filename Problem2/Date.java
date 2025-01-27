package Problem2;

public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor to initalize day, month and year.
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter for day
    public int getDay(){
        return day;
    }

    // Getter for month
    public int getMonth(){
        return month;
    }

    // Getter for year
    public int getYear(){
        return year;
    }

    // Setter for day
    public void setDay(int day) {
        this.day = day;
    }
    // Setter for month
    public void setMonth(int month) {
        this.month = month;
    }
    //Setter for year
    public void setYear(int year) {
        this.year = year;
    }
    // Set all attributes for date
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Return date in "dd/mm/yyyy" format with leading zeros
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
