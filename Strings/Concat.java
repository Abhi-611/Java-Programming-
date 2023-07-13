package Strings;

public class Concat {
    public static void main(String[] args) {
        
    //     String s1 = "abhi";
    //     String s2 = s1.concat("badade");

    //     String s3 = new String("abhi");
    //     s3=s3.concat("badade");

    //     System.out.println(s1);
    //     System.out.println(s2);
    //     System.out.println(s3);

    String s1 = "abhi";
    String s2 = "abhi" + "badade";
    String s3 = "abhi" + "ramraje"+"badade";
    String s4 = s1 + s2;
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);

    String str = "Abhi-" + 6 + 11;
    System.out.println(str);
    }
}
