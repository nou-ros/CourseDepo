import java.lang.*;
// static block will execute once the class will load

class Test {
	static 
	{
		System.out.println("Block 1");
	}
	
	static
	{
		System.out.println("Block 2");
	}
}

public class _02_Static_Block{
	
	static
   	{
        	System.out.println("Block 3");
    	}
	
	public static void main(String [] args)
	{
		// loading the class
		Test t = new Test();
		System.out.println("This is main block");
	}
	
	 static
    	{
   	 	System.out.println("Block 4");
    	}

}