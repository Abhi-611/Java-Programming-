package Abstraction;

// final class Animal1  // We cannot extend a Final Class
// {
//     public void sleep()
//     {
//         System.out.println("Animal is sleeping");
//     }
// }
class Animal1
{
    final int age = 18;
    final public void sleep() 
    {
        // age = 19;
        System.out.println("Animal is sleeping");
    }
}
class Tiger extends Animal1
{
    // Final method is overriden but not modified 
}
public class FinalK {
    public static void main(String[] args) {
         Tiger t = new Tiger();
         t.sleep();
         
    }
}
