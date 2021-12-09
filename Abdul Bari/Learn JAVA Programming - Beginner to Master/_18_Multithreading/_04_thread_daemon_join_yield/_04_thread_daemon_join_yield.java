class MyThread extends Thread{
	public void run()
	{
		int count=1;
		while(true)
		{
			System.out.println(count++ + "My Thread");
		}
	}
}

public class _04_thread_daemon_join_yield{
	public static void main(String args[]) throws Exception{
		MyThread t = new MyThread();
		//daemon
		t.setDaemon(true);
		t.start();
		/*
		try
		{
			//main thread is sleeping to see daemon thread workings. When main thread ends daemon threads also terminates.
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		// another way is to join the main thread so it will wait for other threads to complete
		Thread mainThread = Thread.currentThread();
		mainThread.join();
		*/
		//yield
		int count=1;
		while(true)
		{
			System.out.println(count++ + "Main");
			Thread.yield();
		}
		
	}
}