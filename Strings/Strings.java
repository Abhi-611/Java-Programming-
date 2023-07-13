package Strings;

public class Strings {
    public static void main(String[] args) {
        
        // Immutable String (non-changable) ;

        String brand = "pwskill";
        System.out.println(brand);
        brand.concat("Nagar");
        System.out.println(brand);

        // Mutable String (changable) ;

        StringBuilder brand1 = new StringBuilder("pwskill");
        System.out.println(brand1);
        brand1.append("Nagar");
        System.out.println(brand1);
        
    }
}
