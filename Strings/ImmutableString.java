package Strings;

public class ImmutableString {
    public static void main(String[] args) {
        
        String s1 = "abhi";
        String s2 = "abhi";
        System.out.println(s1==s2); // Inside String Constant Pool , Duplicates are not Allowed (obj)


        String s3 = new String("Abhi");
        String s4 = new String("Abhi");
        System.out.println(s3==s4); // Outside SCP in HeapArea , Duplicates are Allowed (obj)
    }
}
