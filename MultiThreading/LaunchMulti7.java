package MultiThreading;

class Example implements Runnable
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            try{
            System.out.println("Focus is Important");
            Thread.sleep(3000);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
public class LaunchMulti7 {
    public static void main(String[] args) {
        
        Example e = new Example();

        Thread t1 = new Thread(e);
        t1.start();
        t1.interrupt(); // interrupt() method is used to interrupt the task()
    }
}
