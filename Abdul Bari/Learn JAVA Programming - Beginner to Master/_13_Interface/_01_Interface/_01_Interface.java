import java.lang.*;

interface Test{
	void meth1();
	void meth2();
}

class Mine implements Test{
	
	@Override
	public void meth1()
	{
		System.out.println("Meth1 of mine class");	
	}
	public void meth2()
	{
		System.out.println("Meth2 of mine class");	
	}
	public void meth3()
	{
		System.out.println("Meth3 of mine class");
	}
}

public class _01_Interface
{
	public static void main(String [] args)
	{
		Test t = new Mine();
		t.meth1();
		t.meth2();
	}
}