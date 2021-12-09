class Outer{
	static int x = 10;
	int y = 20;
	static class Inner{
		void display()
		{
			// only access static member not non static 
			System.out.println(x);
		}
	}
}

class _04_Static_Inner{
	public static void main(String [] args)
	{
			Outer.Inner i = new Outer.Inner();
			i.display();
	}
}