package MultiThreading;

import java.util.Scanner;

                                      // Multiple Task within Single run() method

class MyThread1 extends Thread
{
    public void run()
    {
        String tName = Thread.currentThread().getName();

        if(tName.equals("Calc"))
        {
            calc();
        }
        else
        {
            importantMessage();
        }
    }

    public void calc()
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

    public void importantMessage()
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

public class LaunchMulti4 {
    public static void main(String[] args) {
        
        MyThread1 t1 = new MyThread1();

        MyThread1 t2 = new MyThread1();

        t1.setName("Calc");
        t2.setName("Print");

        t1.start();
        t2.start();
    }
    
}
