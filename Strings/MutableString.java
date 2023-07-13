package Strings;

public class MutableString {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Abhi");
        System.out.println(sb);
        sb.append("badade");
        System.out.println(sb);

        // Final and Immutibility

        final StringBuffer sb1 = new StringBuffer("Virat");
        sb1.append("Kohli");
       // System.out.println(sb1);
        //sb1 = new StringBuffer("sachin");
        System.out.println(sb1);
    }
}
