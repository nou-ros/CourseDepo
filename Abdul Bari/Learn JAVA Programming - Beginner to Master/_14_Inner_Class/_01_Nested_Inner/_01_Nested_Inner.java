import java.lang.*;

class Outer{
	int x = 10;
	Inner i = new Inner();
	static int b=5;
	class Inner
	{
		int y=20;
		public void innerDisplay()
		{
			System.out.println(x + " " + y + " " + b);
		}
	}
	
	public void outerDisplay()
	{
		//Inner i = new Inner(); // we can create object of inner class inside a method too so it will be access only here
		i.innerDisplay();
		System.out.println(i.y);
	}
}

public class _01_Nested_Inner{
	public static void main(String [] args)
	{
		Outer o = new Outer();
		o.outerDisplay();
		// another way to access inner class features
		Outer.Inner oi = new Outer().new Inner();
		oi.innerDisplay();
	}
}