package chapter2.lecture6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");

//        String dateString = "2016-11-21";
//
//        Date date = simpleDateFormat.parse(dateString);
//
//        System.out.println(date);

        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));

    }
}
