import java.lang.*;

public class _05_Challenge_02{
	static double area(double radius)
	{
		//circle
		return Math.PI*radius*radius;
	}
	
	static double area(double length, double breadth)
	{
		//rectangle 
		return length*breadth;		
	}
	
	static int reverse(int n)
	{
		int rem=0;
		while(n!=0)
		{
			rem=rem*10+n%10;
			n=n/10;
		}
		return rem;
	}
	
	static int [] reverse(int A[])	
	{
		int B[] = new int[A.length];
		for(int i=A.length-1,j=0;i>=0;i--,j++)
		{
			B[j]=A[i];
		}
		return B;
	}
	static boolean validate(String name)
	{
		return name.matches("[a-zA-Z\\s]+");
	}
	
	static boolean validate(int age)
	{
		return age>=3 && age<=15;		
	}

	public static void main(String [] args)
	{
		double radius=4;
		double length=5;
		double breadth=3;
		
		System.out.println("Area of rectangle: " + area(length,breadth));
		System.out.format("Area of circle: %.2f\n", area(radius));

		System.out.println();
		
		int A[] = {2,3,4,5};
		int C[] = new int[A.length];
		int numb = 732;
		System.out.println(reverse(numb));
		for( int x:A)
		{
			System.out.println(x);
		}
		C=reverse(A);
		System.out.println("Reverse of A: ");
		for(int x:reverse(A))
		{
			System.out.println(x);
		}
		
		String name = "nouros yousuf";
		System.out.println(validate(name));
		int age=12;
		System.out.println(validate(age));
	}
}