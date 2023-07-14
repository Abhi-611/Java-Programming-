package Constructor;

class Student 
{
    private int age ;
    private String name ;

    Student(int age , String name)
    {
        this.age = age ;
        this.name = name ;
    }

    public int getAge()
    {
        return age ;
    }
    public String getName()
    {
        return name ;
    }


}
public class Demo {
    public static void main(String[] args) {
        
        Student st = new Student(21 , "Abhi");

        int age = st.getAge();
        System.out.println(age);

        String name = st.getName();
        System.out.println(name);
        
    }
}
