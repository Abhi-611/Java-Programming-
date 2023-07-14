package Constructor;

class Student1
{
    private int age ;
    private String name ;

    public Student1()
    {
        //super();  //Default it is includ while executing the Program and class super class Constructor
        System.out.println("Default Constructor is Called");
        age = 18 ;
        name = "Rohan";
    }

    public Student1(int age)
    {
        this(); //Calls the Constructor in same class ; 
        this.age = age ;
        name = "Virat";
    }

    public Student1(int age , String name)
    {
        this(31);
        this.age = age ;
        this.name = name ;
    }

    public void disp1()
    {
        System.out.println(age);
        System.out.println(name);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        
        Student1 s = new Student1();
        s.disp1();

        Student1 s1 = new Student1(23);
        s1.disp1();

        Student1 s2 = new Student1(21 , "Abhi");
        s2.disp1();

    }
}
