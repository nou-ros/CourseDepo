import java.lang.*;

public class _09_challenge_06{
	public static void main(String [] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		int count = 0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count++;
				System.out.format("%02d ",count); 
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.format("%02d ",j); 
			}
			System.out.println();
		}
		System.out.println();
		int value=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i+1;j++)
			{
				value++;
				System.out.format("%02d ",value); 
			}
			System.out.println();
		}
	}
}