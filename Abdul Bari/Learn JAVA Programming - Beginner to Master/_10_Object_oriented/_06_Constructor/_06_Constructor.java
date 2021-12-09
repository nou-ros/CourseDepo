import java.lang.*;

class Rectangle{
	private double length;
	private double breadth;
	
	public Rectangle()
	{	
		length=1;
		breadth=1;
	}
	public Rectangle(double l, double b)
	{
		setLength(l);
		setBreadth(b);
	}
	public Rectangle(double s)
	{
		length=breadth=s;
	}
	public double getLength()
	{
		return length;
	}
	public double getBreadth()
	{
		return breadth;
	}
	public void setLength(double l)
	{
		if(l>=0)
			length=l;
		else 
			length=1;
	}
	public void setBreadth(double b)
	{
		if(b>=0)
			breadth=b;
		else 
			breadth=1;
	}
	public double area()
	{
		return getLength()*getBreadth();
	}
}

public class _06_Constructor{
	public static void main(String [] args)
	{
		Rectangle r = new Rectangle();
		Rectangle b = new Rectangle(8,5);
		System.out.println(r.area());
		System.out.println(b.area());
	}
}