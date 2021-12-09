import java.lang.*;

class Cylinder{
	public double radius;
	public double height;

	public double lidArea()
	{
		return Math.PI*radius*radius;
	}
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
	public double totalSurfaceArea()
	{
		return 2*lidArea()+circumference()*height;
	}
	public double volume()
	{
		return lidArea()*height;
	}
	
}

public class _03_Challenge_02{
	public static void main(String [] args)
	{
		Cylinder c = new Cylinder();
		c.radius=5;
		c.height=7;
		System.out.println("Lid Area: "+c.lidArea());
		System.out.println("circumference: "+c.circumference());
		System.out.println("totalSurfaceArea: "+c.totalSurfaceArea());
		System.out.println("volume: "+c.volume());
	}
}