package _02_deprecated_cal_timezone_class;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class CalTzoneDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        /*
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));
        */

        /*
        TimeZone tz = gc.getTimeZone();
        System.out.println();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
        */

        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone ntz = gc.getTimeZone();
        System.out.println(ntz.getID());
    }    
}
