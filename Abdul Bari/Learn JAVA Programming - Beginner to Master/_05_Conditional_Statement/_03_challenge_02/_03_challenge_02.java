
package _03_challenge_02;

import java.util.Scanner;

public class _03_challenge_02 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        // Find radix of a number
//        String num;
//        System.out.println("Enter a number: ");
//        num = scan.nextLine();
//        if(num.matches("[01]+"))
//        {
//            System.out.println("Binary Radix=2");
//        }
//        else if(num.matches("[0-7]+"))
//        {
//            System.out.println("Octal Radix=8");
//        }
//        else if(num.matches("[0-9A-F]+"))
//        {
//            System.out.println("HexaDecimal Radix=16");
//        }
//        else
//        {
//            System.out.println("Invalid Number");
//        }
        
        //Leap Year
        System.out.println("Enter a year: ");
        int year = scan.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("a Leap year");
                }
                else
                {
                    System.out.println("Not a leap year");
                }
                
            }
            else
            {
                System.out.println("It's a leap year");
            }
        }
        else
        {
            System.out.println("Not a leap year");
        }
        
    }
    
}
