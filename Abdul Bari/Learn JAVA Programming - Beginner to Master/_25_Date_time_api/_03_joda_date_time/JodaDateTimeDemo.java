package _03_joda_date_time;

import java.time.Instant;

// new date time class
// used seconds and nano seconds
// immutable unlike previous date time package

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaDateTimeDemo {
    public static void main(String args[]){
        /*
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalDate dtdt = LocalDate.now(Clock.systemDefaultZone());
        System.out.println(dtdt);
        LocalDate dt = LocalDate.now(ZoneId.of("Asia/Dhaka"));
        System.out.println(dt);
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 18);
        System.out.println(date);
        */
        // offset - +06:00
        // zondeid - [Asia/Dhaka]
        ZonedDateTime zdt = ZonedDateTime.now();
        //System.out.println(zdt);

        OffsetDateTime odt = OffsetDateTime.now();
        //System.out.println(odt);
        //System.out.println(odt.getDayOfMonth());

        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt1);

        MonthDay md = MonthDay.now();
        System.out.println(md.getMonth());

        // 2 years + 2 months + 10 days added to current date
        Period p = Period.of(2, 2, 10);
        System.out.println(p.addTo(LocalDate.now()));

        // greenwich mean time
        Instant i = Instant.now();
        System.out.println(i);

    }
}
