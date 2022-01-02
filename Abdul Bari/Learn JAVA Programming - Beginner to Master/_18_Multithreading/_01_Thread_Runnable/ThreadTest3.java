package _01_Thread_Runnable;

class MyRunnable implements Runnable{
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i + " Hello ");
            i++; 
        }
    }
}
public class ThreadTest3{
    public static void main(String args[]){
        MyRunnable t = new MyRunnable();
        Thread th = new Thread(t);
        th.start(); 
        int i = 1;
        while(true){
            System.out.println(i + " world");
            i++;
        }
    }
}
