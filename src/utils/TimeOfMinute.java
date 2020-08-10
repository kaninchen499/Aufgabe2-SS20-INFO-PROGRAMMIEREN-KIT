package utils;

public final class TimeOfMinute{

    private int hour;

    private int minutes;

    TimeOfMinute(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        String hour_s, minutes_s;
        hour_s = hour<10?"0".concat(Integer.toString(hour)):Integer.toString(hour);
        minutes_s = minutes<10?"0".concat(Integer.toString(minutes)):Integer.toString(minutes);
        return String.format("%s:%s",hour_s,minutes_s);
    }
}
