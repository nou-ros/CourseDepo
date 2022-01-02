package _02_Thread_Methods;


class TestThread extends Thread{
    public void run(){
        int count = 1;
        while(true){
            System.out.println(count++ + " My thread");
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) throws Exception{
        TestThread t = new TestThread();
        //daemon thread
        // t.setDaemon(true);
        // t.start();
        
        //to check daemon thread
        // try{ 
        //     Thread.sleep(100); 
        // }catch(Exception e){
        //     System.out.println(e);
        // }
        
        //here we are accessing the main thread and joining with daemon 
        // Thread mainThread = Thread.currentThread();
        // mainThread.join();
        
        // yield
        t.start();
        int count = 1;
        while(true){
            System.out.println(count++ + " Main ");
            // here main thread will give more execution time to other threads with yield
            Thread.yield();
        }
    }
}
