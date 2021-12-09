import java.lang.*;

public class _09_Recursion{
	
	static void fun(int n)
	{
		if(n>0)
		{
			System.out.println(n);
			fun(n-1);
		}
	}
	
	static void fun1(int n)
	{
		if(n>0)
		{
			fun1(n-1);
			System.out.println(n);
		}	
	}

	public static void main(String [] args)
	{
		System.out.println("Recursion:1");
		fun(3);
		System.out.println("Recursion:2");
		fun1(3);
	}
}