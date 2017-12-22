package chapter2.lecture10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;

public class LocalTimeTester {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
//        System.out.println(time);
//        LocalDateTime dateTime = time.atDate(LocalDate.now());
//        System.out.println(dateTime);

//        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
//        System.out.println(time.get(ChronoField.MINUTE_OF_HOUR));
//        System.out.println(time.get(ChronoField.MINUTE_OF_DAY));
        LocalTime localTime = time.withHour(5);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();

    }
}
