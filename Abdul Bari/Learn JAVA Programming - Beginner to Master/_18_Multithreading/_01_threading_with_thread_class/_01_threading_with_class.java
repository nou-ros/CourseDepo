class MyThread extends Thread
{
		public void run()
		{
			int i=1;
			while(i<100)
			{
				System.out.println("Hello ");
				i++;
			}
		}
}

public class _01_threading_with_class{
	
	public static void main(String [] args)
	{
		MyThread t = new MyThread();
		t.start();
		int i=1;
		while(i<100)
		{
			System.out.println("world");
			i++;
		}
	}
}

/*
2nd way
public class _01_threading_with_class extends Thread{
	
	public void run()
	{
		int i=1;
		while(i<100)
		{
			System.out.println("Hello ");
			i++;
		}
	}
	
	public static void main(String [] args)
	{
		_01_threading_with_class t = new _01_threading_with_class();
		t.start();
		int i=1;
		while(i<100)
		{
			System.out.println("world");
			i++;
		}
	}
}