import java.lang.*;

class Test{

	static int x = 10;
	int y = 20;

	void show()
	{
		System.out.println(x+" "+y);
	}
	
	static void display()
	{
		System.out.println(x);
	}
}

public class _01_Static_Member{
	public static void main(String [] args)
	{
		Test t1=new Test();
		t1.show();
		t1.x=20;
		t1.y=30;
		t1.show();
		
		Test t2 = new Test();	
		t2.show();
		Test.display();		
	}
}