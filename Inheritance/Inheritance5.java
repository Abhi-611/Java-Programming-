package Inheritance;

class AeroPlane 
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
class CargoPlane extends AeroPlane
{
    public void fly()  // Overriding Method 
    {
        System.out.println("CargoPlane is Flying at Lower Hight.");
    }
    public void carryGoods()
    {
        System.out.println("Carry Goods");
    }
}
class PassengerPlane extends AeroPlane // Both takeOff() and fly() are Inherited Method 
{
 public void carryPassengers() //Specialized Methods 
    {
        System.out.println("Carry passengers");
    }
}
public class Inheritance5 {
    public static void main(String[] args) {
        
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
    }  
}
