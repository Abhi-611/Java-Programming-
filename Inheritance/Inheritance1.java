package Inheritance;

class Human  // Super class // Base class // Parent class
{
    // private String name ; Constructor or Private variables cannot be inherited.
    int age ;

    Human()
    {
        System.out.println("Human Constructor");
    }
    public void sleep()
    {
        age = 19;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human  // Chils class // Sub class // Derived class
{
    // public Student1()
    //{
        //super();
    //}
  void disp()
  {
    System.out.println("Student1 inside Method");
  }
}
public class Inheritance1 {
    public static void main(String[] args) {
        
        Student s = new Student();
        s.sleep();
        s.disp();
    }
}
