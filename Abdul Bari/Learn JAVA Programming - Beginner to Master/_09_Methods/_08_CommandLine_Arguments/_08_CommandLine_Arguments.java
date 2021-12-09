//dir v*.*
import java.lang.*;

public class _08_CommandLine_Arguments{
	public static void main(String [] args)
	{
		//Adding numbers using command line
		double sum=0;
		for(String s:args)
		{
			if(s.matches("[0-9\\.]+"))
				sum=sum+Double.parseDouble(s);		
		}
		System.out.println("Sum is: "+sum);
	}
}