import java.lang.*;

public class _10_challenge_07{
	public static void main(String [] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)	
			{
				if(j>=i)
					System.out.print(" * ");
				else
					System.out.print(" _ ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)	
			{
				if((i+j)>5)
					System.out.print(" * ");
				else
					System.out.print(" _ ");
			}

			for(int j=1;j<=5;j++)
			{
				if(j>=i)
					System.out.print(" _ ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
	}
}