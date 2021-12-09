import java.lang.*;
import java.util.Scanner;

public class AreaCalculation{
	public static void main(String args[])
	{
		// Triangle of an area with base and height
		float base, height;
		System.out.println("Enter base and height of a triangle: ");
		Scanner sc = new Scanner(System.in);
		base = sc.nextFloat();
		height = sc.nextFloat();
		float area;
		area = .5f * base * height ;
		System.out.println("Area of the triangle with base and height: " + area); 
		
		// Triange of an area with 3 sides
		int a, b, c;
		float s;
		double area2;
		System.out.println("Enter 3 sides of triangle: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		s =(a+b+c)/2f;
		area2 = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of the triangle with three sides: " + area2);

	}
}