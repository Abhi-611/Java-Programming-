package Strings;

public class CompareString {
    public static void main(String[] args) {
        
        String s1 = "abhi";
        String s2 = new String("Abhi");
        String s3 = new String("abhi");

        System.out.println(s1==s2); // References '==' ;
        System.out.println(s2==s3);
        System.out.println(s1.equalsIgnoreCase(s2)); // Values '.equals()' ;
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
