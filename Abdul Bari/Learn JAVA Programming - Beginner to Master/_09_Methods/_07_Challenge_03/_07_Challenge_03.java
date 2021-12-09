import java.lang.*;

public class _07_Challenge_03{
	
	static int maximum(int ...A)
	{	
		int max=0;
		for(int i=0;i<A.length;i++)			
		{
			if(max<A[i])	
				max=A[i];
		}
		return max;
	}
	static int sumList(int ...A)
	{
		int sum=0;
		for(int x:A)
			sum=sum+x;
		return sum;
	}
	
	static double discount(double ...P)
	{
		double sum=0;
		for(double x:P)
			sum=sum+x;
		if(sum<500)
			return sum*0.10;
		else if(500<=sum && sum<1000)
			return sum*0.15;
		else 
			return sum*0.20;
	}

	public static void main(String [] args)
	{
		System.out.println(maximum(3,9,2,5,7));
		System.out.println(sumList(3,9,2,5,7));
		System.out.println(discount(300f,490f,210f,50f,700f));
	}
}