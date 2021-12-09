import java.lang.*;

class MyObject{
	public String toString()
	{
		return "My Object";
	}
	
	// hashCode are so it is better not to overwrite them but we can if we want 
	public int hashCode()
	{
		return 100;
	}
	
	public boolean equals(Object o)
	{
		return this.hashCode()==o.hashCode();
	}
}

public class _01_object{
	public static void main(String args[])
	{
		Object ob1 = new Object();
		System.out.println(ob1);
		Object ob2 = new Object();
		Object ob3 = ob1;
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		
		System.out.println("Object one hashcode: " + ob1.hashCode() + "\nObject two hashcode: " + ob2.hashCode() + "\nObject three hashcode: " + ob3.hashCode());
		
		MyObject o1 = new MyObject();
		System.out.println(o1);
		MyObject o2 = new MyObject();
		System.out.println(o1.equals(o2));
		
	}
}

//javap java.lang.Object - to check the class methods of a package.

