import java.lang.*;

class My{
	//final variable is written in Capital format
	//final variable initialization 1
	final int MIN=1;
	final int MAX;
	final int NORMAL;
	//final variable initialization 2
	{
		NORMAL = 5;
	}
	My()
	{
		MAX=10;
	}
	
	// can't override final method
	final void method1()
	{
			System.out.println("Hello");
	}
	
	//can't extend final class
}

public class _03_Final{
	public static void main(String [] args)
	{	
		My m = new My();
		System.out.println(m.MIN+ " " + m.MAX + " " + m.NORMAL);
		m.method1();
	}
}