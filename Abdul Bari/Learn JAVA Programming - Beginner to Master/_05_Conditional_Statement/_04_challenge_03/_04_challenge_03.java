
package _04_challenge_03;

import java.util.Scanner;

public class _04_challenge_03 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        // Diaplay name of a day based on number
//        System.out.println("Enter a day: ");
//        int day = scan.nextInt();
//        
//        if(day==1)
//        {
//            System.out.println("Monday");
//        }
//        else if(day==2)
//        {
//            System.out.println("Tuesday");
//        }
//        else if(day==3)
//        {
//            System.out.println("Wednessday");
//        }
//        else if(day==4)
//        {
//            System.out.println("Thursday");
//        }
//        else if(day==5)
//        {
//            System.out.println("Friday");
//        }
//        else if(day==6)
//        {
//            System.out.println("Saturday");
//        }
//        else if(day==7)
//        {
//            System.out.println("Sunday");
//        }
//        else
//        {
//            System.out.println("Invalid day number");
//        }
//        
        // Find type of website and protocol used
        System.out.println("Enter a url: ");
        String url = scan.nextLine();
        int type = url.indexOf(":");
        String protocol = url.substring(0, type);
        if(protocol.equals("http"))
            System.out.println("Hyper Text Transfer Protocol");
        else if(protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
        
        String ext = url.substring(url.lastIndexOf(".")+1);
        if(ext.equals("com"))
            System.out.println("commercial");
        else if(ext.equals("net"))
            System.out.println("network");
        else if(ext.equals("gov"))
            System.out.println("government");
        else if(ext.equals("org"))
            System.out.println("organization");
    }
    
}
