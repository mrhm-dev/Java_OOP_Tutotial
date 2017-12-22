package chapter2.lecture9;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTester {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
//        LocalDateTime dateTime = localDate.atTime(4, 55);

//        System.out.println(dateTime);

//        System.out.println(localDate.atStartOfDay());

//        System.out.println(localDate.with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY)));

//        System.out.println(localDate.get(ChronoField.MONTH_OF_YEAR));
//        System.out.println(localDate.get(ChronoField.DAY_OF_WEEK));
//        System.out.println(localDate.get(ChronoField.YEAR));
//        System.out.println(localDate.get(ChronoField.DAY_OF_YEAR));

//        System.out.println(localDate.getDayOfMonth());
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getMonthValue());

        LocalDate newDate = localDate.minusYears(5).minusDays(5).plusMonths(5);
        System.out.println(newDate);
    }

}
