package Strings.Practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
        String str1 = "School Master";
        String str2 = "The Classroom";

        str1 = str1.replace(" ",""); //replace " "
        str2 = str2.replace(" ","");

         str1  = str1.toLowerCase(); // .toLowerCase()
         str2  = str2.toLowerCase();

         char []ar1= str1.toCharArray(); // Creating char array
         char []ar2= str2.toCharArray();

         Arrays.sort(ar1); // Sorting array
         Arrays.sort(ar2);

         if(Arrays.equals(ar1 , ar2)) // Compare
         {
           System.out.println("It is Anagram");
         }
         else
         {
           System.out.println("It is not Anagram");
         }
    }
}
