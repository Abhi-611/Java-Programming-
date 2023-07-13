package MethodOverloading;
class Calc{

    public int add(int n1 , int n2){
        int res1 = n1 + n2 ;
        return res1;
    }

    public int add(int n1 , int n2 ,int n3){
        int res1 = n1 + n2 +n3;
        return res1;
    }

    public double add(double n1 , double n2 , double n3){
        double res2 = n1 + n2 + n3 ;
        return res2;
    }
}

public class Demo {
    public static void main(String[] args) {
        
        Calc obj = new Calc();

       int res1 = obj.add(4,5);
       System.out.println(res1);

       double res2 = obj.add(4.5, 2.5, 3.5);
       System.out.println(res2);

       int res = obj.add(4,5,6);
       System.out.println(res);
    }
}

/* Automatic promotion in Method Overloading 
 * byte -> short
 *            ->int -> long -> float -> double
 *      char ->
 */
