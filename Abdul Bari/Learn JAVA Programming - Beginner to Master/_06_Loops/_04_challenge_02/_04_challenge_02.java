
package _04_challenge_02;

import java.util.Scanner;

public class _04_challenge_02 {

    public static void main(String[] args) {
        
        // TODO code application logic here
        //Display and count digits of a number 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int m=num,t=num,n=num;
        int r,count=0;
        while(m>0)
        {
            r=m%10;
            m=m/10;
            count++;
            System.out.println(r);
        }
        System.out.println("Number of digits: " + count);
        
        //Finding the armstrong(addition of cube of each digit is same as the number) number
        int sum = 0;
        while(t>0)
        {
            r=t%10;
            t=t/10;
            sum = sum + r*r*r;
        }
        System.out.println(sum);
        if(sum==num)
            System.out.println("It's an armstrong number");
        else
            System.out.println("Not an armstrong number");
        
        
        // reverse a number and check for palindrome
        int rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse of " +  num + " : " + rev);
        if(rev==num)
            System.out.println("Number is palindrome.");
        else
            System.out.println("Number is not palindrome");
    }
    
}
