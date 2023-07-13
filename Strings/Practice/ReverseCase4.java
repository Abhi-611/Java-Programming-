package Strings.Practice;

public class ReverseCase4 {
    public static void main(String[] args) {
        
        String str1 = "pwskill java";
        String str2 = "";
        String sarr[]= str1.split(" ");
        for(String n : sarr)
        {
            for(int i=n.length()-1;i>=0;i--)
            {
                str2 = str2 + n.charAt(i);
            }
            str2 = str2 + " ";
        }
        System.out.println("Before Reversing : "+str1);
        System.out.println("After Reversing : "+str2);
        
    }
}
