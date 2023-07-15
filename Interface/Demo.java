package Interface;

interface A
{
    int num = 10; // Interface variables are Public Static Final
    void show(); // Methods are Public and Abstract
}
public class Demo {
    public static void main(String[] args) {

        // We cannot create a object of interface
        // A a = new A();
        
        System.out.println(A.num);

    }
}
