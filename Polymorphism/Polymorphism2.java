package Polymorphism;

class Human
{
    public void eat()
    {
        System.out.println("Human is eating");
    }
    public void run()
    {
        System.out.println("Human is Running");
    }
}

class Student extends Human
{
    public void eat()
    {
        System.out.println("Student is eating");
    }
    public void run()
    {
        System.out.println("Student is Running");
    }
}

class Worker extends Human
{
    public void eat()
    {
        System.out.println("Worker is eating");
    }
    public void run()
    {
        System.out.println("Worker is Running");
    }
}

class Runner extends Human 
{
    public void eat()
    {
        System.out.println("Runner is eating");
    }
    public void run()
    {
        System.out.println("Runner is Running");
    }
}

class Polymorphism
{
    public void Poly(Human ref)
    {
        ref.eat();
        ref.run();

        System.out.println("------------------------");
    }
}
public class Polymorphism2 {
    public static void main(String[] args) {

         Student s = new Student();

         Worker w = new Worker();

         Runner r = new Runner();

         Polymorphism poly = new Polymorphism();
         poly.Poly(s);
         poly.Poly(w);
         poly.Poly(r);

         // Instead of Calling 

        //  s.eat();
        //  s.run();

        //  w.eat();
        //  w.run();

        //  r.eat();
        //  r.run();
    }
}
