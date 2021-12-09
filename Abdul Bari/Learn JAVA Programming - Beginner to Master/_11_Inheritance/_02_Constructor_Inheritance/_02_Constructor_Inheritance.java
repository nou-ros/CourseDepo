import java.lang.*;

class Parent{
	// parent class constructor will be executed first
	public Parent()
	{
		System.out.println("Parent Constructor - non param");
	}
	
	Parent(int x)
	{
		System.out.println("Param of Parent " + x);
	}
}

class Child extends Parent{
	public Child()
	{
		System.out.println("Child Constructor - non param");
	}
	
	Child(int x)
	{
		System.out.println("Param of Child");
	}
	Child(int x, int y)
	{
		super(x); // Calling the parent param constructor
		System.out.println("2 Param of Child " + y);
	}
}

class GrandChild extends Child{
	public GrandChild()
	{
		System.out.println("Grand Child Constructor - non param");
	}
	GrandChild(int x)
	{
		System.out.println("Param of GrandChild");
	}
}

public class _02_Constructor_Inheritance{
	public static void main(String [] args)
	{	
		// non param constructor
		//Parent p = new Parent();
		//Child c = new Child();
		//Child c1 = new Child(29);
		Child c1 = new Child(23,11);
		//GrandChild gc = new GrandChild();
		
		
	}
}