import java.lang.*;

public class _04_Challenge_03{
	public static void main(String [] args)
	{	
		//Copying an Array
		int A[] = {10,20,30,40,50};
		int B[]=new int[5];
		/*
		for(int i=0;i<A.length;i++)
		{
			B[i]=A[i];
		}
		for(int x:B)
		{
			System.out.print(x+",");
		}
		*/
		System.out.println();
		//Reverse Copying an Array
		for(int i=A.length-1,j=0;i>=0;i--,j++)
		{
			B[j]=A[i];
		}
		for(int x:B)
		{
			System.out.print(x+",");
		}
		System.out.println();
		//Increasing size of Array
		int C[] = {8,6,10,9,2};
		int D[] = new int[2*C.length];
		System.out.println("Length of C: "+C.length);
		for(int i=0;i<C.length;i++)
		{
			D[i]=C[i];
		}
		C=D;
		System.out.println("Length of C: "+C.length);
		
	}
}