package Constructor;

class Demo2
{
    private int a ;
    private int b ;

    public Demo2()
    {
        System.out.println("Zero paramitarized constructor");
    }

    public Demo2(int a , int b)
    {
        this.a = a ;
        this.b = b ;
    }

    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Demo1 {
    public static void main(String[] args) {
        
        Demo2 d = new Demo2();
        d.disp();

        Demo2 d1 = new Demo2(10,20);
        d1.disp();
    }
}
