package ExceptionHandling;

public class Exception1 {
    public static void main(String[] args) {
        
        int num1 = 20;
        int num2 = 0;
        int result = 0;
        int values[] = {4,5,9,8};
        try 
        {
            result = num1 / num2;
            System.out.println(values[6]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Limit is reached");
        }
        catch(Exception e)
        {
            System.out.println("Something went wwrong..." + e);
        }
        System.out.println(result);
        System.out.println("Bye");
    }
}
