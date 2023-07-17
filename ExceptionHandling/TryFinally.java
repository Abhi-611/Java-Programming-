package ExceptionHandling;

import java.util.Scanner;

public class TryFinally {
    public static void main(String[] args) {
        
        int num = 0;

        Scanner sc = new Scanner(System.in);
        
        // try with resource
        // try(Scanner sc = new Scanner(System.in)
        // {
        //     num = sc.nextInt();
        // }

        try
        {
            num = sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Enter a Number");
        }
        finally
        {
            sc.close();
        }
        System.out.println(num);
    
    }
}
