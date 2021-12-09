//useful for interfaces and abstract class
import java.lang.*;

abstract class My{
	abstract void display();
}

interface Hi{
	void welcome();
}

class Outer{
	public void meth1()
	{
		// As we can not create object of abstract class but with annonymous class we can override the method and make a concrete class
		My m = new My(){
			public void display()
			{
				System.out.println("Annonymous class with abstract keyword");
			}
		};
		m.display();
	}
	
	public void meth2()
	{
		Hi n = new Hi(){
			public void welcome()
			{
				System.out.println("Annonymous class with interface keyword");
			}
		};
		n.welcome();
	}
}

public class _03_Annonymous_Inner{
	public static void main(String [] args)
	{
			Outer o = new Outer();
			o.meth1();
			o.meth2();
	}
}