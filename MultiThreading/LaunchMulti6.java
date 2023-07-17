package MultiThreading;

class Demo2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<2;i++){
        try 
        {
            System.out.println("Focus is important");
            Thread.sleep(3000);
        } 
        catch (InterruptedException e)
        {
            System.out.println("Something went wrong");
        }
        }
    }
}
public class LaunchMulti6 
{
    public static void main(String[] args) throws Exception
    {
        
        Demo2 d = new Demo2();

        System.out.println("Main Thread Started");
        Thread t1 = new Thread(d);
        System.out.println(t1.isAlive()); // isAlive() method is used to check method is thread is started or not .

        t1.start();
        System.out.println(t1.isAlive());
        t1.join(); // join() method is used to execute all the first task 

        System.out.println("Main Thread task completed.");

    }
}

