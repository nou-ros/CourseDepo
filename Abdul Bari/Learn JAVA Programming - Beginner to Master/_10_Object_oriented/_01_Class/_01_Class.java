import java.lang.*;

class Circle{
	public double radius;
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	
	public double circumference()
	{
		return perimeter();
	}
}

public class _01_Class{
	public static void main(String [] args)
	{
		System.out.println("||Circle Class||");
		Circle c = new Circle();
		Circle c2 = new Circle();
		c.radius=5;
		c2.radius=7;
		System.out.format("Area: %.2f\n", c.area());
		System.out.format("Perimeter: %.2f\n", c.perimeter());
		System.out.format("Circumference: %.2f\n", c.circumference());
		System.out.println("...............");
		System.out.format("Area: %.2f\n", c2.area());
		System.out.format("Perimeter: %.2f\n", c2.perimeter());
		System.out.format("Circumference: %.2f", c2.circumference());
	}
}