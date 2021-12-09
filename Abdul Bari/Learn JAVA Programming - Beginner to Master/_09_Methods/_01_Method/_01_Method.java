import java.lang.*;

public class _01_Method{
	static int max(int x, int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
	
	int min(int x, int y)
	{
		if(x<y)
			return x;
		else
			return y;
	}
	
	static void inc(int x)
	{
		x++;
		System.out.println(x);
	}
	public static void main(String [] args)
	{
		int a,b,c,d;
		a=10;
		b=15;
		c=max(a,b);
		
		//without static we have to create an object
		_01_Method m = new _01_Method();
		d=m.min(a,b);
		System.out.println("Maximum number: "+c+ "\n" + "Minimum number: "+ d);
		inc(a);
		System.out.println(a);
	}
}
