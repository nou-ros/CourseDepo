
package _06_challenge_04;

import java.util.Scanner;

public class _06_challenge_04 {

    public static void main(String[] args) {
        // TODO code application logic here
       // Display name of a month based on number
        
        System.out.println("Enter a month: ");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        
        switch(month)
        {
            case 1: 
                System.out.println("January");
                break;
            case 2: 
                System.out.println("February");
                break;
            case 3: 
                System.out.println("March");
                break;
            case 4: 
                System.out.println("April");
                break;    
            case 5: 
                System.out.println("May");
                break;
            case 6: 
                System.out.println("June");
                break;
            case 7: 
                System.out.println("July");
                break;
            case 8: 
                System.out.println("August");
                break;
            case 9: 
                System.out.println("September");
                break;
            case 10: 
                System.out.println("October");
                break;
            case 11: 
                System.out.println("November");
                break;
            case 12: 
                System.out.println("December");
                break;
            
            default:
                System.out.println("Not a valid month");
            
        }
        
          
        System.out.println("Enter Domain name");
        String domain=scan.nextLine();
        
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        
        switch(ext)
        {
            case "com": System.out.println("Commercial");
                        break;
            case "org": System.out.println("Organisation");
                        break;
                        
            case "gov": System.out.println("Government");
                        break;
            case "net": System.out.println("Network");
                        break;
        }
     
    }
    
}
