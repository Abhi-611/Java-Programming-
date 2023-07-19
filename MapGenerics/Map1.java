package MapGenerics;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map1 {
    public static void main(String[] args) {
        
        HashMap hm = new HashMap(); 
        
        //hm.put(null,null);           // We can store null values also
        hm.put(01, "Rohit");
        hm.put(02, "Virat"); // Data can be store in (Key,value) pair -> also called (Entry)
        hm.put(03, "Saurabh");
        hm.put("Jaiswal", "Yash");
        hm.put(04, "Surya"); // Key should be unique , Order of insertion is not preserved

        System.out.println(hm);

        // For order of insertion preserved using LinkedHashMap

        LinkedHashMap lhm = new LinkedHashMap();

        lhm.put("Virat", "Kohli");
        lhm.put("Rohit", "Sharma");
        lhm.put("Ajinkhya", "Rahane");
        lhm.put("Ravindra", "Jadeja");

        System.out.println(lhm);


    }
}
