package chapter2.lecture11;

import java.time.*;
import java.time.temporal.ChronoField;

public class LocalDateTimeTester {

    public static void main(String[] args) {

//        LocalDate localDate = LocalDate.now();
//        LocalTime localTime = LocalTime.now();
//
//        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
//        System.out.println(localDateTime);
//        Clock clock = Clock.system(ZoneId.systemDefault());
//        ZoneId id = ZoneId.of("Asia/Dhaka");
//        LocalDateTime localDateTime = LocalDateTime.now(id);

        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime.get(ChronoField.MINUTE_OF_DAY));
//        System.out.println(localDateTime.get(ChronoField.DAY_OF_YEAR));

//        Month month = localDateTime.getMonth();
//        System.out.println(month);
//
//        DayOfWeek week = localDateTime.getDayOfWeek();
//        System.out.println(week);

        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = localDateTime.plusMonths(4).plusDays(10).minusYears(7);
        System.out.println(localDateTime1);
    }
}
