import java.lang.*;
import java.util.Scanner;

public class _01_Exception_Handling{
	public static void main(String [] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
	
		try 
		{
			c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Devide by zero: " + e);
		}

		System.out.println("Program ended!!");
	}
}