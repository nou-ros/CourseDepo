
class MyRun implements Runnable{
	public void run(){}
}

// Thread constructor with string in thread extend
class MyThread extends Thread
{	
	public MyThread(String name)
	{
		super(name);
		// Providing maximum priority, default priority is 5
		//setPriority(Thread.MAX_PRIORITY);
		// MIN_PRIORITY is 1 adding 2 more priority
		setPriority(Thread.MIN_PRIORITY + 2);
	}
	
	public void run()
	{
		int count = 1;
		while(count<100)
		{
			System.out.println(count++);
			try{
				//Thread sleeping
				//this throws an exception thus try exception
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

public class _03_thread_methods{

	public static void main(String [] args)throws Exception{
		// thread constructor with String
		Thread t1 = new Thread("Thread1");
		// Thread constructor with runnable and string
		Thread t2 = new Thread(new MyRun(), "Thread2");
		
		MyThread t3 = new MyThread("Thread3");
		
		System.out.println("ID: " + t3.getId());
		System.out.println("Name: " + t3.getName());
		System.out.println("Priority: " + t3.getPriority());
		System.out.println("State: " + t3.getState());
		t3.start();
		System.out.println("After starting, state: " + t3.getState());
		//interrupting a thread
		t3.interrupt();
		System.out.println("Alive: " + t3.isAlive());
	}
}