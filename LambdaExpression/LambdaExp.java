package LambdaExpression;

@FunctionalInterface
interface Car
{
    void drive();
}
public class LambdaExp {
    public static void main(String[] args) {
        
        Car obj =()->
            {
                System.out.println("Driving..");
            }
        ;

        // Car obj =avg->
        //     {
        //         System.out.println("Driving..");
        //     }
        // ;

        // Car obj =(avg,ts)->
        //     {
        //         System.out.println("Driving..");
        //     }
        // ;        

        obj.drive();
    }
}
