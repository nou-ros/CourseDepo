import java.util.*;


class MyData{
	synchronized public void display(String str)
	{
		for(int i=0;i<str.length();i++)
			System.out.print(str.charAt(i));
			try{
				# even if the current thread sleep another thread can not enter 
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
	//or we can write
		/*
			synchronized(this)
			{
				for(int i=0;i<str.length();i++)
					System.out.print(str.charAt(i));
			}
		*/
}

class MyThread extends Thread{
	MyData data;
	
	public MyThread(MyData d)
	{
		this.data = d;
	}
	
	public void run()
	{
		data.display("Hello World!");
	}
}

class MyThread2 extends Thread{
	MyData data2;
	
	
	public MyThread2(MyData d)
	{
		this.data2 = d;
	}
	
	public void run()
	{
		data2.display("Welcome All!");
	}
}

public class _05_synchronisation{
	public static void main(String [] args)
	{
		MyData d = new MyData();
		MyThread t = new MyThread(d);
		MyThread2 t2 = new MyThread2(d);
		
		t.start();
		t2.start();
	}
}