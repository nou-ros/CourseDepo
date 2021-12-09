import java.lang.*;
import java.util.Scanner;

public class _03_Challenge_02{
	public static void main(String [] args)
	{
		//Rotating an array
		int [] B = {1,2,3,4,5};
		int temp=B[0];
		for(int i=1;i<B.length;i++)
		{
			B[i-1] = B[i];
		}
		B[B.length-1]=temp;
		for(int x:B)
			System.out.print(x+",");
		System.out.println("");

		//Inserting an element
		int A[] = new int[10];
		A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
		int n=6;
		for(int i=0;i<n;i++)
			System.out.println(A[i]+",");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a position: ");
		int pos=scan.nextInt();
		System.out.println("Enter a number: ");
		int numb=scan.nextInt();
		for(int i=n;i>pos;i--)
		{
			A[i]=A[i-1];	
		}
		A[pos]=numb;

		for(int x:A)
			System.out.print(x+",");
		
		//deleting an element
		System.out.println("Enter a position: ");
		int del=scan.nextInt();
		for(int i=del;i<n;i++)
			A[i]=A[i+1];
		for(int x:A)
			System.out.print(x+",");
	}
}