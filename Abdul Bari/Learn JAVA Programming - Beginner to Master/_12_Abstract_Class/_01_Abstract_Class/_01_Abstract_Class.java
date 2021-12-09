import java.lang.*;

abstract class Super
{

	public Super() { System.out.println("Super Constructor");}

	public void meth1()
	{
		System.out.println("Meth1 of Super");
	}
	
	abstract public void meth2();
}

class Sub extends Super
{
	//either sub will be named abstract or abstract method must be overridden in sub
	@Override
	public void meth2()
	{	
		System.out.println("Sub meth2");
	}
}

public class _01_Abstract_Class{
	public static void main(String [] args)
	{
		//Abstract class object creation is not possible but reference is possible
		Super s = new Sub();
		s.meth1();
		s.meth2();
	}
}