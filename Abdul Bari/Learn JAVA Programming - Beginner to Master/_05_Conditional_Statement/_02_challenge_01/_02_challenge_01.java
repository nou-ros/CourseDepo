package _02_challenge_01;

import java.util.Scanner;

public class _02_challenge_01 {

    public static void main(String[] args) {
        // TODO code application logic here
        // find a number is odd or even
        // find person is young or not young
        // find grades for given marks
        
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        if (num%2==0)
//        {
//            System.out.println("Even");
//        }
//        else
//        {
//            System.out.println("Odd");
//        }
        
//        System.out.println("Enter age: ");
//        int age = sc.nextInt();
//        if (age>=14 && age<=55)
//        {
//            System.out.println("Young!");
//        }
//        else
//        {
//            System.out.println("not young!");
//        }

        int m1,m2,m3;
        System.out.println("Enter marks of 3 Subjects ");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        float avg=(float)(m1+m2+m3)/3;

        if(avg>=70)
        {
            System.out.println("Grade A");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.println("Grade B");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.println("Grade C");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.println("Grade D");
        }
        else 
        {
            System.out.println("Grade E");
        }

    }
    
}
