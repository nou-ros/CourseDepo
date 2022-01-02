package _02_Thread_Methods;


class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        // setPriority(Thread.MIN_PRIORITY + 2);
    }

    public void run(){
        int count = 1;
        while(true){
            System.out.println(count++);
            // sleep
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
 
public class ThreadTest {
    public static void main(String[] args) throws Exception{
        MyThread t = new MyThread("My Thread 1");
        // System.out.println("ID: " + t.getId());;
        // System.out.println("Name: " + t.getName());
        // System.out.println("Priority: " + t.getPriority());
        // System.out.println("Status: " + t.getState());
        // System.out.println("Alive: " + t.isAlive());
        t.start();
        // interrupting the thread to check exception
        t.interrupt();
        // System.out.println("Status: " + t.getState());
        // System.out.println("Alive: " + t.isAlive());
    }
}
