import java.lang.*;
import java.util.Scanner;

public class _02_Challenge_01{
	public static void main(String [] args)
	{

		// Finding sum of all elements
		
		int A [] = {3,9,7,8,12,6,1,5,4,10};
		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			sum=sum+A[i];
		}
		System.out.println(sum);
		
		System.out.println();
		// Searching an Element	
		System.out.println("Enter an element: ");
		Scanner scan = new Scanner(System.in);
		int search = scan.nextInt();
		int p=0;
		for(int i=0;i<A.length;i++)
		{
			if(search==A[i])
			{
				p=i;
				//System.exit();
			}
				
		}
		if(p>0)
			System.out.println(search+" is found at: " + p);
		else
			System.out.println(search+" not found");
		
		System.out.println();
		// Finding Maximum Element
		int max=0;
		for(int i=0;i<A.length;i++)
		{
			if(max<A[i])
			{
				max=A[i];
			}
				
		}
		System.out.println("Maximum element is: "+max);
		
		// Finding Second Largest Element
		int max1=max2=A[0];
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max1)
			{
				max2=max1;
				max1=A[i];
			}
			else if(A[i]>max2)
				max2=A[i];
				
		}
		System.out.println("2nd largest element is: "+max2);
	}
}