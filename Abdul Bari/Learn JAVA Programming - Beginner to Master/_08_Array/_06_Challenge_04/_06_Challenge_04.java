import java.lang.*;

public class _06_Challenge_04{
	public static void main(String [] args)
	{
		//Add 2 matrices
		int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
		int B[][] = {{1,5,2},{6,8,4},{3,9,7}};
		int C[][] = new int[3][3];
		int D[][] = new int[3][3];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		for(int x[]: C)
		{
			for(int y: x)
			{
				System.out.print(y+" ");			
			}
			System.out.println();
		}
		
		System.out.println();
		// Multiply 2 Matrices
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				D[i][j]=0;
				for(int k=0;k<3;k++)
				{
					D[i][j]=C[i][j]+A[i][k]*B[k][j];
				}
				
			}

		}
		for(int x[]: D)
		{
			for(int y: x)
			{
				System.out.print(y+" ");			
			}
			System.out.println();
		}

		System.out.println();
		//Sorting Array of strings
		String arr[] = {"java", "python", "pascal", "smalltalk", "ada", "basic"};
		
		java.util.Arrays.sort(arr);
		for (String x: arr)
			System.out.println(x);

	}
}