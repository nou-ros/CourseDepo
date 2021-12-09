public class _06_Finally{
	
	static void meth1() throws Exception
	{
		try
		{	
			throw new Exception();
		}
		finally{
			System.out.println("finally");
		}
	}
	
	public static void main(String [] args)
	{
		try{
			
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally{
			// we can use it to close resources
			System.out.println("Final Message");
		}
		try 
		{	
			meth1();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}