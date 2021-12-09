
package _05_challenge_02;

public class _05_challenge_02 {

    public static void main(String[] args) {
       // Find if a number is binary
       // Find if a number is hexa-decimal or not
       // Find is the date in Date format (dd/mm/yyyy)
       int b = 1000110;
       String str = String.valueOf(b);
       System.out.println(str.matches("[01]+"));
       
       String hx = "913A3EB";
       System.out.println(hx.matches("[0-9A-F]+"));
       
       String date = "15/11/1995";
       System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
       
    }
    
}
