import java.io.*;
import java.util.Scanner;

public class _07_Try_Resource{
	
	static void divide() throws Exception
	{
		//try with resources -> this will auto close the resources say both scanner and file
		try(FileInputStream fi = new FileInputStream("F:/Java/JavaLab/_17_Exception_Handling/_07_Try_Resources/test.txt"); Scanner sc = new Scanner(fi))
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(a/c);
		}

	}
	
	public static void main(String [] args) throws Exception
	{
		try{
			divide();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}