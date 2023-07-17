package MultiThreading;

class Abhi implements Runnable
{
    public void run()
    {
        try
        {
        System.out.println(Thread.currentThread().getName()+"Has entered into the Parking");
        Thread.sleep(3000);

        synchronized(this) // synchronized keyword is used to execute one resource at a time
        {
        System.out.println(Thread.currentThread().getName()+"Got into the car to drive");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName()+"Started driving the car");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName()+"Came back and parked the car");
        }
        }
        catch(Exception e)
        {
            System.out.println("Some Error");
        }

    }
}
public class LaunchMulti8 {
    public static void main(String[] args) {

        Abhi ab = new Abhi();

        Thread t1 = new Thread(ab);
        Thread t2 = new Thread(ab);
        Thread t3 = new Thread(ab);

        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");

        t1.start();
        t2.start();
        t3.start();
        
    }
}
