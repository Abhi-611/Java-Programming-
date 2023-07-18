package CollectionFramework;
import java.util.*;
public class PriorityQue {
    public static void main(String[] args) {
        
        PriorityQueue pq = new PriorityQueue(); // Implements Queue Follows Min-Heap DS

        pq.add(100);
        pq.add(125);
        pq.add(25);
        pq.add(50);
        pq.add(75);
        pq.add(175);
        pq.add(500);

        System.out.println(pq);

        pq.add(25);
        System.out.println(pq);
    }
}
