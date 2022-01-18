package _01_deprecated_date_classes;

//Deprecated in java 8
// uses miliseconds
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        
        /*System.out.println("Total miliseconds till 1970: " + System.currentTimeMillis());
        System.out.println("Total year passed: " + System.currentTimeMillis()/1000/60/60/24/365);
        System.out.println(Long.MAX_VALUE);*/

        //Date dd = new Date(System.currentTimeMillis());
        //System.out.println(dd);

        // Date d = new Date("1/1/1980");
        // Date d = new Date();
        Date d = new Date("1/17/2022");
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear() + 1900);
    }
    
}
