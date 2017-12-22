package chapter2.lecture8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {

    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        GregorianCalendar calendar1 = new GregorianCalendar(2012, 10, 19);
        GregorianCalendar calendar2 = new GregorianCalendar(2012, 10, 19, 4, 50);

        System.out.println(calendar2.get(Calendar.YEAR));
    }
}
