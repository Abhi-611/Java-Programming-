package MultiThreading;

import java.util.Scanner;
class Demo
{

}
class Calc extends Demo implements Runnable  // Thread is Created extending the Thread class 
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        try{
        int result = num1 + num2 ;
        System.out.println("Result :"+result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            sc.close();
        }

        System.out.println("----------------------------");
    }
}
class Message extends Demo implements Runnable             // Mostlly implements Runnable Method 
{
    public void run()
    {
        System.out.println("Displaying Message");
        try{
        for(int i=0;i<3;i++)
        {
            System.out.println("Focus is important to master skills");
            Thread.sleep(2000);
        }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.getMessage());
        }
    }
    
}
public class LaunchMulti3 {
    public static void main(String[] args) {
         
        Calc c1 = new Calc();

        Message m1 = new Message();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m1);

        t1.start(); // Creates Separate Thread 
        t2.start();

    }
}
