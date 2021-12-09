import java.lang.*;
import java.util.Scanner; 

public class _03_Challenge_01{
	
	static void prime(int a)
	{
		int flag=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
				flag=1;
		}
		if(flag==0)
			System.out.println(a + " is a prime number.");
		else
			System.out.println(a + " is not a prime number");
	}

	int gcd(int b, int c)
	{
		int value=0; 
		while(b!=c)
		{
			if(b>c)
				b=b-c;
			else
				c=c-b;
		}
		return c;
	}
	
	static int max(int A[])
	{	
		int max=0;
		for(int i=0;i<A.length;i++)
		{
			if(max<A[i])
			{
				max=A[i];
			}
		}
		return max;
	}

	public static void main(String [] args)
	{
		int a;
//		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
//		a = scan.nextInt();
//		prime(a);
		System.out.println("GCD");
		System.out.println("Enter two numbers: ");
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d;

		_03_Challenge_01 g = new _03_Challenge_01();
		d=g.gcd(b,c);
		System.out.println("GCD of " + b + " and " + c +" is: "+ d);

		int A[] = {2,8,21,9,1};
		System.out.println("Maximum value in the array is: "+max(A));
	}
}