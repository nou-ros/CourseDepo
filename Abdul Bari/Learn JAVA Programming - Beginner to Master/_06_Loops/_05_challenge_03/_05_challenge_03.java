
package _05_challenge_03;

import java.util.Scanner;

public class _05_challenge_03 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int rem;
        String str="";
        while(num>0)
        {
            rem = num%10;
            num = num/10;
            str = str+rem;
        }
        System.out.println(str);
        char c;
        for(int i=str.length()-1;i>=0;i--)
        {
            c=str.charAt(i); 
            switch(c)
            {
                case '1': 
                    System.out.println("One");
                    break;
                case '2': 
                    System.out.println("Two");
                    break;
                case '3': 
                    System.out.println("Three");
                    break;
                case '4': 
                    System.out.println("Four");
                    break;
                case '5': 
                    System.out.println("Five");
                    break;
                case '6': 
                    System.out.println("Six");
                    break;
                case '7': 
                    System.out.println("Seven");
                    break;
                case '8': 
                    System.out.println("Eight");
                    break;
                case '9': 
                    System.out.println("Nine");
                    break;
                case '0': 
                    System.out.println("Zero");
                    break;
            }
        }

    }
    
}
