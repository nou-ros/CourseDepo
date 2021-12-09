import java.lang.*;
import java.util.*;

public class ReadKeyboard{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int x, y;
		System.out.println("Enter two numbers");
		x = sc.nextInt();
		y = sc.nextInt();

		int z = x + y;
		System.out.println("Sum is : " + z);
		
		sc.useRadix(2);
		int a = sc.nextInt();
		System.out.println("The decimal of the binary: " + a);
	}
}