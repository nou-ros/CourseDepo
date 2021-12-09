class MyThread implements Runnable
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

public class _02_threading_with_interface{
	
	public static void main(String [] args)
	{
		MyThread t = new MyThread();
		Thread th = new Thread(t);
		th.start();
		int i=1;
		while(i<100)
		{
			System.out.println("world");
			i++;
		}
	}
}

/*
public class _02_threading_with_interface implements Runnable{
	
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
		_02_threading_with_interface t = new _02_threading_with_interface();
		Thread th = new Thread(t);
		th.start();
		int i=1;
		while(i<100)
		{
			System.out.println("world");
			i++;
		}
	}
}
*/