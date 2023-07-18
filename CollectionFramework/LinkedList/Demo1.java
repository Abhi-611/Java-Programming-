package CollectionFramework.LinkedList;

import java.util.LinkedList;

public class Demo1 {
    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList<>();

        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(300);
        System.out.println(ll);

        System.out.println(ll.get(2));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println(ll.indexOf(300));
        System.out.println(ll.lastIndexOf(300));

        ll.push(10);
        System.out.println(ll);
        ll.pop();
    }
}
