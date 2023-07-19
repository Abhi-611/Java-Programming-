package MapGenerics;

import java.util.*;
import java.util.Map.*;


class Student
{
    private String name ;
    private int age ;
    private String city;

    public Student(String name , int age , String city)
    {
        this.name = name ;
        this.age = age ;
        this.city = city ;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String toString()
    {
        return name + " " + age + " " + city;
    }

}

public class Map3 {
    public static void main(String[] args) {
        
        Student st1 = new Student("Rohit", 45, "Mumbai");
        Student st2 = new Student("Rohan", 20, "Pune");
        Student st3 = new Student("Rahul", 18, "Kerala");

        Map map = new HashMap();

        map.put(1, st1);
        map.put(2, st2);
        map.put(3, st3);

        System.out.println(map);

        Set set = map.entrySet();

        Iterator itr = set.iterator();

        while(itr.hasNext())
        {
            Map.Entry data = (Entry)itr.next();
            System.out.println(data.getKey() + " " +data.getValue());
            // System.out.println(itr.next());
        }


    }
}
