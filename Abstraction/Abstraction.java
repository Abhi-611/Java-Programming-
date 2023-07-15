package Abstraction;

abstract class AeroPlane 
{
    abstract public void takeOff(); // 100% abstraction
    // {
    //     System.out.println("AeroPlane is Taking Off");
    // }
    abstract public void fly();  // abstract method having only signature not body
    // {
    //     System.out.println("Aeroplane is Flying");
    // }

    public void landing()
    {
        System.out.println("AeroPlane is Landing");
    }

}
class CargoPlane extends AeroPlane
{
    public void takeOff()
    {
        System.out.println("CargoPlane is Taking Off");
    }
    public void fly()
    {
        System.out.println("Cargoplane is Flying");
    }
}
class PassengerPlane extends AeroPlane
{
    public void takeOff()
    {
        System.out.println("PassengerPlane is Taking Off");
    }
    public void fly()
    {
        System.out.println("Passengerplane is Flying");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        
         // AeroPlane ref = new AeroPlane(); We cannot create Object of the Abstract Class

         AeroPlane ref = new CargoPlane();
         ref.takeOff();
         ref.fly();
         ref.landing();
 
         PassengerPlane ref1 = new PassengerPlane();
         ref1.takeOff();
         ref1.fly();
         ref1.landing();
    }
}
