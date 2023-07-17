package MultiThreading;
                                    // States OF Thread 
class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread Exicuting...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Something Error");
        }
        System.out.println("Child Thread task completed");
    }
}
public class LaunchMulti5 {
    public static void main(String[] args) {
        
        Demo d = new Demo();

        Thread t1 = new Thread(d); // Implicitly creating thread // It is in New state

        t1.start(); // Runnable State 

        // After Starting Thread it is in Running State 
        // After Running state if it exits then it is in Dead state , else in Blocked state 
        // It is in Blocked state when there is wait() , sleep() , join() methods
    }
}
