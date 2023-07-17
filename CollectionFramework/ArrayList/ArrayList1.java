package CollectionFramework.ArrayList;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        
        ArrayList a1 = new ArrayList(); //ArrayList implements List Interface

        // Homogeneous type of data

        a1.add(100);
        a1.add(200);
        a1.add(300);
        System.out.println(a1);

        ArrayList a2 = new ArrayList();

        // Heterogeneous type of data 

        a2.add("Abhi");
        a2.add('B');
        a2.add(611);
        a2.add(20.20);             // order of Insertion is preserved
        System.out.println(a2);

        a2.add(100);  // New data stores at rare end
        System.out.println("After Changing");
        System.out.println(a2);

        a2.add(2, "Badade"); // This is allowed but efficient to use instead of these we are using LinkedList

        a2.addAll(a1);
        System.out.println(a2);

    }
    
}
