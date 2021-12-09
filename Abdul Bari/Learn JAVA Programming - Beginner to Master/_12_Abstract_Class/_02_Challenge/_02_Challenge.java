import java.lang.*;

abstract class Shape{

	abstract public double perimeter();
	abstract public double area();
}

class Circle extends Shape{
	double radius;

	@Override
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}

	@Override
	public double area()
	{
		return Math.PI*radius*radius;
	}
}

class Rectangle extends Shape{
	double length;
	double breadth;
	
	public void shape()
	{
		System.out.println("This is a Rectangle shape");
	}

	@Override
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	
	@Override
	public double area()
	{
		return length*breadth;
	}
}

public class _02_Challenge{
	public static void main(String [] args)
	{
		Circle s = new Circle();
		Rectangle r = new Rectangle();
		r.length=10;
		r.breadth=5;
		
		Shape sr=r;
		System.out.println(sr.area());
	}
}