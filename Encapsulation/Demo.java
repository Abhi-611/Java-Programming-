package Encapsulation;

class Student
{
    private int age;  
    private String name;

     public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;          // Refers to the Current Object ;(Shadowing Problem Solve using 'this' Keyword)
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;       // Shadowing Problem is instance and local variable can be clash and jvm refers to local variable first.
    }
}
public class Demo {
    public static void main(String[] args) {
        
        Student obj = new Student();
        obj.setAge(18);
        int result = obj.getAge();
        System.out.println(result);
    }
}
