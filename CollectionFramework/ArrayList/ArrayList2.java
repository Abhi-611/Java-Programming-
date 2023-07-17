package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        
        ArrayList al1 = new ArrayList();

        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);

        System.out.println(al1.size());

        System.out.println(al1.contains(300));

        System.out.println(al1.indexOf(200));

        ((ArrayList) al1).ensureCapacity(10);
        al1.trimToSize();
        System.out.println(al1.size());

        al1.clear();
        System.out.println(al1);
    }
}
