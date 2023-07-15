package LambdaExpression;

// Inner Class = member , static and Anonymous

class A
{
    public void show()
    {
        System.out.println("in Showing");
    }
    static class B
    {
        public void disp()
        {
        System.out.println("in displaying");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
         
        A obj = new A();
        obj.show();
       // obj.disp(); error

       //A.B obj2 = obj.new B(); // For member 

       A.B obj1 = new A.B(); // For Static
       obj1.disp(); 
    }
}
