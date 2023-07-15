package Interface;

interface X
{
    void show();
    default void config()  // Default Method in Interface  //Java8Feature
    {
        System.out.println("Default interface method");
    }
    static void cond()     // Static Method in Interface  //Java8Feature
    {
        System.out.println("Static interface method");
    }
}
interface A
{
    void write();
}
class Y implements X , A // We can implement more than two Interfaces simultaneously
{
   public void show()
   {
    System.out.println("Showing");
   }

   public void write()
   {
    System.out.println("writing");
   }
   // We can override the default and static method 
}
public class Demo2 {
    public static void main(String[] args) {
         Y y = new Y();
         y.show();
         y.config();
         
         X.cond();
    }
}
