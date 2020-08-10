package main;

import config.Config;
import edu.kit.informatik.Terminal;
import utils.Time;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Time[] hasHoliday = checkHoliday(args);
    }

    private static Time[] checkHoliday(String[] args) {
        if (args == null) return null;
        String regexForDate = "^([1-9]\\d{3})-(0[1-9]|1[0-2])-([0][1-9]|[12][0-9]|3[01])$";
        Pattern pattern = Pattern.compile(regexForDate);
        String[] holidays;
        if (args.length == 0) return null;
        try {
            holidays = Terminal.readFile(args[0]);
        } catch (RuntimeException e) {
            return null;
        }

        Time[] holidays_t = new Time[holidays.length];
        for (int i = 0; i<holidays.length; i++) {
            Matcher matcher = pattern.matcher(holidays[i]);
            int year = Integer.parseInt(matcher.group(1));
            int month = Integer.parseInt(matcher.group(2));
            int date = Integer.parseInt(matcher.group(3));
            if (year % 400 ==0 || (year % 4 == 0 && year % 100 != 0)) {
                if (date > Config.DATES_PER_MONTH_ABNORMAL[month]) {
                    return null;
                }
            } else {
                if (date > Config.DATES_PER_MONTH_NORMAL[month]) {
                    return null;
                }
            }
            holidays_t[i] = new Time(year,month,date);
        }


        return holidays_t;
    }
}
