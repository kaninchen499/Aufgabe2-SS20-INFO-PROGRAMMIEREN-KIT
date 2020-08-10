package utils;

public final class TimeOfDate{

    private int year;

    private int month;

    private int date;

    TimeOfDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%d-%d-%d",year,month,date);
    }
}
