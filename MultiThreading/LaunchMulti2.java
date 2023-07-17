package MultiThreading;

import java.util.Scanner;

class Calc extends Thread   // Thread is Created extending the Thread class 
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
class Message extends Thread 
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
public class LaunchMulti2 {
    public static void main(String[] args) {
        
        System.out.println("Main Thread");

        Calc t1 = new Calc(); // Thread Object is created .

        Message t2 = new Message();

        t1.start(); // Thread is Registered to Thread Schedular it handles thread automatically.
        t2.start();
    }
}
