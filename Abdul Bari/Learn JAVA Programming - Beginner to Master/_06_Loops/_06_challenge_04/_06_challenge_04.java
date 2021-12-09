package _06_challenge_04;

import java.util.Scanner;

public class _06_challenge_04 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Display AP(arithmatic progression) series 
        //5,10,15,20... //7,9,11,13,15....
//        int start_num, diff, term;
        Scanner scan = new Scanner(System.in);
//        
//        System.out.println("Enter the starting number: ");
//        start_num = scan.nextInt();
//        System.out.println("Enter the difference: ");
//        diff = scan.nextInt();
//        System.out.println("Enter the term number: ");
//        term = scan.nextInt();
//        
//        int num=start_num;
//        System.out.println("The AP SeriesL");
//        for(int i=0;i<term;i++)
//        {
//            System.out.print(num + ",");
//            num=num+diff;
//        }
//        System.out.println();
//        //Display GP geomatric progression series
////        2,6,18,54 // 5,10,20,40
//        System.out.println("The GP series: ");
//        int gp_num=start_num;
//        for(int i=0;i<term;i++)
//        {
//            System.out.print(gp_num+" ");
//            gp_num=gp_num*diff;
//        }
        //Display fibonacci
        System.out.println("Fibonacci series ");
        int first=0;
        int second=1;
        int value;
        int times = scan.nextInt();
        System.out.print(first+","+second+",");
        for(int i=0;i<times;i++)
        {
            value=first+second;
            System.out.print(value+",");
            first=second;
            second=value;
        }
        
    }
    
}
