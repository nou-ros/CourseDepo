
package _03_challenge_01;

import java.util.Scanner;

public class _03_challenge_01 {

    public static void main(String[] args) {
        // TODO code application logic here
        //display multiplication table 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(num + " X " + i + " = " + (num*i));
        }
        
        //sum of n numbers
        int sum=0;
        for(int j=0; j<=num; j++)
        {
            sum = sum+j;
        }
        System.out.println("Sum of " + num + " numbers: " + sum);
        
        //factorial of n numbers
        int fact=1;
        for(int j=1; j<=num; j++)
        {
            fact = fact*j;
        }
        System.out.println("Factorial of " + num + ": " + fact);
    }
   
}
