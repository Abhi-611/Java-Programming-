package Strings;

public class Static {

    static int age;// 1
    
    static{ // Static Block 2
        age = 18 ;
        System.out.println("Static Block");
        System.out.println(age);
    }
    static void disp()
    {
        System.out.println("Static Method");
    }

    public static void main(String[] args) { // Static Method 3
        disp();
        System.out.println("Static Main method");
        
    }
}
