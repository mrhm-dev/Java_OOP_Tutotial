package chapter2.lecture7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest2 {

    public static void main(String[] args) throws ParseException {

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = simpleDateFormat.parse("2020-5-17");
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);

        Calendar calendar = new Calendar.Builder()
                .setDate(2020, 11, 21)
                .setTimeOfDay(3, 45, 30)
                .build();

        System.out.println(calendar.getTime());

    }
}
