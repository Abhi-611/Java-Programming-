package Polymorphism;

class AeroPlane1 
{
    public void takeOff() 
    {
        System.out.println("AeroPlane is takeOff.");
    }
    public void fly() // Overriden method 
    {
        System.out.println("AeroPlane is flying");
    }
}
class CargoPlane1 extends AeroPlane1
{

    public void takeOff() 
    {
        System.out.println("CargoPlane1 is Taking Off");
    }
    public void fly() // Overriden method 
    {
        System.out.println("CargoPlane1 is flying");
    }
}
class PassengerPlane1 extends AeroPlane1 // Both takeOff() and fly() are Inherited Method 
{
 public void takeOff() 
    {
        System.out.println("PassengerPlane is takeOff.");
    }
    public void fly() // Overriden method 
    {
        System.out.println("PassengerPlane is flying");
    }
}
public class Polymorphism1 { // Poly means Many and morphism is Structure and Forms.
    public static void main(String[] args) {
        
        CargoPlane1 cp = new CargoPlane1();

        PassengerPlane1 pp = new PassengerPlane1();

        AeroPlane1 ref;

        ref = cp;
        ref.takeOff();
        ref.fly();

        ref = pp;
        ref.takeOff();
        ref.fly();
    }
    
}
