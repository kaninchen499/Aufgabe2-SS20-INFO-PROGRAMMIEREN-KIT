package utils;

public class Time {

    private TimeOfDate timeOfDate;

    private TimeOfMinute timeOfMinute;

    public Time(int year, int month, int date, int hour, int minutes) {
        this.timeOfDate = new TimeOfDate(year,month,date);
        this.timeOfMinute = new TimeOfMinute(hour,minutes);
    }

    public Time(int year, int month, int date) {
        this.timeOfDate = new TimeOfDate(year,month,date);
        this.timeOfMinute = null;
    }

    public Time(int hour, int minutes) {
        this.timeOfDate = null;
        this.timeOfMinute = new TimeOfMinute(hour, minutes);
    }

    public String toString() {
        if (timeOfMinute != null && timeOfDate != null) {
            return String.format("%sT%s",timeOfDate.toString(),timeOfMinute.toString());
        }
        return (timeOfMinute == null)?timeOfDate.toString():timeOfMinute.toString();
    }
}
