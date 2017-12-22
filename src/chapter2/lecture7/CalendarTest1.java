package chapter2.lecture7;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarTest1 {

    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();
//        System.out.println(now);

//        Date date = now.getTime();
//        System.out.println("Hour: " + now.get(Calendar.HOUR));
//        System.out.println("Minute: " + now.get(Calendar.MINUTE));
//        System.out.println("Month: " + now.get(Calendar.MONTH));
//        System.out.println("Day of Month: " + now.get(Calendar.DAY_OF_MONTH));
//        System.out.println("Year: " + now.get(Calendar.YEAR));
//        System.out.println("Weak Of Month: " + now.get(Calendar.WEEK_OF_MONTH));
//        System.out.println("Weak Of Month: " + now.get(Calendar.DAY_OF_YEAR));

//        now.add(Calendar.MONTH, -2);
//        now.add(Calendar.YEAR, 5);
//        now.add(Calendar.HOUR, 3);
//
//        System.out.println(now.getTime());

//        now.add(Calendar.MONTH, -1);
//        System.out.println(now.getActualMaximum(Calendar.DAY_OF_MONTH));

//        System.out.println(DayOfWeek.of(now.getFirstDayOfWeek()));

//        TimeZone zone = now.getTimeZone();
//        System.out.println(zone.getDisplayName());

        now.roll(Calendar.MONTH, 4);
        now.roll(Calendar.YEAR, -2);
        System.out.println(now.getTime());
    }
}
