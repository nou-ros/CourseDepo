public class _02_Multiple_Nested_Try_Catch{
		public static void main(String [] args)
		{
			int A[] = {30,20,10,40,0};
			int c;
			
			try{
				c = A[0]/A[1];
				System.out.println(c);
				// inside a try block
				try{
					System.out.println(A[10]);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Array index out of bounds");
				}
				System.out.println(A[5]);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Division by zero");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array index out of bounds");
			}
			System.out.println("Program ended!!");
		}
		
}