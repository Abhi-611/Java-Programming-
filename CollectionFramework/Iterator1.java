package CollectionFramework;

import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(100);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println(al);

        Iterator itr = al.iterator();

        while (itr.hasNext()) {
                System.out.println(itr.next());
        }

        ListIterator itr1 = al.listIterator(al.size());

        while(itr1.hasPrevious())
        {
            System.out.println(itr1.previous());
        }
        
    }
        
}
