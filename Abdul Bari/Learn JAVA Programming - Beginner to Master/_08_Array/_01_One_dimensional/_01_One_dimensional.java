import java.lang.*;

public class _01_One_dimensional{
	public static void main(String [] args){
	
		int A[] = new int[5];
		int B[] = {1,2,3,4,5};
		int C[];
		C = new int[5];
		int []D = new int[5];

		B[2]=15;
		
		for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
		System.out.println();
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]);
		}
		System.out.println();
		for(int x:B)
		{	
			//we cannot change values with for each loop only can read them
			System.out.println(x++);
		}
		System.out.println();
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]++);
		}
		System.out.println();
		for(int x:B)
		{	
			System.out.println(x);
		}
		System.out.println(B);
	}
}