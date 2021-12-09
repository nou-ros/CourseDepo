import java.lang.*;

public class _06_Variable_arguments{
	
	static void show(int ...A)
	{
		for(int x:A)
		{
			System.out.println(x);
		}
	}
	
	static void showList(int start, String ...S)
	{
		for(int i=0;i<S.length;i++)
		{
			System.out.println(start+". "+S[i]);
			start++;		
		}
	}

	public static void main(String [] args)
	{
		//show();
		//show(10,20,30);
		//show(new int[]{3,5,7,9,11,14}); //Anonymous array
		showList(5, "John", "Smith", "Ajay", "Brooker");

	}
}