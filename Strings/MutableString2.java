package Strings;

public class MutableString2 {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("abhi");
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        sb.setCharAt(1,'A');
        System.out.println(sb);

    }
}
