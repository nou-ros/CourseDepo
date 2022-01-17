package _03_joda_date_time;

import java.time.Clock;

// new date time class
// used seconds and nano seconds
// immutable unlike previous date time package

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.*;

public class JodaDateTimeDemo {
    public static void main(String args[]){
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalDate dtdt = LocalDate.now(Clock.systemDefaultZone());
        System.out.println(dtdt);
        LocalDate dt = LocalDate.now(ZoneId.of("Asia/Dhaka"));
        System.out.println(dt);
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 18);
        System.out.println(date);
    }
}
