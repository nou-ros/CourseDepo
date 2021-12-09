import java.lang.*;

class Super
{
	public void display()
	{
		System.out.println("Super Class Display");
	}	
}

class Sub extends Super{
	@Override
	public void display()
	{
		System.out.println("Sub class Display");
	}
}

public class _05_Method_Overriding{
	public static void main(String [] args)
	{
		Super sup = new Super();
		sup.display();

		Sub s = new Sub();
		s.display();		
		
		Super ss = new Sub();
		ss.display();
	}
}