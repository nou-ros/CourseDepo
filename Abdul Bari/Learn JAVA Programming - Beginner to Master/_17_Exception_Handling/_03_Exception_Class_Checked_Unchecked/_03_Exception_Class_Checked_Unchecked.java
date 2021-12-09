import java.io.*;

public class _03_Exception_Class_Checked_Unchecked{
	
	static void fun1()
	{
		try
		{
			FileInputStream  fi = new FileInputStream("My.txt");
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			//will raise the trace
			e.printStackTrace();
		}
	}
	
	static void fun2()
	{
		fun1();
	}	
	
	static void fun3()
	{
		fun2();
	}
	
	public static void main(String [] args)
	{
		fun3();
	}
}