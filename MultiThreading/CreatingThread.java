package MultiThreading;

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Child Thread");
        int pri = Thread.currentThread().getPriority();
        System.out.println(pri);
    }
}
public class CreatingThread {
    public static void main(String[] args) {
        
        System.out.println("Main Thread");
        System.out.println(Thread.currentThread().getPriority());
        MyThread t = new MyThread();
        t.start();
    }
}
