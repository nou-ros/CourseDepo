package _04_date_time_format;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
/**
 * y = year
 * M = month
 * d = day
 * h = Hour (0-12)
 * H = Hour (0-23)
 * m = minute
 * s = seconds
 * S = miliseconds
 * z = time zone
 * Z = offset
 */
public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(df.format(ldt));
        ZonedDateTime zd = ZonedDateTime.now();
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z Z");
        System.out.println(df.format(zd));

        LocalDateTime ndt = LocalDateTime.now();
        System.out.println(ndt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(ndt.get(ChronoField.YEAR));

    }
}
