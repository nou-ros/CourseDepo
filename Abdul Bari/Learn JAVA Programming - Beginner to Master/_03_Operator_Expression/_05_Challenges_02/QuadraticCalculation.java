import java.lang.*;
import java.util.Scanner;

public class QuadraticCalculation{
	public static void main(String args[])
	{
		// Quadratic expression
		int a, b, c;
		System.out.println("Enter a, b and c: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		double r1, r2;
		r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
	
		System.out.println("Roots of the quadratic equation: " + r1 + " " + r2); 
		
	}
}