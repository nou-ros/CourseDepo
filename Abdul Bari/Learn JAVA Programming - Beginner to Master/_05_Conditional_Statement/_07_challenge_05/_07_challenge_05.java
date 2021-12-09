
package _07_challenge_05;

import java.util.Scanner;
public class _07_challenge_05 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("..........Menu..........");
        Scanner scan = new Scanner(System.in);
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.MUL");
        System.out.println("4.DIV");
        
        System.out.println("Enter 2 numbers: ");
        int a,b; 
        a = scan.nextInt();
        b = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter option in words: ");
        String option = scan.nextLine();
        option = option.toUpperCase();
        switch(option)
        {
            case "ADD":
                System.out.println("Addition: " + (a+b));
                break;
            case "SUB":
                if(a>b)
                    System.out.println("Subtraction: " + (a-b));
                else
                    System.out.println("Subtraction: " + (b-a));
                break;
            case "MUL":
                System.out.println("Multiplication: " + (a*b));
                break;
            case "DIV":
                System.out.println("Division: " + (a/b));
                break;
            default:
                System.out.println("Incorrect Option");
                break;
        }
    }
    
}
