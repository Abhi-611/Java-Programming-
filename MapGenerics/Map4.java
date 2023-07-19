package MapGenerics;

import java.util.*;
public class Map4 {
    public static void main(String[] args) {
         // Same HashMap Class inbuilt methods are followed here also

        Hashtable ht = new Hashtable();

        ht.put(1, "Rohti");
        ht.put(2, "Rahul");
        ht.put(3, "Ramesh");
        //ht.put(null, "Ratan"); Null values are not allowed 


        System.out.println(ht);

        ht.putIfAbsent(5, "Abhi");

        System.out.println(ht);

        TreeMap tm = new TreeMap();

        tm.put(2, "Abhi");
        tm.put(1, "sanket");
        tm.put(4, "Niteen");

         System.out.println(tm);



    }
}
