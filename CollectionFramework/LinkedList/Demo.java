package CollectionFramework.LinkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        
        LinkedList ll1 = new LinkedList(); // Immplements List and Deque 

        ll1.add(100); // Homogeneous type data
        ll1.add(200);
        ll1.add(300);
        System.out.println(ll1);   

        LinkedList ll2 = new LinkedList();

        ll2.add("Abhi"); // Heterogeneous type data and duplicates are also allowed
        ll2.add('B');
        ll2.add(300);
        System.out.println(ll2);

        ll2.addFirst("Pwskill");
        ll2.addLast("Java");
        System.out.println(ll2);

        System.out.println(ll1.peek()); // Gives First node 

        ll1.poll();
        System.out.println(ll1); // Clears 1 node 

        // Object is in the from of node which we can modify or manipulate from front , rare and center ends
        // uses Doubly LinkedList  




    }
}
